package modelo;

import java.sql.Connection;
import java.util.ArrayList;

import modelo.BD.conecxiones.Conexion;
import modelo.objetos.Asignatura;
import modelo.objetos.Docente;
import modelo.objetos.GrupoAlumnos;
import modelo.objetos.Habitacion;
import modelo.objetos.Slot;

/**
 * Clase que se encarga de la permanencia de los datos en la base de datos SQLite
 * @author
 *
 */
//TODO: implementar metodos
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
	 * al conectar @see {@link Conexion}
	 */
	public void conecta(String url, boolean existe) {
		//establecer la nueva conecxion
		this.conexion = new Conexion().getConection(url);
		System.out.println("Conectado");
		
		//crear la estructura de la BD
		if (!existe) {
			System.out.println("Creando estructura");
			//crearEstructuraBD
		}
	}
	
	/**
	 * intancia la clase
	 * @param url
	 */
	public ControaldorBD(String url) {
		// TODO Auto-generated method stub
	}

	/**
	 * Genera la estructura de la BD
	 * @return void
	 */
	private void crearEstructuraBD() {
		// TODO Auto-generated method stub
	}

	/**
	 * @param habitacion
	 * @return void
	 */
	public void addHabitacion(Habitacion habitacion) {
		// TODO Auto-generated method stub
	}

	/**
	 * @param asignatura
	 * @return void
	 */
	public void addAsignatura(Asignatura asignatura) {
		// TODO Auto-generated method stub
	}

	/**
	 * @param docente
	 * @return void
	 */
	public void addDocente(Docente docente) {
		// TODO Auto-generated method stub
	}

	/**
	 * @param grupoAlumnos
	 * @return void
	 */
	public void addGrupoAlumno(GrupoAlumnos grupoAlumnos) {
		// TODO Auto-generated method stub
	}

	/**
	 * inserta una instancia de habitacion en la BD
	 * @return void
	 */
	public void addSlot() {
		// TODO Auto-generated method stub
	}

	/**
	 * @return ArrayList<Habitaciones>
	 */
	public ArrayList<Habitacion> obtenerListaHabitaciones() {
		return null;
		// TODO Auto-generated method stub
	}

	/**
	 * @return ArrayList<Asignatura>
	 */
	public ArrayList<Asignatura> obtenerListaAsignaturas() {
		return null;
		// TODO Auto-generated method stub
	}

	/**
	 * @return ArrayList<Docentes>
	 */
	public ArrayList<Docente> obtenerListaDocentes() {
		return null;
		// TODO Auto-generated method stub
	}

	/**
	 * @return ArrayList<GrupoAlumnos>
	 */
	public ArrayList<GrupoAlumnos> obtenerListaGrupoAlumnos() {
		return null;
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
	}

	/**
	 * @param asignatura
	 */
	public void eliminaAsignatura(Asignatura asignatura) {
		// TODO Auto-generated method stub
	}

	/**
	 * @param docente
	 */
	public void eliminarDocente(Docente docente) {
		// TODO Auto-generated method stub
	}


	public void eliminarGrupoAlumnos() {
		// TODO Auto-generated method stub
	}

	/**
	 * elimina el GrupoAlumnos de la BD
	 */
	public void eliminarSlot() {
		// TODO Auto-generated method stub
	}

}

