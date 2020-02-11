package figuras;

public abstract class FiguraGeometrica {
	
	protected int base;
	
	public FiguraGeometrica(int base) {
		this.base = base;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
	public abstract String cantidadLados();

}
