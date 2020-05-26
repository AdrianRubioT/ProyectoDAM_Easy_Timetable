package modelo.objetos;

/**
 * Clase con las propiedades y caracteristicas de un docente
 * @author
 *
 */
public class Docente extends Persona {
	private String especialidad;

	/**
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 * @param especialidad
	 */
	public Docente(String nombre, String apellido1, String apellido2, String especialidad) {
		super(nombre, apellido1, apellido2);
		this.especialidad = especialidad;
	}

	/**
	 * @return the especialidad
	 */
	public String getEspecialidad() {
		return especialidad;
	}

	/**
	 * @param especialidad the especialidad to set
	 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	
	


}

