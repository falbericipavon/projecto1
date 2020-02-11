package figuras;

public class Rectangulo extends FiguraGeometrica{


	private int altura;
	
	public Rectangulo(int base, int altura) {
		super(base);
		setAltura(altura);
	}
	
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public float area() {
		return getAltura() * getBase();
	}
	
	public String cantidadLados() {
		return "Posee cuatro Lados";
	}
}
