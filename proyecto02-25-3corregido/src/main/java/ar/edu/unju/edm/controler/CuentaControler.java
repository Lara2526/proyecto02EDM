package ar.edu.unju.edm.controler;

import ar.edu.unju.edm.model.Cuenta;

public class CuentaControler {	
	
	
	public void operarConCuenta() {
		//instancia
		Cuenta nuevaCuenta = new Cuenta();
		int numCuenta = 1;
		int dni = 2172788;
		int saldo=0;
		
		//una instanciade laclase con valores asignados a sus atributos
		Cuenta otraCuenta = new Cuenta (numCuenta,dni, saldo);
		System.out.println("valor DNI de nuevaCuenta" + nuevaCuenta.getSaldo());
		System.out.println("valor DNI de otraCuenta"+ otraCuenta.getDni());
		
		System.out.println("valor del Saldo: "+otraCuenta.getSaldo());
		
		otraCuenta.depositar(1000);
		otraCuenta.depositar(5000);
		System.out.println("valor de Saldo"+otraCuenta.getSaldo());
		otraCuenta.extraer(9000)
		if(otraCuenta.getSaldo()<0)
		{System.out.println("Saldoin suficiente");
	}
	
	
}
