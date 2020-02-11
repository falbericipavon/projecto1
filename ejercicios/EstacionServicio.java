package ejercicios;

import java.util.Scanner;

public class EstacionServicio {
	
	public static void main(String[] args) {
		
		int [][] matriz = new int [3][3];
		for (int i = 0 ; i < matriz.length; i ++) {
			for (int j = 0 ; j < matriz.length; j ++) {
				 matriz[i][j] =0;
			}
		}
		int totalPorTipoNafta []= {0, 0, 0};
		int totalPorEstacion []= {0, 0, 0};
		String nombreEstacion []= {"A", "B", "C"};
		String tipoNafta []= {"Gas Oil", "Super", "Premium"};
		int gasOil = 10;
		int naftaSuper= 20;
		int naftaPremium= 40;

		System.out.println("ESTACION DE SERVICIO");
		System.out.println("====================");
		System.out.println("");
		System.out.println("Ingrese cantidad de litros: ");
		Scanner scan = new Scanner(System.in);
		int litros = scan.nextInt();
		
		while (litros!=0) {
			System.out.println("TIPOS DE NAFTA");
			System.out.println("==============");
			System.out.println("0) Gas Oil");
			System.out.println("1) Super");
			System.out.println("2) Premium");
			System.out.println(" ");
			System.out.println("Ingrese Tipo nafta: ");
			int nafta = scan.nextInt();
			int costoTotal = 0;
			
			switch (nafta) {
				case 0:
					costoTotal = litros * gasOil;
					break;
				case 1:
					costoTotal = litros * naftaSuper;
					break;
				case 2:
					costoTotal = litros * naftaPremium;
					break;	
			}
			
			System.out.println("ESTACIONES");
			System.out.println("==========");
			System.out.println("0) A");
			System.out.println("1) B");
			System.out.println("2) C");
			System.out.println(" ");
			System.out.println("Ingrese estacion de servicio: ");
			int estacion = scan.nextInt();
			
			matriz[nafta][estacion] += costoTotal;
			totalPorTipoNafta [nafta] += costoTotal;
			totalPorEstacion [estacion] += costoTotal;
			
			System.out.println("");
			System.out.println("ESTACION DE SERVICIO");
			System.out.println("====================");
			System.out.println("");
			System.out.println("Ingrese cantidad de litros: ");
		    litros = scan.nextInt();
			
		}
		System.out.println("");
		System.out.println("TOTALES ");
		System.out.println("=======");
		System.out.println("");
		System.out.println("Total Ganado por estacion: ");
		for (int i = 0 ; i < totalPorEstacion.length; i ++) {
			System.out.println("Estacion " + nombreEstacion[i] + ": " + totalPorEstacion[i]);
		}
		System.out.println("");
		System.out.println("Total Ganado por tipo de nafta: ");
		for (int i = 0 ; i < totalPorTipoNafta.length; i ++) {
			System.out.println("Estacion " + tipoNafta[i] + ": " + totalPorTipoNafta[i]);
		}
		System.out.println("");
		System.out.println("Tipo de nafta mas vendido: ");
		int masVendido = 0;
		int indiceMasVendido =0;
		for (int i = 0 ; i < totalPorEstacion.length; i ++) {
			if (totalPorEstacion[i] > masVendido) {
				masVendido = totalPorEstacion[i];
				indiceMasVendido = i;
			}
		}
		System.out.println(tipoNafta[indiceMasVendido] +": " + masVendido);
	}
}
