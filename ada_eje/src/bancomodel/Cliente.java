package bancomodel;


public class Cliente extends Cuenta {


	private String nombre;
	private String dni;
	private CuentaCorriente sCuentaCorriente;
	private CajaAhorro sCajaAhorro;
	
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
	public CuentaCorriente getsCuentaCorriente() {
		return sCuentaCorriente;
	}
	public void setsCuentaCorriente(CuentaCorriente sCuentaCorriente) {
		this.sCuentaCorriente = sCuentaCorriente;
	}
	public CajaAhorro getsCajaAhorro() {
		return sCajaAhorro;
	}
	public void setsCajaAhorro(CajaAhorro sCajaAhorro) {
		this.sCajaAhorro = sCajaAhorro;
	}

}
