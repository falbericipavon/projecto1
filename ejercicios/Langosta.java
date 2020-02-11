package ejercicios;

import java.util.Scanner;

public class Langosta {
	float numeroPersonas;
	float total;
	
	
	public static void main(String[] args) {
		System.out.println("BANQUETES");
		System.out.println("===========");
		System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("Ingrese numero de personas: (0 = fin)");
		float numeroPersonas = scan.nextInt();	
		if (numeroPersonas >= 300) {
			System.out.println("El total es: " + numeroPersonas * 75);
		} else {
			if (numeroPersonas >= 200) {
				System.out.println("El total es: " + numeroPersonas * 85);
			} else { 
				if (numeroPersonas == 0) {break;}
				
			else { 
				if (numeroPersonas >= 200) {
					System.out.println("El total es: " + numeroPersonas * 85);
				} else {
					System.out.println("El total es: " + numeroPersonas * 95);	
				}
			}
		}  

		}
	}
	}
}
