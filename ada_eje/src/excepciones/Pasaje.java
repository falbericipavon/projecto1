package excepciones;

public class Pasaje {

	private String nombre;
	private String dni;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String toString(){
		return nombre + ", " + dni + " :";
	}
	
}
