package vista.elementos.AreaTrabajo;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;

/**
 * Clase para mostrar la informacion en dos paneles: a la izquierda se mostrara 
 * la hora de inicio y fin y a la derecha los datos del intervalo
 * @author adrian
 *
 */
public class MomentoInfo extends JPanel {

	/**
	 * Create the panel.
	 */
	public MomentoInfo() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{70, 0};
		gbl_panel.rowHeights = new int[]{15, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel horaInicio = new JLabel("Hora Inicio");
		GridBagConstraints gbc_horaInicio = new GridBagConstraints();
		gbc_horaInicio.anchor = GridBagConstraints.NORTHWEST;
		gbc_horaInicio.insets = new Insets(0, 0, 5, 0);
		gbc_horaInicio.gridx = 0;
		gbc_horaInicio.gridy = 0;
		panel.add(horaInicio, gbc_horaInicio);
		
		JLabel horaFinal = new JLabel("Hora fin");
		GridBagConstraints gbc_horaFinal = new GridBagConstraints();
		gbc_horaFinal.anchor = GridBagConstraints.NORTHWEST;
		gbc_horaFinal.gridx = 0;
		gbc_horaFinal.gridy = 1;
		panel.add(horaFinal, gbc_horaFinal);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{110, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblDocente = new JLabel("Docente:");
		GridBagConstraints gbc_lblDocente = new GridBagConstraints();
		gbc_lblDocente.anchor = GridBagConstraints.WEST;
		gbc_lblDocente.insets = new Insets(0, 0, 5, 5);
		gbc_lblDocente.gridx = 0;
		gbc_lblDocente.gridy = 0;
		panel_1.add(lblDocente, gbc_lblDocente);
		
		JLabel lblGrupo = new JLabel("Grupo");
		GridBagConstraints gbc_lblGrupo = new GridBagConstraints();
		gbc_lblGrupo.anchor = GridBagConstraints.WEST;
		gbc_lblGrupo.insets = new Insets(0, 0, 5, 5);
		gbc_lblGrupo.gridx = 0;
		gbc_lblGrupo.gridy = 1;
		panel_1.add(lblGrupo, gbc_lblGrupo);
		
		JLabel lblHabitacion = new JLabel("Habitacion");
		GridBagConstraints gbc_lblHabitacion = new GridBagConstraints();
		gbc_lblHabitacion.anchor = GridBagConstraints.WEST;
		gbc_lblHabitacion.insets = new Insets(0, 0, 5, 5);
		gbc_lblHabitacion.gridx = 0;
		gbc_lblHabitacion.gridy = 2;
		panel_1.add(lblHabitacion, gbc_lblHabitacion);
		
		JLabel lblAsignatura = new JLabel("Asignatura");
		GridBagConstraints gbc_lblAsignatura = new GridBagConstraints();
		gbc_lblAsignatura.insets = new Insets(0, 0, 0, 5);
		gbc_lblAsignatura.anchor = GridBagConstraints.WEST;
		gbc_lblAsignatura.gridx = 0;
		gbc_lblAsignatura.gridy = 3;
		panel_1.add(lblAsignatura, gbc_lblAsignatura);

	}

}
