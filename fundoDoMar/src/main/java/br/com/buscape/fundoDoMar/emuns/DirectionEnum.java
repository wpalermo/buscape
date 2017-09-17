package br.com.buscape.fundoDoMar.emuns;

public enum DirectionEnum {

	NORTH("NORTE"),
	SOUTH("SUL"),
	EAST("LEST"),
	WEST("OESTE");
	
	public String value;
	
	private DirectionEnum(String value) {
		this.value = value;
	}
	
}
