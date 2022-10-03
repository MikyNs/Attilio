package com.example.geometria;

import java.util.Objects;

import com.example.geometria.util.TeoremaDiPitagora;

public class Rettangolo extends FiguraGeometrica {

	private double base; // dare valori differenti
	private double altezza; // dare valori differenti
	
	/**Questo metodo è il costruttore 
	 * @param base 
	 * @param altezza
	 */
	
	public Rettangolo(double base, double altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}

	@Override
	public double perimetro() {
		return (this.base + this.altezza) * 2;
	}
	
	public double area() {
		return base * altezza;
	}

	public double diagonale() {
		return TeoremaDiPitagora.ipotenusa(base, altezza);
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rettangolo [base=");
		builder.append(base);
		builder.append(", altezza=");
		builder.append(altezza);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(altezza, base);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rettangolo other = (Rettangolo) obj; // CAST DownCasting
		return Double.doubleToLongBits(altezza) == Double.doubleToLongBits(other.altezza)
				&& Double.doubleToLongBits(base) == Double.doubleToLongBits(other.base);
	}
}