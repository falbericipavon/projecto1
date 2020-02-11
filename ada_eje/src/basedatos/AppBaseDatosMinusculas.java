package basedatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AppBaseDatosMinusculas {

	public static void main(String[] args) {

		Statement stmt;
		try {
			Connection conexion = NuevaABD.obtenerConexion();
			stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery("select * from persona");
			while (rs.next()) {
				int ID = rs.getInt(1);
				String nombre = rs.getString(2);

				System.out.println(ID + "  " + nombre.toUpperCase() + "  " + rs.getString(3));
			}
			conexion.close();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}