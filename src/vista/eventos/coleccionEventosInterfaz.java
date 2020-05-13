package vista.eventos;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para coleccionar los eventos y los triggers 
 * @author adrian
 *
 */
public class coleccionEventosInterfaz {

	//Evento AniadirObjeto
	//Evento cuando en la clase ListaTargetas se pulsa aniadir, esta clase manda la informacion
	//insertada en el dialogo mediante el evento
	/**
	 * lista de las clases a que llamar cuando se lanza el evento
	 */
	private static List<AniadirListado> listenerAniadirObjeto = new ArrayList<AniadirListado>();
	/**
	 * aniade el parametro a l alista de listenerListado
	 * @param toAdd clase que sera llamada cuando se lance el evento
	 */
	public static void addListenerAniadirObjeto(AniadirListado toAdd) {
		listenerAniadirObjeto.add(toAdd);
	}
	/**
	 * trigger para el evento AniadirObjeto
	 */
	public static void triggerAniadirObjeto() {
		for (AniadirListado hl : listenerAniadirObjeto) {
			hl.onAddObject();
		}
	}

}
