package ejercicios;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		Recaudacion[] rec = new Recaudacion[360];
		for (int i = 0; i < rec.length; i++) {
			rec[i] = new Recaudacion(App.aleatorio(50), App.aleatorio(50));
		}
		float total6meses = 0;
		for (int i = 180; i < rec.length; i++) {
			total6meses += rec[i].getEfectivo() + rec[i].getTarjeta();
		}
		System.out.println("TOTALES RECAUDADOS");
		System.out.println("====================");
		System.out.println("");
		System.out.println("1. Totales ultimos 6 meses: " + total6meses);

		float total4meses = 0;
		for (int i = 30 * 3; i < 30 * 4; i++) {
			total4meses += rec[i].getEfectivo() + rec[i].getTarjeta();
		}
		System.out.println("2. Totales mes 4: " + total4meses);
		
		for (int i = 0; i < rec.length; i++) {
			if ( i%7 == 0) {
				System.out.println();
			}
			System.out.println(rec[i].getEfectivo()+ " ");
		}
	}

	public static int aleatorio(int upperRange) {
		Random random = new Random();
		return random.nextInt(upperRange);
	}
}
