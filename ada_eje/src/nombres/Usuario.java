package nombres;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Usuario {

	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	
	
	public Usuario(String nombre, String apellido, Date fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String toString(){
		SimpleDateFormat df = new SimpleDateFormat(Constantes.FORMATO_FECHA_STD);
		return apellido + ", " + nombre + ". Fecha nacimiento " + df.format(fechaNacimiento);
		
	}
}
