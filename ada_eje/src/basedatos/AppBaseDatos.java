package basedatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AppBaseDatos {

	public static void main(String[] args) {

		Statement stmt;
		try {
			Connection conexion = AdminBD.obtenerConexion();
			stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery("select * from clientes");
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4)+ "  " + rs.getString(5));
			}
			conexion.close();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}