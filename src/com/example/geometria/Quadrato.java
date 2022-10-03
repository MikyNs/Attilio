package com.example.geometria;

import java.util.Objects;

public class Quadrato extends Rettangolo {
	private double lato;
	public Quadrato(double lato) {
		super(lato, lato); // invoca il costruttore corrispondente nella classe padre
		this.lato = lato;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quadrato [lato=");
		builder.append(lato);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(lato);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quadrato other = (Quadrato) obj;
		return Double.doubleToLongBits(lato) == Double.doubleToLongBits(other.lato);
	}




}