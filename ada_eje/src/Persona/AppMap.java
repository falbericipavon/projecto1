package Persona;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class AppMap {
	// Map: la clase map tiene dos atributos: key (clave) y value (valor).
		// La clave no se puede repetir
		// Ejemplo: dni - persona
		// 123 - Ana
		// 234 - Juan
		
		public static void main(String[] args) {
			HashMap<String, Persona>mapa = new HashMap<String, Persona>();
			System.out.println("mapa.size() " + mapa.size());
			
			String dniAna = "123";
			Persona per1 = new Persona("Ana", dniAna);
			
			String dniJuan = "234";
			Persona per2 = new Persona("Juan", dniJuan);
			
			System.out.println("agrega Ana");
			mapa.put(dniAna, per1);

			System.out.println("mapa.size() " + mapa.size());
			
			System.out.println("agrega Juan");
			mapa.put(dniJuan, per2);
			
			System.out.println("mapa.size() " + mapa.size());
			

			Persona objetoBuscado = mapa.get(dniJuan);
			System.out.println("Persona buscada " + objetoBuscado.getNombre());
			
			String dni2 = "222";
			Persona buscado = mapa.get(dni2);
			System.out.println("Persona buscada " + buscado);
			
			// recorrer el mapa
			Set<String> setKeyMapa = mapa.keySet();
			Iterator<String> it = setKeyMapa.iterator();
			while (it.hasNext()) {
				String key = it.next();
				System.out.println("key: " + key);
				System.out.println("value: " + mapa.get(key).getNombre());
			}
		}
	}
