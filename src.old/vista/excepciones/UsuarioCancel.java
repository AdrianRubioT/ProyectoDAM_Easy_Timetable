package vista.excepciones;


/**
 * excepcion para indicar que el usuario a cancelado en una ventana
 * @author adrian
 *
 */
public class UsuarioCancel extends Exception{

	
	public UsuarioCancel() {
		super();
		System.out.println("El usuario ha cancelado la introduccion de datos");
	}
	
	
}
