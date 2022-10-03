package com.example.geometria;

public class Figura implements Misurabile{

	private double perimetro;
	private double area;
	
	public Figura(double perimetro, double area) {
		this.perimetro = perimetro;
		this.area = area;
	}
	
	@Override
	public double perimetro( ) {
		return this.perimetro;
	}
	
	@Override
	public double area( ) {
		return this.area;
	}
}
