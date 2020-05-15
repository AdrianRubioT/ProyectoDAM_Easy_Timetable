package controlador.objetos;

import vista.elemetos.InfoPanel;

/**
 * clase para contener la informacion sobre las asignaturas
 * @author adrian
 *
 */
public class Asignaturas extends InfoPanel{

	public static String[] campos = {"Nombre"};
	private String Nombre;
	
	
	
	public Asignaturas() {
		this("");
	}
	
	public Asignaturas(String nombre) {
		super("Asignatura", campos, new String[]{nombre});
		this.Nombre = nombre;
	}

	/**
	 * @return the campos
	 */
	public static String[] getCampos() {
		return campos;
	}

	/**
	 * @param campos the campos to set
	 */
	public static void setCampos(String[] campos) {
		Asignaturas.campos = campos;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	
	
	
}
