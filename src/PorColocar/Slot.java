package PorColocar;
/**
 * Clase para coleccionar los momentos en el horario
 * @author
 *
 */
public class Slot {
	public IntervaloTiempo intervalo;
	public Habitacion habitacion;
	public Asignatura asignatura;
	public Docentes docentes;
	public GrupoAlumnos grupoAlumnos;

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
comprueba
	 *  que la esta instancia suceda antes que la instancia del parametro
Return
	 *  true si el parametro va antes que esta instancia.
throw NoInterval si no
	 *  hay intervalo
	 * @param slot
	 * @return Boolean
	 */
	public Boolean antesDe(Slot slot) {
		// TODO Auto-generated method stub
	}

	/**
	 * @param intervaloTiempo
	 * @return void
	 */
	public void setIntervaloTiempo(IntervaloTiempo intervaloTiempo) {
		// TODO Auto-generated method stub
	}

	/**
	 * @return IntervaloTiempo
	 */
	public IntervaloTiempo getIntervaloTiempo() {
		// TODO Auto-generated method stub
	}

	/**
	 * @param habitacion
	 * @return void
	 */
	public void setHabitacion(Habitacion habitacion) {
		// TODO Auto-generated method stub
	}

	/**
	 * @return Habitacion
	 */
	public Habitacion getHabitacion() {
		// TODO Auto-generated method stub
	}

	/**
	 * @param asignatura
	 * @return Void
	 */
	public Void setAsignatura(Asignatura asignatura) {
		// TODO Auto-generated method stub
	}

	/**
	 * @return Asignatura
	 */
	public Asignatura getAsignatura() {
		// TODO Auto-generated method stub
	}

	/**
	 * @param docente
	 * @return Docente
	 */
	public Docente setDocente(Docente docente) {
		// TODO Auto-generated method stub
	}

	/**
	 * @return Docente
	 */
	public Docente getDocente() {
		// TODO Auto-generated method stub
	}

	/**
	 * @param grupoAlumnos
	 * @return Void
	 */
	public Void setGrupoAlumnos(GrupoAlumnos grupoAlumnos) {
		// TODO Auto-generated method stub
	}

}

