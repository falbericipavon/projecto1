package ejercicios;

import java.util.Scanner;

public class ValorMayor {
	int valorA;
	int valorB;
	int valorC;

	public ValorMayor(int v1, int v2, int v3) {
		valorA = v1;
		valorB = v2;
		valorC = v3;
	}
	
	public static void main(String[] args) {
		System.out.println("VALOR MAYOR");
		System.out.println("===========");
		System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese valor 1: ");
		int valorA = scan.nextInt();
		System.out.println("Ingrese valor 2: ");
		int valorB = scan.nextInt();
		System.out.println("Ingrese valor 3: ");
		int valorC = scan.nextInt();
		int valorM;
		if (valorA == valorB && valorA == valorC) {
			valorM = valorA;
			System.out.println("Los tres valores son iguales: " + valorM);
			
		} else {
			if (valorA > valorB && valorA > valorC) {
				valorM = valorA;
			} else {
				if (valorB > valorC) {
					valorM = valorB;
				} else {
					valorM = valorC;
				}
			}
		} System.out.println("El mayor valor es: " + valorM);
	}	
}