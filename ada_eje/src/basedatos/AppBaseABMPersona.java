package basedatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class AppBaseABMPersona {

	public static void main(String[] args) {

		Connection conexion = null;
		try {
			conexion = NuevaABD.obtenerConexion();
			Scanner sc = new Scanner(System.in);

			int opcion = mostrarMenu(sc);
			while (opcion != 0) {

				switch (opcion) {
				case 1:
					alta(conexion, sc);
					break;
				case 2:
					modificacion(conexion, sc);
					break;
				case 3:
					baja(conexion, sc);
					break;
				case 4:
					listado(conexion);
					break;
				case 0:

					break;

				default:
					break;
				}
				opcion = mostrarMenu(sc);
			}

			conexion.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void listado(Connection conexion) {
		System.out.println();
		System.out.println("LISTADO--------------------");
		Statement stmt;
		try {

			stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM cliente");
			while (rs.next()) {
				Date fNac = rs.getDate(4);
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + fNac);
			}

			System.out.println("FIN LISTADO------------");
			System.out.println();
		} catch (SQLException e) {

		}

	}

	private static void baja(Connection conexion, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("BAJA DE PERSONA");
		System.out.println("===============");
		
		Statement stm;
		try {
			stm = conexion.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM cliente");
			while (rs.next()) {
				Date fNac = rs.getDate(4);
				System.out.println(rs.getInt(1) + " " + rs.getString(2)+ " " + rs.getInt(3) + " " + fNac);
			}
			System.out.println("FIN LISTADO------------");
			System.out.println();
		} catch (SQLException e) {

		}
		
		System.out.println("INGRESA EL ID DEL USUARIO QUE QUIERE ELIMINAR: ");
		Scanner scs = new Scanner(System.in);
		int numCli= scs.nextInt();
		
		Statement stmt;
		try {
			stmt = conexion.createStatement();
			System.out.println("ESTA SEGURO QUE QUIERE ELIMINAR EL SIGUENTE USUARIO");
			ResultSet rs = stmt.executeQuery("SELECT * FROM `ada`.`cliente` WHERE ID=" + numCli + ";");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2)+ " " + rs.getInt(3) + " " + rs.getString(4));
			}
			System.out.println("----------------------");
			System.out.println("1 ELIMAR 2 NO ELIMINAR");
			int eleccion= scs.nextInt();
			if (eleccion==1){
				String eliminaUsuario = "DELETE FROM `ada`.`cliente` " + 
						" WHERE `ID`='" + numCli + "';";
				stmt.execute(eliminaUsuario);
				System.out.println("");
				System.out.println("EL USUARIO SE HA ELIMINADO CORRECTAMENTE");
			} else {
				System.out.println("EL USUARIO NO FUE ELIMINADO");
			}
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
						e.printStackTrace();

		}

	}

	private static void modificacion(Connection conexion, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("MODIFICACION DE PERSONA");
		System.out.println("=======================");
		System.out.println("MENU OPCIONES: ");
		System.out.println("");
		System.out.println("1: MODIFICAR NOMBRE ");
		System.out.println("2: MODIFICAR FECHA NACIMIENTO ");
		int opcionDos= sc.nextInt();
		
		
		String nombreModificado=null;
		String fechaModificado=null;
		int cliModificado =0;
		int anios=0;
		
		Statement stm;
		try {
			stm = conexion.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM cliente");
			while (rs.next()) {
				Date fNac = rs.getDate(4);
				System.out.println(rs.getInt(1) + " " + rs.getString(2)+ " " + rs.getInt(3) + " " + fNac);
			}
			System.out.println("FIN LISTADO------------");
			System.out.println();
		} catch (SQLException e) {

		}
		
		
		switch (opcionDos) {
		case 1:
			System.out.println("INGRESA EL ID DEL USUARIO QUE QUIERE MODIFICAR: ");
			int numCli= sc.nextInt();
			cliModificado=numCli;
			System.out.println("Ingrese nombre:");
			String nombre = sc.next();
			nombreModificado= nombre;
			break;
		case 2:
			System.out.println("INGRESA EL ID DEL USUARIO QUE QUIERE MODIFICAR: ");
			numCli= sc.nextInt();
			cliModificado=numCli;
			System.out.println("Ingrese fecha nacimiento (yyyy-MM-dd):");
			String fNac = sc.next();
			fechaModificado=fNac ;
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			try {
				Date fechaNac = sdf.parse(fNac);
				int edad = calcularEdad(fechaNac);
				anios= edad;
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		}

		
		
		
		Statement stmt;
		try {
			stmt = conexion.createStatement();
			String modifNombre = " UPDATE `ada`.`cliente`" + 
					" SET  `NOMBRE`='"+ nombreModificado +"' WHERE `ID`='" +  cliModificado +"';";
			
			String modifEdad = " UPDATE `ada`.`cliente`" + 
					" SET  `EDAD`='"+ anios +"', `FECHA_NACIMIENTO`='"+ fechaModificado +"' WHERE `ID`='" + cliModificado +  "';";
			
			System.out.println("ESTA SEGURO QUE QUIERE MODIFICAR EL SIGUENTE USUARIO");
			ResultSet rs = stmt.executeQuery("SELECT * FROM `ada`.`cliente` WHERE ID=" + cliModificado + ";");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2)+ " " + rs.getInt(3) + " " + rs.getString(4));
			}
			System.out.println("----------------------");
			System.out.println("1 MODIFICAR 2 NO MODIFICAR");
			int eleccion= sc.nextInt();
			boolean ajs;
			if (eleccion ==1){
				ajs= true;
			}else {
				ajs= false;
			}
				
			
			
		
			if (opcionDos==1 && ajs==true){
				stmt.executeUpdate(modifNombre);
				System.out.println("EL USUARIO ID = " + cliModificado + " HA CAMBIADO SU NOMBRE");
				rs = stmt.executeQuery("SELECT * FROM `ada`.`cliente` WHERE ID=" + cliModificado + ";");
				while (rs.next()) {
					System.out.println("ID = " + rs.getInt(1) + ", NOMBRE = " + rs.getString(2));
				}
			}
			else { 
				if(opcionDos==2 && ajs==true){
					stmt.executeUpdate(modifEdad);
					System.out.println("EL USUARIO ID = " + cliModificado + " HA CAMBIADO SU EDAD Y FECHA DE NACIMIENTO");
					rs = stmt.executeQuery("SELECT * FROM `ada`.`cliente` WHERE ID=" + cliModificado + ";");
					while (rs.next()) {
						System.out.println("ID = " + rs.getInt(1) + ", NOMBRE = " + rs.getString(2)+ " EDAD = "  + rs.getInt(3) + " FECHA NACIMIENTO = " + rs.getString(4));
					}
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
						e.printStackTrace();

		}
		

		
	}

	private static void alta(Connection conexion, Scanner sc) {
		System.out.println();
		System.out.println("ALTA DE PERSONA");
		System.out.println("===============");
		System.out.println("Ingrese nombre:");
		String nombre = sc.next();
		System.out.println("Ingrese fecha nacimiento (yyyy-MM-dd):");
		String fNac = sc.next();
		int anios=0;

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date fechaNac = sdf.parse(fNac);
			int edad = calcularEdad(fechaNac);
			anios= edad;
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Statement stmt;
		try {
			stmt = conexion.createStatement();
			String insert = "INSERT INTO ada.cliente (NOMBRE, EDAD, FECHA_NACIMIENTO)\n" + 
					"  VALUES ('"+ nombre +"'," + anios +", '" + fNac + "');";
			stmt.executeUpdate(insert);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
						e.printStackTrace();

		}
		

	}

	private static int calcularEdad(Date fechaNac) {
		GregorianCalendar gc = new GregorianCalendar();
		GregorianCalendar hoy = new GregorianCalendar();
		gc.setTime(fechaNac);
		int anioActual = hoy.get(Calendar.YEAR);
		int anioNacim = gc.get(Calendar.YEAR);

		int mesActual = hoy.get(Calendar.MONTH);
		int mesNacim = gc.get(Calendar.MONTH);

		int diaActual = hoy.get(Calendar.DATE);
		int diaNacim = gc.get(Calendar.DATE);

		int dif = anioActual - anioNacim;

		if (mesActual < mesNacim) {
			dif = dif - 1;
		}
		else {
			if (mesActual == mesNacim && diaActual < diaNacim) {
				dif = dif - 1;
			}
		}

		return dif;
	}

	private static int mostrarMenu(Scanner sc) {

		System.out.println("");
		System.out.println("SISTEMA DE PERSONAS (ABM)");
		System.out.println("=========================");

		System.out.println("");
		System.out.println("MENU OPCIONES: ");
		System.out.println("");
		System.out.println("1: ALTA ");
		System.out.println("2: MODIFICACION ");
		System.out.println("3: BAJA");
		System.out.println("4: LISTADO");
		System.out.println("0: SALIR");
		int opcion = 0;
		opcion = sc.nextInt();
		return opcion;
	}
}