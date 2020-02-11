package nombres;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dia {

	public static void main(String[] args) throws ParseException {
		
		Date ahora = new Date();
		long ahoraLong = System.currentTimeMillis();
		
		System.out.println(ahora);
		System.out.println(ahoraLong);
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		SimpleDateFormat sdfh = new SimpleDateFormat ("H:mm:ss");
		System.out.println( "format: " + sdf.format(ahora));
		System.out.println( "format: " + sdfh.format(ahora));
		System.out.println( " ");
		
		Date noventas = sdf.parse("12/11/1990");
		Date nov = sdf.parse("12/11/2019");
		
		if (nov.before(noventas)) {
			System.out.println( sdf.format(nov));
			System.out.println( "la fecha es posterior");	
		}
		else {
			System.out.println( sdf.format(noventas));
			System.out.println( "la fecha es anterior");	
		}
		
	}
	
}
