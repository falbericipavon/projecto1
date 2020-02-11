package ejercicios;

public class RuletaNumeros {

	private int numeros;
	private int contador;
	private String color;
	
	
	public RuletaNumeros (int numeros, String color, int contador) {
		this.numeros = numeros;
		this.contador = 0;
		this.color = color;
		
	}
	public RuletaNumeros (int numeros) {
		this.numeros = numeros;
		this.contador = 0;
		
	}
	
	public int getNumeros() {
		return numeros;
	}

	public void setNumeros(int numeros) {
		this.numeros = numeros;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color =  color;
	}
	public int getContador() {
		return contador;
	}

	public void setContador (int contador) {
		this.contador = contador;
	}
	
	public void acumular() {
		this.contador++;
	}

	public String toString () {
		return  "EL NUMERO " + numeros + ". SALIO = " + contador ;
	}
	
	
}
