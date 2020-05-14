package controlador.controlador;

import java.util.ArrayList;
import java.util.Map;

import controlador.objetos.Habitacion;
import vista.eventos.AniadirListado;
import vista.eventos.ColeccionEventosInterfaz;

/**
 * Clase para controlar y manejar los objetos a emplear por el proyecto
 * @author adrian
 *
 */
public class Controlador implements AniadirListado {

	ArrayList<Habitacion> colHabitaciones = new ArrayList<Habitacion>();
	
	/**
	 * Iniciliza el controlador
	 */
	public Controlador() {
		ColeccionEventosInterfaz.addListenerAniadirObjeto(this);
	
	}

	/**
	 * Genera los objetos Habitacion, docente, grupoAlumnos y asignatura
	 * segun los datos del evento y llama a ListarTargeta para que lo muestre en la interfaz 
	 */
	@Override
	public void onAddObject(Map<String, Object> data){
		
		for (Map.Entry<String, Object> entry : data.entrySet()) {
		    System.out.println(
		        String.format("llave: %s, valor: %s", entry.getKey(), entry.getValue())
		    );
		}
		
	}
	
	
	/**
	 * Inicializa objeto habitacion y lo aniade a la coleccion de habitacion
	 * @param habitacion
	 */
	private void CrearHabitacion(String habitacion) {
		Habitacion sala = new Habitacion(habitacion); 
		
	}

	
	
	
	
}
