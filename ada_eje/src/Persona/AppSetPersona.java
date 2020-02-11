package Persona;

import java.util.HashSet;

import java.util.Iterator;

public class AppSetPersona {
	
	public static void main(String[] args) {
		
		HashSet<Persona>hash = new HashSet<Persona>();
		System.out.println("Size: " + hash.size());
		
		Persona primero = new Persona("Primero", "123");
		System.out.println(primero.hashCode());
		hash.add(primero);
		System.out.println("Size: " + hash.size());
		
		Persona segundo = new Persona("Segundo", "234");
		System.out.println(segundo.hashCode());
		hash.add(segundo);
		System.out.println("Size: " + hash.size());

		Persona tercero = new Persona("Tercero", "345");
		System.out.println(tercero.hashCode());
		hash.add(tercero);
		System.out.println("Size: " + hash.size());
		System.out.println("");
		
		//recorrer set
		Iterator<Persona> it = hash.iterator();
		Iterator<Persona> dit = hash.iterator();
		while (it.hasNext() && dit.hasNext()) {
			System.out.println(it.next().getNombre());
			System.out.println(dit.next().getDni());
		}
		
	}
	

}

