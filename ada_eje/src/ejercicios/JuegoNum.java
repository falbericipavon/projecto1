package ejercicios;

import java.util.Random;

import javax.swing.JOptionPane;

public class JuegoNum {

public static final int Oportunidades = 10;
	
	public static void main(String[] args) {
		
		String JUEGO = "BIENVENIDO AL JUEGO ADIVINA EL NUMERO\n"
				+ "\n"
				+ "Pensaré un numero del 0 al 10\n"
				+ "Tenes 10 oportunidades para adivinarlo."
				+ "\n";
		JOptionPane.showMessageDialog(null, JUEGO);
		
		int numSercreto = aleatorio (11);
		int contador=0;
		int numerAux=0;
		
		do {
			contador++;
			String numSeleccionado = JOptionPane.showInputDialog("Ingresa el numero");
			int numSel = Integer.valueOf(numSeleccionado);
			numerAux = numSel;
			if(numSel>numSercreto && contador!=10) {
				JOptionPane.showMessageDialog(null, "VUELVE A INTENTARLO. EL NUMERO EN EL QUE PIENSO ES MENOR");
			}else if(numSel<numSercreto && contador!=10) {
				JOptionPane.showMessageDialog(null,"VUELVE A INTENTARLO. EL NUMERO EN EL QUE PIENSO ES MAYOR");
			}else if(contador==10) {
				JOptionPane.showMessageDialog(null,"LLEGASTE A TU NUMERO MAXIMO DE INTENTOS");
				break; } 
			
		} while(numerAux!=numSercreto);
		
		String GANASTE = "GANASTE JUEGO\n"
				+  "\n"
				+ "El numero era el: " + numSercreto +"\n"
				+ "Lo lograste en: " + contador + " intentos."
				+ "\n";	
		if(contador!=10) {
			JOptionPane.showMessageDialog(null, GANASTE);
			
		}
		
		
		
		
	}

	public static int aleatorio(int upperRange) {
		Random random = new Random();
		return random.nextInt(upperRange);
	}
	
}
