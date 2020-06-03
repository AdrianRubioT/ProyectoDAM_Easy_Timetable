package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.BD.conexiones.ConexionSQLite;
import modelo.objetos.Asignatura;
import modelo.objetos.Docente;
import modelo.objetos.GrupoAlumnos;
import modelo.objetos.Habitacion;
import modelo.objetos.IntervaloTiempo;
import modelo.objetos.Slot;

/**
 * Clase que se encarga de la permanencia de los datos en la base de datos SQLite
 * @author
 *
 */
//TODO: implementar metodos
//TODO: reducir codigo duplicado de las sentencias
public class ControaldorBD {

	/** conecxion con la BD Inicialmente para SQLite
	 */
	private Connection conexion;


	public ControaldorBD() {

	}

	/**
	 * inicia la conexion con la BD tipo SQLite
	 * @param url path a la base de datos
	 * @param existe boolean para crear la estructura si la BD es creada 
	 * al conectar @see {@link ConexionSQLite}
	 */
	public void conecta(String url, boolean existe) {
		//establecer la nueva conecxion
		this.conexion = ConexionSQLite.conexion(url);
		System.out.println("Conectado");

		//crear la estructura de la BD
		if (!existe) {
			crearEstructuraBD();
		}
	}

	/**
	 * intancia la clase
	 * @param url
	 */
	public ControaldorBD(String url) {
	}

	/**
	 * llama al conector adecuado para que genere la estructura de la BD
	 * Por el momento solo esta SQLite
	 */
	private void crearEstructuraBD() {
		//System.out.println("Creando estructura");
		ConexionSQLite.crearEstructura(conexion);
	}

	/**
	 * @param habitacion
	 * @return void
	 */
	public int addHabitacion(Habitacion habitacion) {
		String sql = "INSERT INTO Habitacion(codigoHabitacion) VALUES(?)";

		try (
				PreparedStatement pstmt = conexion.prepareStatement(sql)) {
			pstmt.setString(1, habitacion.getCodigoHabitacion() );
			pstmt.executeUpdate();

			ResultSet resultado = pstmt.getGeneratedKeys();
			if (resultado.next()) {
				return resultado.getInt(1);
			}


		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		//return para que indica fallo
		//TODO: cambiar por una excepcion o algo mejor
		return -1;	}

	/**
	 * agrega parametro asignatura a la BD
	 * @param asignatura
	 */
	public int addAsignatura(Asignatura asignatura) {
		String sql = "INSERT INTO Asignatura(nombre) VALUES(?)";

		try (
				PreparedStatement pstmt = conexion.prepareStatement(sql)) {
			pstmt.setString(1, asignatura.getNombre() );
			pstmt.executeUpdate();

			ResultSet resultado = pstmt.getGeneratedKeys();
			if (resultado.next()) {
				return resultado.getInt(1);
			}


		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		//return para que indica fallo
		//TODO: cambiar por una excepcion o algo mejor
		return -1;
	}

	/**
	 * aniade el objeto docente a la BD y retorna el id generado
	 * @param docente
	 * @return 
	 */
	public int addDocente(Docente docente) {
		String sql = "INSERT INTO Docente(nombre, apellido1, apellido2, especialidad) VALUES(?,?,?,?)";

		try (
				PreparedStatement pstmt = conexion.prepareStatement(sql)) {
			pstmt.setString(1, docente.getNombre() );
			pstmt.setString(2, docente.getApellido1() );
			pstmt.setString(3, docente.getApellido2() );
			pstmt.setString(4, docente.getEspecialidad() );

			pstmt.executeUpdate();

			ResultSet resultado = pstmt.getGeneratedKeys();
			if (resultado.next()) {
				return resultado.getInt(1);
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		//return para que indica fallo
		//TODO: cambiar por una excepcion o algo mejor
		return -1;
	}

	/**
	 * @param grupoAlumnos
	 * @return void
	 */
	public int addGrupoAlumno(GrupoAlumnos grupoAlumnos) {
		String sql = "INSERT INTO GrupoALumnos(nombreGrupo, nombreCurso) VALUES(?,?)";

		try (
				PreparedStatement pstmt = conexion.prepareStatement(sql)) {
			pstmt.setString(1, grupoAlumnos.getNombreCurso() );
			pstmt.setString(2, grupoAlumnos.getNombreGrupo() );

			pstmt.executeUpdate();

			ResultSet resultado = pstmt.getGeneratedKeys();
			if (resultado.next()) {
				return resultado.getInt(1);
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		//return para que indica fallo
		//TODO: cambiar por una excepcion o algo mejor
		return -1;
	}

	

	public int addIntervaloTiempo(IntervaloTiempo intervalo) {
		String sql = "INSERT INTO IntervaloTiempo("
				+ "diaSemana, "
				+ "horaInicio, minutoInicio, "
				+ "horaFin, minutoFin) "
				+ "VALUES(?,?,?,?,?)";

		try (
				PreparedStatement pstmt = conexion.prepareStatement(sql)) {
			pstmt.setInt(1, intervalo.getDia() );
			pstmt.setInt(2, intervalo.getHoraIncio() );
			pstmt.setInt(3, intervalo.getMinutoInicio() );
			pstmt.setInt(4, intervalo.getHoraFin() );
			pstmt.setInt(5, intervalo.getMinutoFin() );
			

			pstmt.executeUpdate();

			ResultSet resultado = pstmt.getGeneratedKeys();
			if (resultado.next()) {
				return resultado.getInt(1);
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		//return para que indica fallo
		//TODO: cambiar por una excepcion o algo mejor
		return -1;
		
	}

	
	
	/**
	 * inserta una instancia de habitacion en la BD
	 * @param momento 
	 */
	public int addSlot(Slot momento) {
		String sql = "INSERT INTO Ocurre("
				+ "ID_Habitacion,"
				+ "ID_Asignatura, "
				+ "ID_Docente,"
				+ "ID_GrupoAlumnos) "
				+ "VALUES(?,?,?,?,?)";

		try (
				PreparedStatement pstmt = conexion.prepareStatement(sql)) {
			pstmt.setInt(1, momento.getHabitacion().getId_BD() );
			pstmt.setInt(2, momento.getAsignatura().getId_BD() );
			pstmt.setInt(3, momento.getDocentes().getId_BD() );
			pstmt.setInt(4, momento.getGrupoAlumnos().getId_BD() );

			pstmt.executeUpdate();

			ResultSet resultado = pstmt.getGeneratedKeys();
			if (resultado.next()) {
				return resultado.getInt(1);
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		//return para que indica fallo
		//TODO: cambiar por una excepcion o algo mejor
		return -1;
	}

	/**
	 * @return ArrayList<Habitaciones>
	 */
	public ArrayList<Habitacion> obtenerListaHabitaciones() {

		ArrayList<Habitacion> coleccion = new ArrayList<Habitacion>();
		Habitacion habTemp;

		String sql = "SELECT rowid, * FROM Habitacion";

		try (
				Statement stmt  = conexion.createStatement();
				ResultSet rs    = stmt.executeQuery(sql)){

			// loop through the result set
			while (rs.next()) {
				habTemp = new Habitacion();

				habTemp.setCodigoHabitacion( rs.getString("codigoHabitacion") );

				//1 -> rowID from SQLite		no se porque no puedo acceder por el nombre
				habTemp.setId_BD( rs.getInt(1) );

				coleccion.add(habTemp );

			}


		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return coleccion;
	}

	/**
	 * @return ArrayList<Asignatura>
	 */
	public ArrayList<Asignatura> obtenerListaAsignaturas() {
		ArrayList<Asignatura> coleccion = new ArrayList<Asignatura>();
		Asignatura habTemp;

		String sql = "SELECT rowid, * FROM Asignatura";

		try (
				Statement stmt  = conexion.createStatement();
				ResultSet rs    = stmt.executeQuery(sql)){

			// loop through the result set
			while (rs.next()) {
				habTemp = new Asignatura();

				habTemp.setNombre( rs.getString("nombre") );

				//1 -> rowID from SQLite		no se porque no puedo acceder por el nombre
				habTemp.setId_BD( rs.getInt(1) );

				coleccion.add(habTemp );

			}


		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return coleccion;
	}

	/**
	 * @return ArrayList<Docentes>
	 */
	public ArrayList<Docente> obtenerListaDocentes() {
		ArrayList<Docente> coleccion = new ArrayList<Docente>();
		Docente habTemp;

		String sql = "SELECT rowid, * FROM Docente";

		try (
				Statement stmt  = conexion.createStatement();
				ResultSet rs    = stmt.executeQuery(sql)){

			// loop through the result set
			while (rs.next()) {
				habTemp = new Docente();

				habTemp.setNombre( rs.getString("nombre") );
				habTemp.setApellido1( rs.getString("apellido1") );
				habTemp.setApellido1( rs.getString("apellido2") );
				habTemp.setApellido1( rs.getString("especialidad") );

				//1 -> rowID from SQLite		no se porque no puedo acceder por el nombre
				habTemp.setId_BD( rs.getInt(1) );

				coleccion.add(habTemp );
			}


		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return coleccion;
	}

	/**
	 * @return ArrayList<GrupoAlumnos>
	 */
	public ArrayList<GrupoAlumnos> obtenerListaGrupoAlumnos() {
		ArrayList<GrupoAlumnos> coleccion = new ArrayList<GrupoAlumnos>();
		GrupoAlumnos habTemp;

		String sql = "SELECT rowid, * FROM GrupoAlumnos";

		try (
				Statement stmt  = conexion.createStatement();
				ResultSet rs    = stmt.executeQuery(sql)){

			// loop through the result set
			while (rs.next()) {
				habTemp = new GrupoAlumnos();
				
				habTemp.setNombreGrupo( rs.getString("nombreGrupo") );
				habTemp.setNombreCurso( rs.getString("nombreCurso") );

				//1 -> rowID from SQLite		no se porque no puedo acceder por el nombre
				habTemp.setId_BD( rs.getInt(1) );

				coleccion.add(habTemp );
			}


		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return coleccion;
	}
	
	
	public ArrayList<IntervaloTiempo> obtenerListaIntervaloTiempo() {
		ArrayList<IntervaloTiempo> coleccion = new ArrayList<IntervaloTiempo>();
		IntervaloTiempo habTemp;

		String sql = "SELECT rowid, * FROM IntervaloTiempo";

		try (
				Statement stmt  = conexion.createStatement();
				ResultSet rs    = stmt.executeQuery(sql)){

			// loop through the result set
			while (rs.next()) {
				habTemp = new IntervaloTiempo();
				
				habTemp.setDia( rs.getInt( "diaSemana" ) );
				habTemp.setHoraIncio( rs.getInt ( "horaInicio" ) );
				habTemp.setMinutoInicio( rs.getInt ( "horaInicio" ) );
				habTemp.setHoraFin( rs.getInt( "horaFin") );
				habTemp.setMinutoFin( rs.getInt( "minutoFin" ) );
				

				//1 -> rowID from SQLite		no se porque no puedo acceder por el nombre
				habTemp.setId_BD( rs.getInt(1) );

				coleccion.add(habTemp );
			}


		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return coleccion;
	}

	

	/**
	 * busca en la base de datos todas las tuplas de la tabla GrupoAlumnos e ins
	 * tancia los objetos GrupoAlumnos con todos los datos
Return: array list co
	 * n lo encontrado
	 * @return ArrayList<Slot>
	 */
	public ArrayList<Slot> obtenerListaSlot() {
		return null;
		// TODO Auto-generated method stub
	}

	/**
	 * @param habitacion
	 * @return ArrayList<Slots>
	 */
	public ArrayList<Slot> obtenerListaSlot(Habitacion habitacion) {
		return null;
		// TODO Auto-generated method stub
	}

	/**
	 * @param asignatura
	 * @return ArrayList<Slot>
	 */
	public ArrayList<Slot> obtenerListaSlot(Asignatura asignatura) {
		return null;
		// TODO Auto-generated method stub
	}

	/**
	 * @param docente
	 * @return ArrayList<Docente>
	 */
	public ArrayList<Docente> obtenerListaSlot(Docente docente) {
		return null;
		// TODO Auto-generated method stub
	}

	/**
	 * busca en la tabla Ocurren las coincidencias del parametro 
	 * @param grupoAlumnos
	 * @return ArrayList<Slots>
	 */
	public ArrayList<Slot> obtenerListaSlot(GrupoAlumnos grupoAlumnos) {
		return null;
		// TODO Auto-generated method stub
	}

	/**
	 * @param habitacion
	 */
	public void updateHabitacion(Habitacion habitacion) {
		// TODO Auto-generated method stub
	}

	/**
	 * @param asignatura
	 */
	public void UpdateAsignatura(Asignatura asignatura) {
		// TODO Auto-generated method stub
	}

	/**
	 * @param docente
	 */
	public void updateDocente(Docente docente) {
		// TODO Auto-generated method stub
	}


	public void updateGrupoAlumnos() {
		// TODO Auto-generated method stub
	}

	/**
	 * Actualiza el objeto en la BD
	 */
	public void updateSlot() {
		// TODO Auto-generated method stub
	}

	/**
	 * @param habitacion
	 */
	public void eliminarHabitacion(Habitacion habitacion) {
		String sql = "DELETE FROM Habitacion WHERE rowID = ?";

		try (
				PreparedStatement pstmt = conexion.prepareStatement(sql)) {
			pstmt.setInt( 1, habitacion.getId_BD() );

			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * @param asignatura
	 */
	public void eliminaAsignatura(Asignatura asignatura) {

		String sql = "DELETE FROM Asignatura WHERE rowID = ?";

		try (
				PreparedStatement pstmt = conexion.prepareStatement(sql)) {
			pstmt.setInt( 1, asignatura.getId_BD() );

			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * elimina docente de la BD
	 * @param docente
	 */
	public void eliminarDocente(Docente docente) {
		String sql = "DELETE FROM Docente WHERE rowID = ?";

		try (
				PreparedStatement pstmt = conexion.prepareStatement(sql)) {
			pstmt.setInt( 1, docente.getId_BD() );

			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}


	public void eliminarGrupoAlumnos(GrupoAlumnos grupoAlumnos) {
		String sql = "DELETE FROM GrupoAlumnos WHERE rowID = ?";

		try (
				PreparedStatement pstmt = conexion.prepareStatement(sql)) {
			pstmt.setInt( 1, grupoAlumnos.getId_BD() );

			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * elimina el GrupoAlumnos de la BD
	 */
	public void eliminarSlot() {
		// TODO Auto-generated method stub
	}




}

