package ar.edu.unju.edm.model;

public class Cuenta {
	private int numCuenta;
	private int dni;
	private double saldo;
	private String nombre;
	public Cuenta() {
		// TODO Auto-generated constructor stub
	}
	
	
	//constructor con parametros propiedades a la clase 
	public Cuenta(int numCuenta, int dni, double saldo) {
		super();
		this.numCuenta = numCuenta;
		this.dni = dni;
		this.saldo = saldo;
		
	}
//crear


	public int getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
