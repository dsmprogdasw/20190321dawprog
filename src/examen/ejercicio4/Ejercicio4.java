package examen.ejercicio4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio4 {
	
	static Map<String, String> map = new HashMap();
	
	
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean finalizar = false;
		
		do {
			System.out.println("Añadir/Buscar/Fin");
			String linea = in.nextLine();
			
			if(linea.equals("fin") || linea.contentEquals("Fin")) {
				finalizar = true;
			}
			
			for(int i=0; i<linea.length(); i++) {
				
				if(linea.charAt(i) == '-') {
					String nombre = linea.substring(0, i);
					String numero = linea.substring(i+1, linea.length());
					map.put(nombre, numero);
				}
				
				if(linea.charAt(i) == ':') {
					String nombreBus = linea.substring(i+1, linea.length());
					
					for(int j=0; j<map.size(); j++) {
						
						if(map.containsKey(nombreBus)) {
							System.out.println(nombreBus + " - " + map.get(nombreBus));
							break;
							
						}else
							System.out.println(nombreBus + " no se encuentra en la agenda");
						break;
					}
				}
			}
			
		}while(finalizar == false);
		System.out.println("Has salido de la agenda");
	}

}
