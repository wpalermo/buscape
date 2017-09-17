package br.com.buscape.fundoDoMar.main;

import java.util.ArrayList;
import java.util.List;


public class Main {
	
	public void start(String commands) {
		
		List<String> commandList = new ArrayList<String>();
		
		for(char c : commands.toCharArray())
			commandList.add(String.valueOf(c));
		
		commandList.forEach(c -> System.out.println(c));
		
		
		
	}

}
