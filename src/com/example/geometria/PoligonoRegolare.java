package com.example.geometria;

/**
 *
 * @see https://www.youmath.it/formulari/formulari-di-geometria-piana/419-tutte-le-formule-sui-poligoni-regolari.html
 */
public class PoligonoRegolare extends FiguraGeometrica{
	private int numeroLati;
	private double lato;
	private double costanteArea;

	// costruttore reso con visibilità protected perchè consente la creazione di poligoni
	// di cui mancano i dati
	protected PoligonoRegolare(int numeroLati, double lato, double costanteArea) {
		super();
		this.numeroLati = numeroLati;
		this.lato = lato;
		this.costanteArea = costanteArea;
	}

	public double perimetro() {
		return lato * numeroLati;
	}

	public double area() {
		return lato * lato * costanteArea;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PoligonoRegolare [numeroLati=");
		builder.append(numeroLati);
		builder.append(", lato=");
		builder.append(lato);
		builder.append(", costanteArea=");
		builder.append(costanteArea);
		builder.append("]");
		return builder.toString();
	}
	
	
}