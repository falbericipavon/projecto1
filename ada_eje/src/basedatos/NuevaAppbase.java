package basedatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class NuevaAppbase {

	public static void main(String[] args) {

		Statement stmt;
		try {
			Connection conexion = NuevaABD.obtenerConexion();
			stmt = conexion.createStatement();
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("Ingrese nombre de la Persona: ");
			String cliNombre = sc.next();
			System.out.println("Ingrese DNI de la Persona: ");
			String dniNombre = sc.next();
			
			String insert = "UPDATE ada.persona SET namePersona='"+cliNombre+"' ,dniPersona='" + dniNombre +"'WHERE PersonaId='4'";
			
			stmt.executeUpdate("UPDATE ada.persona SET namePersona='"+cliNombre+"' WHERE PersonaId='4'");
			
			ResultSet rs = stmt.executeQuery("select * from persona");
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			}
			conexion.close();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}