package projecto1;

import java.util.Scanner;
/**
 * @author Usuario
 * Javadoc para el metodo
 */

public class Nombre {
 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese Nombre: ");
		String nombre = sc.next();
		System.out.println("Ingrese Apellido: ");
		String apellido = sc.next();
		System.out.println("El nombre completo es: " + nombre + " " + apellido);
		sc.close();
	}
}
