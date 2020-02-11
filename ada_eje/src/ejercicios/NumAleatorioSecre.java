package ejercicios;

public class NumAleatorioSecre {

	private int valor;
	private int oportunidades;
	
	public NumAleatorioSecre(int valor) {
		this.valor = valor;
		this.oportunidades = 1;
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getOportunidades() {
		return oportunidades;
	}
	public void setOportunidades(int oportunidades) {
		this.oportunidades = oportunidades;
	}
	public void acumularOportunidades(int oportunidades) {
		oportunidades++;
	}
}
