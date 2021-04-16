package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.controler.CalculadoraControler;
import ar.edu.unju.edm.controler.CuentaControler;

@SpringBootApplication
public class Proyecto02253corregidoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proyecto02253corregidoApplication.class, args);
	
		CalculadoraControler operacion = new CalculadoraControler();
		operacion.resolverOperaciones();
		
		CuentaControler cuenta = new CuentaControler();
		cuenta.operarConCuenta();
	}

}
