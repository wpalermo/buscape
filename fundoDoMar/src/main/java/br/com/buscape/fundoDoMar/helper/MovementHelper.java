package br.com.buscape.fundoDoMar.helper;

import java.util.List;

import br.com.buscape.fundoDoMar.emuns.DirectionEnum;
import br.com.buscape.fundoDoMar.position.Position;

/**
 * 
 * @author wpalermo
 *
 */
public class MovementHelper {
	
	
	/**
	 * Desce ou sobe o submarino
	 * @param currentPosition
	 * @param z
	 * @return
	 */
	public static Position upOrDown(Position currentPosition, Integer z) {
		
		currentPosition.setzAxis(currentPosition.getzAxis() + z);
		return currentPosition;
		
	}
	
	
	/**
	 * Rotaciona o submarino para a direita
	 * @param currentPosition
	 * @return
	 */
	public static Position rotateRight(Position currentPosition) {

		List<DirectionEnum> currentDirection = currentPosition.getDirectionEnum();

		for (int i = 0; i < currentDirection.size(); i++) {

			if (currentDirection.get(i).isValid) {
				currentDirection.get(i).isValid = false;

				if (i + 1 > currentDirection.size() -1 )
					currentDirection.get(0).isValid = true;
				else
					currentDirection.get(i + 1).isValid = true;

				currentPosition.setDirectionEnum(currentDirection);
				break;

			}

		}
		
		return currentPosition;

	}

	
	/**
	 * Rotaciona o submarino para a esquerda
	 * @param currentPosition
	 * @return
	 */
	public static  Position rotateLeft(Position currentPosition) {

		List<DirectionEnum> currentDirection = currentPosition.getDirectionEnum();

		for (int i = 0; i < currentDirection.size(); i++) {

			if (currentDirection.get(i).isValid) {
				currentDirection.get(i).isValid = false;

				if (i - 1 < 0)
					currentDirection.get(currentDirection.size()-1).isValid = true;
				else
					currentDirection.get(i - 1).isValid = true;

				currentPosition.setDirectionEnum(currentDirection);
				break;
			}

		}
		return currentPosition;


	}
	


	/**
	 * Move o submarino para o direcao em que esta apontado
	 * @param position
	 * @return
	 */
	public static  Position move(Position position) {

			for (DirectionEnum de : position.getDirectionEnum()) {

				if (de.isValid) {
					position.setxAxis(position.getxAxis() + de.x);
					position.setyAxis(position.getyAxis() + de.y);
				}

			}
		
		return position;

	}

}
