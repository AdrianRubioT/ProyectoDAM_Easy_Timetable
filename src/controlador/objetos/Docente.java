package controlador.objetos;

import vista.elemetos.InfoPanel;

/**
 * clase para contener la informacion de un docente
 * @author adrian
 *
 */
public class Docente extends InfoPanel{

	public static String[] campos = {"Nombre", "Apellidos1", "Apellidos2", "especialidad"};
	private Persona docente;
	private String especialidad;
	
	public Docente() {
		this("", "", "", "");
	}
	
	
	public Docente(String nombre,String apellido1, String apellido2, String especialidad) {
		super("Docente", campos, new String[]{nombre, apellido1, apellido2, especialidad});
		this.docente = new Persona(nombre, apellido1, apellido2); 
		this.especialidad = especialidad;
	}

	/**
	 * set nombre
	 */
	public void setDocenteName(String nombre) {
		docente.setNombre(nombre);
	}
	/**
	 * get nombre
	 */
	public String getNombre() {
		return docente.getNombre();
	}
	
	/**
	 * set apellido1
	 */
	public void setDocenteApellido1(String apellido) {
		docente.setApellidos1(apellido);
	}
	/**
	 * get apellido1
	 */
	public String getApellidos1() {
		return docente.getApellidos1();
	}
	
	/**
	 * set apellido2
	 */
	public void setDocenteApellido2(String apellido) {
		docente.setApellidos2(apellido);
	}
	/**
	 * get apellido1
	 */
	public String getApellidos2() {
		return docente.getApellidos2();
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
