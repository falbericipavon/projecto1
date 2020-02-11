package projecto1;

import java.util.Scanner;

public class NombreCompleto {
 private String nombre;
 private String apellido;

 public NombreCompleto(){
	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Ingrese Nombre: ");
	 nombre = sc.next();
	 System.out.println("Ingrese Apellido: ");
	 apellido = sc.next();
	 System.out.println("El nombre completo es: " + nombre + " " + apellido);
	 sc.close();
 }
 
 public static void main(String[] args) {
		NombreCompleto nom = new NombreCompleto();
	}
 
}
