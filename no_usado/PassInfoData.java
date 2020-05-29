package vista.elementos.ListaTargetas;
/**
 * Definir los metodos para pasar la informacion a InfoPanel
 * @author
 *
 */
public interface PassInfoData {

	/**
	 * metodo para obtener un listado de los nombre de los campos
	 * @return String[]
	 */
	public String[] getKeys();

	/**
	 * metodo para obtener los valores de dichas Keys
	 * @return Stirng[]
	 */
	public String[] getValues();

}

