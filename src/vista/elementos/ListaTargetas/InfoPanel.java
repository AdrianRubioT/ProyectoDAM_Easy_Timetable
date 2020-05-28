package vista.elementos.ListaTargetas;

import java.awt.Color;
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

	private ArrayList<JLabel> labelKey = new ArrayList<JLabel>();
	private ArrayList<JLabel> labelValue= new ArrayList<JLabel>();
	
	
		public InfoPanel(String[] campos) {
			
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


			creteJLabels(campos);


		}

		/**
		 * extrae del parametro objeto la informacion para crear los pares de JLabels
		 * clave-valor
		 * @param campos
		 * @return void
		 */
		public void creteJLabels(String[] campos) {

			//Key
			for (int i = 0; i < campos.length; i++) {
				JLabel jlKey = new JLabel( campos[i]);
				//guardar el JLabel en la lista
				labelKey.add(jlKey);
				GridBagConstraints gbc_lblLinea_3 = new GridBagConstraints();
				gbc_lblLinea_3.insets = new Insets(0, 0, 0, 5);
				gbc_lblLinea_3.gridx = 0;
				gbc_lblLinea_3.gridy = i;
				add(jlKey, gbc_lblLinea_3);
			}
			
			//Value
			for (int i = 0; i < campos.length; i++) {
				JLabel jlValue = new JLabel();
				labelValue.add(jlValue);
				GridBagConstraints gbc_lin4 = new GridBagConstraints();
				gbc_lin4.fill = GridBagConstraints.HORIZONTAL;
				gbc_lin4.gridx = 1;
				gbc_lin4.gridy = i;
				add( jlValue, gbc_lin4);

			}



		}
		


		
		/**
		 * metodo para actualizar los JLabels con los valores
		 * @param newValores array con los nuevos valores, tiene que 
		 * estar en el mismo orden y longitud que labelKey 
		 */
		public void actualizaValores(String[] newValores) {
			
			for (int i = 0; i < newValores.length; i++) {
				labelValue.get(i).setText(newValores[i]);
			}
			
		}
	
}

