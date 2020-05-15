package vista.elemetos;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;


/**
 * clase para mostrar un Jpanel con informacion mediante JLabels
 * ademas de un ControlRadioButton 
 * @author adrian
 *
 */
public class InfoPanel extends JPanel {

	private JPanel panDescripcion;
	private JPanel panRadioButton;
	private String categoria;

	/**
	 * inicializa la clase y genera los JLabels necesarios, ademas de
	 * un ControlRadioButton en dicha categoria
	 * @param categoria indica el RadioGruop @see {@link ControlRadioButon}
	 * @param labels nombre de las JLabel indicativo
	 * @param data valores de las JLabel indicativo
	 */
	public InfoPanel(String categoria, String[] labels, String[] data) {

		this.categoria = categoria;

		setBorder(new LineBorder(new Color(0, 0, 0), 2));



		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{81, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);

		//JRadioButton radiobutton = controlRadio.crearRadioButton("Seleccionado", "hola mundo desde targeta");
		//panRadioButton.add(radiobutton);

		
		
		panRadioButton = new JPanel();
		GridBagConstraints gbc_panRadioButton = new GridBagConstraints();
		gbc_panRadioButton.insets = new Insets(0, 0, 0, 5);
		gbc_panRadioButton.fill = GridBagConstraints.BOTH;
		gbc_panRadioButton.gridx = 0;
		gbc_panRadioButton.gridy = 0;
		add(panRadioButton, gbc_panRadioButton);




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

		crearLabels(labels, data);

	}




	/**
	 * Crea tantos JTextfield como inputs hayan y lo agrega a colInputs ademas de
	 * agregarlos a la intefaz
	 * @param inputs 
	 */
	private void crearLabels(String[] etiquetas, String[] data) {
		
		//etiquetas
		for (int i = 0; i < etiquetas.length; i++) {
			//System.out.println(etiquetas[i]);
			JLabel clave = new JLabel( etiquetas[i]);
			GridBagConstraints gbc_lblLinea_3 = new GridBagConstraints();
			gbc_lblLinea_3.insets = new Insets(0, 0, 0, 5);
			gbc_lblLinea_3.gridx = 0;
			gbc_lblLinea_3.gridy = i;
			panDescripcion.add(clave, gbc_lblLinea_3);
		}

		for (int i = 0; i < data.length; i++) {
			//System.out.println(data[i]);
			JLabel clave = new JLabel( data[i]);
			GridBagConstraints gbc_lin4 = new GridBagConstraints();
			gbc_lin4.fill = GridBagConstraints.HORIZONTAL;
			gbc_lin4.gridx = 1;
			gbc_lin4.gridy = i;
			panDescripcion.add( clave, gbc_lin4);
			
		}


	}

}
