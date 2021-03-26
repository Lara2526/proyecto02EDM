package ar.edu.unju.edm.controler;

import ar.edu.unju.edm.model.Calculadora;

public class CalculadoraControler {
	
	public void resolverOperaciones() {
	
		int num1;
		int num2;
		num1 = 45;
		num2 = 20;
		Calculadora nuevaCalculadora = new Calculadora();
		
		nuevaCalculadora.setA(num1);
		nuevaCalculadora.setB(num2);
		
		System.out.println("El resultado de la suma es:"+ nuevaCalculadora.SumarDosNumeros());
	}
	}
	

