package vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;

public class Targeta extends JPanel {


	public Targeta(String textlb1) {
		this(textlb1, "","","");
	}

	public Targeta(String textlb1, String textlb2) {
		this(textlb1, textlb2, "", "");
	}

	public Targeta(String textlb1, String textlb2, String textlb3) {
		this(textlb1, textlb2, textlb3, "");
	}


	/**
	 * crea un panel con un icono y 4 etiquetas a rellenar (opcional),
	 * si se proporciona "" en los parametros, no se generara dicha linea reagrupando los 
	 * otros labels
	 * @param textlb1 texto en linea1
	 * @param textlb2 texto en linea2
	 * @param textlb3 texto en linea3
	 * @param textlb4 texto en linea4
	 * @wbp.parser.constructor
	 * 
	 */
	public Targeta(String textlb1, String textlb2, String textlb3, String textlb4) {


		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{81, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);

		JPanel panIcon = new JPanel();
		GridBagConstraints gbc_panIcon = new GridBagConstraints();
		gbc_panIcon.insets = new Insets(0, 0, 0, 5);
		gbc_panIcon.fill = GridBagConstraints.BOTH;
		gbc_panIcon.gridx = 0;
		gbc_panIcon.gridy = 0;
		add(panIcon, gbc_panIcon);

		JPanel panDescripcion = new JPanel();
		GridBagConstraints gbc_panDescripcion = new GridBagConstraints();
		gbc_panDescripcion.fill = GridBagConstraints.BOTH;
		gbc_panDescripcion.gridx = 1;
		gbc_panDescripcion.gridy = 0;
		add(panDescripcion, gbc_panDescripcion);
		GridBagLayout gbl_panDescripcion = new GridBagLayout();
		gbl_panDescripcion.columnWidths = new int[]{46, 46, 0};
		gbl_panDescripcion.rowHeights = new int[]{14, 0, 0, 0, 0};
		gbl_panDescripcion.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panDescripcion.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panDescripcion.setLayout(gbl_panDescripcion);


		if (!textlb1.equals("")) {
			JLabel lb1 = new JLabel("");
			GridBagConstraints gbc_lb1 = new GridBagConstraints();
			gbc_lb1.anchor = GridBagConstraints.NORTHWEST;
			gbc_lb1.insets = new Insets(0, 0, 5, 5);
			gbc_lb1.gridx = 0;
			gbc_lb1.gridy = 0;
			panDescripcion.add(lb1, gbc_lb1);
		}


		if (!textlb1.equals("")) {
			JLabel lb2 = new JLabel("");
			GridBagConstraints gbc_lb2 = new GridBagConstraints();
			gbc_lb2.insets = new Insets(0, 0, 5, 5);
			gbc_lb2.anchor = GridBagConstraints.NORTHWEST;
			gbc_lb2.gridx = 0;
			gbc_lb2.gridy = 1;
			panDescripcion.add(lb2, gbc_lb2);
		}


		if (!textlb1.equals("")) {
			JLabel lb3 = new JLabel("");
			GridBagConstraints gbc_lb3 = new GridBagConstraints();
			gbc_lb3.anchor = GridBagConstraints.SOUTHWEST;
			gbc_lb3.insets = new Insets(0, 0, 5, 5);
			gbc_lb3.gridx = 0;
			gbc_lb3.gridy = 2;
			panDescripcion.add(lb3, gbc_lb3);
		}


		if (!textlb1.equals("")) {
			JLabel lb4 = new JLabel("");
			GridBagConstraints gbc_lb4 = new GridBagConstraints();
			gbc_lb4.anchor = GridBagConstraints.WEST;
			gbc_lb4.insets = new Insets(0, 0, 0, 5);
			gbc_lb4.gridx = 0;
			gbc_lb4.gridy = 3;
			panDescripcion.add(lb4, gbc_lb4);
		}


	}

}
