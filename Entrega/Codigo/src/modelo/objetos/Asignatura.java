package modelo.objetos;

import vista.elementos.ListaTargetas.InfoPanel;

/**
 * Clase con las propiedades de una asignatura
 * @author
 *
 */
public class Asignatura extends InfoPanel{


	private String nombre;

	/**
	 * Lista de la clave de los atributos que tiene la clase
	 */
	final public static String[]CAMPOS = {"nombre"}; 

	/**
	 * @param nombre
	 */
	public Asignatura(String nombre) {
		super(CAMPOS, "Asignatura");
		this.setNombre(nombre);
		actualizaSuper();
	}

	public Asignatura() {
		super(CAMPOS, "Asignatura");
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


	public String toString() {
		// TODO Auto-generated method stub
		return this.nombre;
	}



}

