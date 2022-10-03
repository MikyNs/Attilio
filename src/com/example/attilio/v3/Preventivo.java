package com.example.attilio.v3;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.geometria.FiguraGeometrica;

public class Preventivo {
	private static final Logger log = LogManager.getLogger(Preventivo.class);

	private FiguraGeometrica[] figure = new FiguraGeometrica[6];
	private int indice;

	private BigDecimal prezzoSiepe = new  BigDecimal(18);
	private BigDecimal prezzoPrato = new  BigDecimal(6);

	public void add(FiguraGeometrica figura) {
		if (indice >= figure.length) {
			log.trace("Necessaria espansione array");
			// allocare un array + grande, copiare i dati pre-esistenti
			espandiArray(10);
		}
		figure[indice] = figura; // se sfondo l'array ==> java.lang.ArrayIndexOutOfBoundsException
		indice++;
	}

	private void espandiArray(int length) {
		log.trace("Richiesta espansione array di {} elementi", length);
		FiguraGeometrica[] figure = new FiguraGeometrica[this.figure.length + length];
		log.trace("Il nuovo array sarà di {} elementi", figure.length);

		// sostituita dalla arraycopy
//		for(int i=0; i<this.figure.length; i++) {
//			figure[i] = this.figure[i];
//		}

		// https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/System.html#arraycopy(java.lang.Object,int,java.lang.Object,int,int)
		// shallow copy degli oggetti contenuti nell'array sorgente verso la
		// destinazione
		System.arraycopy(this.figure, // Object src,
				0, // int srcPos,
				figure, // Object dest,
				0, // int destPos,
				this.figure.length); // int length);

		// il riferimento al vecchio array viene ricoperto
		// con il riferimento del nuovo array
		this.figure = figure;
	}

	public int size() {
//		int dimensione = 0;
//		for(FiguraGeometrica g : figure) {
//			if(g == null) {
//				return dimensione;
//			}
//			dimensione++;
//		}
//		return dimensione;
		return indice;
	}

	public void remove(int posizione) {
		if (posizione > this.indice - 1) {
			log.error("Cella vuota");
		} else {
			log.trace("Rimozione " + figure[posizione]);
			figure[posizione] = null;

			for (int i = posizione; i < this.indice; i++) {
				if (i != indice - 1) {
					FiguraGeometrica temp = figure[i + 1];
					figure[i + 1] = null;
					figure[i] = temp;
				}
			}
			this.indice--;
		}
	}

	public void list() {
// lista il contenuto dell'arrayfor
		for (int i = 0; i < this.figure.length; i++) {
			if (this.figure[i] == null) {
				continue;
			}
			System.out.print("Posizione (" + i + ") ");
			System.out.println(" " + this.figure[i]);
		}
	}

	private double area() {
		double area = 0;
		for (FiguraGeometrica g : figure) {
			if (g == null) {
				continue;
			}
			area += g.area();
		}
		return area;
	}

	private double perimetro() {
		double perimetro = 0;
		for (FiguraGeometrica g : figure) {
			if (g == null) {
				continue;
			}
			perimetro += g.perimetro();
		}
		return perimetro;
	}

	private BigDecimal costoPrato() {
		BigDecimal areaBd = new BigDecimal(area());
		return prezzoPrato.multiply(areaBd).setScale(2, RoundingMode.HALF_UP);
	}

	private BigDecimal costoSiepe() {
		BigDecimal perimetroBd = new BigDecimal(perimetro());
		return prezzoSiepe.multiply(perimetroBd).setScale(2, RoundingMode.HALF_UP);
	}

	private BigDecimal costoTotale() {
		return costoPrato().add(costoSiepe()).setScale(2, RoundingMode.HALF_UP);
	}

	public void stampa() {
		System.out.println(String.format("Costo Siepe %s", costoSiepe()));
		System.out.println(String.format("Costo Prato %s", costoPrato()));
		System.out.println(String.format("Costo Totale %s", costoTotale()));
	}
}