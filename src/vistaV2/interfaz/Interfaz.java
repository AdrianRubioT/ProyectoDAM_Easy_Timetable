package vistaV2.interfaz;

import java.awt.EventQueue;

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
import vistaV2.elemetos.ListarElementos;

import javax.swing.JList;

public class Interfaz {

	private JFrame frame;
	private JPanel listaModulos;
	

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
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 0.0, Double.MIN_VALUE};
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
		
		
		ListarElementos panModulos = new ListarElementos();
		
	
		
		GridBagConstraints gbc_panModulos = new GridBagConstraints();
		gbc_panModulos.insets = new Insets(0, 0, 0, 5);
		gbc_panModulos.fill = GridBagConstraints.BOTH;
		gbc_panModulos.gridx = 1;
		gbc_panModulos.gridy = 0;
		frame.getContentPane().add(panModulos, gbc_panModulos);
		
		
		JPanel panEmnpleados = new JPanel();
		GridBagConstraints gbc_panEmnpleados = new GridBagConstraints();
		gbc_panEmnpleados.fill = GridBagConstraints.VERTICAL;
		gbc_panEmnpleados.gridx = 2;
		gbc_panEmnpleados.gridy = 0;
		frame.getContentPane().add(panEmnpleados, gbc_panEmnpleados);
		GridBagLayout gbl_panEmnpleados = new GridBagLayout();
		gbl_panEmnpleados.columnWidths = new int[]{91, 0};
		gbl_panEmnpleados.rowHeights = new int[]{14, 27, 0, 0};
		gbl_panEmnpleados.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panEmnpleados.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		panEmnpleados.setLayout(gbl_panEmnpleados);
		
		JLabel tituloEmpleados = new JLabel("Lista de empleados");
		GridBagConstraints gbc_tituloEmpleados = new GridBagConstraints();
		gbc_tituloEmpleados.anchor = GridBagConstraints.NORTH;
		gbc_tituloEmpleados.insets = new Insets(0, 0, 5, 0);
		gbc_tituloEmpleados.gridx = 0;
		gbc_tituloEmpleados.gridy = 0;
		panEmnpleados.add(tituloEmpleados, gbc_tituloEmpleados);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.VERTICAL;
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 1;
		panEmnpleados.add(panel_3, gbc_panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton button_2 = new JButton("A\u00F1adir");
		panel_3.add(button_2);
		
		JButton button_3 = new JButton("Eliminar");
		panel_3.add(button_3);
		
		JList list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 2;
		panEmnpleados.add(list, gbc_list);
	}
	
	

	

}
