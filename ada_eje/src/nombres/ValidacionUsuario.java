package nombres;


	import java.util.Calendar;
	import java.util.Date;
	import java.util.GregorianCalendar;

public class ValidacionUsuario {
		
		public static boolean validarMayor(Date dateFNac) {

			// generar fecha en base al calculo -18 años de la fecha actual
			GregorianCalendar limite18 = new GregorianCalendar();
			limite18.add(Calendar.YEAR, -18);
			
			// comparar si tiene 18 años
			return dateFNac.before(limite18.getTime());
		}
		
		public static boolean validarLongitud(String contrasena) {
			return contrasena.length() >= Constantes.LONGITUD_CONTRASENA;
		}
		
		public static boolean validarFechaPasada(Date fecha) {
			return fecha.before(new Date());
		}

	}