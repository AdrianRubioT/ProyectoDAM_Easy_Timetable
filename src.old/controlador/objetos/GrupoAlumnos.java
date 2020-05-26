package controlador.objetos;

import java.util.ArrayList;

import vista.elemetos.InfoPanel;

/**
 * Clase para contener un listado de alumnos 
 * @author adrian
 *
 */
public class GrupoAlumnos extends InfoPanel {

	public static String[] campos = {"Nombre", "Apellidos1", "Apellidos2", "Grupo"};
	private String grupo;
	private ArrayList<Persona> alumnos = new ArrayList<Persona>();
	
	public GrupoAlumnos() {
		this("","","","");
	}
	
	public GrupoAlumnos(String nombre,String apellido1, String apellido2, String grupo) {
		super("GrupoAlumnos", campos, new String[]{nombre, apellido1, apellido2, grupo } );
		this.grupo = grupo;
		alumnos.add( new Persona( nombre, apellido1, apellido2) );
		
	}

	/**
	 * @return the grupo
	 */
	public String getGrupo() {
		return grupo;
	}

	/**
	 * @param grupo the grupo to set
	 */
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	/**
	 * @return the alumnos
	 */
	public ArrayList<Persona> getAlumnos() {
		return alumnos;
	}

	/**
	 * @param alumnos the alumnos to set
	 */
	public void setAlumnos(ArrayList<Persona> alumnos) {
		this.alumnos = alumnos;
	}
	
	
	
	
}
