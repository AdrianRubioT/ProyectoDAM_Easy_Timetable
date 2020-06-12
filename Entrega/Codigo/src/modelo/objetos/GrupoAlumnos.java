package modelo.objetos;

import java.util.ArrayList;

import vista.elementos.ListaTargetas.InfoPanel;

/**
 * Coleccion de alumnos que realizan un curso 
 * @author
 *
 */
public class GrupoAlumnos extends InfoPanel{

	private ArrayList<Alumno> alumnos;
	private String nombreCurso;
	private String nombreGrupo;

	final public static String[]CAMPOS = {"nombreCurso", "nombreGrupo"}; 


	/**
	 * @param nombreCurso
	 * @param nombreGrupo
	 */
	public GrupoAlumnos(String nombreCurso, String nombreGrupo) {
		super(CAMPOS, "GrupoAlumnos");
		this.nombreCurso = nombreCurso;
		this.nombreGrupo = nombreGrupo;
		actualizaSuper();
	}

	public GrupoAlumnos() {
		super(CAMPOS, "GrupoAlumnos");
	}

	/**
	 * recoge los valores de las variables de la clase para notificar a super
	 */
	private void actualizaSuper() {
		String[] valores = {this.nombreCurso, this.nombreGrupo};
		actualizaValores(valores);
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
		actualizaSuper();
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
		actualizaSuper();
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

	@Override
	public String toString() {
		return this.nombreGrupo;
	}

}

