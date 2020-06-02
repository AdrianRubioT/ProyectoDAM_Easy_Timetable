package modelo.objetos;

import vista.elementos.ListaTargetas.InfoPanel;

/**
 * Clase con las propiedades de una asignatura
 * @author
 *
 */
public class Asignatura extends InfoPanel{
	
	private int id_BD;
	
	private String nombre;
	
	/**
	 * Lista de la clave de los atributos que tiene la clase
	 */
	final public static String[]CAMPOS = {"nombre"}; 
	
	/**
	 * @param nombre
	 */
	public Asignatura(String nombre) {
		super(CAMPOS);
		this.setNombre(nombre);
		actualizaSuper();
	}

	/**
	 * recoge los valores de las variables de la clase para notificar a super
	 */
	private void actualizaSuper() {
		String[] valores = {this.nombre};
		actualizaValores(valores);
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
	 * @return the id_BD
	 */
	public int getId_BD() {
		return id_BD;
	}

	/**
	 * @param id_BD the id_BD to set
	 */
	public void setId_BD(int id_BD) {
		this.id_BD = id_BD;
	}
	


	


}

