package controlador.objetos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import vista.elemetos.InfoPanel;

/**
 * Clase para contener la informacion de una habitacion
 * extienda a InfoPanel para que este la muestre la informacion
 * @author adrian
 *
 */
public class Habitacion extends InfoPanel{

	private String habitacion;
	public static String[] campos = {"Habitacion"};
	
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
		super("Habitacion", campos, new String[] {codHabitacion});
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("click"+ "  Color:" + getBackground().toString());
				System.out.println(e);
			}
		});
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