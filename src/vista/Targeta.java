package vista;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;

public class Targeta extends JPanel {

	/**
	 * Create the panel.
	 */
	public Targeta() {
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
		
		JLabel lb1 = new JLabel("");
		GridBagConstraints gbc_lb1 = new GridBagConstraints();
		gbc_lb1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lb1.insets = new Insets(0, 0, 5, 5);
		gbc_lb1.gridx = 0;
		gbc_lb1.gridy = 0;
		panDescripcion.add(lb1, gbc_lb1);
		
		JLabel lb2 = new JLabel("");
		GridBagConstraints gbc_lb2 = new GridBagConstraints();
		gbc_lb2.insets = new Insets(0, 0, 5, 5);
		gbc_lb2.anchor = GridBagConstraints.NORTHWEST;
		gbc_lb2.gridx = 0;
		gbc_lb2.gridy = 1;
		panDescripcion.add(lb2, gbc_lb2);
		
		JLabel lb3 = new JLabel("");
		GridBagConstraints gbc_lb3 = new GridBagConstraints();
		gbc_lb3.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lb3.insets = new Insets(0, 0, 5, 5);
		gbc_lb3.gridx = 0;
		gbc_lb3.gridy = 2;
		panDescripcion.add(lb3, gbc_lb3);
		
		JLabel lb4 = new JLabel("");
		GridBagConstraints gbc_lb4 = new GridBagConstraints();
		gbc_lb4.anchor = GridBagConstraints.WEST;
		gbc_lb4.insets = new Insets(0, 0, 0, 5);
		gbc_lb4.gridx = 0;
		gbc_lb4.gridy = 3;
		panDescripcion.add(lb4, gbc_lb4);

	}

}
