package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.GridLayout;

public class Interfaz {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
		frame.setBounds(100, 100, 542, 362);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 111, 105, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
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
		
		JPanel panEmpleados = new JPanel();
		GridBagConstraints gbc_panEmpleados = new GridBagConstraints();
		gbc_panEmpleados.insets = new Insets(0, 0, 0, 5);
		gbc_panEmpleados.fill = GridBagConstraints.VERTICAL;
		gbc_panEmpleados.gridx = 1;
		gbc_panEmpleados.gridy = 0;
		frame.getContentPane().add(panEmpleados, gbc_panEmpleados);
		GridBagLayout gbl_panEmpleados = new GridBagLayout();
		gbl_panEmpleados.columnWidths = new int[]{91, 0};
		gbl_panEmpleados.rowHeights = new int[]{14, 27, 0, 0};
		gbl_panEmpleados.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panEmpleados.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		panEmpleados.setLayout(gbl_panEmpleados);
		
		JLabel lblListaDeEmpleados = new JLabel("Lista de empleados");
		GridBagConstraints gbc_lblListaDeEmpleados = new GridBagConstraints();
		gbc_lblListaDeEmpleados.insets = new Insets(0, 0, 5, 0);
		gbc_lblListaDeEmpleados.anchor = GridBagConstraints.NORTH;
		gbc_lblListaDeEmpleados.gridx = 0;
		gbc_lblListaDeEmpleados.gridy = 0;
		panEmpleados.add(lblListaDeEmpleados, gbc_lblListaDeEmpleados);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.VERTICAL;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		panEmpleados.add(panel_1, gbc_panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton button = new JButton("A\u00F1adir");
		panel_1.add(button);
		
		JButton button_1 = new JButton("Eliminar");
		panel_1.add(button_1);
		
		JScrollPane listaEmpleados = new JScrollPane();
		GridBagConstraints gbc_listaEmpleados = new GridBagConstraints();
		gbc_listaEmpleados.fill = GridBagConstraints.VERTICAL;
		gbc_listaEmpleados.gridx = 0;
		gbc_listaEmpleados.gridy = 2;
		panEmpleados.add(listaEmpleados, gbc_listaEmpleados);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.VERTICAL;
		gbc_panel_2.gridx = 2;
		gbc_panel_2.gridy = 0;
		frame.getContentPane().add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{91, 0};
		gbl_panel_2.rowHeights = new int[]{14, 27, 0, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel label = new JLabel("Lista de empleados");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.NORTH;
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		panel_2.add(label, gbc_label);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.VERTICAL;
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 1;
		panel_2.add(panel_3, gbc_panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton button_2 = new JButton("A\u00F1adir");
		panel_3.add(button_2);
		
		JButton button_3 = new JButton("Eliminar");
		panel_3.add(button_3);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.VERTICAL;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		panel_2.add(scrollPane, gbc_scrollPane);
	}

}
