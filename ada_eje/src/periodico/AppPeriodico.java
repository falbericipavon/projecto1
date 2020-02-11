package periodico;

import java.awt.Dimension;
import java.util.Scanner;

import recorrido.Turistico;

/**
 * En el periodico tenemos anuncios y notas. 
 * Se pueden publicar en 5 viñetas por dia.
 * Se solicita generar la estructura de clases que soporte la informacion necesaria
 * Ingresar por teclado los datos y se cargan las 5 posiciones de las viñetas
 * del periodico, mostrar el contenido de todas 
 *
 */
public class AppPeriodico {

	public static void main(String[] args) {
		
		Vinieta[] pagina = new Vinieta[3];
		System.out.println("APLICACION PERIODICO");
		System.out.println("====================");
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < pagina.length; i++) {
			System.out.println("Tipo (1=Publicidad 2=Articulo)");
			int tipo = sc.nextInt();
			
			System.out.println("Seccion:");
			String seccion = sc.next();
			// el resto de los atributos
			
			switch (tipo) {
			case 1: {
				System.out.println("Auspiciante:");
				String ausp = sc.next();
				System.out.println("Precio:");
				float precio = sc.nextFloat();
				Publicidad pub = new Publicidad("", "",  seccion, "", new Dimension(3,2), ausp, precio);
				pagina[i] = pub;
				break;
			}
			case 2: {
				System.out.println("Titulo:");
				String titulo = sc.next();
				System.out.println("Autor:");
				String autor = sc.next();
				System.out.println("Cuerpo:");
				String cuerpo = sc.next();
				Articulo art = new Articulo(titulo, autor, cuerpo, "", "", seccion, "", new Dimension(2,2) );
				pagina[i] = art;
				

				break;
			}

			default:
				break;
			}
		}
		System.out.println("");
		System.out.println("5 VIÑETAS DEL DIA");
		System.out.println("=================");
		System.out.println("");
		Publicidad itemPubli;
		float total;
		for (int i = 0; i < pagina.length; i++) {
			System.out.print(pagina[i]);
			if (pagina[i] instanceof Publicidad) {
				System.out.print("(PUBLICIDAD)");
				System.out.print("");
			}
			else {
				System.out.print(" (ARTICULO)");
				System.out.print("");
			}
			System.out.println();
		}
		for (int i = 0; i < pagina.length; i++) {
			if (pagina[i].esFacturable()) {
				itemPubli = (Publicidad) pagina[i];
				total = itemPubli.getPrecio();
			}
		}
	}

}