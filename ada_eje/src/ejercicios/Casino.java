package ejercicios;

import java.text.DecimalFormat;
import java.util.Random;

public class Casino {

	public static void main(String[] args) {
		
		RuletaNumeros[] rul = new RuletaNumeros[37];
		
		for (int i = 0; i < rul.length; i++) {
			rul[i]= new RuletaNumeros(i);
			
		}
		DecimalFormat formateador = new
		DecimalFormat("00");	
		for (int i = 0; i < 100; i++) {
			 int sorteo = aleatorio (37);
			 rul[sorteo].acumular();
			 System.out.println("TIRO "+ formateador.format(i+1) + "= " + formateador.format(sorteo) + ".  CONTADOR= " +rul[sorteo].getContador());
			 
		}
		
		RuletaNumeros aux;
		for (int i = 0; i < rul.length; i++) {
			for (int j = 0; j < rul.length - 1; j++) {
				if (rul[i].getContador() > rul[j].getContador()) {
					aux = rul[j];
					rul[j] = rul[i];
					rul[i] = aux;
				}
			}
		}
		System.out.println("");
		System.out.println("3 NUMEROS QUE MAS SALIERON");
		System.out.println("==========================");
		System.out.println("");
		for (int i = 0; i < 3; i++) {
			System.out.println(rul[i]);
		}
		
		System.out.println("");
		System.out.println("10 COLORES QUE MAS SALIERON");
		System.out.println("==========================");
		System.out.println("");
		for (int i = 0; i < rul.length - 20; i++) {
			if (rul[i].getNumeros() == 0) {
				System.out.println("TIRO "+ formateador.format(i+1) + "= " + formateador.format(rul[i].getNumeros()) +" COLOR = Verde");
			} else {
				if ((rul[i].getNumeros() >=1) && (rul[i].getNumeros()<= 7)) {
					System.out.println("TIRO "+ formateador.format(i+1) + "= " + formateador.format(rul[i].getNumeros()) +" COLOR = Rojo");
				}else {
					if ((rul[i].getNumeros()>=8) && (rul[i].getNumeros()<= 15)) {
						System.out.println("TIRO "+ formateador.format(i+1) + "= " + formateador.format(rul[i].getNumeros()) +" COLOR = Negro");
					}
				}
			} 
		}
	}
	
	public static int aleatorio(int upperRange) {
		Random random = new Random();
		return random.nextInt(upperRange);
	}
	
}
