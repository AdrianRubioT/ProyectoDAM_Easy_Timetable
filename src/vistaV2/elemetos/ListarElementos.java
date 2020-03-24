package vistaV2.elemetos;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListarElementos extends JPanel {

	private DefaultListModel<String> modelList = new DefaultListModel<String>();
	
	/**
	 * Create the panel.
	 */
	public ListarElementos() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JPanel titulo = new JPanel();
		GridBagConstraints gbc_titulo = new GridBagConstraints();
		gbc_titulo.insets = new Insets(0, 0, 5, 0);
		gbc_titulo.fill = GridBagConstraints.BOTH;
		gbc_titulo.gridx = 0;
		gbc_titulo.gridy = 0;
		panel.add(titulo, gbc_titulo);
		
		JLabel lblTitulo = new JLabel("titulo");
		titulo.add(lblTitulo);
		
		JPanel botonera = new JPanel();
		GridBagConstraints gbc_botonera = new GridBagConstraints();
		gbc_botonera.insets = new Insets(0, 0, 5, 0);
		gbc_botonera.fill = GridBagConstraints.BOTH;
		gbc_botonera.gridx = 0;
		gbc_botonera.gridy = 1;
		panel.add(botonera, gbc_botonera);
		
		JButton btnAniadir = new JButton("A\u00F1adir");
		btnAniadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		botonera.add(btnAniadir);
		
		JButton btnEliminar = new JButton("Eliminar");
		botonera.add(btnEliminar);
		
		JPanel lista = new JPanel();
		GridBagConstraints gbc_lista = new GridBagConstraints();
		gbc_lista.fill = GridBagConstraints.BOTH;
		gbc_lista.gridx = 0;
		gbc_lista.gridy = 2;
		panel.add(lista, gbc_lista);
		
		JList list = new JList(modelList);
		lista.add(list);

	}

	
	
	
}
