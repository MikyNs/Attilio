package com.example.attilio.v2;

import com.example.geometria.Cerchio;
import com.example.geometria.FiguraGeometrica;
import com.example.geometria.Rettangolo;

public class Preventivo {

	public static void main(String[] args) {
		double costoSiepe = 18;
		double costoPrato = 6;
		
		
		FiguraGeometrica[] giardino = {new Rettangolo(6,2), new Cerchio(3), new Cerchio(3), new Rettangolo(6,2)};
		
		
		
		
		/*Rettangolo[] rettangoli = new Rettangolo[2];
		Cerchio[] cerchi = new Cerchio[2];
		
		for(int i=0;i<rettangoli.length;i++)
		{
			rettangoli[i]= new Rettangolo(6, 2);
		}
		
		for(int i=0;i<cerchi.length;i++)
		{
			cerchi[i]= new Cerchio(3);
		}
		*/ 
		
		
		
		
		double perimetro=0;
		double area=0;
		
		for(int i=0;i<giardino.length;i++)
		{
			perimetro = perimetro + giardino[i].perimetro();
			area = area + giardino[i].area();
		}
		
		
		
		/*for(int i=0;i<rettangoli.length;i++)
		{
			perimetro = perimetro + rettangoli[i].area();
			area = area + rettangoli[i].area();
		}
		
		for(int i=0;i<cerchi.length;i++)
		{
			perimetro = perimetro + cerchi[i].perimetro();
			area = area + cerchi[i].area();
		}*/
		
		
		
		
		double totaleSiepe = costoSiepe*perimetro;
		double totalePrato = costoPrato*area;
		double totalePreventivo = totaleSiepe + totalePrato;
		System.out.println("Costo siepe = "+totaleSiepe);
		System.out.println("Costo prato = "+totalePrato);
		System.out.println("Totale generale = "+totalePreventivo);
	}
}