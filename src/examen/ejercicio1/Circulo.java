package examen.ejercicio1;

import java.awt.Color;

public class Circulo extends FiguraGeometrica {
	private float radio;
	
	public Circulo(Color color, int x, int y, boolean relleno, int radio) {
		super(color, x, y, relleno);
		this.radio = radio;
		area = calcularAreaCirculo(radio);
		perimetro = calcularPerimetroCirculo(radio);
	}
	
	
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "] " + super.toString();
	}


	public double calcularAreaCirculo(float radio) {
		area = 3.1416 * (radio * radio);
		return area;
	}
	
	public double calcularPerimetroCirculo(float radio) {
		perimetro = 2 * 3.1416 * radio;
		return perimetro;
	}
}
