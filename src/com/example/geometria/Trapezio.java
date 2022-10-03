package com.example.geometria;

public class Trapezio extends FiguraGeometrica {


	private double baseMinore;
	private double baseMaggiore;
	private double altezza;

	public Trapezio(double baseMinore, double baseMaggiore, double altezza) {
		super();
		this.baseMinore = baseMinore;
		this.baseMaggiore = baseMaggiore;
		this.altezza = altezza;
	}

	@Override
	public double area() {
		return (baseMinore + baseMaggiore) * altezza / 2;
	}

	@Override
	public double perimetro() {
		return (baseMinore + baseMaggiore) * 2;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Trapezio [baseMinore=");
		builder.append(baseMinore);
		builder.append(", baseMaggiore=");
		builder.append(baseMaggiore);
		builder.append(", altezza=");
		builder.append(altezza);
		builder.append("]");
		return builder.toString();
	}
	
	
}