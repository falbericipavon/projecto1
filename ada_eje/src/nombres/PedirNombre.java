package nombres;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PedirNombre {
	
	public static void main(String[] args) {
		
		String cartelBienvenida = "BIENVENIDO AL SITEMA";
				
		JOptionPane.showMessageDialog(null, cartelBienvenida);
		String apellidoUsuario = JOptionPane.showInputDialog("Ingresa tu apellido");
		String nombreUsuario = JOptionPane.showInputDialog("Ingresa tu nombre");
		
		char inicialNombre = nombreUsuario.charAt(0);
		char inicialApellido = apellidoUsuario.charAt(0);
		
		String inicialNom = String.valueOf(inicialNombre);
		String inicialApe = "" + inicialApellido;
		
		String mayusIniNom = inicialNom.toUpperCase();
		String mayusIniApe = inicialApe.toUpperCase();
		
		nombreUsuario = nombreUsuario.toLowerCase();
		apellidoUsuario= apellidoUsuario.toLowerCase();
		
		nombreUsuario = nombreUsuario.substring(1);
		apellidoUsuario= apellidoUsuario.substring(1);
		
		String cartelNombre = "SU NOMBRE ES:\n"+ mayusIniApe + apellidoUsuario + ", " + mayusIniNom + nombreUsuario;
		
		JOptionPane.showMessageDialog(null, cartelNombre );
		
		
	}
	
	
}
