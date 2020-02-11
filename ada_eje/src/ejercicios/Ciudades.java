package ejercicios;

public class Ciudades {
	
	int distancia;
	

	String nomCiudad;
	
	public Ciudades (int km, String nombre) {
		distancia = km;
		this.nomCiudad = nombre;
		
	}	
	
	
	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public String getNomCiudad() {
		return nomCiudad;
	}

	public void setNomCiudad(String nomCiudad) {
		this.nomCiudad = nomCiudad;
	}
}
