package ejercicios;

import java.util.Scanner;

public class Vinos {
	int tipoUva;
	String tipoUvaA = "A";
	String tipoUvaB = "B";
	int tamañoUva;
	int kilos;
	
	
	
	public static void main(String[] args) {
		System.out.println("TIPO DE VINOS");
		System.out.println("=================");
		System.out.println("");
		float total = 0;
		float ganancia;
		int precioUva = 130;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese kilos de uva: ");
		int kilos = scan.nextInt();
		System.out.println(" ");
		System.out.println("Tipos de uva: ");
		System.out.println("1) Tipo A: ");
		System.out.println("2) Tipo B: ");
		System.out.println("Ingrese tipo de uva: ");
		int tipoUva = scan.nextInt();
		System.out.println("Tamaño de Uvas: ");
		System.out.println("1) Tamaño chico: ");
		System.out.println("2) Tamaño grande: ");
		System.out.println("Ingrese tamaño de uva: ");
		int tamañoUva = scan.nextInt();
		if (tipoUva != 1 && tipoUva != 2) {
			System.out.println("Ingrese un tipo de uva correcto ");
		} else {
			if (tamañoUva != 1 && tamañoUva != 2) {
					System.out.println("Ingrese un tamaño de uva correcto ");
			}else {
				if (tipoUva == 1) {
					if (tamañoUva == 1) {
						total = precioUva + 20;
					}else {
						total = precioUva + 30;
					}
				}else {
					if (tamañoUva == 1) {
						total = precioUva - 30;
				    } else {
					    total = precioUva - 50;
				}
			}
			}
		}
	
		
		ganancia = total * kilos;
		System.out.println(" ");
		System.out.println("La ganancia es " + ganancia);
	}
}
