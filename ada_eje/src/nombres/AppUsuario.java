package nombres;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class AppUsuario {
	


	public static void main(String[] args) throws ParseException {
		
		System.out.println("NOMBRE Y NACIMIENTO");
		System.out.println("===================");
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese nombre usuario");
		String nombre = sc.next();
		System.out.println("Ingrese contrase�a usuario (Minimo: " + Constantes.LONGITUD_CONTRASENA + " caracteres)");
		
		String password = sc.next();
		while (!ValidacionUsuario.validarLongitud(password)) {
			System.out.println("Incorrecto: debe tener al menos " + Constantes.LONGITUD_CONTRASENA + " caracteres");
			System.out.println("Ingrese contrase�a usuario ");
			password = sc.next();
		}
		
		// repetir ingreso contrase�a y validar que sean iguales
		System.out.println("Repetir contrase�a");
		String reingresoPassword = sc.next();
		while (!password.equals(reingresoPassword)) {
			System.out.println("Contrase�as no coinciden... Repetir contrase�a");
			reingresoPassword = sc.next();
			
		}
		
		
		System.out.println("Ingrese fecha nacimiento (dd/mm/aaaa) ");
		String fnac = sc.next();
		
		// validar que la fecha sea en el pasado
		SimpleDateFormat sdf = new SimpleDateFormat(Constantes.FORMATO_FECHA_STD);
		Date dateFNac = sdf.parse(fnac); // pasa de string a date
		
		while (!ValidacionUsuario.validarFechaPasada(dateFNac)) {
			System.out.println("Ingrese fecha nacimiento (dd/mm/aaaa) ");
			fnac = sc.next();
			dateFNac = sdf.parse(fnac); 
		}
		
		Usuarios user = new Usuarios(nombre, dateFNac, password);
		System.out.println(user);
		
		//verificar si el usuario puede darse de alta
		if (ValidacionUsuario.validarMayor(user.getFechaNacimiento())) {

			// ahora tengo que calcular el vencimiento de la contrase�a 30 dias
			GregorianCalendar fechaVencimPassword = new GregorianCalendar();
			fechaVencimPassword.setTime(user.getFechaContrase�a());
			
			// sumo tres meses a la fecha. Uso el metodo add para sumar (o restar)
			// uso la constante MONTH de Calendar para hacer referencia al mes 
			// => sumo tres meses a la variable fechaVencimPassword
			fechaVencimPassword.add(Calendar.MONTH, 3);
			
			// convierto la fecha de vencimiento a formato Date
			Date fechaVencimDate = fechaVencimPassword.getTime();
			
			// luego convierto la fecha de Date a String
			String fechaFormatoStr = sdf.format(fechaVencimDate);
			
			// Muestro la fecha
			System.out.println("Su contrase�a caduca el " + fechaFormatoStr );
			
				
		}
		else {
			System.out.println("El usuario no puede ingresar por edad");
		}
		
		
	}
}
