package com.example.geometria;

public class Parallelogramma extends Trapezio {

	public Parallelogramma(double baseMinore, double baseMaggiore, double altezza) {
		super(baseMinore, baseMaggiore, altezza);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Parallelogramma []");
		return builder.toString();
	}

	
}