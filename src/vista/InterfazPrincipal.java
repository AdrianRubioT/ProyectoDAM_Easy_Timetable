package vista;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import Controlador.Controlador;
import PorColocar.AreaTrabajo;
import vista.elementos.ListaTargetas.ListaTarjetas;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Clase para montar la interfaz principal y su componentes
 * @author
 *
 */
public class InterfazPrincipal extends JFrame {
	
	
	
	private Controlador controlador;
	
	//listados para mostrar en la interfaz
	private ListaTarjetas listaHabitaciones;
	private ListaTarjetas listaAsiganturas;
	private ListaTarjetas listaDocentes;
	private ListaTarjetas listaAlumnos;
	
	//componentes de la interfaz
	private AreaTrabajo areaTrabajo;
	private ListaTarjetas tabAsignatura;
	private ListaTarjetas tabDocente;
	private ListaTarjetas tabHabitaciones;
	private ListaTarjetas tabGrupoAlumnos;

	
	/**
	 * @wbp.parser.entryPoint
	 */
	public InterfazPrincipal(Controlador controlador) {
		this.controlador = controlador;
		initialize();
		//setVisible(true);
	}
	
	/**
	 * Initialize the contents of the frame
	 */
	private void initialize() {
		
		setBounds(100, 100, 645, 414);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmNuevo = new JMenuItem("Nuevo");
		mntmNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.NuevoHorario();
			}
		});
		mnArchivo.add(mntmNuevo);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 100, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);

		JPanel panHorario = new JPanel();
		GridBagConstraints gbc_panHorario = new GridBagConstraints();
		gbc_panHorario.insets = new Insets(0, 0, 0, 5);
		gbc_panHorario.fill = GridBagConstraints.BOTH;
		gbc_panHorario.gridx = 0;
		gbc_panHorario.gridy = 0;
		getContentPane().add(panHorario, gbc_panHorario);
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
		getContentPane().add(tabbedPane, gbc_tabbedPane);


		tabAsignatura = new ListaTarjetas("Asignaturas");
		tabbedPane.addTab("Asignaturas", tabAsignatura);

		tabDocente = new ListaTarjetas("Docente");
		tabbedPane.addTab("Docente", tabDocente);

		tabHabitaciones = new ListaTarjetas("Habitaciones");
		tabbedPane.addTab("Habitaciones", tabHabitaciones);

		tabGrupoAlumnos = new ListaTarjetas("GrupoAlumnos");
		tabbedPane.addTab("GrupoAlumnos", tabGrupoAlumnos);



		setVisible(true);
	}

	
	
	
}

