package com.example.attilio.v3;

import com.example.geometria.Quadrato;

public class Main {

	public static void main(String[] args) {
		Preventivo preventivo = new Preventivo();

		Quadrato q1 = new Quadrato(1.5);
		Quadrato q2 = new Quadrato(1.5);

		preventivo.add(q1);
		preventivo.add(q2);
	}
}