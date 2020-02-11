package nombres;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.swing.JOptionPane;

public class NombreNacimiento {
	
public static void main(String[] args) throws ParseException {
		
		String cartelBienvenida = "BIENVENIDO AL SITEMA";
				
		JOptionPane.showMessageDialog(null, cartelBienvenida);
		String apellidoUsuario = JOptionPane.showInputDialog("Ingresa tu apellido");
		String nombreUsuario = JOptionPane.showInputDialog("Ingresa tu nombre");
		String fechNacimiento = JOptionPane.showInputDialog("Ingresa la fecha de nacimiento formato dd/mm/yyyy");
		Date ahora = new Date();
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date testDate = null;
        String date = fechNacimiento;
		
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
		
		String cartelNombre = "SU NOMBRE ES:\n"+ mayusIniApe + apellidoUsuario + ", "
		+ mayusIniNom + nombreUsuario;
		
		JOptionPane.showMessageDialog(null, cartelNombre );
		
		
		try{
            testDate = df.parse(date);
        	String cartelFecha = "SU FECHA DE NACIMIENTO ES:\n"+  df.format(testDate);
        	JOptionPane.showMessageDialog(null, cartelFecha);
        	
        } catch (Exception e){ System.out.println("formato invalido");}
 
      
		
	}

}
