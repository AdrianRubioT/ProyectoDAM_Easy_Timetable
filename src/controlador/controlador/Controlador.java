package controlador.controlador;

import java.util.ArrayList;
import java.util.Map;

import controlador.objetos.Habitacion;
import vista.elemetos.ListaTargetas;
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
		
		/*
		String[] p = (String[])data.get("Datos");
		for (String string : p) {
			System.out.println(string);
		}*/
		
		switch ( ((ListaTargetas) data.get("ListaTarjeta")).getTitulo() ) {
		case "Habitaciones":
			CrearHabitacion( (String[]) data.get("Datos") );
			
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
		colHabitaciones.add( new Habitacion(datos[1]) );
	}

	
	
	
	
}
