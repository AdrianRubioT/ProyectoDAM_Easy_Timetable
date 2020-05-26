package vista.elemetos;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridBagLayout;
import javax.swing.JTable;

public class AreaTrabajo extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public AreaTrabajo() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		table = new JTable();
		add(table);
		
	}
}
