package com.example.attilio.v3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import com.example.attilio.v3.Preventivo;
import com.example.geometria.Cerchio;
import com.example.geometria.Quadrato;
import com.example.geometria.Rettangolo;

class PreventivoTest {
	private static final Logger log = LogManager.getLogger(PreventivoTest.class);

	@Test
	void testAdd() {
		Preventivo preventivo = new Preventivo();

		Quadrato q1 = new Quadrato(1.5);
		Quadrato q2 = new Quadrato(1.5);

		preventivo.add(q1);
		preventivo.add(q2);
	}

	@Test
	void testDimensione() {
		Preventivo preventivo = new Preventivo();

		Quadrato q1 = new Quadrato(1.5);
		Quadrato q2 = new Quadrato(1.5);

		preventivo.add(q1);
		preventivo.add(q2);

		assertEquals(2, preventivo.size());
	}

	@Test
	void testList() {
		Preventivo preventivo = new Preventivo();
		
		Quadrato q1 = new Quadrato(1.5);
		Quadrato q2 = new Quadrato(1.5);

		preventivo.add(q1);
		preventivo.add(q2);
		
		preventivo.list();
	}
	
	@Test
	void testStampa() {
		Preventivo preventivo = new Preventivo();

		Quadrato q1 = new Quadrato(1.5);
		Quadrato q2 = new Quadrato(1.5);
		Rettangolo r1 = new Rettangolo(6, 2);
		Rettangolo r2 = new Rettangolo(6, 2);
		Cerchio c1 = new Cerchio(3);
		Cerchio c2 = new Cerchio(3);
		Cerchio c3 = new Cerchio(3);

		preventivo.add(q1);
		preventivo.add(q2);

		preventivo.add(r1);
		preventivo.add(r2);

		preventivo.add(c1);
		preventivo.add(c2);
		preventivo.add(c3);

		preventivo.stampa();
	}
	
	@Test
	void remove() {
		Preventivo preventivo = new Preventivo();
		
		Quadrato q1 = new Quadrato(1.5);
		Quadrato q2 = new Quadrato(1.5);
		Quadrato q3 = new Quadrato(1.5);
		Rettangolo r1 = new Rettangolo(6, 2);
		Rettangolo r2 = new Rettangolo(6, 2);
		Rettangolo r3 = new Rettangolo(6, 2);
		Cerchio c1 = new Cerchio(3);
		Cerchio c2 = new Cerchio(3);
		Cerchio c3 = new Cerchio(3);

		preventivo.add(q1);
		preventivo.add(q2);
		preventivo.add(q3);

		preventivo.add(r1);
		preventivo.add(r2);
		preventivo.add(r3);

		preventivo.add(c1);
		preventivo.add(c2);;
		preventivo.add(c3);;
		
		preventivo.list();
		
		preventivo.remove(11);
		
		log.info("Nuova lista");
		preventivo.list();
		
	}
	

}