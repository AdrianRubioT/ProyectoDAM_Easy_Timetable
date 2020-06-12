package modelo.objetos;

import vista.elementos.ListaTargetas.InfoPanel;

/**
 * Clases con las propiedades de una sala 
 * @author
 *
 */
public class Habitacion  extends InfoPanel{
	

	private String codigoHabitacion;

	final public static String[]CAMPOS = {"codigoHabitacion"}; 

	
	/**
	 * @param codigoHabitacion
	 */
	public Habitacion(String codigoHabitacion) {
		super(CAMPOS, "Habitacion");
		this.codigoHabitacion = codigoHabitacion;
		actualizaSuper();
	}
	
	
	public Habitacion() {
		super(CAMPOS, "Habitacion");
	}


	/**
	 * recoge los valores de las variables de la clase para notificar a super
	 */
	private void actualizaSuper() {
		String[] valores = {this.codigoHabitacion};
		actualizaValores(valores);
	}
	

	/**
	 * @return the codigoHabitacion
	 */
	public String getCodigoHabitacion() {
		return codigoHabitacion;
	}

	/**
	 * @param codigoHabitacion the codigoHabitacion to set
	 */
	public void setCodigoHabitacion(String codigoHabitacion) {
		this.codigoHabitacion = codigoHabitacion;
		actualizaSuper();
	}

	
	public String toString() {
		return this.codigoHabitacion;
	}

}

