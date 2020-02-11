package projecto1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AlumnosPromedio {
	int nota1;
	int nota2;
	int nota3;
	String nombre;
	float promedio;
	float suma;
	
	public AlumnosPromedio(int n1, int n2, int n3, String nombre) {
		nota1 = n1;
		nota2 = n2;
		nota3 = n3;
		this.nombre = nombre;
		suma = nota1 + nota2 + nota3;
		promedio = suma/3;
	}	
	
	public static void main(String[] args) {
		System.out.println("Ingrese cantidad de alumnos: ");
		Scanner scan = new Scanner(System.in);
		int cant = scan.nextInt();
		AlumnosPromedio[] ap = new AlumnosPromedio[cant];
		
		for (int i = 0; i < ap.length; i++ ) {
			System.out.println("Ingrese nombre alumno: ");
			String nom = scan.next();
			System.out.println("Ingrese notas 1: ");
			int nota1 = scan.nextInt();
			System.out.println("Ingrese notas 2: ");
			int nota2 = scan.nextInt();
			System.out.println("Ingrese notas 3: ");
			int nota3 = scan.nextInt();
			float suma = 0;
			float promedio = 0;
			suma = nota1 + nota2 + nota3;
			promedio = suma/3;
			DecimalFormat formateador = new
					DecimalFormat("####.00");	
			        System.out.println();
			        System.out.println("El Alumno: " + nom);
					System.out.println("Tiene de Promedio: " + formateador.format(promedio));
					System.out.println();
			
			AlumnosPromedio alu= new AlumnosPromedio(nota1, nota2, nota3, nom);
			ap[i]= alu;
		}
		for (int i = 0; i < ap.length; i++ ) {
			String nombre = ap[i].getNombre();
			int n1 = ap[i].getNota1();
			int n2 = ap[i].getNota2();
			int n3 = ap[i].getNota3();
			float promedio = ap[i].getPromedio();
			System.out.println("RESULTADOS");
			System.out.println("==========");
			System.out.println(" ");
			System.out.println("El alumno: " + nombre);
			DecimalFormat formateador = new
			DecimalFormat("####.00");
			System.out.println("Tiene las notas: " + n1 + " " + n2 + " " + n3);
			System.out.println("Tiene un promedio: " + formateador.format(promedio));
			System.out.println(" ");
		}
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getSuma() {
		return suma;
	}
	public void setSuma(float suma) {
		this.suma = suma;
	}
	public float getPromedio() {
		return promedio;
	}
	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}
}
	
