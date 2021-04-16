package ar.edu.unju.edm.model;

public class Calculadora {

	
	private float a , b;
	
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}
	
	public float SumarDosNumeros() {
		float suma;
		suma = a+b;
		return suma;
		
		
	};
	
	public float DividirDosNumeros(){
		
		float division=0;
		if (b==0)
		{
			sysoSystem.out.println("b es cero");

		}
		division = a / b ;
		
		return division;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Calculadora [a=" + a + ", b=" + b + ", SumarDosNumeros()=" + SumarDosNumeros()
				+ ", DividirDosNumeros()=" + DividirDosNumeros() + ", getA()=" + getA() + ", getB()=" + getB()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(a);
		result = prime * result + Float.floatToIntBits(b);
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
		if (Float.floatToIntBits(a) != Float.floatToIntBits(other.a))
			return false;
		if (Float.floatToIntBits(b) != Float.floatToIntBits(other.b))
			return false;
		return true;
	}
	
	
	
	
}
