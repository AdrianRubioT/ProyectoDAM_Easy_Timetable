package modelo.BD.conexiones;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Clase para servir una conexion de una BD SQLite Y 
 * dar estructura a la BD 
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
		try {
			Connection conn = DriverManager.getConnection(url);
			if (conn != null) {
				DatabaseMetaData meta = conn.getMetaData();

				//test /chibatos
				//System.out.println("The driver name is " + meta.getDriverName());
				//System.out.println("A new database has been created.");

				return conn;
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;

	}

	/**
	 * Genera la estructura de la base de datos
	 * @param conSQLite BD donde crear la estructura
	 */
	public static void crearEstructura(Connection connSQLite) {

		String tablaGrupoAlumnos = "CREATE TABLE GrupoAlumnos(\n" + 
				"	ID_GrupoAlumnos integer PRIMARY KEY,\n" + 
				"	nombreGrupo TEXT,\n" + 
				"	nombreCurso TEXT\n" + 
				"	);\n";

		String tablaAlumno = "CREATE TABLE Alumno(\n" + 
				"	ID_Alumno integer PRIMARY KEY,\n" + 
				"	ID_GrupoAlumnos integer,\n" + 
				"	nombre TEXT,\n" + 
				"	apellido1 TEXT,\n" + 
				"	apellido2 TEXT,\n" + 
				"	FOREIGN KEY (ID_GrupoAlumnos) REFERENCES GrupoAlumnos(ID_GrupoAlumnos) ON DELETE CASCADE\n" + 
				"	);";
		
		String tablaHabitacion = "CREATE TABLE Habitacion(\n" + 
				"	ID_Habitacion  integer PRIMARY KEY,\n" + 
				"	codigoHabitacion TEXT\n" + 
				"	);";
		
		String tablaAsignatura = "CREATE TABLE Asignatura(\n" + 
				"	ID_ Asignatura  integer PRIMARY KEY,\n" + 
				"	nombre TEXT\n" + 
				"	);";
		
		String tablaDocente = "CREATE TABLE Docente(\n" + 
				"	ID_ Docente integer PRIMARY KEY,\n" + 
				"	nombre TEXT,\n" + 
				"	apellido1 TEXT,\n" + 
				"	apellido2 TEXT,\n" + 
				"	especialidad TEXT\n" + 
				"	);";
		
		String tablaIntervaloTiempo = "CREATE TABLE IntervaloTiempo(\n" + 
				"	ID_IntervaloTiempo integer PRIMARY KEY,\n" + 
				"	diaSemana integer,\n" + 
				"	horaInicio integer CHECK( horaInicio  >= 0 AND horaInicio <=23),\n" + 
				"	minutoInicio integer CHECK( minutoInicio >= 0 AND minutoInicio <=59),\n" + 
				"	horaFin integer CHECK( horaFin >= 0 AND horaFin <=23),\n" + 
				"	minutoFin integer CHECK( minutoFin >= 0 AND minutoFin <=59)\n" + 
				"	);";
		// SQL statement for creating a new table
		String tablaOcurren = "CREATE TABLE Ocurren(\n" + 
				"	ID_Ocurren integer PRIMARY KEY,\n" + 
				"	ID_Habitacion integer,\n" + 
				"	ID_Asignatura  integer,\n" + 
				"	ID_Docente integer,\n" + 
				"	ID_GrupoAlumnos integer,\n" + 
				"	FOREIGN KEY(ID_Habitacion) REFERENCES Habitacion(ID_Habitacion)ON 			DELETE CASCADE,\n" + 
				"	FOREIGN KEY(ID_Asignatura) REFERENCES Asignatura(ID_Asignatura)ON 			DELETE CASCADE,\n" + 
				"	FOREIGN KEY(ID_Docente) REFERENCES Docente(ID_Docente)ON DELETE 		CASCADE,\n" + 
				"	FOREIGN KEY(ID_GrupoAlumnos) REFERENCES 							GrupoAlumnos(ID_GrupoAlumnos)ON DELETE CASCADE\n" + 
				"	);";

		try {
			connSQLite.setAutoCommit(false);
			
			Statement stmt = connSQLite.createStatement();
			stmt.execute(tablaGrupoAlumnos);
			stmt.execute(tablaAlumno);
			stmt.execute(tablaHabitacion);
			stmt.execute(tablaAsignatura);
			stmt.execute(tablaDocente);
			stmt.execute(tablaIntervaloTiempo);
			stmt.execute(tablaOcurren);

			connSQLite.commit();
			connSQLite.setAutoCommit(true);
			
			
			
		} catch (SQLException e) {
			System.out.println("este bloque");
			e.printStackTrace();
		}



	}

}

