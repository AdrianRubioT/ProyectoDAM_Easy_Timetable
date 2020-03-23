package vista.elemetos;

import java.awt.Dimension;
import java.awt.FlowLayout;
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

import vista.interfaz.CrearTargeta;

/**
 * JPanel con un titulo, y botones para añadir o eliminar
 * elementos en una lista interna que se muestra 
 * @author Adrian
 *
 */
public class ListaTargetas extends JPanel {

	
	
	
	
	/**
	 * inicializa la clase con el 
	 * @param titulo
	 */
	public static JPanel aListaTargetas(String titulo, JFrame framePadre) {
		JPanel padre = new JPanel();
		
		JPanel lista = new JPanel();
		
		GridBagLayout gbl_panModulos = new GridBagLayout();
		gbl_panModulos.columnWidths = new int[]{91, 0};
		gbl_panModulos.rowHeights = new int[]{14, 27, 0, 0};
		gbl_panModulos.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panModulos.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		padre.setLayout(gbl_panModulos);
		
		JLabel tituloModulos = new JLabel(titulo);
		GridBagConstraints gbc_tituloModulos = new GridBagConstraints();
		gbc_tituloModulos.insets = new Insets(0, 0, 5, 0);
		gbc_tituloModulos.anchor = GridBagConstraints.NORTH;
		gbc_tituloModulos.gridx = 0;
		gbc_tituloModulos.gridy = 0;
		padre.add(tituloModulos, gbc_tituloModulos);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.VERTICAL;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		padre.add(panel_1, gbc_panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton button = new JButton("A\u00F1adir");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//cambiar para no abusar del modal para que no se lance otro proceso
				Targeta targeta = new CrearTargeta(framePadre, true).getTargeta();

				lista.add(targeta);
				lista.revalidate();
				
				System.out.println("aniadida");
				
			}
		});
		panel_1.add(button);
		
		JButton button_1 = new JButton("Eliminar");
		panel_1.add(button_1);
		
		
		lista.setPreferredSize(new Dimension(100, 100));
		GridBagConstraints gbc_lista = new GridBagConstraints();
		gbc_lista.fill = GridBagConstraints.BOTH;
		gbc_lista.gridx = 0;
		gbc_lista.gridy = 2;
		
		
		
		padre.add(lista, gbc_lista);
		lista.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		return padre;
	}
	
	/**
	 * aniade un objeto targeta a la lista de modulos
	 */
	private void aniadirTargetaModulos(Targeta targeta) {
		//lista.add(targeta);
		//lista.revalidate();
		
	}
	
	
}
