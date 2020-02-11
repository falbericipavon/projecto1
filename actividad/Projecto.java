package projecto1;

import java.util.Scanner;

public class Projecto {

	int nota1;
	int nota2;
	int nota3;
	
	public Projecto() {
		System.out.println("Ingrese cantidad de notas: ");
		Scanner scan = new Scanner(System.in);
		int canNotas = scan.nextInt();
		int[] notas = new int [canNotas];
		float promedio = 0;
		for (int i = 0; i < canNotas; i++) {
			System.out.println("Ingrese nota " + (i + 1));
			notas [i] = scan.nextInt();
			promedio += notas[i];
		}
		System.out.println("El promedio es: " + promedio/canNotas);
	}
	public Projecto(int n1, int n2, int n3 ) {
		nota1 = n1;
		nota2 = n2;
		nota3 = n3;
	}
	public Projecto(int n1, int n2, int n3, int n4, String nombre) {
		nota1 = n1;
		nota2 = n2;
		nota3 = n3;
	}
	public Projecto(String mensaje) {
	}
	public static void main(String[] args) {
		Projecto prom1 = new Projecto();
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
