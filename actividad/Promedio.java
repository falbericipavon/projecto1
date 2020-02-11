package projecto1;

import java.util.Scanner;

public class Promedio {
	int nota1;
	int nota2;
	int nota3;
	
	public Promedio() {
		System.out.println("Ingrese cantidad alumnos: ");
		Scanner scan1 = new Scanner(System.in);
		int canAlumnos = scan1.nextInt();
		int[] alumnos = new int [canAlumnos];
		String alum = "";
		for (int i = 0; i < canAlumnos; i++) {
			System.out.println("Ingrese nombre ");
			String nombres[] = new String[canAlumnos];
			Scanner teclado = new Scanner(System.in);
			nombres [i] = teclado.next();
			alum = nombres[i];
		}	
			System.out.println("Ingrese cantidad notas ");
			Scanner scan2 = new Scanner(System.in);
			int canNotas = scan2.nextInt(); 
			int notas [] = new int [canNotas];
			float promedio = 0;
			for (int j = 0; j < canNotas; j++) {
				System.out.println("Ingrese nota " + (j + 1));
				notas [j] = scan2.nextInt();
				promedio += notas[j];
			}
			System.out.println("El alumno es: " + alum);
			System.out.println("El promedio es: " + promedio/canNotas);
		}
	public Promedio(int n1, int n2, int n3 ) {
		nota1 = n1;
		nota2 = n2;
		nota3 = n3;
	}
	public Promedio(int n1, int n2, int n3, int n4, String nombre) {
		nota1 = n1;
		nota2 = n2;
		nota3 = n3;
	}
	public Promedio(String mensaje) {
	}
	public static void main(String[] args) {
		Promedio prom1 = new Promedio();
	}
	public int getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	public int getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	public int getNota3() {
		return nota3;
	}
	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}
}

