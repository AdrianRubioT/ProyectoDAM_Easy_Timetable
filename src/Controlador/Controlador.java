package Controlador;

import java.io.File;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import modelo.ControaldorBD;
import modelo.objetos.Asignatura;
import modelo.objetos.Docente;
import modelo.objetos.GrupoAlumnos;
import modelo.objetos.Habitacion;
import vista.InterfazPrincipal;

/**
 * 
 * @author
 *
 */
public class Controlador {
	/**
	 * colleccion de los objetos basicos de la logica de negocio
	 */
	private ArrayList<Habitacion> listaHabitaciones;
	private ArrayList<Asignatura> listaAsignatura;
	private ArrayList<Docente> listaDocente;
	private ArrayList<GrupoAlumnos> listaGruposAlumnos;

	private ControaldorBD controladorBD = new ControaldorBD();
	private InterfazPrincipal interfazPrincipal = new InterfazPrincipal(this);

	public Controlador() {

	}


	/**
	 * Inicializa objeto habitacion y lo aniade a la coleccion de habitacion
	 * @param datos 
	 */
	private void crearHabitacion(String[] datos) {
		// TODO Auto-generated method stub
	}

	/**
	 * Crea objeto Asignatura y lo lista en colAsignatura
	 * @param datos
	 */
	private void crearAsignatura(String[] datos) {
		// TODO Auto-generated method stub
	}

	/**
	 * Crea objeto docente y lo lista en colDocente
	 * @param datos
	 */
	private void crearDocente(String[] datos) {
		// TODO Auto-generated method stub
	}

	/**
	 * Crea objeto grupoAlumnos y lo aniade a colGrupoAlumnos
	 * @param datos
	 */
	private void crearGrupoAlumno(String[] datos) {
		// TODO Auto-generated method stub
	}


	/**
	 * evento para indicar un nuevo archivo del horario
	 */
	public void NuevoHorario() {

		JFileChooser fileChooser = new JFileChooser("./prueba");

		//mostrar el dialogo para seleccionar la carpeta
		int seleccion = fileChooser.showSaveDialog( interfazPrincipal );

		//comprovacion que el usuario ha pulsado el boton guardar
		if (seleccion == JFileChooser.APPROVE_OPTION)
		{

			//Obtenemos el fichero seleccionado 
			File fichero = fileChooser.getSelectedFile();
			controladorBD.conecta( fichero.getPath(), fichero.exists() );
			//System.out.println(fichero.getPath() );
			
			//System.out.println("El fichero existe: " +  fichero.exists() );
			
		}


	}

}

