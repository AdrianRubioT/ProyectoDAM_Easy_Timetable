package modelo.objetos;

/**
 * Clase para coleccionar los momentos en el horario
 * @author
 *
 */
public class Slot {
	
	private IntervaloTiempo intervalo;
	private Habitacion habitacion;
	private Asignatura asignatura;
	private Docente docentes;
	private GrupoAlumnos grupoAlumnos;

	public Slot() {
		
	}

	/**
	 * Intancia la clase
	 * @return void
	 */
	public void Slot() {
		// TODO Auto-generated method stub
	}

	/**
	 * metodo para determinar el orden de los intervalos de los slots.
	 * comprueba que la esta instancia suceda antes que la instancia del parametro 
	 * Return
	 *   true si el parametro va antes que esta instancia.
	 *   throw NoInterval si no hay intervalo
	 * @param slot
	 * @return Boolean
	 */
	public Boolean antesDe(Slot slot) {
		// TODO: por hacer
		return false;
	}

	
	//getters y setters
	/**
	 * @return the intervalo
	 */
	public IntervaloTiempo getIntervalo() {
		return intervalo;
	}

	/**
	 * @param intervalo the intervalo to set
	 */
	public void setIntervalo(IntervaloTiempo intervalo) {
		this.intervalo = intervalo;
	}

	/**
	 * @return the habitacion
	 */
	public Habitacion getHabitacion() {
		return habitacion;
	}

	/**
	 * @param habitacion the habitacion to set
	 */
	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	/**
	 * @return the asignatura
	 */
	public Asignatura getAsignatura() {
		return asignatura;
	}

	/**
	 * @param asignatura the asignatura to set
	 */
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	/**
	 * @return the docentes
	 */
	public Docente getDocentes() {
		return docentes;
	}

	/**
	 * @param docentes the docentes to set
	 */
	public void setDocentes(Docente docentes) {
		this.docentes = docentes;
	}

	/**
	 * @return the grupoAlumnos
	 */
	public GrupoAlumnos getGrupoAlumnos() {
		return grupoAlumnos;
	}

	/**
	 * @param grupoAlumnos the grupoAlumnos to set
	 */
	public void setGrupoAlumnos(GrupoAlumnos grupoAlumnos) {
		this.grupoAlumnos = grupoAlumnos;
	}

	
	
	
	

}

