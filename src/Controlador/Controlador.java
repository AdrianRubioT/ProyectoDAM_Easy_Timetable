package Controlador;

import java.io.File;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import modelo.ControaldorBD;
import modelo.objetos.Asignatura;
import modelo.objetos.Docente;
import modelo.objetos.GrupoAlumnos;
import modelo.objetos.Habitacion;
import modelo.objetos.IntervaloTiempo;
import modelo.objetos.Slot;
import vista.InterfazPrincipal;
import vista.elementos.AreaTrabajo.AreaTrabajo;
import vista.elementos.ListaTargetas.InfoPanel;
import vista.elementos.ListaTargetas.ListaTarjetas;
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
	private ArrayList<IntervaloTiempo> listaIntervaloTiempo= new ArrayList<IntervaloTiempo>();
	//private ArrayList<Slot> listaSlots= new ArrayList<Slot>();


	private ControaldorBD controladorBD = new ControaldorBD();
	private InterfazPrincipal interfazPrincipal = new InterfazPrincipal(this);




	public Controlador() {

	}


	/**
	 * Inicialia objeto IntervaloTiempo y lo  aniade a la coleccion de IntervaloTiempo
	 * @param datos
	 * @return
	 */
	private Slot crearMomento(IntervaloTiempo intervalo, Habitacion habitacion, 
			Asignatura asignatura, Docente docentes,GrupoAlumnos grupoAlumnos) {

		Slot momento= new Slot(intervalo, habitacion, asignatura, docentes, grupoAlumnos);
		int id = controladorBD.addSlot(momento);
		momento.setId_BD(id);


		return momento;	
	}

	/**
	 * Inicialia objeto IntervaloTiempo y lo  aniade a la coleccion de IntervaloTiempo
	 * @param datos
	 * @return
	 */
	private IntervaloTiempo crearIntervaloTiempo(
			int dia, 
			int horaIncio,int minutoInicio, 
			int horaFin, int minutoFin) {

		IntervaloTiempo intervalo = new IntervaloTiempo(dia, horaIncio, minutoInicio, horaFin, minutoFin);
		int id = controladorBD.addIntervaloTiempo(intervalo);
		intervalo.setId_BD(id);


		return intervalo;	
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
	 * recoje los listados de los objetos a listar y los añade a 
	 * las listas de la interfaz
	 */
	public void eventoCargar() {

		if ( controladorBD.isConected() ) {
			
			JFileChooser fileChooser = new JFileChooser("./prueba");

			//mostrar el dialogo para seleccionar la carpeta
			int seleccion = fileChooser.showSaveDialog( interfazPrincipal );

			//comprovacion que el usuario ha pulsado el boton guardar
			if (seleccion == JFileChooser.APPROVE_OPTION)
			{

				//Obtenemos el fichero seleccionado 
				File fichero = fileChooser.getSelectedFile();
				controladorBD.conecta( fichero.getPath(), fichero.exists() );
				
				//cargar listados
				listaHabitaciones = controladorBD.obtenerListaHabitaciones();
				interfazPrincipal.setListaHabitacion(listaHabitaciones);


				listaAsignatura = controladorBD.obtenerListaAsignaturas();
				interfazPrincipal.setListaAsignatura(listaAsignatura);

				listaDocente = controladorBD.obtenerListaDocentes();
				interfazPrincipal.setListaDocente(listaDocente);

				listaGruposAlumnos = controladorBD.obtenerListaGrupoAlumnos();
				interfazPrincipal.setListaGrupoAlumnos(listaGruposAlumnos);

				listaIntervaloTiempo = controladorBD.obtenerListaIntervaloTiempo();
			}
		}
		


	}
	
	
	/**
	 * metodo para el evento de crear un objeto InfoPanel, con sus valores,
	 * lo añade a la lista correspondiente y lo devuelve
	 * @param comando 
	 */
	public InfoPanel crearObjetoTargeta(ListaTarjetas listaTargeta, String comando){

		InputPopup entradaDatos;

		String[]datos;

		switch (comando) {

		case "aniadirAsignaturas":
			entradaDatos = new InputPopup(interfazPrincipal, true, Asignatura.CAMPOS);
			if (entradaDatos.isAcepted) {
				datos = entradaDatos.getData();
				Asignatura asignatura = crearAsignatura( datos );
				listaTargeta.aniadir( asignatura );
			}
			break;

		case "aniadirDocente":
			entradaDatos = new InputPopup(interfazPrincipal, true, Docente.CAMPOS);
			if (entradaDatos.isAcepted) {
				datos = entradaDatos.getData();
				Docente docente = crearDocente(datos);
				listaTargeta.aniadir( docente );
			}
			break;


		case "aniadirGrupoAlumnos":
			entradaDatos =  new InputPopup(interfazPrincipal, true, GrupoAlumnos.CAMPOS); 
			if (entradaDatos.isAcepted) {
				datos = entradaDatos.getData();
				GrupoAlumnos grupoALumnos = crearGrupoAlumno(datos);
				listaTargeta.aniadir( grupoALumnos );
			}
			break;


		case "aniadirHabitaciones":
			entradaDatos = new InputPopup(interfazPrincipal, true, Habitacion.CAMPOS);
			if (entradaDatos.isAcepted) {
				datos = entradaDatos.getData();
				Habitacion habitacion = crearHabitacion(datos);
				listaTargeta.aniadir( habitacion );
			}
			break;


		default:
			System.out.println("-----crearObjetoTargetatest: Comando no encontrado: " + comando);
			break;
		}

		return null;

	}

	/**
	 * elimina el objeto seleccionado
	 * @param infoPanel 
	 */
	public void eliminarSeleccionado(InfoPanel infoPanel) {

		try {


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

//			String clas = infoPanel.getClass().getSimpleName();
//			System.out.println(clas);
		} catch (NullPointerException e) {
			System.out.println("No hay nada seleccionado");
		}

	}


	


	/**
	 * evento para aniadir un momento en un tiempo determinado
	 * donde interactuan un Docente, GrupoAlumnos, Habitacion y Asignatura
	 * en un margen de tiempo determinado real
	 */
	public void aniadirMomento() {

		crearMomento evento = 
				new crearMomento(interfazPrincipal, true, listaAsignatura, listaDocente, listaGruposAlumnos, listaHabitaciones);

		IntervaloTiempo intervalo = crearIntervaloTiempo(evento.getSelDiaSem(),
				evento.getSelHoraIni(), evento.getSelMinIni(), 
				evento.getSelHoraFin(), evento.getSelMinFin() );

		Slot momento = crearMomento(intervalo, evento.getSelHabitacion(), 
				evento.getSelAsignatura(), evento.getSelDocente(), evento.getSelGrupoAlum() );


		//si el usuario esta añadiendo un elemento al area de trbajo 
		//con la vista activada notara el cambio
		actualizarAreaTrabajo();

	}


	/**
	 * recoge la informacion
	 */
	public void actualizarAreaTrabajo() {
		//		System.out.println(
		//				interfazPrincipal.getControlRadioButon().getSelected().getActionCommand()
		//				);

		ArrayList<Slot> listaMomentos = new ArrayList<Slot>();

		String tipoObjeto = interfazPrincipal.getControlRadioButon().getSelected().getActionCommand().split(" : " )[0];
		String id= interfazPrincipal.getControlRadioButon().getSelected().getActionCommand().split(" : ")[1];

		//		System.out.println("tipo objeto " + tipoObjeto);
		//		System.out.println("id: " + id);

		switch (tipoObjeto) {
		case "Asignatura":
			listaMomentos = controladorBD.obtenerListaMomentosAsignatura( Integer.valueOf(id) );
			break;
		case "Docente":
			listaMomentos = controladorBD.obtenerListaMomentosDocente( Integer.valueOf(id) );
			break;
		case "GrupoAlumnos":
			listaMomentos = controladorBD.obtenerListaMomentosGrupoAlumnos( Integer.valueOf(id) );
			break;
		case "Habitacion":
			listaMomentos = controladorBD.obtenerListaMomentosHabitaciones( Integer.valueOf(id) );
			break;


		default:
			System.out.println("var: tipoObjeto --- no encontrada");
			break;
		}

		interfazPrincipal.setAreaTrabajo(new AreaTrabajo(listaMomentos, tipoObjeto) );


	}


}

