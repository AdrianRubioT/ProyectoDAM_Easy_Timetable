package controlador.controlador;

import java.util.ArrayList;
import java.util.Map;

import controlador.objetos.Habitacion;
import vista.controlador.ControladorInterfaz;
import vista.elemetos.ListaTarjetas;
import vista.eventos.AniadirListado;
import vista.eventos.ColeccionEventosInterfaz;
import vista.interfaz.Interfaz;

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
	public void onAddObject(Map<String, String[]> data){
		
		/*
		String[] p = (String[])data.get("Datos");
		for (String string : p) {
			System.out.println(string);
		}*/
		
		System.out.println(data.get("ListaTarjeta")[0]);
		
		switch ( data.get("ListaTarjeta")[0] ) {
		case "Habitaciones":
			//Crear objeto Habitacion, y recojer el ultimo ingresado
			//TODO: modificar para obtener la habitacion en CrearHabitacion?
			CrearHabitacion( (String[]) data.get("Datos") );
			colHabitaciones.get( colHabitaciones.size() -1 );
			ControladorInterfaz.interfaz.aniadirObjetoListatarjeta(
					"Habitaciones", 
					colHabitaciones.get( 
							colHabitaciones.size() -1 )
					);
			break;
			
			

		default:
			break;
		}
		
	}
	
	
	/**
	 * Inicializa objeto habitacion y lo aniade a la coleccion de habitacion
	 * @param datos
	 */
	private void CrearHabitacion(String[] datos) {
		colHabitaciones.add( new Habitacion(datos[0]) );
	}

	
	
	
	
}
