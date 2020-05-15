package controlador.controlador;

import java.util.ArrayList;
import java.util.Map;

import controlador.objetos.Asignatura;
import controlador.objetos.Docente;
import controlador.objetos.GrupoAlumnos;
import controlador.objetos.Habitacion;
import vista.controlador.ControladorInterfaz;
import vista.eventos.AniadirListado;
import vista.eventos.ColeccionEventosInterfaz;

/**
 * Clase para controlar y manejar los objetos a emplear por el proyecto
 * @author adrian
 *
 */
public class Controlador implements AniadirListado {

	ArrayList<Habitacion>   colHabitaciones = new ArrayList<Habitacion>();
	ArrayList<Asignatura>   colAsignaturas  = new ArrayList<Asignatura>();
	ArrayList<Docente>      colDocente      = new ArrayList<Docente>();
	ArrayList<GrupoAlumnos> colGrupoAlumnos = new ArrayList<GrupoAlumnos>();


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

		//System.out.println(data.get("ListaTarjeta")[0]);

		switch ( data.get("ListaTarjeta")[0] ) {
		case "Habitaciones":
			//TODO: modificar para obtener la habitacion en CrearHabitacion?
			CrearHabitacion( (String[]) data.get("Datos") );
			colHabitaciones.get( colHabitaciones.size() -1 );
			ControladorInterfaz.interfaz.aniadirObjetoListatarjeta(
					"Habitaciones", 
					colHabitaciones.get( 
							colHabitaciones.size() -1 )
					);
			break;

		case "Asignaturas":
			//TODO: modificar para obtener la habitacion en CrearHabitacion?
			CrearDocente( (String[]) data.get("Datos") );
			colAsignaturas.get( colAsignaturas.size() -1 );
			ControladorInterfaz.interfaz.aniadirObjetoListatarjeta(
					"Asignaturas", 
					colAsignaturas.get( 
							colAsignaturas.size() -1 )
					);
			break;


		case "Docente":
			//TODO: modificar para obtener la habitacion en CrearHabitacion?
			CrearDocente( (String[]) data.get("Datos") );
			colDocente.get( colDocente.size() -1 );
			ControladorInterfaz.interfaz.aniadirObjetoListatarjeta(
					"Docente", 
					colDocente.get( 
							colDocente.size() -1 )
					);
			break;
			
		case "GrupoAlumnos":
			//TODO: modificar para obtener la habitacion en CrearHabitacion?
			CrearGrupoAlumnos( (String[]) data.get("Datos") );
			//colGrupoAlumnos.get( colGrupoAlumnos.size() -1 );
			ControladorInterfaz.interfaz.aniadirObjetoListatarjeta(
					"GrupoAlumnos", 
					colGrupoAlumnos.get( 
							colGrupoAlumnos.size() -1 )
					);
			break;

		default:
			System.out.println("no deveria llegar aqui...");
			break;
		}

	}

	private void CrearGrupoAlumnos(String[] datos) {
		//"Nombre", "Apellidos1", "Apellidos2", "grupo"
		colGrupoAlumnos.add( new GrupoAlumnos(datos[0],datos[1],datos[2],datos[3]) );
	}

	/**
	 * Inicializa el objeto docente y lo aniade a la coleccion 
	 * @param strings
	 */
	private void CrearDocente(String[] datos) {
		//"Nombre", "Apellidos1", "Apellidos2", "especialidad"
		colDocente.add( new Docente(datos[0],datos[1],datos[2],datos[3]) );
	}

	/**
	 * Inicializa objeto habitacion y lo aniade a la coleccion de habitacion
	 * @param datos
	 */
	private void CrearHabitacion(String[] datos) {
		colHabitaciones.add( new Habitacion(datos[0]) );
	}

	private void CrearAsignatura(String[] datos) {
		colAsignaturas.add( new Asignatura(datos[0]) );
	}



}
