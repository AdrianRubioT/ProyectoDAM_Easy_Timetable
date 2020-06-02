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
import vista.elementos.ListaTargetas.InfoPanel;
import vista.interfaces.crearMomentos.crearMomento;
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
		
		int id = controladorBD.addHabitacion(habitacion);
		habitacion.setId_BD(id);
		
		listaHabitaciones.add(habitacion);
		return habitacion;
	}
	
	/**
	 * elimina de la listaHabitacion y de la BD la instancia del parametro pasado
	 * @param habtiacion instancia a eliminar
	 */
	private void eliminarHabitacion(Habitacion habitiacion) {
		listaHabitaciones.remove(habitiacion);
		controladorBD.eliminarHabitacion(habitiacion);
	}

	/**
	 * Crea objeto Asignatura, lo lista en colAsignatura y a la BD
	 * @param datos datos que contendra la asignatura
	 * @return objeto asignatura con los datos
	 */
	private Asignatura crearAsignatura(String[] datos) {
		
		Asignatura asignatura = new Asignatura(datos[0]);
		
		int id = controladorBD.addAsignatura(asignatura);
		asignatura.setId_BD(id);
		
		listaAsignatura.add(asignatura);
		
		return asignatura;

	}
	
	/**
	 * elimina de la listaAsignatura y de la BD la instancia del parametro pasado
	 * @param asignatura instancia a eliminar
	 */
	private void eliminarAsignatura(Asignatura asignatura) {
		listaAsignatura.remove(asignatura);
		controladorBD.eliminaAsignatura(asignatura);
		}


	/**
	 * Crea objeto docente y lo lista en colDocente
	 * @param datos
	 * @return 
	 */
	private Docente crearDocente(String[] datos) {
		Docente docente = new Docente(datos[0], datos[1], datos[2], datos[3]);
		int id = controladorBD.addDocente(docente);
		docente.setId_BD(id);
		listaDocente.add(docente);
		return docente;
	}
	
	/**
	 * elimina de la listaDocentey de la BD la instancia del parametro pasado
	 * @param docente instancia a eliminar
	 */
	private void eliminarDocente(Docente docente) {
		listaDocente.remove(docente);
		controladorBD.eliminarDocente(docente);
	}

	/**
	 * Crea objeto grupoAlumnos y lo aniade a colGrupoAlumnos
	 * @param datos
	 * @return 
	 */
	private GrupoAlumnos crearGrupoAlumno(String[] datos) {
		GrupoAlumnos grupoAlumnos = new GrupoAlumnos(datos[0], datos[1]);
		
		int id = controladorBD.addGrupoAlumno(grupoAlumnos);
		grupoAlumnos.setId_BD(id);
		
		listaGruposAlumnos.add(grupoAlumnos);
		return grupoAlumnos;
	}

	/**
	 * elimina de la listaGrupoAlumnos y de la BD la instancia del parametro pasado
	 * @param grupoAlumnos instancia a eliminar
	 */
	private void eliminarGrupoAlumnos(GrupoAlumnos grupoAlumnos) {
		listaGruposAlumnos.remove(grupoAlumnos);
		controladorBD.eliminarGrupoAlumnos(grupoAlumnos);
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

		}


	}

	/**
	 * metodo para el evento de crear un objeto InfoPanel, con sus valores,
	 * lo añade a la lista correspondiente y lo devuelve
	 * @param comando 
	 */
	public InfoPanel crearObjetoTargeta(String comando){

		
		String[]datos;

		switch (comando) {
		case "aniadirAsignaturas":

			datos = new InputPopup(interfazPrincipal, true, Asignatura.CAMPOS).getData();
			Asignatura asignatura = crearAsignatura(datos);
			return asignatura;

		case "aniadirDocente":

			datos = new InputPopup(interfazPrincipal, true, Docente.campos).getData();
			Docente docente = crearDocente(datos);
			return docente;

		case "aniadirGrupoAlumnos":

			datos = new InputPopup(interfazPrincipal, true, GrupoAlumnos.CAMPOS).getData();
			GrupoAlumnos grupoALumnos = crearGrupoAlumno(datos);
			return grupoALumnos;

		case "aniadirHabitaciones":

			datos = new InputPopup(interfazPrincipal, true, Habitacion.CAMPOS).getData();
			Habitacion habitacion = crearHabitacion(datos);
			return habitacion;

		default:
			System.out.println("Comando no encontrado: " + comando);
			break;
		}

		return null;

	}


	/**
	 * elimina el objeto seleccionado
	 * @param infoPanel 
	 */
	public void eliminarSeleccionado(InfoPanel infoPanel) {

		
		switch ( infoPanel.getClass().getSimpleName() ) {
		case "Asignatura":
			eliminarAsignatura((Asignatura) infoPanel);
//			System.out.println("tamanio lista: " + listaHabitaciones.size() );
			break;

		case "Habitacion":
			eliminarHabitacion( (Habitacion) infoPanel);
//			System.out.println("tamanio lista: " + listaHabitaciones.size() );
			break;
		
		case "GrupoAlumnos":
			eliminarGrupoAlumnos( (GrupoAlumnos) infoPanel);
//			System.out.println("tamanio lista: " + listaHabitaciones.size() );
			break;
			
		case "Docente":
			eliminarDocente( (Docente) infoPanel);
//			System.out.println("tamanio lista: " + listaHabitaciones.size() );
			break;
			
			
		default:
			System.out.println("No encontrado:" +  infoPanel.getClass().getSimpleName() );
			break;
		}
		
		String clas = infoPanel.getClass().getSimpleName();
			System.out.println(clas);

		
	}

	
	/**
	 * recoje los listados de los objetos a listar y los añade a 
	 * las listas de la interfaz
	 */
	public void eventoCargar() {

		listaHabitaciones = controladorBD.obtenerListaHabitaciones();
		interfazPrincipal.setListaHabitacion(listaHabitaciones);
		
		
		listaAsignatura = controladorBD.obtenerListaAsignaturas();
		interfazPrincipal.setListaAsignatura(listaAsignatura);
		
		listaDocente = controladorBD.obtenerListaDocentes();
		interfazPrincipal.setListaDocente(listaDocente);
		
		listaGruposAlumnos = controladorBD.obtenerListaGrupoAlumnos();
		interfazPrincipal.setListaGrupoAlumnos(listaGruposAlumnos);
		
	}


	public void aniadirEvento() {

		new crearMomento(interfazPrincipal, true, listaAsignatura, listaDocente, listaGruposAlumnos, listaHabitaciones);
		
	}


}

