package projecto1;

import java.util.Scanner;

public class Ejercicio2 {
	private int valor3;
	private int valor4;

public Ejercicio2(){
	Scanner sc = new Scanner(System.in);
	System.out.println("ingrese valor 1: ");
	valor3 = sc.nextInt();
	System.out.println("ingrese valor 2: ");
	valor4 = sc.nextInt();
	int total = valor3 + valor4;
	System.out.println("el total es: " + total);
	sc.close();
    }
public static void main(String[] args) {
	Ejercicio2 eje2 = new Ejercicio2();
}
}