package vista.ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

/**
 * Crea un popup para que el usuario ingrese los datos.
 * El popup contendra tantos JLabel y JTextField como parametro se le ayan pasado en el constructor
 * @author adrian
 *
 */
public class InputPopup extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private ArrayList<JTextField> colInputs = new ArrayList<JTextField>();
	
	
	/**
	 * Create the dialog.
	 * @param controlRadio 
	 */
	public InputPopup(JFrame padre, boolean modal, String[] inputs) {
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

		crearInputs(inputs);
		
		
		
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
						dispose();
					}
				});
				
				buttonPane.add(cancelButton);
			}
		}

		setVisible(true);
	}

	
	/**
	 * Crea tantos JTextfield como inputs ayan y lo agrega a colInputs
	 * @param inputs 
	 */
	private void crearInputs(String[] inputs) {
		
		for (String input : inputs) {
			
			
			JTextField a = new JTextField();
			colInputs.add( a );
			
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
	 * devuelve el contenido introducido por el usuario en los campos 
	 * @return array con la informacion introducida en el mismo orden que se inicializo esta clase
	 */
	public String[] getData() {
		return null;
		
	}
	
	
}
