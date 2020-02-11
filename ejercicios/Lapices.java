package ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lapices {
	double canLapices;
	
	
	public static void main(String[] args) {
		System.out.println("LAPICES");
		System.out.println("=======");
		System.out.println(" ");
		double pag;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese cantidad de lapices: ");
		double canLapices = scan.nextDouble();
		if (canLapices >= 1000 ) {
			pag = canLapices * 0.80;
		} else {
			pag = canLapices * 0.90;
		}
		DecimalFormat formateador = new
		DecimalFormat("####.00");
		System.out.println("El pago es: $" + formateador.format(pag));
	}
}
