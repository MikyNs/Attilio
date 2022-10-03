package com.example.attilio.v5;

import com.example.geometria.Misurabile;

public class Aiuola implements Misurabile{
	
	private Misurabile figura;	 
	private TipoAggiunta tipoAiuola;

	public Aiuola(Misurabile figura,TipoAggiunta tipoAiuola) {
		super();
		this.figura = figura;
		this.tipoAiuola = tipoAiuola;
	}

	public double perimetro() {
		if(tipoAiuola == TipoAggiunta.SIEPE_PRATO || tipoAiuola == TipoAggiunta.SIEPE || tipoAiuola == TipoAggiunta.SIEPE_RIMUOVI_PRATO) {
			return figura.perimetro(); 
		}
		return 0;
	}
	
	public double area() {    
		if(tipoAiuola == TipoAggiunta.SIEPE_PRATO || tipoAiuola == TipoAggiunta.PRATO) {
			return figura.area();
		}
		if(tipoAiuola == TipoAggiunta.RIMUOVI_PRATO || tipoAiuola == TipoAggiunta.SIEPE_RIMUOVI_PRATO) {
			return -figura.area(); 
		}
		return 0;
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
