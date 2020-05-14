package vista.interfaz;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;

import vista.elemetos.ListaTarjetas;
import javax.swing.JTabbedPane;

public class Interfaz {

	private JFrame frame;
	


	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 645, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 100, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JPanel panHorario = new JPanel();
		GridBagConstraints gbc_panHorario = new GridBagConstraints();
		gbc_panHorario.insets = new Insets(0, 0, 0, 5);
		gbc_panHorario.fill = GridBagConstraints.BOTH;
		gbc_panHorario.gridx = 0;
		gbc_panHorario.gridy = 0;
		frame.getContentPane().add(panHorario, gbc_panHorario);
		GridBagLayout gbl_panHorario = new GridBagLayout();
		gbl_panHorario.columnWidths = new int[]{0, 0};
		gbl_panHorario.rowHeights = new int[]{0, 0, 0};
		gbl_panHorario.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panHorario.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panHorario.setLayout(gbl_panHorario);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		panHorario.add(panel, gbc_panel);
		
		JLabel lblHorario = new JLabel("Horario:");
		panel.add(lblHorario);
		
		JComboBox comboBox = new JComboBox();
		panel.add(comboBox);
		
		JButton btnAadir = new JButton("A\u00F1adir");
		panel.add(btnAadir);
		
		JButton btnEliminar = new JButton("Eliminar");
		panel.add(btnEliminar);
		
		JPanel areaTrabajo = new JPanel();
		areaTrabajo.setBackground(Color.WHITE);
		GridBagConstraints gbc_areaTrabajo = new GridBagConstraints();
		gbc_areaTrabajo.fill = GridBagConstraints.BOTH;
		gbc_areaTrabajo.gridx = 0;
		gbc_areaTrabajo.gridy = 1;
		panHorario.add(areaTrabajo, gbc_areaTrabajo);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 1;
		gbc_tabbedPane.gridy = 0;
		frame.getContentPane().add(tabbedPane, gbc_tabbedPane);
		
		
		JComponent tabModulos = new ListaTarjetas("Asignaturas", frame);
		tabbedPane.addTab("Asignaturas", tabModulos);
		
		JComponent tabEmpleados = new ListaTarjetas("Empleados", frame);
		tabbedPane.addTab("Empleados", tabEmpleados);

		JComponent tabHabitaciones= new ListaTarjetas("Habitaciones", frame);
		tabbedPane.addTab("Habitaciones", tabHabitaciones);
		
		JComponent tabAlumnos= new ListaTarjetas("Alumnos", frame);
		tabbedPane.addTab("Alumnos", tabAlumnos);
		
       		
		
		frame.setVisible(true);
	}

	/**
	 * @return the frame
	 */
	public JFrame getFrame() {
		return frame;
	}
	
	

	

}
