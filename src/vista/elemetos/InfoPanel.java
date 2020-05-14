package vista.elemetos;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JRadioButton;


//TODO: hacer el icono
public class Tarjeta extends JPanel {


	public Tarjeta(String textlb1, ControlRadioButon controlRadio) {
		this(textlb1, "","","", controlRadio);
	}

	public Tarjeta(String textlb1, String textlb2, ControlRadioButon controlRadio) {
		this(textlb1, textlb2, "", "", controlRadio);
	}

	public Tarjeta(String textlb1, String textlb2, String textlb3, ControlRadioButon controlRadio) {
		this(textlb1, textlb2, textlb3, "", controlRadio);
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
	public Tarjeta(String textlb1, String textlb2, String textlb3, String textlb4, ControlRadioButon controlRadio) {
		setBorder(new LineBorder(new Color(0, 0, 0), 2));


		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{81, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);

		JPanel panRadioButton = new JPanel();
		GridBagConstraints gbc_panRadioButton = new GridBagConstraints();
		gbc_panRadioButton.insets = new Insets(0, 0, 0, 5);
		gbc_panRadioButton.fill = GridBagConstraints.BOTH;
		gbc_panRadioButton.gridx = 0;
		gbc_panRadioButton.gridy = 0;
		add(panRadioButton, gbc_panRadioButton);
		

		JRadioButton radiobutton = controlRadio.crearRadioButton("Seleccionado", "hola mundo desde targeta");
		panRadioButton.add(radiobutton);
		


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



		JLabel lb1 = new JLabel(textlb1);
		GridBagConstraints gbc_lb1 = new GridBagConstraints();
		gbc_lb1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lb1.insets = new Insets(0, 0, 5, 5);
		gbc_lb1.gridx = 0;
		gbc_lb1.gridy = 0;
		panDescripcion.add(lb1, gbc_lb1);




		JLabel lb2 = new JLabel(textlb2);
		GridBagConstraints gbc_lb2 = new GridBagConstraints();
		gbc_lb2.insets = new Insets(0, 0, 5, 5);
		gbc_lb2.anchor = GridBagConstraints.NORTHWEST;
		gbc_lb2.gridx = 0;
		gbc_lb2.gridy = 1;
		panDescripcion.add(lb2, gbc_lb2);


		JLabel lb3 = new JLabel(textlb3);
		GridBagConstraints gbc_lb3 = new GridBagConstraints();
		gbc_lb3.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lb3.insets = new Insets(0, 0, 5, 5);
		gbc_lb3.gridx = 0;
		gbc_lb3.gridy = 2;
		panDescripcion.add(lb3, gbc_lb3);


		JLabel lb4 = new JLabel(textlb4);
		GridBagConstraints gbc_lb4 = new GridBagConstraints();
		gbc_lb4.anchor = GridBagConstraints.WEST;
		gbc_lb4.insets = new Insets(0, 0, 0, 5);
		gbc_lb4.gridx = 0;
		gbc_lb4.gridy = 3;
		panDescripcion.add(lb4, gbc_lb4);



	}

}