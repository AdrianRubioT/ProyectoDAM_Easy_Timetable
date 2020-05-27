package modelo.objetos;

/**
 * define las caracteristicas de un alumno
 * @author
 *
 */
public class Alumno extends Persona {
	/**
	 * Nombre del curso que realizan
	 */
	private String curso;
	/**
	 * Numero Identificacion Escolar
	 */
	private String nia;
	
	/**
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 * @param curso
	 * @param nia
	 */
	public Alumno(String nombre, String apellido1, String apellido2, String curso, String nia) {
		super(nombre, apellido1, apellido2);
		this.curso = curso;
		this.nia = nia;
	}
	
	/**
	 * @return the curso
	 */
	public String getCurso() {
		return curso;
	}
	/**
	 * @param curso the curso to set
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}
	/**
	 * @return the nia
	 */
	public String getNia() {
		return nia;
	}
	/**
	 * @param nia the nia to set
	 */
	public void setNia(String nia) {
		this.nia = nia;
	}

	

}
