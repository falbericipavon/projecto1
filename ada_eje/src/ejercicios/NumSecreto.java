package ejercicios;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class NumSecreto {
	

	public static void main(String[] args) {
		
		System.out.println("BIENVENIDO AL JUEGO");
		System.out.println("==========================");
		System.out.println("");
		System.out.println("Pensaré un numero del 0 al 10");
		System.out.println("Tenes 10 oportunidades para adivinarlo");
		System.out.println("");
		
		NumAleatorioSecre na = new NumAleatorioSecre (new Random().nextInt(10));
		int numerAux=0;
		int contador=0;
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("");
			System.out.println("Ingresa el numero");
			int numElegido = scan.nextInt();
			numerAux = numElegido;
			contador++;
			if(numElegido>na.getValor()  && na.getOportunidades()!=10) {
				System.out.println("VUELVE A INTENTARLO");
				System.out.println("El numero es menor");
				
			}else if(numElegido<na.getValor() && na.getOportunidades()!=10) {
				System.out.println("VUELVE A INTENTARLO");
				System.out.println("El numero es mayor");
			}else if(na.getOportunidades()==10) {
				System.out.println("LLEGASTE A TU NUMERO MAXIMO DE INTENTOS");
				break; } 
		} while(numerAux!=na.getValor());
		
		System.out.println(" ");
		System.out.println("GANASTE");
		System.out.println("=======");
		System.out.println("El numero era el: " + na.getValor());
		System.out.println("Lo lograste en: " + contador + " intentos.");
	}
		

	
	
}
