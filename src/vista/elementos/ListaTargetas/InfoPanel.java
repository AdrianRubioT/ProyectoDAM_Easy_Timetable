package vista.elementos.ListaTargetas;

import java.util.ArrayList;

import javax.swing.JLabel;

/**
 * Pequeño JPanel con JLabels indicando las claves y sus valores
 * @author
 *
 */
public class InfoPanel {
	/**
	 * coleccion de JLabels generadas
	 */
	private ArrayList<JLabel> claves;
	/**
	 * coleccion de los valores para las claves
	 */
	private ArrayList<JLabel> valores;

	public InfoPanel() {
		
	}

	/**
	 * extrae del parametro objeto la informacion para crear los pares de JLabel
	 * s clave-valor
	 * @param objeto
	 * @return void
	 */
	public void addInfoObject(PassInfoData objeto) {
		// TODO Auto-generated method stub
	}

	/**
	 * Crea tantos JTextfield como inputs hayan y lo agrega a colInputs ademas d
	 * e agregarlos a la intefaz
	 * @param etiquetas
	 * @param data
	 * @return void
	 */
	private void crearLabels(String[] etiquetas, String[] data) {
		// TODO Auto-generated method stub
	}

}

