package ejercicios;

import java.util.Scanner;

public class LangostaFeliz {

	public static void main(String[] args) {
		System.out.println("BANQUETES");
		System.out.println("===========");
		System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese cantidad de personas (0= salir)");
		int numPer = scan.nextInt();
		int total = 0;
		while (numPer != 0) {
			if (numPer > 300) {
				total= numPer * 750;
			} else {
				if (numPer > 200) {
					total= numPer * 850;
				} else {
					total= numPer * 950;
				}
			}
			System.out.println("Total a pagar es " + total);
			System.out.println(" ");
			System.out.println("Ingrese cantidad de personas (0= salir)");
			System.out.println(" ");
		}
	}
}
