package br.com.buscape.fundoDoMar.position;

import java.util.List;

import br.com.buscape.fundoDoMar.emuns.DirectionEnum;

public class Position {

	private Integer xAxis;
	private Integer yAxis;
	private Integer zAxis;
	private List<DirectionEnum> directionEnum;
	
	
	public Position() {
		this.xAxis = new Integer(0);
		this.yAxis = new Integer(0);
		this.zAxis = new Integer(0);
		
	}
	
	
	
	public Integer getxAxis() {
		return xAxis;
	}
	public void setxAxis(Integer xAxis) {
		this.xAxis = xAxis;
	}
	public Integer getyAxis() {
		return yAxis;
	}
	public void setyAxis(Integer yAxis) {
		this.yAxis = yAxis;
	}
	public Integer getzAxis() {
		return zAxis;
	}
	public void setzAxis(Integer zAxis) {
		this.zAxis = zAxis;
	}
	public List<DirectionEnum> getDirectionEnum() {
		return directionEnum;
	}
	public void setDirectionEnum(List<DirectionEnum> directionEnum) {
		this.directionEnum = directionEnum;
	}


	
	
}
