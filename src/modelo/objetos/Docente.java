package modelo.objetos;

import vista.elementos.ListaTargetas.PassInfoData;

/**
 * Clase con las propiedades y caracteristicas de un docente
 * @author
 *
 */
public class Docente implements PassInfoData {
	private String especialidad;
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	
	
	public static String[]campos = {"nombre","apellido1","apellido2","especialidad"}; 



	/**
	 * @param especialidad
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 */
	public Docente(String especialidad, String nombre, String apellido1, String apellido2) {
		this.especialidad = especialidad;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
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
	}

	/**
	 * @return the apellido1
	 */
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * @param apellido1 the apellido1 to set
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	/**
	 * @return the apellido2
	 */
	public String getApellido2() {
		return apellido2;
	}

	/**
	 * @param apellido2 the apellido2 to set
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	
	


}

