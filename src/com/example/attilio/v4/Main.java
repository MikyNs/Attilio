package com.example.attilio.v4;

import com.example.geometria.Cerchio;
import com.example.geometria.Quadrato;
import com.example.geometria.Rettangolo;

public class Main {

	public static void main(String[] args) {
		Preventivo preventivo = new Preventivo();

		Quadrato q1 = new Quadrato(6);
		Quadrato q2 = new Quadrato(5);
		Rettangolo r1 = new Rettangolo(20, 1);
		Cerchio c1 = new Cerchio(5);
		Cerchio c2 = new Cerchio(2);
		Cerchio c3 = new Cerchio(5);

		preventivo.add(q1,2);
		preventivo.add(q2,2);

	    preventivo.add(r1,2);

	    preventivo.add(c1,0); //solo siepe
		preventivo.add(c2,1); //solo prato
		preventivo.add(c3,0); //solo siepe 

		preventivo.stampa();
	}
}