package tienda;

import java.util.Scanner;



public class AppTienda {

	public static void main(String[] args) {
		System.out.println("APLICACION TIENDA:");
		System.out.println("==================");
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		
		Lavarropa prod1 = new Lavarropa();
		prod1.setCantidad(10);
		prod1.setMarca("KOHINOOR");
		prod1.setPrecio(50000);
		
		Lavarropa prod2 = new Lavarropa();
		prod2.setCantidad(5);
		prod2.setMarca("Philco");
		prod2.setPrecio(20000);
		
		
		Heladera prod3 = new Heladera();
		prod3.setCantidad(15);
		prod3.setMarca("Samdung");
		prod3.setPrecio(35000);
		
		Heladera prod4 = new Heladera();
		prod4.setCantidad(20);
		prod4.setMarca("Patrick");
		prod4.setPrecio(30000);
		
		Productos h1 = new Productos();
		h1.setProductoH(prod3);
		
		Productos h2 = new Productos();
		h2.setProductoH(prod4);
		
		Productos l1 = new Productos();
		l1.setProductoL(prod1);
		
		Productos l2 = new Productos();
		l2.setProductoL(prod2);
		
		
		System.out.println("");

		System.out.println("Cual es la operacion que desea realizar ");
		System.out.println("1. Comprar un Lavarropas");
		System.out.println("2. Comprar una Heladera");
		System.out.println("Operacion elegida:");
		int cliEleccion = sc.nextInt();
		
		try {
		switch (cliEleccion) {
			case 1: {
				System.out.println(" ");
				System.out.println("Tiene las siguientes opciones de Lavarropas: ");
				System.out.println(prod1);
				System.out.println(prod2);
				System.out.println("Elija un producto:");
				int proEleccion = sc.nextInt();
				if (proEleccion ==1) {
					System.out.println("Cantidad: ");
					int cantidadR = sc.nextInt();
					l1.getProductoL().comprar(cantidadR);
					System.out.println("Precio final: " + (cantidadR * prod1.getPrecio()) );
				}else {
					System.out.println("Cantidad: ");
					int cantidadR = sc.nextInt();
					l2.getProductoL().comprar(cantidadR);
					System.out.println("Precio final: " + (cantidadR * prod2.getPrecio()) );
				}
				
				break;
			}
			case 2: {
				System.out.println(" ");
				System.out.println("Tiene las siguientes opciones de Heladeras: ");
				System.out.println(prod3);
				System.out.println(prod4);
				System.out.println("Elija un producto:");
				int proEleccion = sc.nextInt();
				if (proEleccion ==1) {
					System.out.println("Cantidad: ");
					int cantidadR = sc.nextInt();
					h1.getProductoH().comprar(cantidadR);
					System.out.println("Precio final: " + (cantidadR * prod3.getPrecio()) );
				}else {
					System.out.println("Cantidad: ");
					int cantidadR = sc.nextInt();
					h2.getProductoH().comprar(cantidadR);
					System.out.println("Precio final: " + (cantidadR * prod4.getPrecio()) );
				}
				break;
			}
		}
		} catch (SinStock e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
