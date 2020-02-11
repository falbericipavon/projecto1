package ejercicios;

import java.util.Scanner;

public class RecorridoCiudad {

	public static void main(String[] args) {
		
		System.out.println("HOJA DE RUTA");
		System.out.println("============");
		System.out.println(" ");
		System.out.println("Ingrese cantidad de ciudades: ");
		Scanner scan = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);
		int cantCiudades = scan.nextInt();
		String nomCiudad [];
		nomCiudad = new String [cantCiudades];
		int disCiudad [];
		disCiudad = new int [cantCiudades];
		HojaDeRuta[] ap = new HojaDeRuta[cantCiudades];
		for (int i = 0; i < cantCiudades; i++ ) {
			System.out.println("Ingrese nombre ciudad: ");
			nomCiudad [i]= entrada.next();
			System.out.println("Ingrese distancia en kilometros: ");
			disCiudad [i] = scan.nextInt();
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
		for (int i = 0; i < cantCiudades; i++ ) {
			System.out.println("CIUDADES ORDENADAS POR DISTANCIA");
			System.out.println("================================");
			System.out.println(" ");
			System.out.println(nomCiudad [i]+ ":" +disCiudad [i] + "km");
		}
		
		System.out.println("");
		System.out.println("Mayor distancia: ");
		int mayorDistancia = 0;
		int indiceMayorDistancia =0;
		
		for (int i = 0 ; i < ap.length; i ++) {
			if (disCiudad [i] > mayorDistancia) {
				mayorDistancia = disCiudad [i];
				indiceMayorDistancia = i;
			}
		}
		System.out.println("Cuidad: " + nomCiudad[indiceMayorDistancia] + ". Tiene la mayor distancia: " + mayorDistancia + "km");
		for (int i = 0 ; i < cantCiudades-1; i ++) {
			kmDist +=  disCiudad [i+1] -  disCiudad [i];
			if (mayorDistancia < disCiudad [i+1]-disCiudad [i]) {
				mayorDistancia = disCiudad [i+1]-disCiudad [i] ;
			}
		}
		int promedio = kmDist /(cantCiudades-1);
		System.out.println("La distancia promedio es de: " + promedio + "km");
	}
}
