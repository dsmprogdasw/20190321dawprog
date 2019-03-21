package examen.ejercicio2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

import examen.ejercicio1.Circulo;
import examen.ejercicio1.Cuadrado;
import examen.ejercicio1.FiguraGeometrica;
import examen.ejercicio1.Rectangulo;



public class Ejercicio2 {
	
	

	public static void main(String[] args) {
		ArrayList<FiguraGeometrica> lista = new ArrayList<FiguraGeometrica>();
		
		lista.add(new Circulo(Color.GREEN, 3, 7, true, 8));
		lista.add(new Circulo(Color.BLACK, 2, 8, false, 3));
		
		lista.add(new Rectangulo(Color.RED, 2, 4, false, 8, 9));
		lista.add(new Rectangulo(Color.YELLOW, 8, 3, true, 2, 14));
		
		lista.add(new Cuadrado(Color.ORANGE, 6, 9, true, 4));
		lista.add(new Cuadrado(Color.BLUE, 4, 10, false, 12));
		
		mostrarLista(lista);

	}	
	
	
		public static void mostrarLista(ArrayList<FiguraGeometrica> lista) {
			Iterator<FiguraGeometrica> i = lista.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
		}
	

}
