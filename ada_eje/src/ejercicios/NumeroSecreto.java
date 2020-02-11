package ejercicios;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class NumeroSecreto {
	
 /*
  * Adivinar un numero del 1 al 10 que debe elegir la maquina en forma aleatoria 
  * Una vez acertado debe indicar en cuantos intentos lo hemos conseguido
  * 
  */
	
	
	public static void main(String[] args) {
		
		System.out.println("BIENVENIDO AL JUEGO");
		System.out.println("==========================");
		System.out.println("");
		System.out.println("Pensaré un numero del 0 al 10");
		System.out.println("Tenes 10 oportunidades para adivinarlo");
		System.out.println("");
		
		
		int numSercreto = aleatorio (11);
		int contador=0;
		int numerAux=0;
		
		do {
			contador++;
			Scanner scan = new Scanner(System.in);
			System.out.println("");
			System.out.println("Ingresa el numero");
			int numElegido = scan.nextInt();
			numerAux = numElegido;
			if(numElegido>numSercreto) {
				System.out.println("El numero es menor");
			}else if(numElegido<numSercreto) {
				System.out.println("El numero es mayor");
			}
		} while(numerAux!=numSercreto);
		
			
		
		System.out.println(" ");
		System.out.println("GANASTE");
		System.out.println("=======");
		System.out.println("El numero era el: " + numSercreto);
		System.out.println("Lo lograste en: " + contador + " intentos.");
	}
	
	public static int obtenerValor() {
		int valor=0;
		return valor;
		
	}

	public static int aleatorio(int upperRange) {
		Random random = new Random();
		return random.nextInt(upperRange);
	}
	
}
