package PorColocar;
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
abstracto o unico en
	 *  memoria
	 */
	private static Seleccionado ultimoSeleccionado;

	public Seleccion() {
		
	}

	/**
	 * Instancia la clase
	 * @return void
	 */
	public void Seleccion() {
		// TODO Auto-generated method stub
	}

	/**
	 * coloca el parametro seleccionado en el atributo ultimoSeleccionado
	 * @param seleccion
	 * @return Void
	 */
	private Void nuevoSeleccion(Seleccionado seleccion) {
		// TODO Auto-generated method stub
	}

	/**
	 * @return static Seleccionado
	 */
	public static Seleccionado getUltimoSeleccion() {
		// TODO Auto-generated method stub
	}

}

