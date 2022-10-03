package com.example.attilio.v4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.geometria.FiguraGeometrica;

public class Preventivo {
	private static final Logger log = LogManager.getLogger(Preventivo.class);

	private List<Aiuola> aiuole = new ArrayList<>();

	private BigDecimal prezzoSiepe = new BigDecimal(18);
	private BigDecimal prezzoPrato = new BigDecimal(6);

	public void add(FiguraGeometrica figura, int tipo) {
		aiuole.add(new Aiuola(figura, tipo));
	}

	public int size() {
		return aiuole.size();
	}

	public void remove(int posizione) {
		if (posizione > aiuole.size() - 1) {
			log.error("Cella vuota");
		} else {
			log.trace("Rimozione " + aiuole.get(posizione));
			aiuole.remove(posizione);
		}
	}

	public void list() {
		for (int i = 0; i < aiuole.size(); i++) {
			if (aiuole.get(i) == null) {
				continue;
			}
			System.out.print("Posizione (" + i + ") ");
			System.out.println(" " + aiuole.get(i));
		}
	}

	private double area() {
		double area = 0;
		for (int i = 0; i < aiuole.size(); i++) {
			if (aiuole.get(i) == null) {
				continue;
			}
			area += aiuole.get(i).area();
		}
		return area;
	}

	private double perimetro() {
		double perimetro = 0;
		for (int i = 0; i < aiuole.size(); i++) {
			if (aiuole.get(i) == null) {
				continue;
			}
			perimetro += aiuole.get(i).perimetro();
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

