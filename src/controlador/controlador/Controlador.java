package controlador.controlador;

import controlador.objetos.Habitacion;
import vista.eventos.AniadirListado;
import vista.eventos.ColeccionEventosInterfaz;

/**
 * Clase para controlar y manejar los objetos a emplear por el proyecto
 * @author adrian
 *
 */
public class Controlador implements AniadirListado {

	Habitacion[] colHabitaciones;
	
	/**
	 * Iniciliza el controlador
	 */
	public Controlador() {
		ColeccionEventosInterfaz.addListenerAniadirObjeto(this);
	
	}

	/**
	 * 
	 */
	@Override
	public void onAddObject(String[] hola) {
		//System.out.println(hola);
		for (String string : hola) {
			System.out.println(string);
		}
		
	}
	
	
	
	
	
	
}
