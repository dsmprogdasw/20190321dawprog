package examen.ejercicio4;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio4New {
	
	static Map<String, String> map = new HashMap();
	
	
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean finalizar = false;
		
		do {
			String linea = in.nextLine();
			
			if(linea.toLowerCase().equals("fin")) {
				finalizar = true;
			}
			
			for(int i=0; i<linea.length(); i++) {
				
					if(linea.charAt(i) == '-') {
						String nombre = linea.substring(0, i);
						String numero = linea.substring(i+1, linea.length());
						
						if(numero.length() != 9) {
							System.out.println("No es un número válido");
						}
						else
						map.put(nombre, numero);
						System.out.println(nombre + " se ha añadido a la agenda");
					}
				
					if(linea.charAt(i) == ':') {
						String nombreBus = linea.substring(i+1, linea.length());
						String buscar = linea.substring(0, i);
					
					
					
				if(buscar.toLowerCase().equals("buscar")) {
						
					if(map.containsKey(nombreBus)) {
						System.out.println(nombreBus + " - " + map.get(nombreBus));
						
							
					}else
						System.out.println(nombreBus + " no se encuentra en la agenda");
						
				    
				}
				else
					System.out.println("No es un comando válido");
					
				}
			}
			
		}while(finalizar == false);
		System.out.println("Has salido de la agenda");
	}

}