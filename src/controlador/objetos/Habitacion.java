package controlador.objetos;

import vista.elemetos.InfoPanel;

/**
 * Clase para contener la informacion de una habitacion
 * extienda a InfoPanel para que este la muestre la informacion
 * @author adrian
 *
 */
public class Habitacion extends InfoPanel{

	private String habitacion;
	
	
	/**
	 * Genera objeto Habitacion sin valores
	 */
	public Habitacion() {
		this("");
	}
	
	/**
	 * Inicializa el objeto con codido habitacion
	 * @param codHabitacion nombre de la habitacion
	 */
	public Habitacion(String codHabitacion) {
		super("Habitacion", new String[] {"Habitacion"}, new String[] {codHabitacion});
	}

	/**
	 * @return the habitacion
	 */
	public String getHabitacion() {
		return habitacion;
	}
	
	/**
	 * @param habitacion the habitacion to set
	 */
	public void setHabitacion(String habitacion) {
		this.habitacion = habitacion;
	}
	
	
	
	
}
