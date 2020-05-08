package vista.elemetos;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import vista.interfaz.CrearTarjeta;
import javax.swing.JScrollPane;

/**
 * JPanel con un titulo, y botones para a�adir o eliminar
 * elementos en una lista interna que se muestra 
 * @author Adrian
 *
 */
public class ListaTargetas extends JPanel {
	private JScrollPane scrollLista;
	private JPanel lista;
	
	private ControlRadioButon controlRadio;
	
	
	/**
	 * inicializa la clase con el 
	 * @param titulo
	 */
	public ListaTargetas(String titulo, JFrame framePadre) {
		
		controlRadio = new ControlRadioButon();
		
		
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
		
		JButton button = new JButton("A\u00F1adir");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//cambiar para no abusar del modal para que no se lance otro proceso
				Tarjeta targeta = new CrearTarjeta(framePadre, true, controlRadio).getTargeta();
				aniadirTargeta(targeta);
			
			}
		});
		panel_1.add(button);
		
		JButton button_1 = new JButton("Eliminar");
		panel_1.add(button_1);
		
		scrollLista = new JScrollPane();
		GridBagConstraints gbc_scrollLista = new GridBagConstraints();
		gbc_scrollLista.fill = GridBagConstraints.BOTH;
		gbc_scrollLista.gridx = 0;
		gbc_scrollLista.gridy = 2;
		add(scrollLista, gbc_scrollLista);
		
		lista = new JPanel();
		
		// con preferredSiza coloca los elemetos en vertical pero no muestra el scroll
		lista.setPreferredSize(new Dimension(scrollLista.getWidth(), 0));
		//lista.setPreferredSize(scrollLista.getSize());
		
		scrollLista.setViewportView(lista);
		
		
	}
	
	/**
	 * aniade un objeto targeta al jpanel lista y llama a 
	 * scrollLista.updateUI();
	 * 
	 */
	private void aniadirTargeta(Tarjeta targeta) {
		lista.add(targeta);
		//scrollLista.revalidate();
		scrollLista.updateUI();
		
		System.out.println("aniadida");
		
	}
	
	
}
