package vista.interfaz;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JScrollPane;

import vista.elemetos.ListaTargetas;

public class Interfaz {

	private JFrame frame;
	private JScrollPane listaEmpleados;


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
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
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
		
		
		ListaTargetas panModulos = new ListaTargetas("modulos", frame);
		
		
		GridBagConstraints gbc_panModulos = new GridBagConstraints();
		gbc_panModulos.insets = new Insets(0, 0, 0, 5);
		gbc_panModulos.fill = GridBagConstraints.BOTH;
		gbc_panModulos.gridx = 1;
		gbc_panModulos.gridy = 0;
		frame.getContentPane().add(panModulos, gbc_panModulos);
		
		ListaTargetas panEmpleados = new ListaTargetas("Empleados", frame);
		//JPanel panEmpleados = new JPanel();
		GridBagConstraints gbc_panEmpleados = new GridBagConstraints();
		gbc_panEmpleados.fill = GridBagConstraints.BOTH;
		gbc_panEmpleados.gridx = 2;
		gbc_panEmpleados.gridy = 0;
		frame.getContentPane().add(panEmpleados, gbc_panEmpleados);

		
		
		frame.setVisible(true);
	}
	
	

	

}
