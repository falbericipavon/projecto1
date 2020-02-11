package ejercicios;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		float suma = 0;
		for (int i = 0; i < 10; i++ ) {
			System.out.println("Ingrese el valor que desea sumar: ");
			Scanner scan = new Scanner(System.in);
			int valor1 = scan.nextInt();
			suma += valor1;
		}
		System.out.println("La suma da " + suma);
	}
}
