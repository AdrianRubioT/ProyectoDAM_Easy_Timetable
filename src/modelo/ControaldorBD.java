package PorColocar;
/**
 * Clase que se encarga de la permanencia de los datos en la base de datos SQLit
 * e
 * @author
 *
 */
public class ControaldorBD {
	/**
	 * url de la conecxion a la BD
	 */
	private String url;
	/**
	 * conecxion con la BD Inicialmente para SQLite
	 */
	private Connection conecxion;

	public ControaldorBD() {
		
	}

	/**
	 * intancia la clase

	 * @param url
	 * @return void
	 */
	public void ControaldorBD(String url) {
		// TODO Auto-generated method stub
	}

	/**
	 * Genera la estructura de la BD
	 * @return Void
	 */
	private Void crearEstructuraBD() {
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
	 * @return Void
	 */
	public Void addAsignatura(Asignatura asignatura) {
		// TODO Auto-generated method stub
	}

	/**
	 * @param docente
	 * @return Void
	 */
	public Void addDocente(Docente docente) {
		// TODO Auto-generated method stub
	}

	/**
	 * @param grupoAlumnos
	 * @return Void
	 */
	public Void addGrupoAlumno(GrupoAlumnos grupoAlumnos) {
		// TODO Auto-generated method stub
	}

	/**
	 * inserta una instancia de habitacion en la BD
	 * @return Void
	 */
	public Void addSlot() {
		// TODO Auto-generated method stub
	}

	/**
	 * @return ArrayList<Habitaciones>
	 */
	public ArrayList<Habitaciones> obtenerListaHabitaciones() {
		// TODO Auto-generated method stub
	}

	/**
	 * @return ArrayList<Asignatura>
	 */
	public ArrayList<Asignatura> obtenerListaAsignaturas() {
		// TODO Auto-generated method stub
	}

	/**
	 * @return ArrayList<Docentes>
	 */
	public ArrayList<Docentes> obtenerListaDocentes() {
		// TODO Auto-generated method stub
	}

	/**
	 * @return ArrayList<GrupoAlumnos>
	 */
	public ArrayList<GrupoAlumnos> obtenerListaGrupoAlumnos() {
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
		// TODO Auto-generated method stub
	}

	/**
	 * @param habitacion
	 * @return ArrayList<Slots>
	 */
	public ArrayList<Slots> obtenerListaSlot(Habitacion habitacion) {
		// TODO Auto-generated method stub
	}

	/**
	 * @param asignatura
	 * @return ArrayList<Slot>
	 */
	public ArrayList<Slot> obtenerListaSlot(Asignatura asignatura) {
		// TODO Auto-generated method stub
	}

	/**
	 * @param docente
	 * @return ArrayList<Docente>
	 */
	public ArrayList<Docente> obtenerListaSlot(Docente docente) {
		// TODO Auto-generated method stub
	}

	/**
	 * busca en la tabla Ocurren las coincidencias del parametro 
	 * @param grupoAlumnos
	 * @return ArrayList<Slots>
	 */
	public ArrayList<Slots> obtenerListaSlot(GrupoALumnos grupoAlumnos) {
		// TODO Auto-generated method stub
	}

	/**
	 * @param habitacion
	 * @return Void
	 */
	public Void updateHabitacion(Habitacion habitacion) {
		// TODO Auto-generated method stub
	}

	/**
	 * @param asignatura
	 * @return Void
	 */
	public Void UpdateAsignatura(Asignatura asignatura) {
		// TODO Auto-generated method stub
	}

	/**
	 * @param docente
	 * @return Void
	 */
	public Void updateDocente(Docente docente) {
		// TODO Auto-generated method stub
	}

	/**
	 * @return Void
	 */
	public Void updateGrupoAlumnos() {
		// TODO Auto-generated method stub
	}

	/**
	 * Actualiza el objeto en la BD
	 * @return Void
	 */
	public Void updateSlot() {
		// TODO Auto-generated method stub
	}

	/**
	 * @param habitacion
	 * @return Void
	 */
	public Void eliminarHabitacion(Habitacion habitacion) {
		// TODO Auto-generated method stub
	}

	/**
	 * @param asignatura
	 * @return Void
	 */
	public Void eliminaAsignatura(Asignatura asignatura) {
		// TODO Auto-generated method stub
	}

	/**
	 * @param docente
	 * @return Void
	 */
	public Void eliminarDocente(Void docente) {
		// TODO Auto-generated method stub
	}

	/**
	 * @return Void
	 */
	public Void eliminarGrupoAlumnos() {
		// TODO Auto-generated method stub
	}

	/**
	 * elimina el GrupoAlumnos  de la BD
	 * @return Void
	 */
	public Void eliminarSlot() {
		// TODO Auto-generated method stub
	}

}

