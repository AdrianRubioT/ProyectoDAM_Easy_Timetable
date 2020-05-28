package vista.elementos.ListaTargetas;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Pequeño JPanel con JLabels indicando las claves y sus valores
 * @author
 *
 */
public class InfoPanel extends JPanel {
	/**
	 * coleccion de JLabels generadas
	 */
	private ArrayList<JLabel> claves;
	/**
	 * coleccion de los valores para las claves
	 */
	private ArrayList<JLabel> valores;



		public InfoPanel(PassInfoData objeto) {
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					//obtener la instancia que proboca el evento
					InfoPanel a = (InfoPanel) e.getSource();
					//... crear codigo
				}
			});
			//TODO: quitar mas adelante es muy feo
			setBorder(new LineBorder(new Color(0, 0, 0), 2));



			GridBagLayout gridBagLayout = new GridBagLayout();
			gridBagLayout.columnWidths = new int[]{81, 0, 0};
			gridBagLayout.rowHeights = new int[]{0, 0};
			gridBagLayout.columnWeights = new double[]{};
			gridBagLayout.rowWeights = new double[]{};
			setLayout(gridBagLayout);


			GridBagLayout gbl_panDescripcion = new GridBagLayout();
			gbl_panDescripcion.columnWidths = new int[]{0};
			gbl_panDescripcion.rowHeights = new int[]{0};
			gbl_panDescripcion.columnWeights = new double[]{Double.MIN_VALUE};
			gbl_panDescripcion.rowWeights = new double[]{Double.MIN_VALUE};
			setLayout(gbl_panDescripcion);


			addInfoObject(objeto);


		}

		/**
		 * extrae del parametro objeto la informacion para crear los pares de JLabels
		 * clave-valor
		 * @param objeto
		 * @return void
		 */
		public void addInfoObject(PassInfoData objeto) {

			String[] etiquetas = objeto.getKeys();
			String[] claves = objeto.getValues();

			//etiquetas
			for (int i = 0; i < etiquetas.length; i++) {
				//System.out.println(etiquetas[i]);
				JLabel JPKey = new JLabel( etiquetas[i]);
				GridBagConstraints gbc_lblLinea_3 = new GridBagConstraints();
				gbc_lblLinea_3.insets = new Insets(0, 0, 0, 5);
				gbc_lblLinea_3.gridx = 0;
				gbc_lblLinea_3.gridy = i;
				add(JPKey, gbc_lblLinea_3);
			}


			for (int i = 0; i < claves.length; i++) {
				//System.out.println(data[i]);
				JLabel JPValue = new JLabel( claves[i]);
				GridBagConstraints gbc_lin4 = new GridBagConstraints();
				gbc_lin4.fill = GridBagConstraints.HORIZONTAL;
				gbc_lin4.gridx = 1;
				gbc_lin4.gridy = i;
				add( JPValue, gbc_lin4);

			}

		}



	
}

