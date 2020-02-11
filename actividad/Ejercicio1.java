package projecto1;

import java.util.Scanner;
/**
 * @author Usuario
 * Javadoc para el metodo
 */

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese valor 1: ");
		int valor1 = sc.nextInt();
		System.out.println("ingrese valor 2: ");
		int valor2 = sc.nextInt();
		int total = valor1 + valor2;
		System.out.println("el total es: " + total);
		sc.close();
	}

}
