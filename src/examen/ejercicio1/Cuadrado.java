package examen.ejercicio1;

import java.awt.Color;

public class Cuadrado extends FiguraGeometrica {
	private double longitudLado;
	
	public Cuadrado(Color color, int x, int y, boolean relleno, double longitudLado) {
		super(color, x, y, relleno);
		this.longitudLado = longitudLado;
		area =  calcularAreaCuadrado(longitudLado);
		perimetro = calcularPerimetroCuadrado(longitudLado);
	}
	
	
	
	
	@Override
	public String toString() {
		return "Cuadrado [longitudLado=" + longitudLado + "] " + super.toString();
	}




	public double calcularAreaCuadrado(double longitudLado) {
		area = longitudLado * longitudLado;
		return area;
	}
	
	public double calcularPerimetroCuadrado(double longitudLado) {
		perimetro = longitudLado * 4;
		return perimetro;
	}
}
