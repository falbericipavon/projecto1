package tienda;

public class Heladera extends Productos{

	@Override
	public void comprar(float cantidadR) throws SinStock {
		if (cantidad >= cantidadR) {
			cantidad = cantidad - cantidadR;
			System.out.println("Compra realizada");
			System.out.println("Cantidad de Heladeras en stock: " + cantidad);
		}
		else {
			throw new SinStock ("Cantidad de producto insuficiente: " + cantidad);
		}
	}
	
	public String toString() {
		return "Marca de la Heladera: " + marca + " - " + "Precio: " + precio + " - " + "Cantidad en Stock: " +cantidad;
	}

}
