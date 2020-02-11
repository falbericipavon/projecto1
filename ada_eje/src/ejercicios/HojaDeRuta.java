package ejercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class HojaDeRuta {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "BIENVENIDO AL SISTEMA HOJA DE RUTA");
		String km = JOptionPane.showInputDialog("Ingrese cantidad de ciudades:");
		int cantCiudades = Integer.valueOf(km);
		Scanner scan = new Scanner(System.in);
		Ciudades[] ciud = new Ciudades[cantCiudades];
		for (int i = 0; i < ciud.length; i++) {
			String nomCiudad = JOptionPane.showInputDialog("Ingrese nombre de ciudad " + (i +1) + ":");
			String distanciaCiudad = JOptionPane.showInputDialog("Ingrese Km distancia de ciudad " + (i +1) + ":");
			int distancia = Integer.valueOf(distanciaCiudad);
			Ciudades ciu = new Ciudades(distancia, nomCiudad);
			ciud[i] = ciu;

		}
		int kmDist = 0;

		System.out.println("CIUDADES ORDENADAS POR DISTANCIA");
		System.out.println("================================");
		System.out.println(" ");
		Ciudades aux;
		for (int i = 1; i < cantCiudades; i++ ) {
			for (int j = 0; j < (cantCiudades-1); j++ ) {
				if (ciud[j].getDistancia()> ciud[j+1].getDistancia()) {
					aux = ciud[i];
					ciud[i] = ciud[j];
					ciud[j] = aux;
					
				}
			}
		}	
		for (int i = 0; i < cantCiudades; i++) {
			System.out.println(ciud[i].getNomCiudad() + ":" + ciud[i].getDistancia() + "km");
		}

		System.out.println("");
		System.out.println("Mayor distancia: ");
		int mayorDistancia = 0;
		int indiceMayorDistancia = 0;

		for (int i = 0; i < ciud.length; i++) {
			if (ciud[i].getDistancia() > mayorDistancia) {
				mayorDistancia = ciud[i].getDistancia();
				indiceMayorDistancia = i;
			}
		}
		
		System.out.println("Cuidad: " + ciud[indiceMayorDistancia].getNomCiudad() + ": " + mayorDistancia);
		int mayorDistanciaentreciudad = 0;

		for (int i = 0; i < cantCiudades - 1; i++) {
			int diferencia = ciud[i + 1].getDistancia() - ciud[i].getDistancia();
			kmDist += diferencia;
			if (mayorDistanciaentreciudad < diferencia) {
				mayorDistanciaentreciudad = diferencia;
			}
		}
		int promedio = kmDist / (cantCiudades - 1);
		System.out.println("La mayor distancia entre ciudades es de: " + mayorDistanciaentreciudad + "km");
		System.out.println("La distancia promedio es " + promedio + "Km");

	}

}
