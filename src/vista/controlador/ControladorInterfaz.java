package vista.controlador;

import javax.swing.JFrame;

import vista.elemetos.InfoPanel;
import vista.excepciones.UsuarioCancel;
import vista.interfaz.Interfaz;
import vista.ventanas.InputPopup;

/**
 * clase para controlar la interfaz asi como susu eventos y comunicarlo al controlador princiapal
 * @author Adrian
 *
 */
public class ControladorInterfaz {

	public static Interfaz interfaz = new Interfaz();


	public ControladorInterfaz() {


	}


	/**
	 * Muestra la clase InputPopup al usuario para que la rellene como modal.
	 * @param campos campos a rellenar por el usuario.
	 * @param ventana ventana de la que ser modal.
	 * @return los valores de los JTextfield rellenados por el usuario y en el mismo ordne que campos.
	 */
	//TODO: pasar visibilidad a pakage
	public static String[] abrirInputPopup(JFrame ventana,  String[] campos)throws UsuarioCancel{

		InputPopup inputsVentana = new InputPopup(ventana, true, campos);

		//si el usuario a pulsado ok o intro
		if (inputsVentana.isAcepted) {
			return inputsVentana.getData();
		}else {
			throw new UsuarioCancel();
		}

	}
	
	
	/**
	 * metodo de llama a aniadir targeta de la interfaz
	 * @param listaTarjeta indica a que ListaTarjetas aniadir objeto 
	 * @param objeto objeto que extiende infopanel 
	 */
	public void aniadirTargetaInterfaz(String listaTarjeta, InfoPanel objeto) {
		interfaz.aniadirObjetoListatarjeta(listaTarjeta, objeto);
	}

}
