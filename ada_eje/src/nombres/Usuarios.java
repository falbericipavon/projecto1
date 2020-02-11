package nombres;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Usuarios {

	private String nombre;
	private String contrase�a;
	private Date fechaNacimiento;
	private Date fechaContrase�a;
	
	public Usuarios (String nombre, Date fechaNacimiento, String contrase�a) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.contrase�a = contrase�a;
		this.fechaContrase�a = new Date();
	}

	
	public Date getFechaContrase�a() {
		return fechaContrase�a;
	}


	public void setFechaContrase�a(Date fechaContrase�a) {
		this.fechaContrase�a = fechaContrase�a;
	}


	public String getContrase�a() {
		return contrase�a;
	}


	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
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

	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat(Constantes.FORMATO_FECHA_STD);
		// format pasa de data a string
		return nombre + " " + sdf.format(fechaNacimiento);
	}
}