package modelo.objetos;

import vista.elementos.ListaTargetas.InfoPanel;

/**
 * Clases con las propiedades de una sala 
 * @author
 *
 */
public class Habitacion  extends InfoPanel{
	private String codigoHabitacion;

	public static String[]campos = {"codigoHabitacion"}; 

	
	/**
	 * @param codigoHabitacion
	 */
	public Habitacion(String codigoHabitacion) {
		super(campos);
		this.codigoHabitacion = codigoHabitacion;
		actualizaSuper();
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

	

}

