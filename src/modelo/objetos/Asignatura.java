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
	public static String[]campos = {"nombre"}; 
	
	/**
	 * @param nombre
	 */
	public Asignatura(String nombre) {
		super(campos);
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
	


	


}

