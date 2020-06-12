package vista.interfaces.popup;
/**
 * excepcion para indicar que el usaurio ha cancelado la ventana
 * @author
 *
 */
public class UsuarioCancel extends Exception{

	
	public UsuarioCancel() {
		super();
		System.out.println("El usuario ha cancelado la introduccion de datos");
	}
	
	
}