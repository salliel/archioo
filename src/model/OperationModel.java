package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class OperationModel implements Serializable{
	
	private double x;
	private double y;
	private String operation;
	private double resultat;
	
	public OperationModel(double x, double y, String operation) {
		super();
		this.x = x;
		this.y = y;
		this.operation = operation;
		this.resultat = 0.0;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public double getResultat() {
		return resultat;
	}
	public void setResultat(double resultat) {
		this.resultat = resultat;
	}
	
}
