package vista.interfaces.popup;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * Crea un popup para que el usuario ingrese los datos.
 * El popup contendra tantos JLabel y JTextField como 
 * parametro se le ayan pasado
 * @author
 *
 */
public class InputPopup extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private ArrayList<JTextField> colInputs = new ArrayList<JTextField>();
	
	public boolean isAcepted = false;
	
	
	/**
	 * Crea un dialogo dinamico con JTextField y JLabels como elementos del array se le pasen.
	 * El texto de los JLabel es el correspondiente a la posicion del array  
	 * @param padre Jframe padre para ser modal 
	 * @param modal modal o no sobre ventana padre
	 * @param campos lista de JTextfields y JLabel que apareceran en la interfaz. 
	 *
	 */
	public InputPopup(JFrame padre, boolean modal, String[] campos) {
		super(padre, modal);
		
		setBounds(100, 100, 306, 217);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);

		crearInputs(campos);
		
		
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						isAcepted = true;
						dispose();
					}
				});
				
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						isAcepted = false;
						dispose();
					}
				});
				
				buttonPane.add(cancelButton);
			}
		}

		setVisible(true);
	}

	
	/**
	 * Crea tantos JTextfield como inputs hayan y lo agrega a colInputs ademas de
	 * agregarlos a la intefaz
	 * @param inputs 
	 */
	private void crearInputs(String[] inputs) {
		
		for (String input : inputs) {
			
			
			//JTextField a = new JTextField();
			colInputs.add( new JTextField() );
			
			JLabel lblLinea_3 = new JLabel(input);
			GridBagConstraints gbc_lblLinea_3 = new GridBagConstraints();
			gbc_lblLinea_3.insets = new Insets(0, 0, 0, 5);
			gbc_lblLinea_3.gridx = 0;
			gbc_lblLinea_3.gridy = colInputs.size();
			contentPanel.add(lblLinea_3, gbc_lblLinea_3);
		
			GridBagConstraints gbc_lin4 = new GridBagConstraints();
			gbc_lin4.fill = GridBagConstraints.HORIZONTAL;
			gbc_lin4.gridx = 1;
			gbc_lin4.gridy = colInputs.size();
			contentPanel.add( colInputs.get( colInputs.size() -1  ), gbc_lin4);
			colInputs.get( colInputs.size() -1 ).setColumns(10);
			
			
		}
		
	}
	
	/**
	 * Recoge los valores de los inputs introducido por el usuario en 
	 * un array de String. 
	 * @return array con la informacion introducida en el mismo orden que se inicializo esta clase
	 */
	public String[] getData() {
		
		String[] inputData = new String[colInputs.size()]; 
		
		for (int i = 0; i < inputData.length; i++) {
			inputData[ i ] = colInputs.get( i ).getText();
		}
		
		return inputData;
	}



}

