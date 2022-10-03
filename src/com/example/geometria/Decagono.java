package com.example.geometria;

public class Decagono extends PoligonoRegolare {

	public Decagono(double lato) {
		super(10, lato, CostantiArea.DECAGONO);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Decagono []");
		return builder.toString();
	}
	
	
	

}