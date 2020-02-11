package ejercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class HojaRuta {

	public static void main(String[] args) {
		String km = JOptionPane.showInputDialog("Ingrese cantidad de ciudades:");
		int cantCiudades = Integer.valueOf(km);
		String nomCiudad [];
		nomCiudad = new String [cantCiudades];
		int disCiudad [];
		disCiudad = new int [cantCiudades];
		for (int i = 0; i < cantCiudades; i++ ) {
			String nombreCiudad = JOptionPane.showInputDialog("Ingrese nombre de ciudad " + (i +1) + ":");
			nomCiudad [i] = nombreCiudad;
			String distanciaCiudad = JOptionPane.showInputDialog("Ingrese Km distancia de ciudad "  + (i +1) + ":");
			int numDistancia = Integer.valueOf(distanciaCiudad );
			disCiudad [i] = numDistancia;
		}
		int kmDist = 0;
		String auxCiudad;
		int auxUbicacion;
		for (int i = 1; i < cantCiudades; i++ ) {
			for (int j = 0; j < (cantCiudades-1); j++ ) {
				if (disCiudad [j]>disCiudad [j+1]) {
					auxUbicacion= disCiudad [j];
					disCiudad [j]=disCiudad [j+1];
					disCiudad [j+1] = auxUbicacion;
					auxCiudad = nomCiudad [j];
					nomCiudad [j] = nomCiudad [j+1];
					nomCiudad [j+1] = auxCiudad ;
				}
			}
		}
		System.out.println("CIUDADES ORDENADAS POR DISTANCIA");
		System.out.println("================================");
		System.out.println(" ");
		for (int i = 0; i < cantCiudades; i++ ) {
			System.out.println(nomCiudad [i]+ ":" +disCiudad [i] + "km");
		}
		
		System.out.println("");
		System.out.println("DISTANCIAS ");
		System.out.println("==========");
		System.out.println(" ");
		int mayorDistancia = 0;
		int indiceMayorDistancia =0;
		
		for (int i = 0 ; i < cantCiudades; i ++) {
			if (disCiudad [i] > mayorDistancia) {
				mayorDistancia = disCiudad [i];
				indiceMayorDistancia = i;
			}
		}
		System.out.println("Cuidad: " + nomCiudad[indiceMayorDistancia] + ". Tiene la mayor distancia: " + mayorDistancia + "km");
		int mayorDistanciaentreciudad = 0;
		int diferencia;
		for (int i = 0 ; i < cantCiudades-1; i ++) {
			diferencia= disCiudad [i+1] -  disCiudad [i];
			kmDist +=  diferencia;
			if (mayorDistanciaentreciudad < diferencia) {
				mayorDistanciaentreciudad = diferencia;
			}
		}
		int promedio = kmDist /(cantCiudades-1);
		System.out.println("La mayor distancia entre ciudades es de: " + mayorDistanciaentreciudad  + "km");
		System.out.println("La distancia promedio es de: " + promedio + "km");
	}
	
}
