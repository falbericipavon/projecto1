package Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class AppListaPersona {

	public static void main(String[] args) {
		
		ArrayList<Persona> lista = new ArrayList<Persona>();
		String nombre="";
		String dni="";
		
		System.out.println("APLICACION NOMBRES PERSONAS:");
		System.out.println("===========================");
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese nombre de cliente: ");
		nombre = sc.next();
		
		while (!nombre.equals(".")){
			System.out.println("Ingrese DNI del cliente: ");
			dni = sc.next();
			Persona p = new Persona(nombre, dni);
			lista.add(p);
			System.out.println("");
			System.out.println("Elemento Agregado correctamente. Tamaño lista: " + lista.size());
			System.out.println("Ingrese nombre del cliente: ");
			nombre = sc.next();
		}
		System.out.println("");
		for (Persona itemPersona: lista) {
			System.out.println(lista+ " NOMBRE PERSONA: " + itemPersona.getNombre() + ". DNI: " +  itemPersona.getDni());
		}
		
	}
}
