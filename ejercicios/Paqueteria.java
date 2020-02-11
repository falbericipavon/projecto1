package ejercicios;

import java.util.Scanner;

public class Paqueteria {
	String nomZona;
	int zona;
	float peso;
	float costo;
	private int valorpeso;
	int costo1;
	int costo2;
	int costo3;
	int costo4;
	int costo5;
	

	public Paqueteria(String nz, float pe, float co, int zon) {	
		peso = pe;
		costo = co;
		zona = zon;
		this.nomZona = nz;

	}
	
	public static void main(String[] args) {
		System.out.println("SISTEMA DE ENVIOS");
		System.out.println("=================");
		System.out.println("");
		System.out.println("Ingrese peso del paquete: ");
		Scanner scan = new Scanner(System.in);
		float peso = scan.nextFloat();
		float total = 0;
		int costo1 = 11000;
		int costo2 = 10000;
		int costo3 = 12000;
		int costo4 = 24000;
		int costo5 = 27000;
		if (peso > 5) {
			System.out.println("No se puede dar el servicio ");
		} else {
			System.out.println("ZONAS DE ENVIOS");
			System.out.println("=================");
			System.out.println("");
			System.out.println("1) America del Norte");
			System.out.println("2) America Central");
			System.out.println("3) America del Sur");
			System.out.println("4) Europa");
			System.out.println("5) Asia");
			System.out.println("");
			System.out.println("Ingrese numero de opcion: ");
			Scanner scan2 = new Scanner(System.in);
			int zona = scan2.nextInt();
			switch(zona) {
				case 1:
					System.out.println("La zona es America del norte ");
					total= peso * costo1;
					System.out.println("El costo de envio por peso es " + costo1);
					System.out.println("El costo total es  " + total);
					break;
				case 2:
					System.out.println("La zona es America central ");
					total= peso * costo2;
					System.out.println("El costo de envio por peso es " + costo2);
					System.out.println("El costo total es  " + total);
					break;
				case 3:
					System.out.println("La zona es America del sur ");
					total= peso * costo3;
					System.out.println("El costo de envio por peso es " + costo3);
					System.out.println("El costo total es  " + total);
					break;
				case 4:
					System.out.println("La zona es Europa ");
					total= peso * costo4;
					System.out.println("El costo de envio por peso es " + costo4);
					System.out.println("El costo total es  " + total);
					break;
				case 5:
					System.out.println("La zona es america del norte ");
					total= peso * costo5;
					System.out.println("El costo de envio por peso es " + costo5);
					System.out.println("El costo total es  " + total);
					break;
			}
			
		}
	}
}