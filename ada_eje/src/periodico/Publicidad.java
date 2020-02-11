package periodico;

import java.awt.Dimension;

public class Publicidad extends Vinieta {

	private String auspiciante;
	private float precio;
	
	public Publicidad(String imagen, String link, String seccion, String posicion, Dimension dimension,
			String auspiciante, float precio) {
		super (imagen, link, seccion, posicion, dimension);
		this.auspiciante= auspiciante;
		this.precio = precio;
		
	}
	
	public String getAuspiciante() {
		return auspiciante;
	}
	public void setAuspiciante(String auspiciante) {
		this.auspiciante = auspiciante;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String toString() {
		return  "SECCION: "+ seccion + " - " +"AUSPICIANTE: "+ auspiciante + " - " +"PRECIO: "+ precio +" - " +"FACTURABLE: "+ esFacturable();
	}

	
	public boolean esFacturable() {
		return true;
	}
	
}
