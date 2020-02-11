package figuras;

public class Cuadrado extends FiguraGeometrica {
	
	public Cuadrado(int base) {
		super(base);
	}

	public float area() {
		return getBase() * getBase();
	}
	
	public float perimetro() {
		return getBase() * 4;
	}

	@Override
	public String cantidadLados() {
		return "Posee cuatro Lados";
	}

}
