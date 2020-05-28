package vista.elementos.ListaTargetas;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * Pequeño JPanel con JLabels indicando las claves y sus valores
 * @author
 *
 */
public class InfoPanel extends JPanel{
	/**
	 * coleccion de JLabels generadas
	 */
	private ArrayList<JLabel> claves;
	/**
	 * coleccion de los valores para las claves
	 */
	private ArrayList<JLabel> valores;
	private JPanel panDescripcion;

	/**
	 * @wbp.parser.entryPoint
	 */
	public InfoPanel(PassInfoData objeto) {
		setBorder(new LineBorder(new Color(0, 0, 0), 2));



		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{81, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);


		panDescripcion = new JPanel();
		GridBagConstraints gbc_panDescripcion = new GridBagConstraints();
		gbc_panDescripcion.fill = GridBagConstraints.BOTH;
		gbc_panDescripcion.gridx = 1;
		gbc_panDescripcion.gridy = 0;
		add(panDescripcion, gbc_panDescripcion);
		GridBagLayout gbl_panDescripcion = new GridBagLayout();
		gbl_panDescripcion.columnWidths = new int[]{0};
		gbl_panDescripcion.rowHeights = new int[]{0};
		gbl_panDescripcion.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panDescripcion.rowWeights = new double[]{Double.MIN_VALUE};
		panDescripcion.setLayout(gbl_panDescripcion);
		
		
		addInfoObject(objeto);
		
		
	}

	/**
	 * extrae del parametro objeto la informacion para crear los pares de JLabels
	 * clave-valor
	 * @param objeto
	 * @return void
	 */
	public void addInfoObject(PassInfoData objeto) {
		
		String[] etiquetas = objeto.getKeys();
		String[] claves = objeto.getValues();
		
		//etiquetas
		for (int i = 0; i < etiquetas.length; i++) {
			//System.out.println(etiquetas[i]);
			JLabel JPKey = new JLabel( etiquetas[i]);
			GridBagConstraints gbc_lblLinea_3 = new GridBagConstraints();
			gbc_lblLinea_3.insets = new Insets(0, 0, 0, 5);
			gbc_lblLinea_3.gridx = 0;
			gbc_lblLinea_3.gridy = i;
			panDescripcion.add(JPKey, gbc_lblLinea_3);
		}

		
		for (int i = 0; i < claves.length; i++) {
			//System.out.println(data[i]);
			JLabel JPValue = new JLabel( claves[i]);
			GridBagConstraints gbc_lin4 = new GridBagConstraints();
			gbc_lin4.fill = GridBagConstraints.HORIZONTAL;
			gbc_lin4.gridx = 1;
			gbc_lin4.gridy = i;
			panDescripcion.add( JPValue, gbc_lin4);

		}

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

