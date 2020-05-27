package modelo.BD.conexiones;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase para servir una conexion de una BD SQLite
 * @author
 *
 */
public class ConexionSQLite {

	/**
	 * Establebe la conexion con una BD SQLite
	 * Genera el archivo en path si este no existe
	 * @param path BD SQLite donde conectar o crear la BD
	 * @return conexion con la BD SQLite en path
	 */
	public static Connection conexion(String path) {
		//preparamos la ruta de la BD
		String url = "jdbc:sqlite:" + path;

		//intentar conecctar a la BD creada
		try (Connection conn = DriverManager.getConnection(url)) {
			if (conn != null) {
				DatabaseMetaData meta = conn.getMetaData();
				
				//test /chibatos
				System.out.println("The driver name is " + meta.getDriverName());
				System.out.println("A new database has been created.");
				
				return conn;
				//conn.close();
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
		
	}


}

