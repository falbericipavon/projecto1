package auto;

public class Auto {
	private String patente;
	private String modelo;

	public Auto(String patente, String modelo) {
		super();
		this.patente = patente;
		this.modelo = modelo;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
