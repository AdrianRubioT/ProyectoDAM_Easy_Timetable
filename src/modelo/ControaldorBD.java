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
import vista.elementos.ListaTargetas.InfoPanel;

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
	 * inserta una instancia de slot en la BD
	 * @param momento 
	 */
	public int addSlot(Slot momento) {
		String sql = "INSERT INTO Ocurre("
				+ "ID_Habitacion,"
				+ "ID_Asignatura, "
				+ "ID_Docente,"
				+ "ID_GrupoAlumnos,"
				+ "ID_IntervaloTiempo) "
				+ "VALUES(?,?,?,?,?)";

		try (
				PreparedStatement pstmt = conexion.prepareStatement(sql)) {

			pstmt.setInt(1, momento.getHabitacion().getId_BD() );
			pstmt.setInt(2, momento.getAsignatura().getId_BD() );
			pstmt.setInt(3, momento.getDocentes().getId_BD() );
			pstmt.setInt(4, momento.getGrupoAlumnos().getId_BD() );
			pstmt.setInt(5, momento.getIntervalo().getId_BD() );


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
	 * metodo para obtener una instancia de asignatura con los 
	 * datos de la BD
	 * @param id
	 * @return 
	 */
	private Asignatura obtenerAsignatura (int id) {
		Asignatura temp = new Asignatura();


		String sql = "SELECT rowid, * FROM Asignatura "
				+ "WHERE id_Asignatura = ?";

		try {
			PreparedStatement stmt  = conexion.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs    = stmt.executeQuery();

			// loop through the result set
			while (rs.next()) {
				temp.setNombre( rs.getString("nombre"));
				//1 -> rowID from SQLite		no se porque no puedo acceder por el nombre
				temp.setId_BD( rs.getInt(1) );
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return temp;
	}

	/**
	 * metodo para obtener una instancia de GrupoAlumno con los 
	 * datos de la BD
	 * @param id
	 * @return 
	 */
	private GrupoAlumnos obtenerGrupoAlumno(int id) {
		GrupoAlumnos temp = new GrupoAlumnos();


		String sql = "SELECT rowid, * FROM GrupoAlumnos "
				+ "WHERE id_GrupoAlumnos = ?";

		try {
			PreparedStatement stmt  = conexion.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs    = stmt.executeQuery();

			// loop through the result set
			while (rs.next()) {
				temp.setNombreCurso( rs.getString("nombreCurso") );
				temp.setNombreGrupo( rs.getString("nombreGrupo") );
				//1 -> rowID from SQLite		no se porque no puedo acceder por el nombre
				temp.setId_BD( rs.getInt(1) );
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return temp;
	}


	/**
	 * metodo para obtener una instancia de GrupoAlumno con los 
	 * datos de la BD
	 * @param id
	 * @return 
	 */
	private Docente obtenerDocente(int id) {
		Docente temp = new Docente();


		String sql = "SELECT rowid, * FROM Docente "
				+ "WHERE id_Docente = ?";

		try {
			PreparedStatement stmt  = conexion.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs    = stmt.executeQuery();

			// loop through the result set
			while (rs.next()) {
				temp.setNombre( rs.getString("nombre") );
				temp.setApellido1( rs.getString("apellido1") );
				temp.setApellido2( rs.getString("apellido2") );
				temp.setEspecialidad( rs.getString("especialidad") );
				//1 -> rowID from SQLite		no se porque no puedo acceder por el nombre
				temp.setId_BD( rs.getInt(1) );
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return temp;
	}
	
	/**
	 * metodo para obtener una instancia de GrupoAlumno con los 
	 * datos de la BD
	 * @param id
	 * @return 
	 */
	private Habitacion obtenerHabitacion(int id) {
		Habitacion temp = new Habitacion();


		String sql = "SELECT rowid, * FROM Habitacion "
				+ "WHERE id_Habitacion = ?";

		try {
			PreparedStatement stmt  = conexion.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs    = stmt.executeQuery();

			// loop through the result set
			while (rs.next()) {
				temp.setCodigoHabitacion( rs.getString("codigoHabitacion") );
				//1 -> rowID from SQLite		no se porque no puedo acceder por el nombre
				temp.setId_BD( rs.getInt(1) );
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return temp;
	}
	
	/**
	 * metodo para obtener una instancia de GrupoAlumno con los 
	 * datos de la BD
	 * @param id
	 * @return 
	 */
	private IntervaloTiempo obtenerIntervaloTiempo(int id) {
		IntervaloTiempo temp = new IntervaloTiempo();


		String sql = "SELECT rowid, * FROM IntervaloTiempo "
				+ "WHERE id_IntervaloTiempo = ?";

		try {
			PreparedStatement stmt  = conexion.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs    = stmt.executeQuery();

			// loop through the result set
			while (rs.next()) {
				temp.setDia( rs.getInt("diaSemana") );
				temp.setHoraIncio( rs.getInt( "horaInicio" ) );
				temp.setMinutoInicio( rs.getInt( "minutoInicio" ) );
				temp.setHoraFin( rs.getInt( "horaFin" ) );
				temp.setMinutoFin( rs.getInt( "minutoFin" ) );
				//1 -> rowID from SQLite		no se porque no puedo acceder por el nombre
				temp.setId_BD( rs.getInt(1) );
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return temp;
	}
	
	
	/**
	 * Busca en la BD las tuplas relacionadas con 
	 * @param id
	 * @return listado con los momentos ordenados por dia y hora
	 */
	public ArrayList<Slot> obtenerListaMomentosAsignatura(int id) {
		ArrayList<Slot> coleccion = new ArrayList<Slot>();
		Slot slotTemp;

		String sql = "SELECT "
				+	"Ocurre.rowid, "
				+ 	"Ocurre.id_IntervaloTiempo,"
				//+ 	"Ocurre.id_Asignatura, "
				+ 	"Ocurre.id_Docente,"
				+ 	"Ocurre.id_GrupoAlumnos,"
				+ 	"Ocurre.id_Habitacion "
				+ "FROM Ocurre, IntervaloTiempo "
				+ "WHERE ("
				+ 	"id_Asignatura = ? AND "
				+ 	"Ocurre.id_IntervaloTiempo = IntervaloTiempo.id_IntervaloTiempo "
				+ 	")"
				+ "ORDER BY "
				+ 	"IntervaloTiempo.horaInicio ASC;";

		try {
			PreparedStatement pstmt = conexion.prepareStatement(sql);
			pstmt.setInt(1, id);


			ResultSet rs = pstmt.executeQuery();


			// loop through the result set
			while (rs.next()) {
				slotTemp = new Slot();
				slotTemp.setIntervalo(obtenerIntervaloTiempo(rs.getInt("id_IntervaloTiempo")));
				//slotTemp.setAsignatura(obtenerAsignatura( rs.getInt("id_Asignatura") ));
				slotTemp.setDocentes(obtenerDocente( rs.getInt("id_Docente") ));
				slotTemp.setGrupoAlumnos(obtenerGrupoAlumno( rs.getInt("id_GrupoAlumnos") ));
				slotTemp.setHabitacion(obtenerHabitacion( rs.getInt("id_Habitacion") ));
				//1 -> rowID from SQLite		no se porque no puedo acceder por el nombre
				slotTemp.setId_BD( rs.getInt(1) );

				coleccion.add(slotTemp );

			}	
		}
		catch (SQLException e) {
			System.out.println("error");
			System.out.println(e.getMessage());
		}

		return coleccion;
	}

	/**obtenerListaMomentosDocente
	 * Busca en la BD las tuplas relacionadas con 
	 * @param id
	 * @return listado con los momentos ordenados por dia y hora
	 */
	public ArrayList<Slot> obtenerListaMomentosDocente(int id) {
		ArrayList<Slot> coleccion = new ArrayList<Slot>();
		Slot slotTemp;

		String sql = "SELECT "
				+	"Ocurre.rowid, "
				+ 	"Ocurre.ID_IntervaloTiempo, "
				+ 	"Ocurre.ID_Asignatura, "
				//+ 	"Ocurre.id_Docente, "
				+ 	"Ocurre.ID_GrupoAlumnos, "
				+ 	"Ocurre.ID_Habitacion "
				+ "FROM Ocurre, IntervaloTiempo "
				+ "WHERE ("
				+ 	"Ocurre.ID_Docente = ? AND "
				+ 	"Ocurre.ID_IntervaloTiempo = IntervaloTiempo.id_IntervaloTiempo "
				+ 	")"
				+ "ORDER BY "
				+ 	"IntervaloTiempo.horaInicio ASC;";

		try {
			PreparedStatement pstmt = conexion.prepareStatement(sql);
			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();


			// loop through the result set
			while (rs.next()) {

				slotTemp = new Slot();
				
				slotTemp.setIntervalo(obtenerIntervaloTiempo(rs.getInt("id_IntervaloTiempo")));
				slotTemp.setAsignatura(obtenerAsignatura( rs.getInt("id_Asignatura") ));
				//slotTemp.setDocentes(obtenerDocente( rs.getInt("id_Docente") ));
				slotTemp.setGrupoAlumnos(obtenerGrupoAlumno( rs.getInt("id_GrupoAlumnos") ));
				slotTemp.setHabitacion(obtenerHabitacion( rs.getInt("id_Habitacion") ));
				
				//1 -> rowID from SQLite		no se porque no puedo acceder por el nombre
				slotTemp.setId_BD( rs.getInt(1) );

				coleccion.add(slotTemp );

			}	
		}
		catch (SQLException e) {
			System.out.println("error");
			System.out.println(e.getMessage());
		}

		return coleccion;
	}

	/**obtenerListaMomentosDocente
	 * Busca en la BD las tuplas relacionadas con 
	 * @param id
	 * @return listado con los momentos ordenados por dia y hora
	 */
	public ArrayList<Slot> obtenerListaMomentosGrupoAlumnos(int id) {
		ArrayList<Slot> coleccion = new ArrayList<Slot>();
		Slot slotTemp;

		String sql = "SELECT "
				+	"Ocurre.rowid, "
				+ 	"Ocurre.ID_IntervaloTiempo, "
				+ 	"Ocurre.ID_Asignatura, "
				+ 	"Ocurre.id_Docente, "
				//+ 	"Ocurre.ID_GrupoAlumnos, "
				+ 	"Ocurre.ID_Habitacion "
				+ "FROM Ocurre, IntervaloTiempo "
				+ "WHERE ("
				+ 	"Ocurre.ID_GrupoAlumnos = ? AND "
				+ 	"Ocurre.ID_IntervaloTiempo = IntervaloTiempo.id_IntervaloTiempo "
				+ 	")"
				+ "ORDER BY "
				+ 	"IntervaloTiempo.horaInicio ASC;";

		try {
			PreparedStatement pstmt = conexion.prepareStatement(sql);
			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();


			// loop through the result set
			while (rs.next()) {

				slotTemp = new Slot();
				
				slotTemp.setIntervalo(obtenerIntervaloTiempo(rs.getInt("id_IntervaloTiempo")));
				slotTemp.setAsignatura(obtenerAsignatura( rs.getInt("id_Asignatura") ));
				slotTemp.setDocentes(obtenerDocente( rs.getInt("id_Docente") ));
				//slotTemp.setGrupoAlumnos(obtenerGrupoAlumno( rs.getInt("id_GrupoAlumnos") ));
				slotTemp.setHabitacion(obtenerHabitacion( rs.getInt("id_Habitacion") ));
				
				//1 -> rowID from SQLite		no se porque no puedo acceder por el nombre
				slotTemp.setId_BD( rs.getInt(1) );

				coleccion.add(slotTemp );

			}	
		}
		catch (SQLException e) {
			System.out.println("error");
			System.out.println(e.getMessage());
		}

		return coleccion;
	}
	
	/**obtenerListaMomentosDocente
	 * Busca en la BD las tuplas relacionadas con 
	 * @param id
	 * @return listado con los momentos ordenados por dia y hora
	 */
	public ArrayList<Slot> obtenerListaMomentosHabitaciones(int id) {
		ArrayList<Slot> coleccion = new ArrayList<Slot>();
		Slot slotTemp;

		String sql = "SELECT "
				+	"Ocurre.rowid, "
				+ 	"Ocurre.ID_IntervaloTiempo, "
				+ 	"Ocurre.ID_Asignatura, "
				+ 	"Ocurre.id_Docente, "
				+ 	"Ocurre.ID_GrupoAlumnos "
				//+ 	"Ocurre.ID_Habitacion "
				+ "FROM Ocurre, IntervaloTiempo "
				+ "WHERE ("
				+ 	"Ocurre.ID_Habitacion = ? AND "
				+ 	"Ocurre.ID_IntervaloTiempo = IntervaloTiempo.id_IntervaloTiempo "
				+ 	")"
				+ "ORDER BY "
				+ 	"IntervaloTiempo.horaInicio ASC;";

		try {
			PreparedStatement pstmt = conexion.prepareStatement(sql);
			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();


			// loop through the result set
			while (rs.next()) {

				slotTemp = new Slot();
				
				slotTemp.setIntervalo(obtenerIntervaloTiempo(rs.getInt("id_IntervaloTiempo")));
				slotTemp.setAsignatura(obtenerAsignatura( rs.getInt("id_Asignatura") ));
				slotTemp.setDocentes(obtenerDocente( rs.getInt("id_Docente") ));
				slotTemp.setGrupoAlumnos(obtenerGrupoAlumno( rs.getInt("id_GrupoAlumnos") ));
				//slotTemp.setHabitacion(obtenerHabitacion( rs.getInt("id_Habitacion") ));
				
				//1 -> rowID from SQLite		no se porque no puedo acceder por el nombre
				slotTemp.setId_BD( rs.getInt(1) );

				coleccion.add(slotTemp );

			}	
		}
		catch (SQLException e) {
			System.out.println("error");
			System.out.println(e.getMessage());
		}

		return coleccion;
	}
	
	

	/**
	 * busca en la base de datos todas las tuplas de la tabla GrupoAlumnos e ins
	 * tancia los objetos GrupoAlumnos con todos los datos
	 * 
	 * @Return: array list con lo encontrado
	 */
	public ArrayList<Slot> obtenerListaMomentos() {
		// TODO Auto-generated method stub
		return null;
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
	 * elimina momento de la BD
	 * @param id clave primaria del row a eliminar
	 */
	public void eliminarSlot(int id) {
		String sql = "DELETE FROM Ocurre WHERE rowID = ?";

		try (
				PreparedStatement pstmt = conexion.prepareStatement(sql)) {
			pstmt.setInt( 1, id );

			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * @return the conexion
	 */
	public Boolean isConected() {
		return conexion != null;
	}



}

