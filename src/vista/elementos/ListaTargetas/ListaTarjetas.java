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

/**
 * Clase para listar los objetos Habitacion, Clase, docente y grupo alumno
 * @author
 *
 */
public class ListaTarjetas extends JPanel{
	
	public String titulo;
	
	
	private JButton botonAniadir;
	private JButton botonEliminar;
	private JScrollPane listado;

	private JPanel lista;


	/**
	 * @param titulo
	 * @return void
	 */
	public ListaTarjetas(String titulo) {
		super();

		this.titulo = titulo;


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
	 * evento para iniciar el evento de aniadir un item a la lista
	 * @return void
	 */
	public void aniadir() {
		// TODO Auto-generated method stub
	}

	/**
	 * evento para iniciar el evento de borrar un item de la lista
	 * @return void
	 */
	public void eliminar() {
		// TODO Auto-generated method stub
	}

}

