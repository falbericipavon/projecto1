package projecto1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Promediosimple {
	private int nota1;
	private int nota2;
	private int nota3;
	private int suma;
	private float promedio;	

	public Promediosimple(){
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese Nota 1: ");
		nota1 = sc.nextInt();
		System.out.println("ingrese Nota 2: ");
		nota2 = sc.nextInt();
		System.out.println("ingrese Nota 3: ");
		nota3 = sc.nextInt();
		suma = nota1 + nota2 + nota3;
		promedio = suma /3 ;
		System.out.println("el Promedio es: " + promedio);
		sc.close();
	}
	public static void main(String[] args) {
		Promediosimple proj = new Promediosimple();
	}

}