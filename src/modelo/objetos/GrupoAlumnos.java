package modelo.objetos;

import java.util.ArrayList;

/**
 * Coleccion de alumnos que realizan un curso 
 * @author
 *
 */
public class GrupoAlumnos {
	private ArrayList<Alumno> alumnos;
	private String nombreCurso;
	private String nombreGrupo;


	/**
	 * @param nombreCurso
	 * @param nombreGrupo
	 */
	public GrupoAlumnos(String nombreCurso, String nombreGrupo) {
		this.nombreCurso = nombreCurso;
		this.nombreGrupo = nombreGrupo;
	}


	/**
	 * @return the alumnos
	 */
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}


	/**
	 * @param alumnos the alumnos to set
	 */
	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}


	/**
	 * @return the nombreCurso
	 */
	public String getNombreCurso() {
		return nombreCurso;
	}


	/**
	 * @param nombreCurso the nombreCurso to set
	 */
	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}


	/**
	 * @return the nombreGrupo
	 */
	public String getNombreGrupo() {
		return nombreGrupo;
	}


	/**
	 * @param nombreGrupo the nombreGrupo to set
	 */
	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}



}

