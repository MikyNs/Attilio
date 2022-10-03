package com.example.attilio.v5;

import com.example.geometria.Cerchio;
import com.example.geometria.Figura;
import com.example.geometria.Quadrato;
import com.example.geometria.Rettangolo;

public class Main {

	public static void main(String[] args) {
		Preventivo preventivo = new Preventivo();

		Rettangolo giardino = new Rettangolo(40, 10);
		Quadrato q1 = new Quadrato(6);
		Quadrato q2 = new Quadrato(5);
		Rettangolo r1 = new Rettangolo(20, 1);
		Cerchio c1 = new Cerchio(5);
		Cerchio c2 = new Cerchio(5);

		preventivo.add(giardino,TipoAggiunta.SIEPE_PRATO);
		preventivo.add(q1,TipoAggiunta.SIEPE);
		preventivo.add(q2,TipoAggiunta.SIEPE);
		preventivo.add(r1,TipoAggiunta.SIEPE);
		preventivo.add(c1,TipoAggiunta.SIEPE_RIMUOVI_PRATO); 
		preventivo.add(c2,TipoAggiunta.SIEPE_RIMUOVI_PRATO); 
	    preventivo.add(new Figura(28,35),TipoAggiunta.RIMUOVI_PRATO);

		preventivo.stampa();	
	}
}
