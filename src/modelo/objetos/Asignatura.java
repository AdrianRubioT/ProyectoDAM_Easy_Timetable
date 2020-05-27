package modelo.objetos;

import vista.elementos.ListaTargetas.PassInfoData;

/**
 * Clase con las propiedades de una asignatura
 * @author
 *
 */
public class Asignatura implements PassInfoData{
	
	private String nombre;
	
	/**
	 * Lista de la clave de los atributos que tiene la clase
	 */
	public static String[]campos = {"nombre"}; 
	
	/**
	 * @param nombre
	 */
	public Asignatura(String nombre) {
		this.nombre = nombre;
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
	 * @return the campos
	 */
	public String[] getCampos() {
		return campos;
	}
	
	
	/**
	 * 
	 */
	@Override
	public String[] getKeys() {
		return campos;
	}

	@Override
	public String[] getValues() {
		// TODO Auto-generated method stub
		String[] toReturn = {nombre};
		return toReturn;
	}

	


}

