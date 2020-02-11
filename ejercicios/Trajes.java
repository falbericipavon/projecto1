package ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Trajes {
	
	double cosTraje;
	
	public static void main(String[] args) {
		System.out.println("TRAJES");
		System.out.println("======");
		System.out.println(" ");
		double descuento1 = 0.15;
		double descuento2 = 0.08;
		double precioFinal;
		double descuento;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese costo del traje: ");
		double cosTraje = scan.nextDouble();
		if (cosTraje >= 2500 ) {
			descuento = cosTraje * descuento1;
		} else {
			descuento = cosTraje * descuento2;
		}
		precioFinal = cosTraje - descuento;
		DecimalFormat formateador = new
		DecimalFormat("####.00");
		System.out.println("El precio final es: " + formateador.format(precioFinal));
		System.out.println("El descuento aplicado fue: " + formateador.format(descuento));
	}
}
