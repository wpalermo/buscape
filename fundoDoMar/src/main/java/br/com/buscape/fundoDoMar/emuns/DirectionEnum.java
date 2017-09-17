package br.com.buscape.fundoDoMar.emuns;

/**
 * 
 * @author wpalermo
 *
 */
public enum DirectionEnum {

	NORTH("NORTE", true, 0, 1),
	EAST("LESTE", false, 1, 0),
	SOUTH("SUL", false, 0, -1),
	WEST("OESTE", false, -1, 0);
	
	
	public String value;
	public boolean isValid;
	public Integer x;
	public Integer y;
	private boolean changed;
	
	private DirectionEnum(String value, boolean isValid, Integer x, Integer y) {
		this.value = value;
		this.isValid = isValid;
		this.x = x;
		this.y = y;
		this.changed = false;
	}
	
	public boolean hasChanged() {
		return changed;
	}
	
	

	
}
