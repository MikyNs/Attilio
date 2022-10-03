package com.example.geometria;

public class Pentagono extends PoligonoRegolare {

	public Pentagono(double lato) {
		super(5, lato, CostantiArea.PENTAGONO);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pentagono []");
		return builder.toString();
	}
	 
	
}