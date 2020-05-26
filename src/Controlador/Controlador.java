package Controlador;

import java.util.ArrayList;

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

	//private ControaldorBD controladorBD = new ControaldorBD();
	private InterfazPrincipal interfazPrincipal = new InterfazPrincipal();
	
	public Controlador() {
		
	}

	/**
	 * Inicializa objeto habitacion y lo aniade a la coleccion de habitacion
	 * @param datos 
	 * @return void
	 */
	private void crearHabitacion(String[] datos) {
		// TODO Auto-generated method stub
	}

	/**
	 * Crea objeto Asignatura y lo lista en colAsignatura
	 * @param datos
	 * @return void
	 */
	private void crearAsignatura(String[] datos) {
		// TODO Auto-generated method stub
	}

	/**
	 * Crea objeto docente y lo lista en colDocente
	 * @param datos
	 * @return void
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

}

