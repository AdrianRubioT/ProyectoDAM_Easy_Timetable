package vista;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import Controlador.Controlador;
import modelo.objetos.Asignatura;
import modelo.objetos.Docente;
import modelo.objetos.GrupoAlumnos;
import modelo.objetos.Habitacion;
import vista.elementos.AreaTrabajo.AreaTrabajo;
import vista.elementos.ListaTargetas.ListaTarjetas;
import vista.elementos.radioButton.ControlRadioButon;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

/**
 * Clase para montar la interfaz principal y su componentes
 * @author
 *
 */
public class InterfazPrincipal extends JFrame {
	
	
	
	private Controlador controlador;
	
	//componentes de la interfaz
	//private AreaTrabajo areaTrabajo;
	private ListaTarjetas tabAsignatura;
	private ListaTarjetas tabDocente;
	private ListaTarjetas tabHabitaciones;
	private ListaTarjetas tabGrupoAlumnos;

	private ControlRadioButon controlRadio;
	private JPanel areaTrabajo_1;
	private JButton btnAadir;
	private JButton btnEliminar;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public InterfazPrincipal(Controlador controlador) {
		this.controlador = controlador;
		this.controlRadio = new ControlRadioButon(controlador);
		initialize();
		//setVisible(true);
	}
	
	/**
	 * Initialize the contents of the frame
	 */
	private void initialize() {
		
		setTitle("Easy Time Table");
		setIconImage(Toolkit.getDefaultToolkit().getImage(InterfazPrincipal.class.getResource("/Recursos/IMG/icono.png")));
		
		
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
		JMenuItem mntmCargar = new JMenuItem("Abrir");
		mntmCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.eventoCargar();
				
			}
		});
		mnArchivo.add(mntmCargar);
		
		
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

		JLabel lblHorario = new JLabel("Momento:");
		panel.add(lblHorario);

		btnAadir = new JButton("A\u00F1adir");
		btnAadir.setEnabled(false);
		btnAadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					controlador.aniadirMomento();
				} catch (Exception e) {
				}
				
			}
		});
		panel.add(btnAadir);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setEnabled(false);
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					controlador.eliminarMomento();
				} catch (Exception e) {
				}
				
			}
		});
		panel.add(btnEliminar);

		areaTrabajo_1 = new JPanel();
		areaTrabajo_1.setBackground(Color.WHITE);
		GridBagConstraints gbc_areaTrabajo_1 = new GridBagConstraints();
		gbc_areaTrabajo_1.fill = GridBagConstraints.BOTH;
		gbc_areaTrabajo_1.gridx = 0;
		gbc_areaTrabajo_1.gridy = 1;
		panHorario.add(areaTrabajo_1, gbc_areaTrabajo_1);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 1;
		gbc_tabbedPane.gridy = 0;
		getContentPane().add(tabbedPane, gbc_tabbedPane);


		tabAsignatura = new ListaTarjetas("Asignaturas", controlador, controlRadio);
		tabbedPane.addTab("Asignaturas", tabAsignatura);

		tabDocente = new ListaTarjetas("Docente", controlador, controlRadio);
		tabbedPane.addTab("Docente", tabDocente);

		tabHabitaciones = new ListaTarjetas("Habitaciones", controlador, controlRadio);
		tabbedPane.addTab("Habitaciones", tabHabitaciones);

		tabGrupoAlumnos = new ListaTarjetas("GrupoAlumnos", controlador, controlRadio);
		tabbedPane.addTab("GrupoAlumnos", tabGrupoAlumnos);



		setVisible(true);
	}
	
	/**
	 * elimina el contenido del JPanel areatrabajo para
	 * imponer el de la instancia areatrabajo
	 * @param
	 */
	public void setAreaTrabajo(AreaTrabajo areaTrabajo) {
		this.areaTrabajo_1.removeAll();
		this.areaTrabajo_1.add(areaTrabajo);
		revalidate();
		repaint();
	}

	/**
	 * Settea la nueva lista en tabAsignatura
	 * @param listaAsignaturas
	 */
	public void setListaAsignatura(ArrayList<Asignatura>listaAsignaturas) {
		tabAsignatura.eliminarTodo();
		for (Asignatura asignatura : listaAsignaturas) {
			tabAsignatura.aniadir(asignatura);
		}
	}
	
	/**
	 * Setea la nueva lista en tabDocente
	 * @param listaDocente
	 */
	public void setListaDocente(ArrayList<Docente>listaDocente) {
		tabDocente.eliminarTodo();
		for (Docente docente : listaDocente) {
			tabDocente.aniadir(docente);
		}
	}
	
	
	/**
	 * Setea la nueva lista en tabAsignatura
	 * @param listaAsignaturas
	 */
	public void setListaGrupoAlumnos(ArrayList<GrupoAlumnos>listaGrupoAlumnos) {
		tabGrupoAlumnos.eliminarTodo();
		for (GrupoAlumnos grupoAlumnos: listaGrupoAlumnos) {
			tabGrupoAlumnos.aniadir(grupoAlumnos);
		}
	}
	
	/**
	 * Setea la nueva lista en tabAsignatura
	 * @param listaAsignaturas
	 */
	public void setListaHabitacion(ArrayList<Habitacion>listaHabitacion ) {
		tabHabitaciones.eliminarTodo();
		for (Habitacion habitacion: listaHabitacion) {
			tabHabitaciones.aniadir(habitacion);
		}
	}
	
	
	
	/**
	 * retorna la instancia controlRadioButton
	 * @return
	 */
	public ControlRadioButon getControlRadioButon() {
		return controlRadio;
	}
	
	/**
	 * Habilita o desabilita los botones de la interfaz
	 * @param enabled 
	 */
	public void habilitarBotones(boolean enabled) {
		tabAsignatura.SetEnableButtons(enabled);
		tabDocente.SetEnableButtons(enabled);
		tabGrupoAlumnos.SetEnableButtons(enabled);
		tabHabitaciones.SetEnableButtons(enabled);
		
		btnAadir.setEnabled(enabled);
		btnEliminar.setEnabled(enabled);
		
		
	}
	
}

