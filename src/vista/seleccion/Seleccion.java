package vista.seleccion;
/**
 * clase para controlar los objetos seleccionados
Por el momento guarda el ultim
 * o seleccionado pero puede que lo modifque para que haya más
 * @author
 *
 */
public abstract class Seleccion {
	/**
	 * atributo para albergar el ultimo objeto seleccionado 
	 * abstracto o unico en memoria
	 */
	private static Seleccionable ultimoSeleccionado;


	/**
	 * coloca el parametro seleccionado en el atributo ultimoSeleccionado
	 * @param seleccion objeto que ha sido seleccionado
	 */
	public static void nuevoSeleccion(Seleccionable seleccion) {
		ultimoSeleccionado = seleccion;
		//System.out.println("seleccionado instancia de: " + seleccion.getClass() );
	}
	

	/**
	 * @return the ultimoSeleccionado
	 */
	public static Seleccionable getUltimoSeleccionado() {
		return ultimoSeleccionado;
	}



}

