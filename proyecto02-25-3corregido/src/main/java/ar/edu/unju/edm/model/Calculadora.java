package ar.edu.unju.edm.model;

public class Calculadora {

	
	private int a , b;
	
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}
	
	public int SumarDosNumeros() {
		int suma;
		suma = a+b;
		return suma;
		
		
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Calculadora [a=" + a + ", b=" + b + ", getA()=" + getA() + ", getB()=" + getB() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculadora other = (Calculadora) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}
	
	
}
