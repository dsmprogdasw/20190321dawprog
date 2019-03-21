package examen.ejercicio1;

import java.awt.Color;

public class Rectangulo extends FiguraGeometrica {
	
	private double base;
	private double altura;
	
	public Rectangulo(Color color, int x, int y, boolean relleno, double base, double altura) {
		super(color, x, y, relleno);
		this.base = base;
		this.altura = altura;
		area = calcularAreaRectangulo(base, altura);
		perimetro = calcularPerimetroRectangulo(base, altura);
	}
	
	
	
	
	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "] " + super.toString();
	}




	public double calcularAreaRectangulo(double base, double altura) {
		area = base * altura;
		return area;
	}
	
	public double calcularPerimetroRectangulo(double base, double altura) {
		perimetro = (base * 2) + (altura * 2);
		return perimetro;
	}
}
