package modelo.objetos;

import vista.elementos.ListaTargetas.PassInfoData;

/**
 * Clase con las propiedades y caracteristicas de un docente
 * @author
 *
 */
public class Docente extends Persona implements PassInfoData {
	private String especialidad;

	public static String[]campos = {"nombre","apellido1","apellido2","especialidad"}; 

	
	/**
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 * @param especialidad
	 */
	public Docente(String nombre, String apellido1, String apellido2, String especialidad) {
		super(nombre, apellido1, apellido2);
		this.especialidad = especialidad;
	}

	/**
	 * @return the especialidad
	 */
	public String getEspecialidad() {
		return especialidad;
	}

	/**
	 * @param especialidad the especialidad to set
	 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
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
		String[] toReturn = {nombre, apellido1, apellido2, especialidad}; 
		return toReturn;
	}


	
	


}

