package com.example.attilio.v1;

import com.example.geometria.Cerchio;
import com.example.geometria.Rettangolo;

public class CalcoloPreventivo {
	
	public static void main(String[] args)
	{
		double preventivo=0;
		
		Rettangolo zona1 = new Rettangolo(6,2);
		preventivo= preventivo + (zona1.perimetro()*CostantiPagamento.COSTOSIEPE) + (zona1.area()*CostantiPagamento.COSTOPRATO);
		
		Cerchio zona2 = new Cerchio(3);
		preventivo= preventivo + (zona2.perimetro()*CostantiPagamento.COSTOSIEPE) + (zona2.area()*CostantiPagamento.COSTOPRATO);
		
		Cerchio zona3 = new Cerchio(3);
		preventivo= preventivo + (zona3.perimetro()*CostantiPagamento.COSTOSIEPE) + (zona3.area()*CostantiPagamento.COSTOPRATO);
		
		Rettangolo zona4 = new Rettangolo(6,2);
		preventivo= preventivo + (zona4.perimetro()*CostantiPagamento.COSTOSIEPE) + (zona4.area()*CostantiPagamento.COSTOPRATO);
		
		System.out.printf("%.2f",preventivo);
	}
}
