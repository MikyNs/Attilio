package com.example.geometria;

public class Ottagono extends PoligonoRegolare {

	public Ottagono(double lato) {
		super(8, lato, CostantiArea.OTTAGONO);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ottagono []");
		return builder.toString();
	}

	
}