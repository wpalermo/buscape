package br.com.buscape.fundoDoMar.emuns;

public enum MovesEnum {
	
	LEFT("L"),
	RIGHT("R"),
	MOVE("M"),
	UP("U"),
	DOWN("D");
	
	
	public String value;
	
	MovesEnum(String value) {
		this.value = value;
	}

}
