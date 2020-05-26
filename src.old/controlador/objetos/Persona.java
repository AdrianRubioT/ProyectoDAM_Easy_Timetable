package controlador.objetos;

/**
 * Clase pra contener variables de una persona
 * @author adrian
 *
 */
public class Persona {

	private String nombre;
	private String apellidos1;
	private String apellidos2;
	
	
	public Persona() {
	}

	public Persona(String nombre, String apellidos1, String apellidos2) {
		super();
		this.nombre = nombre;
		this.apellidos1 = apellidos1;
		this.apellidos2 = apellidos2;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos1
	 */
	public String getApellidos1() {
		return apellidos1;
	}

	/**
	 * @param apellidos1 the apellidos1 to set
	 */
	public void setApellidos1(String apellidos1) {
		this.apellidos1 = apellidos1;
	}

	/**
	 * @return the apellidos2
	 */
	public String getApellidos2() {
		return apellidos2;
	}

	/**
	 * @param apellidos2 the apellidos2 to set
	 */
	public void setApellidos2(String apellidos2) {
		this.apellidos2 = apellidos2;
	}
	
	
	
}
