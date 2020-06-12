package modelo.objetos;

/**
 * Clase para coleccionar los momentos en el horario
 * @author
 *
 */
public class Slot {
	
	private int id_BD;
	
	private IntervaloTiempo intervalo;
	private Habitacion habitacion;
	private Asignatura asignatura;
	private Docente docentes;
	private GrupoAlumnos grupoAlumnos;


	/**
	 * Intancia la clase
	 */
	public Slot() {
		
	}

		
	/**
	 * @param intervalo
	 * @param habitacion
	 * @param asignatura
	 * @param docentes
	 * @param grupoAlumnos
	 */
	public Slot(IntervaloTiempo intervalo, Habitacion habitacion, Asignatura asignatura, Docente docentes,
			GrupoAlumnos grupoAlumnos) {
		super();
		this.intervalo = intervalo;
		this.habitacion = habitacion;
		this.asignatura = asignatura;
		this.docentes = docentes;
		this.grupoAlumnos = grupoAlumnos;
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


	/**
	 * @return the id_BD
	 */
	public int getId_BD() {
		return id_BD;
	}


	/**
	 * @param id_BD the id_BD to set
	 */
	public void setId_BD(int id_BD) {
		this.id_BD = id_BD;
	}

	

}

