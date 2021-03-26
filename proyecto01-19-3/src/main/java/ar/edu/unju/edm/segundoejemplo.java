package ar.edu.unju.edm;

public class segundoejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int altura;
		int base;
		altura=10;
		base=10;
		//pasar alrectangulo
		//llama al constructor
		rectangulo unRectangulo = new rectangulo();
		int resultado = unRectangulo.calcularsuperficie(altura,base);
		System.out.println("la superficie del rectangulo es :" + resultado);
	
		unRectangulo.setAltura(altura);
		unRectangulo.setBase(base);
		unRectangulo.calcularPerimetro();
		System.out.println("perimetro del rectangulo es=" + unRectangulo.getPerimetro() );
	}

}
