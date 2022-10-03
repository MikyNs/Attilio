package com.example.attilio.v4;

import com.example.geometria.FiguraGeometrica;
import com.example.geometria.Misurabile;

public class Aiuola implements Misurabile{
	
	private Misurabile figura;
	 
	private int tipoAiuola;

	public Aiuola(FiguraGeometrica figura,int tipoAiuola) {
		super();
		this.figura = figura;
		this.tipoAiuola = tipoAiuola;
	}

	public double perimetro() {
		if(tipoAiuola == 1) {
			return 0;
		}
		return figura.perimetro();
	}
	
	public double area() {
		if(tipoAiuola == 0) {
			return 0;
		}
		return figura.area();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aiuola [figura=");
		builder.append(figura);
		builder.append(", tipoAiuola=");
		builder.append(tipoAiuola);
		builder.append("]");
		return builder.toString();
	}
}
