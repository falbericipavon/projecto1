package tienda;


public class Productos {

	protected int precio;
	protected String marca;
	protected String capacidad;
	protected float cantidad;
	private Lavarropa productoL;
	private Heladera productoH;
	
	public void comprar(float cantidadR) throws SinStock {
		if (cantidad >= cantidadR) {
			cantidad = cantidad - cantidadR;
			System.out.println("Compra realizada");
			System.out.println("Cantidad de Lavarropas en stock: " + cantidad);
		}
		else {
			throw new SinStock ("Cantidad de producto insuficiente: " + cantidad);
		}
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}
	public float getCantidad() {
		return cantidad;
	}
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	public Lavarropa getProductoL() {
		return productoL;
	}
	public void setProductoL(Lavarropa productoL) {
		this.productoL = productoL;
	}
	public Heladera getProductoH() {
		return productoH;
	}
	public void setProductoH(Heladera productoH) {
		this.productoH = productoH;
	}
}
