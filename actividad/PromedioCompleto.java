package projecto1;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * @author Usuario
 * Javadoc para el metodo
 */

public class PromedioCompleto {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese Nota 1: ");
		int nota1 = sc.nextInt();
		System.out.println("ingrese Nota 2: ");
		int nota2 = sc.nextInt();
		System.out.println("ingrese Nota 3: ");
		int nota3 = sc.nextInt();
		float suma = nota1 + nota2 + nota3;
		float promedio = suma /3 ;
		sc.close();
		DecimalFormat formateador = new
		DecimalFormat("####.00");	
		System.out.println("el Promedio es: " + formateador.format(promedio));
	}
}
