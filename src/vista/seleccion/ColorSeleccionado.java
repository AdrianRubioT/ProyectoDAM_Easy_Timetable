package vista.seleccion;

/**
 * metodos para ser llamado por Seleccion 
 * para que las clases cambien el color
 * si estan seleccionadas o no.
 * @author adrian
 *
 */
public interface ColorSeleccionado {

	/**
	 * cambia el color a seleccionado
	 */
	public void cambiaColorSelecionado();
	
	/**
	 * cambia el color a no seleccionado
	 */
	public void cambiaColorDesseleccionado();
}
