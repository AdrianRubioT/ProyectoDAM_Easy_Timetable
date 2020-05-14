package vista.eventos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Clase para coleccionar los eventos y los triggers 
 * @author adrian
 *
 */
public class ColeccionEventosInterfaz {

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
	public static void triggerAniadirObjeto(Map<String, Object> data) {
		for (AniadirListado hl : listenerAniadirObjeto) {
			hl.onAddObject(data);
		}
	}

}
