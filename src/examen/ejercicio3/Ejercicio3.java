package examen.ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
	static Scanner in = new Scanner(System.in);
	static ArrayList<String> lista = new ArrayList<String>();

	public static void main(String[] args) {
		boolean seguirMetiendo = true;
		
		do {
		System.out.println("Introduce un compuesto químico");
		String compuesto = in.nextLine();
		
		for(int i=0; i<lista.size() + 1; i++) {
			if(lista.contains(compuesto)) {
				
			}
			else
				lista.add(compuesto);
		}
		
		
		System.out.println("¿Quieres añadir otro compuesto? (SI/NO)");
		String respuesta = in.nextLine();
		if(respuesta.equals("SI") || respuesta.equals("si") || respuesta.equals("Si")){
			seguirMetiendo = true;
		}
		else {
			seguirMetiendo = false;
		}
		
		}while(seguirMetiendo == true);
		
		System.out.println("");
		System.out.println(lista);

	}

}
