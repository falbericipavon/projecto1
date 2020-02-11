package excepciones;

public class AppExcepcion {

	public static void main(String[] args) throws AgotadoException{
		
		Pasaje[]  micro= new Pasaje[40];
		Pasaje pas = new Pasaje();
		pas.setDni("123");
		pas.setNombre("ABC");
		
		try {
			VentaPasaje vp = new VentaPasaje();
			vp.vender(micro, pas);
			
		} catch (Exception e) {
			System.out.println("Se lanzo una excepcion " + e.getMessage());
		}
		finally {
			System.out.println("Prueba finally");
		}
	}
}
