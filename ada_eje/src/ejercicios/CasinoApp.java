package ejercicios;

import java.util.Random;

public class CasinoApp {
	
	public static final int Medida = 100;
	
	public static void main(String[] args) {
		Random aleatorioRuleta = new Random();
		int cas [] = new int [Medida];
		for (int i = 0; i < cas.length; i++) {
			cas [i]= aleatorioRuleta.nextInt(37);
		}
		System.out.println("PRIMEROS 100 GIROS RULETA");
		System.out.println("========================");
		System.out.println("");
		float ejecuciones = 0;
		for (int i = 0; i <  cas.length; i ++) {
			System.out.println("TIRO " + i + " = " + cas[i]);
		}
		int num=0,c;
		int veces=0;
		c=0;
		for (int i = 0; i <=9; i ++) {
			c=0;
			for (int j = 0; j < Medida; j ++) {
				if (i ==cas[j]) {
					c=c+1;
				}
			}
			if (i ==0) {
				veces = c;
				num = i;
			}else {
				if (veces<c) {
					veces = c;
					num = i;
				}
			}
		}
		System.out.println(" ");
		System.out.println("El numero = " + num + " salio mas cantidad de veces."  );
		System.out.println("Cantidad de veces que salio = " + veces );
	}
	public static int aleatorioRuleta (int upperRange) {
		Random random = new Random ();
		return random.nextInt(upperRange);
	}

}
