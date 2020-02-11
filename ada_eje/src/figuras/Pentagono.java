package figuras;

public class Pentagono extends FiguraGeometrica {
	
	public Pentagono(int base) {
		super(base);
	}

	public float perimetro() {
		return getBase() * 5;
	}
	
	public String cantidadLados() {
		return "Posee cinco Lados";
	}

}
