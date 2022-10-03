package com.example.geometria;

public class Ellisse extends FiguraGeometrica{

	private double semiAsseMinore;
	private double semiAsseMaggiore;

	public Ellisse(double semiAsseMinore,double semiAsseMaggiore) {
		super();
		this.semiAsseMinore = semiAsseMinore;
		this.semiAsseMaggiore = semiAsseMaggiore;
	}

	public double asseMinore() {
		return semiAsseMinore * 2;
	}

	public double asseMaggiore() {
		return semiAsseMaggiore * 2;
	}
	
	public double perimetro() {
		return 2 * Math.PI * Math.sqrt( (Math.pow(semiAsseMinore, 2) + Math.pow(semiAsseMaggiore, 2) ) / 2);
	}
	
	public double area() {
		return Math.PI*semiAsseMinore*semiAsseMaggiore;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ellisse [semiAsseMinore=");
		builder.append(semiAsseMinore);
		builder.append(", semiAsseMaggiore=");
		builder.append(semiAsseMaggiore);
		builder.append("]");
		return builder.toString();
	}
	
	
}