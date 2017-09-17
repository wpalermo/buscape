package br.com.buscape.fundoDoMar.utils;

import java.util.logging.Logger;

import br.com.buscape.fundoDoMar.position.Position;

public class LogUtils {

	static Logger logger = Logger.getLogger("LogUtils"); 	
	
	
	public static void logPosition(Position position) {
		
		logger.info("X = " + position.getxAxis());
		logger.info("Y = " + position.getyAxis());
		logger.info("Z = " + position.getzAxis());
		
		
	}
	
}
