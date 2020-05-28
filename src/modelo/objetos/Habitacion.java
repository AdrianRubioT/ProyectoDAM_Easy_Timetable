package modelo.objetos;

import vista.elementos.ListaTargetas.PassInfoData;

/**
 * Clases con las propiedades de una sala 
 * @author
 *
 */
public class Habitacion  implements PassInfoData{
	private String codigoHabitacion;

	public static String[]campos = {"codigoHabitacion"}; 

	
	/**
	 * @param codigoHabitacion
	 */
	public Habitacion(String codigoHabitacion) {
		this.codigoHabitacion = codigoHabitacion;
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
	}

	/**
	 * devuelve el atributo campos
	 * @see PassInfoData
	 */
	@Override
	public String[] getKeys() {
		return campos;
	}
	
	
	/**
	 * devuelve los valores de los atributos de la clase
	 * @see PassInfoData
	 */
	@Override
	public String[] getValues() {
		String[] toReturn = {codigoHabitacion}; 
		return toReturn;
	}

	

}

