package vista.elementos.AreaTrabajo;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import modelo.objetos.Slot;
import vista.seleccion.Seleccion;
import vista.seleccion.Seleccionable;

import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


/**
 * Clase para mostrar la informacion en dos paneles: a la izquierda se mostrara 
 * la hora de inicio y fin y a la derecha los datos del intervalo
 * @author adrian
 *
 */
public class MomentoInfo extends JPanel implements Seleccionable {

	private Slot momento;


	/**
	 * Create the panel.
	 */
	public MomentoInfo(String puntoVista, Slot momento) {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				notificarSeleccion();
			}
		});
		this.momento = momento;
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);

		JPanel panel = new JPanel();
		panel.setOpaque(false);
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

		
		
		JPanel panelTiempo = new JPanel();
		panelTiempo.setOpaque(false);
		
		GridBagConstraints gbc_panelTiempo = new GridBagConstraints();
		gbc_panelTiempo.insets = new Insets(0, 0, 0, 5);
		gbc_panelTiempo.gridx = 0;
		gbc_panelTiempo.gridy = 0;
		GridBagLayout gbl_panelTiempo = new GridBagLayout();
		gbl_panelTiempo.columnWidths = new int[]{70, 0};
		gbl_panelTiempo.rowHeights = new int[]{15, 0, 0};
		gbl_panelTiempo.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panelTiempo.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panelTiempo.setLayout(gbl_panel);
		add(panelTiempo, gbc_panelTiempo);
		
		
		
		JLabel horaInicio = new JLabel("HORA INICIO");
		horaInicio.setOpaque(false);
		GridBagConstraints gbc_horaInicio = new GridBagConstraints();
		gbc_horaInicio.gridx = 0;
		gbc_horaInicio.gridy = 0;
		panelTiempo.add(horaInicio, gbc_horaInicio);

		JLabel horaInicioValor = new JLabel(momento.getIntervalo().horaMinInicio() );
		horaInicioValor.setOpaque(false);
		GridBagConstraints gbc_horaInicioValor = new GridBagConstraints();
		gbc_horaInicioValor.gridx = 1;
		gbc_horaInicioValor.gridy = 0;
		panelTiempo.add(horaInicioValor, gbc_horaInicioValor);
		
		
		JLabel horaFinal = new JLabel("HORA FIn");
		horaFinal.setOpaque(false);
		GridBagConstraints gbc_horaFinal = new GridBagConstraints();
		gbc_horaFinal.gridx = 0;
		gbc_horaFinal.gridy = 1;
		panelTiempo.add(horaFinal, gbc_horaFinal);
		
		JLabel horaFinalValor = new JLabel(momento.getIntervalo().horaMinFin() );
		horaFinalValor.setOpaque(false);
		GridBagConstraints gbc_horaFinalValor = new GridBagConstraints();
		gbc_horaFinalValor.gridx = 1;
		gbc_horaFinalValor.gridy = 1;
		panelTiempo.add(horaFinalValor, gbc_horaFinalValor);

		
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
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


		if (!puntoVista.contentEquals("Docente")) {
			JLabel lblDocente = new JLabel("DOCENTE:");
			lblDocente.setOpaque(false);
			GridBagConstraints gbc_lblDocente = new GridBagConstraints();
			gbc_lblDocente.anchor = GridBagConstraints.WEST;
			gbc_lblDocente.insets = new Insets(0, 0, 5, 5);
			gbc_lblDocente.gridx = 0;
			gbc_lblDocente.gridy = 0;
			panel_1.add(lblDocente, gbc_lblDocente);

			JLabel valorDocente = new JLabel( momento.getDocentes().getNombre() );
			valorDocente.setOpaque(false);
			GridBagConstraints gbc_valorDocente = new GridBagConstraints();
			gbc_valorDocente.insets = new Insets(0, 0, 5, 0);
			gbc_valorDocente.gridx = 1;
			gbc_valorDocente.gridy = 0;
			panel_1.add(valorDocente, gbc_valorDocente);
		}


		if (!puntoVista.contentEquals("GrupoAlumnos")) {
			JLabel lblGrupo = new JLabel("GRUPO");
			lblGrupo.setOpaque(false);
			GridBagConstraints gbc_lblGrupo = new GridBagConstraints();
			gbc_lblGrupo.anchor = GridBagConstraints.WEST;
			gbc_lblGrupo.insets = new Insets(0, 0, 5, 5);
			gbc_lblGrupo.gridx = 0;
			gbc_lblGrupo.gridy = 1;
			panel_1.add(lblGrupo, gbc_lblGrupo);

			JLabel valorGrupoalumno = new JLabel( momento.getGrupoAlumnos().getNombreGrupo() );
			valorGrupoalumno.setOpaque(false);
			GridBagConstraints gbc_valorGrupoalumno = new GridBagConstraints();
			gbc_valorGrupoalumno.insets = new Insets(0, 0, 5, 0);
			gbc_valorGrupoalumno.gridx = 1;
			gbc_valorGrupoalumno.gridy = 1;
			panel_1.add(valorGrupoalumno, gbc_valorGrupoalumno);
		}

		if (!puntoVista.contentEquals("Habitacion")) {
			JLabel lblHabitacion = new JLabel("HABITACÍON");
			lblHabitacion.setOpaque(false);
			GridBagConstraints gbc_lblHabitacion = new GridBagConstraints();
			gbc_lblHabitacion.anchor = GridBagConstraints.WEST;
			gbc_lblHabitacion.insets = new Insets(0, 0, 5, 5);
			gbc_lblHabitacion.gridx = 0;
			gbc_lblHabitacion.gridy = 2;
			panel_1.add(lblHabitacion, gbc_lblHabitacion);

			JLabel valorHabitacion = new JLabel( momento.getHabitacion().getCodigoHabitacion() );
			valorHabitacion.setOpaque(false);
			GridBagConstraints gbc_valorHabitacion = new GridBagConstraints();
			gbc_valorHabitacion.insets = new Insets(0, 0, 5, 0);
			gbc_valorHabitacion.gridx = 1;
			gbc_valorHabitacion.gridy = 2;
			panel_1.add(valorHabitacion, gbc_valorHabitacion);
		}


		if (!puntoVista.contentEquals("Asignatura")) {
			JLabel lblAsignatura = new JLabel("ASIGNATURA");
			lblAsignatura.setOpaque(false);
			GridBagConstraints gbc_lblAsignatura = new GridBagConstraints();
			gbc_lblAsignatura.insets = new Insets(0, 0, 0, 5);
			gbc_lblAsignatura.anchor = GridBagConstraints.WEST;
			gbc_lblAsignatura.gridx = 0;
			gbc_lblAsignatura.gridy = 3;
			panel_1.add(lblAsignatura, gbc_lblAsignatura);

			JLabel valorAsignatura = new JLabel( momento.getAsignatura().getNombre() );
			GridBagConstraints gbc_valorAsignatura = new GridBagConstraints();
			gbc_valorAsignatura.gridx = 1;
			gbc_valorAsignatura.gridy = 3;
			panel_1.add(valorAsignatura, gbc_valorAsignatura);

		}

	}


	@Override
	public void notificarSeleccion() {

		Seleccion.nuevoSeleccion(this);
		
	}
	
	
	/**
	 * @return the momento
	 */
	public Slot getMomento() {
		return momento;
	}


	@Override
	public void cambiaColorSelecionado() {
		setBackground( new Color(255, 218, 71) );
		
	}

	@Override
	public void cambiaColorDesseleccionado() {
		setBackground( new Color(238, 238, 238) );
		
	}


}
