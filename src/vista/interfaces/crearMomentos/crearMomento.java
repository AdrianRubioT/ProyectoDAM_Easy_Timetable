package vista.interfaces.crearMomentos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.objetos.Asignatura;
import modelo.objetos.Docente;
import modelo.objetos.GrupoAlumnos;
import modelo.objetos.Habitacion;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;

public class crearMomento extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JComboBox<Habitacion> cbHabitacion;
	private JComboBox<Asignatura> cbAsignatura;
	private JComboBox<Docente> cbDocente;
	private JComboBox<GrupoAlumnos> cbGrupoAlum;
	private JSpinner spinHoraIni;
	private JSpinner spinMinIni;
	private JSpinner spinHoraFin;
	private JSpinner spinMinFin;



	/**
	 * Create the dialog.
	 * @param listaAsignatura 
	 * @param listaHabitaciones 
	 * @param listaGruposAlumnos 
	 * @param listaDocente 
	 */
	public crearMomento(
			JFrame padre, boolean modal, 
			ArrayList<Asignatura> listaAsignatura, 
			ArrayList<Docente> listaDocente, 
			ArrayList<GrupoAlumnos> listaGruposAlumnos, 
			ArrayList<Habitacion> listaHabitaciones
			) {
		
		super(padre, modal);
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{119, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{24, 37, 27, 28, 24, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblHoraInico = new JLabel("Hora Inico");
			GridBagConstraints gbc_lblHoraInico = new GridBagConstraints();
			gbc_lblHoraInico.anchor = GridBagConstraints.WEST;
			gbc_lblHoraInico.fill = GridBagConstraints.VERTICAL;
			gbc_lblHoraInico.insets = new Insets(0, 0, 5, 5);
			gbc_lblHoraInico.gridx = 0;
			gbc_lblHoraInico.gridy = 0;
			contentPanel.add(lblHoraInico, gbc_lblHoraInico);
		}
		{
			JPanel pHoraInicio = new JPanel();
			GridBagConstraints gbc_pHoraInicio = new GridBagConstraints();
			gbc_pHoraInicio.insets = new Insets(0, 0, 5, 5);
			gbc_pHoraInicio.fill = GridBagConstraints.BOTH;
			gbc_pHoraInicio.gridx = 1;
			gbc_pHoraInicio.gridy = 0;
			contentPanel.add(pHoraInicio, gbc_pHoraInicio);
			{
				spinHoraIni = new JSpinner();
				spinHoraIni.setModel(new SpinnerNumberModel(0, 0, 23, 1));
				pHoraInicio.add(spinHoraIni);
			}
			{
				spinMinIni = new JSpinner();
				spinMinIni.setModel(new SpinnerNumberModel(0, 0, 59, 1));
				pHoraInicio.add(spinMinIni);
			}
		}
		{
			JLabel lblHoraFinal = new JLabel("Hora final");
			GridBagConstraints gbc_lblHoraFinal = new GridBagConstraints();
			gbc_lblHoraFinal.anchor = GridBagConstraints.WEST;
			gbc_lblHoraFinal.insets = new Insets(0, 0, 5, 5);
			gbc_lblHoraFinal.gridx = 0;
			gbc_lblHoraFinal.gridy = 1;
			contentPanel.add(lblHoraFinal, gbc_lblHoraFinal);
		}
		{
			JPanel pHoraFin = new JPanel();
			GridBagConstraints gbc_pHoraFin = new GridBagConstraints();
			gbc_pHoraFin.insets = new Insets(0, 0, 5, 5);
			gbc_pHoraFin.fill = GridBagConstraints.HORIZONTAL;
			gbc_pHoraFin.gridx = 1;
			gbc_pHoraFin.gridy = 1;
			contentPanel.add(pHoraFin, gbc_pHoraFin);
			{
				spinHoraFin = new JSpinner();
				spinHoraFin.setModel(new SpinnerNumberModel(0, 0, 23, 1));
				pHoraFin.add(spinHoraFin);
			}
			{
				spinMinFin = new JSpinner();
				spinMinFin.setModel(new SpinnerNumberModel(0, 0, 59, 1));
				pHoraFin.add(spinMinFin);
			}
		}
		{
			JLabel lblGrupoAlumno = new JLabel("Grupo Alumno");
			GridBagConstraints gbc_lblGrupoAlumno = new GridBagConstraints();
			gbc_lblGrupoAlumno.anchor = GridBagConstraints.WEST;
			gbc_lblGrupoAlumno.fill = GridBagConstraints.VERTICAL;
			gbc_lblGrupoAlumno.insets = new Insets(0, 0, 5, 5);
			gbc_lblGrupoAlumno.gridx = 0;
			gbc_lblGrupoAlumno.gridy = 2;
			contentPanel.add(lblGrupoAlumno, gbc_lblGrupoAlumno);
		}
		{
			cbGrupoAlum = new JComboBox<GrupoAlumnos>();
			
			for(GrupoAlumnos grupoAlumno : listaGruposAlumnos) {
				cbGrupoAlum.addItem(grupoAlumno);
			}
			
			GridBagConstraints gbc_cbGrupoAlum = new GridBagConstraints();
			gbc_cbGrupoAlum.insets = new Insets(0, 0, 5, 5);
			gbc_cbGrupoAlum.fill = GridBagConstraints.HORIZONTAL;
			gbc_cbGrupoAlum.gridx = 1;
			gbc_cbGrupoAlum.gridy = 2;
			contentPanel.add(cbGrupoAlum, gbc_cbGrupoAlum);
		}
		{
			JLabel lblDocente = new JLabel("Docente");
			GridBagConstraints gbc_lblDocente = new GridBagConstraints();
			gbc_lblDocente.anchor = GridBagConstraints.WEST;
			gbc_lblDocente.fill = GridBagConstraints.VERTICAL;
			gbc_lblDocente.insets = new Insets(0, 0, 5, 5);
			gbc_lblDocente.gridx = 0;
			gbc_lblDocente.gridy = 3;
			contentPanel.add(lblDocente, gbc_lblDocente);
		}
		{
			cbDocente = new JComboBox<Docente>();
			
			for(Docente docente : listaDocente) {
			    cbDocente.addItem(docente);
			}
			
			GridBagConstraints gbc_cbDocente = new GridBagConstraints();
			gbc_cbDocente.insets = new Insets(0, 0, 5, 5);
			gbc_cbDocente.fill = GridBagConstraints.HORIZONTAL;
			gbc_cbDocente.gridx = 1;
			gbc_cbDocente.gridy = 3;
			contentPanel.add(cbDocente, gbc_cbDocente);
		}
		{
			JLabel lblAsignatura = new JLabel("Asignatura");
			
			GridBagConstraints gbc_lblAsignatura = new GridBagConstraints();
			gbc_lblAsignatura.anchor = GridBagConstraints.WEST;
			gbc_lblAsignatura.insets = new Insets(0, 0, 5, 5);
			gbc_lblAsignatura.fill = GridBagConstraints.VERTICAL;
			gbc_lblAsignatura.gridx = 0;
			gbc_lblAsignatura.gridy = 4;
			contentPanel.add(lblAsignatura, gbc_lblAsignatura);
		}
		{
			cbAsignatura = new JComboBox<Asignatura>();
			for(Asignatura asignatura : listaAsignatura) {
			    cbAsignatura.addItem(asignatura);
			}
			
			GridBagConstraints gbc_cbAsignatura = new GridBagConstraints();
			gbc_cbAsignatura.insets = new Insets(0, 0, 5, 5);
			gbc_cbAsignatura.fill = GridBagConstraints.HORIZONTAL;
			gbc_cbAsignatura.gridx = 1;
			gbc_cbAsignatura.gridy = 4;
			contentPanel.add(cbAsignatura, gbc_cbAsignatura);
		}
		{
			JLabel lblHabitacion = new JLabel("Habitacion");
			GridBagConstraints gbc_lblHabitacion = new GridBagConstraints();
			gbc_lblHabitacion.anchor = GridBagConstraints.WEST;
			gbc_lblHabitacion.insets = new Insets(0, 0, 0, 5);
			gbc_lblHabitacion.gridx = 0;
			gbc_lblHabitacion.gridy = 5;
			contentPanel.add(lblHabitacion, gbc_lblHabitacion);
		}
		{
			cbHabitacion = new JComboBox<Habitacion>();
			for(Habitacion habitacion : listaHabitaciones) {
				cbHabitacion.addItem(habitacion);
			}
			
			GridBagConstraints gbc_cbHabitacion = new GridBagConstraints();
			gbc_cbHabitacion.insets = new Insets(0, 0, 0, 5);
			gbc_cbHabitacion.fill = GridBagConstraints.HORIZONTAL;
			gbc_cbHabitacion.gridx = 1;
			gbc_cbHabitacion.gridy = 5;
			contentPanel.add(cbHabitacion, gbc_cbHabitacion);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		setVisible(true);
		
	}

}
