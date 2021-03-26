package ar.edu.unju.edm;

public class rectangulo {
	//atributos:son las variables
	private int altura;
	private int base;
	
	private int perimetro;
	
	//String color;
	//String material;
	
	//constructor: crea al reactangulo crt+ barra espaciadora
	public rectangulo() {
		// TODO Auto-generated constructor stub
	}
	
	//metodos: resuelven elproblema
	//aqui no se usan las variables que especifique arriba
	public int calcularsuperficie(int base, int altura){
		return  base*altura;
	}
	
	public void calcularPerimetro(){
		perimetro = 2*base+2*altura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(int perimetro) {
		this.perimetro = perimetro;
	}
	
}
