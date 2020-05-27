package vista.elementos.ListaTargetas;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Controlador.Controlador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Clase para listar los objetos Habitacion, Clase, docente y grupo alumno
 * @author
 *
 */
public class ListaTarjetas extends JPanel{
	
	private String titulo;
	
	
	private JButton botonAniadir;
	private JButton botonEliminar;
	private JScrollPane listado;

	private JPanel lista;

	private Controlador controlador;

	/**
	 * @param titulo
	 */
	public ListaTarjetas(String titulo, Controlador controlador) {
		super();
		
		this.titulo = titulo;
		this.controlador =  controlador;

		GridBagLayout gbl_panModulos = new GridBagLayout();
		gbl_panModulos.columnWidths = new int[]{91, 0};
		gbl_panModulos.rowHeights = new int[]{14, 27, 0, 0};
		gbl_panModulos.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panModulos.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gbl_panModulos);

		JLabel tituloModulos = new JLabel(titulo);
		GridBagConstraints gbc_tituloModulos = new GridBagConstraints();
		gbc_tituloModulos.insets = new Insets(0, 0, 5, 0);
		gbc_tituloModulos.gridx = 0;
		gbc_tituloModulos.gridy = 0;
		add(tituloModulos, gbc_tituloModulos);

		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.VERTICAL;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		add(panel_1, gbc_panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));

		botonAniadir = new JButton("A\u00F1adir");
		botonAniadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PassInfoData Object = controlador.crearObjetoTargeta( arg0.getActionCommand() );
				aniadir(Object);
			}
		});
		botonAniadir.setActionCommand("aniadir" + titulo);
		panel_1.add(botonAniadir);

		botonEliminar = new JButton("Eliminar");
		panel_1.add(botonEliminar);

		listado = new JScrollPane();
		GridBagConstraints gbc_listado = new GridBagConstraints();
		gbc_listado.fill = GridBagConstraints.BOTH;
		gbc_listado.gridx = 0;
		gbc_listado.gridy = 2;
		add(listado, gbc_listado);

		lista = new JPanel();

		// con preferredSiza coloca los elemetos en vertical pero no muestra el scroll
		lista.setPreferredSize(new Dimension(listado.getWidth(), 0));
		//lista.setPreferredSize(listado.getSize());

		listado.setViewportView(lista);

	}

	/**
	 * metodo que añade un objeto al Jpanel Lista
	 * @param object objeto a aniadir
	 */
	public void aniadir(PassInfoData object) {
		
	}

	/**
	 * evento para iniciar el evento de borrar un item de la lista
	 * @return void
	 */
	public void eliminar() {
		// TODO Auto-generated method stub
	}

	
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
	
}

