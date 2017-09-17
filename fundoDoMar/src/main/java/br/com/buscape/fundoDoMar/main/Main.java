package br.com.buscape.fundoDoMar.main;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import br.com.buscape.fundoDoMar.emuns.DirectionEnum;
import br.com.buscape.fundoDoMar.emuns.MovesEnum;
import br.com.buscape.fundoDoMar.helper.MovementHelper;
import br.com.buscape.fundoDoMar.position.Position;
import br.com.buscape.fundoDoMar.utils.LogUtils;

/**
 * 
 * @author wpalermo
 *
 */
public class Main {

	Logger logger = Logger.getLogger(this.getClass().getName());

	public String start(String commands) {

		List<String> commandList = new ArrayList<String>();

		// Transaforma a STRING recebida em um lista de letras
		for (char c : commands.toCharArray())
			commandList.add(String.valueOf(c));

		// Monda o array de direcoes possiveis
		final List<DirectionEnum> currentDirection = new ArrayList<DirectionEnum>(DirectionEnum.values().length);
		for (DirectionEnum de : DirectionEnum.values())
			currentDirection.add(de);

		// seta o array no atributo de posicao
		Position currentPosition = new Position();
		currentPosition.setDirectionEnum(currentDirection);

		// Le a entrada e executa os comandos
		for (String command : commandList) {

			if (command.equalsIgnoreCase(MovesEnum.RIGHT.value))
				currentPosition = MovementHelper.rotateRight(currentPosition);

			if (command.equalsIgnoreCase(MovesEnum.LEFT.value))
				currentPosition = MovementHelper.rotateLeft(currentPosition);

			if (command.equalsIgnoreCase(MovesEnum.DOWN.value))
				currentPosition = MovementHelper.upOrDown(currentPosition, -1);

			if (command.equalsIgnoreCase(MovesEnum.UP.value))
				currentPosition = MovementHelper.upOrDown(currentPosition, 1);

			if (command.equalsIgnoreCase(MovesEnum.MOVE.value))
				currentPosition = MovementHelper.move(currentPosition);

			LogUtils.logPosition(currentPosition);

		}

		// Verifica qual a direcao que o submarino acabou
		String finalDirection = currentPosition.getDirectionEnum().stream().filter(d -> d.isValid).findAny()
				.orElse(null).name();

		// retorna a saida conforme pedido
		return (currentPosition.getxAxis() + " " + currentPosition.getyAxis() + " " + currentPosition.getzAxis() + " " + finalDirection);

	}

}
