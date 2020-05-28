package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import modelo.ControaldorBD;
import modelo.objetos.Asignatura;
import modelo.objetos.Docente;
import modelo.objetos.GrupoAlumnos;
import modelo.objetos.Habitacion;
import vista.InterfazPrincipal;
import vista.elementos.ListaTargetas.PassInfoData;
import vista.interfaces.popup.InputPopup;

/**
 * 
 * @author
 *
 */
public class Controlador {
	/**
	 * colleccion de los objetos basicos de la logica de negocio
	 */
	private ArrayList<Habitacion> listaHabitaciones = new ArrayList<Habitacion>();
	private ArrayList<Asignatura> listaAsignatura = new ArrayList<Asignatura>();
	private ArrayList<Docente> listaDocente = new ArrayList<Docente>();
	private ArrayList<GrupoAlumnos> listaGruposAlumnos = new ArrayList<GrupoAlumnos>();

	private ControaldorBD controladorBD = new ControaldorBD();
	private InterfazPrincipal interfazPrincipal = new InterfazPrincipal(this);

	public Controlador() {

	}


	/**
	 * Inicializa objeto habitacion y lo aniade a la coleccion de habitacion
	 * @param datos 
	 * @return 
	 */
	private Habitacion crearHabitacion(String[] datos) {
		Habitacion habitacion = new Habitacion(datos[0]);
		listaHabitaciones.add(habitacion);
		return habitacion;
	}

	/**
	 * Crea objeto Asignatura y lo lista en colAsignatura
	 * @param datos datos que contendra la asignatura
	 * @return objeto asignatura con los datos
	 */
	private Asignatura crearAsignatura(String[] datos) {
		Asignatura asignatura = new Asignatura(datos[0]);
		listaAsignatura.add(asignatura);
		return asignatura;

	}

	/**
	 * Crea objeto docente y lo lista en colDocente
	 * @param datos
	 * @return 
	 */
	private Docente crearDocente(String[] datos) {
		Docente asignatura = new Docente(datos[0], datos[1], datos[2], datos[3]);
		listaDocente.add(asignatura);
		return asignatura;
	}

	/**
	 * Crea objeto grupoAlumnos y lo aniade a colGrupoAlumnos
	 * @param datos
	 * @return 
	 */
	private GrupoAlumnos crearGrupoAlumno(String[] datos) {
		GrupoAlumnos grupoAlumnos = new GrupoAlumnos(datos[0], datos[1]);
		listaGruposAlumnos.add(grupoAlumnos);
		return grupoAlumnos;
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

	/**
	 * metodo para el evento de crear un objeto InfoPanel, con sus valores,
	 * lo añade a la lista correspondiente y lo devuelve
	 * @param comando 
	 */
	public PassInfoData crearObjetoTargeta(String comando){

		
		String[]datos;

		switch (comando) {
		case "aniadirAsignaturas":

			datos = new InputPopup(interfazPrincipal, true, Asignatura.campos).getData();
			Asignatura asignatura = crearAsignatura(datos);
			return asignatura;

		case "aniadirDocente":

			datos = new InputPopup(interfazPrincipal, true, Docente.campos).getData();
			Docente docente = crearDocente(datos);
			return docente;

		case "aniadirGrupoAlumnos":

			datos = new InputPopup(interfazPrincipal, true, GrupoAlumnos.campos).getData();
			GrupoAlumnos grupoALumnos = crearGrupoAlumno(datos);
			return grupoALumnos;

		case "aniadirHabitaciones":

			datos = new InputPopup(interfazPrincipal, true, Habitacion.campos).getData();
			Habitacion habitacion = crearHabitacion(datos);
			return habitacion;

		default:
			System.out.println("Comando no encontrado: " + comando);
			break;
		}

		return null;

	}


}

