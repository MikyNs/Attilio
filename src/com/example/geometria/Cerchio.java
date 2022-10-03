package com.example.geometria;

import java.util.Objects;

public class Cerchio extends Ellisse {
	private double raggio;

	public Cerchio(double raggio) {
		super(raggio, raggio);
		this.raggio = raggio;
	}

	public double diametro() {
		return raggio * 2;
	}

	public double circonferenza() {
		return perimetro();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cerchio [raggio=");
		builder.append(raggio);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(raggio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cerchio other = (Cerchio) obj;
		return Double.doubleToLongBits(raggio) == Double.doubleToLongBits(other.raggio);
	}
}