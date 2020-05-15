package controlador.objetos;

import vista.elemetos.InfoPanel;

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
