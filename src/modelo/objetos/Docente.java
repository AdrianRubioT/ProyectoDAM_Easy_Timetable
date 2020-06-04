package modelo.objetos;

import vista.elementos.ListaTargetas.InfoPanel;

/**
 * Clase con las propiedades y caracteristicas de un docente
 * @author
 *
 */
public class Docente extends InfoPanel{
	
	private String especialidad;
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	
	
	public static String[]campos = {"nombre","apellido1","apellido2","especialidad"}; 



	/**
	 * @param especialidad
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 */
	public Docente(String especialidad, String nombre, String apellido1, String apellido2) {
		super(campos, "Docente");
		this.especialidad = especialidad;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		actualizaSuper();
	}


	public Docente() {
		super(campos, "Docente");
	}


	/**
	 * recoge los valores de las variables de la clase para notificar a super
	 */
	private void actualizaSuper() {
		String[] valores = {this.nombre, this.apellido1, this.apellido2, this.especialidad};
		actualizaValores(valores);
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
		actualizaSuper();
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
		actualizaSuper();
	}

	/**
	 * @return the apellido1
	 */
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * @param apellido1 the apellido1 to set
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
		actualizaSuper();
	}

	/**
	 * @return the apellido2
	 */
	public String getApellido2() {
		return apellido2;
	}

	/**
	 * @param apellido2 the apellido2 to set
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}


	public String toString() {
		return this.nombre;
	}


}

