package controlador.objetos;

import vista.elemetos.InfoPanel;

/**
 * clase para contener la informacion de un docente
 * @author adrian
 *
 */
public class Docente extends InfoPanel{

	public static String[] campos = {"Nombre", "Apellidos1", "Apellidos2"};
	private Persona docente;
	
	
	public Docente() {
		this("", "", "");
	}
	
	
	public Docente(String nombre,String apellido1, String apellido2) {
		super("Docente", campos, new String[]{nombre, apellido1, apellido2});
		this.docente = new Persona(nombre, apellido1, apellido2); 
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
	
	
}
