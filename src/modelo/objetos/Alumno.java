package modelo.objetos;

/**
 * define las caracteristicas de un alumno
 * @author
 *
 */
public class Alumno{
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	
	/**
	 * Nombre del curso que realizan
	 */
	private String curso;
	/**
	 * Numero Identificacion Escolar
	 */
	private String nia;
	
	//public static String[]campos = {"nombre","apellido1","apellido2","curso","NIA"}; 

	
	/**
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 * @param curso
	 * @param nia
	 */
	public Alumno(String nombre, String apellido1, String apellido2, String curso, String nia) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.curso = curso;
		this.nia = nia;
	}
	
	
	/**
	 * @return the curso
	 */
	public String getCurso() {
		return curso;
	}
	/**
	 * @param curso the curso to set
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}
	/**
	 * @return the nia
	 */
	public String getNia() {
		return nia;
	}
	/**
	 * @param nia the nia to set
	 */
	public void setNia(String nia) {
		this.nia = nia;
	}

	//TODO: descomentar cuando se necesite
//	/**
//	 * devuelve el atributo campos
//	 * @see PassInfoData
//	 */
//	@Override
//	public String[] getKeys() {
//		return campos;
//	}
//
//	/**
//	 * devuelve los valores de los atributos de la clase
//	 * @see PassInfoData
//	 */
//	@Override
//	public String[] getValues() {
//		String[] toReturn = {nombre, apellido1, apellido2, curso, nia}; 
//		return toReturn;
//	}

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

