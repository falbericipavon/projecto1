package figuras;

import java.util.Scanner;

/**
 * Generar las clases de las figuras geometricas triangulo y rectangulo 
 * y exponer al menos un metodo que calcule el area de la figura
 * Los valors se debe ingresar por teclado
 * Generar un objeto de cada clase 
 *
 */
public class AppFiguras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("APLICACION FIGURAS GEOMETRICAS");
		System.out.println("==============================");
		System.out.println("");
		System.out.println("Ingrese tipo figura (1: Triangulo || 2: Rectangulo)");
		int opcion = sc.nextInt();
		switch (opcion) {
		case 1: {
			Triangulo fgTri = new Triangulo(obtenerFiguraLado(sc, "base"), obtenerFiguraLado(sc, "altura"));
			System.out.println("El area es: " + fgTri.area() +" - " +"Lados: " +  fgTri.cantidadLados());
			
			break;
		}
		case 2: {
			Rectangulo fgRect = new Rectangulo(obtenerFiguraLado(sc, "base"), obtenerFiguraLado(sc, "altura"));
			System.out.println("El area es: " + fgRect.area() +" - " +"Lados: " +  fgRect.cantidadLados());
			
			break;
		}

		default:
			break;
		}
	}

	private static int obtenerFiguraLado(Scanner sc, String param) {
		System.out.println("Ingrese " + param + ":");
		int x = sc.nextInt();
		return x;
	}
	
}
