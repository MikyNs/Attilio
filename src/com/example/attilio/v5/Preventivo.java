package com.example.attilio.v5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.geometria.Misurabile;

public class Preventivo {
	private static final Logger log = LogManager.getLogger(Preventivo.class);
	
	private BigDecimal prezzoSiepe = new BigDecimal(18);
	private BigDecimal prezzoPrato = new BigDecimal(6);
	
	private List<Misurabile> aiuole = new ArrayList<>();

	public void add(Misurabile figura, TipoAggiunta tipo) {
		if(figura != null) {
			aiuole.add(new Aiuola(figura, tipo));
		}
	}
	
	public void add(Misurabile figura) {
		aiuole.add(new Aiuola(figura, TipoAggiunta.SIEPE_PRATO));
	}
		
	public void remove(int posizione) {
		if (posizione > aiuole.size() - 1) {
			log.error("Cella vuota");
		} else {
			log.trace("Rimozione " + aiuole.get(posizione));
			aiuole.remove(posizione);
		}
	}
	
	public void stampa() {     
		BigDecimal lung = new BigDecimal(0);
		BigDecimal sup = new BigDecimal(0);
		
		for (Misurabile aiuola : aiuole) {
			if (aiuola != null) {
				lung = lung.add(new BigDecimal(aiuola.perimetro()).setScale(2, RoundingMode.HALF_UP));
				sup = sup.add(new BigDecimal(aiuola.area()).setScale(2, RoundingMode.HALF_UP));
			}
		}
		
		BigDecimal costoSiepe = lung.multiply(prezzoSiepe);
		BigDecimal costoPrato = sup.multiply(prezzoPrato);
		BigDecimal costoTotale = costoSiepe.add(costoPrato);
		
		System.out.println(String.format("Costo Siepe %s", costoSiepe));
		System.out.println(String.format("Costo Prato %s", costoPrato));
		System.out.println(String.format("Costo Totale %s", costoTotale));
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

	public int size() {
		return aiuole.size();
	}
}

