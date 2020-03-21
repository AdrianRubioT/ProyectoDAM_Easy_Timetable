package vista.interfaz;

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
import java.awt.event.ActionEvent;

public class CrearTargeta extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField lin1;
	private JTextField lin2;
	private JTextField lin3;
	private JTextField lin4;
	private JTextField pathIcon;

	/**
	 * Create the dialog.
	 */
	public CrearTargeta(JFrame padre, boolean modal) {
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
		{
			JLabel lblIcono = new JLabel("Icono");
			GridBagConstraints gbc_lblIcono = new GridBagConstraints();
			gbc_lblIcono.insets = new Insets(0, 0, 5, 5);
			gbc_lblIcono.gridx = 0;
			gbc_lblIcono.gridy = 0;
			contentPanel.add(lblIcono, gbc_lblIcono);
		}
		{
			JPanel panel = new JPanel();
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.insets = new Insets(0, 0, 5, 0);
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 1;
			gbc_panel.gridy = 0;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{140, 83, 0};
			gbl_panel.rowHeights = new int[]{23, 0};
			gbl_panel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				pathIcon = new JTextField();
				GridBagConstraints gbc_pathIcon = new GridBagConstraints();
				gbc_pathIcon.insets = new Insets(0, 0, 0, 5);
				gbc_pathIcon.fill = GridBagConstraints.HORIZONTAL;
				gbc_pathIcon.gridx = 0;
				gbc_pathIcon.gridy = 0;
				panel.add(pathIcon, gbc_pathIcon);
				pathIcon.setColumns(10);
			}
			{
				JButton btnBuscarIcon = new JButton("Buscar");
				btnBuscarIcon.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String path = mostrarBuscarIcono();
						pathIcon.setText(path);
					}
				});
				GridBagConstraints gbc_btnBuscarIcon = new GridBagConstraints();
				gbc_btnBuscarIcon.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnBuscarIcon.gridx = 1;
				gbc_btnBuscarIcon.gridy = 0;
				panel.add(btnBuscarIcon, gbc_btnBuscarIcon);
			}
		}
		{
			JLabel lblLinea = new JLabel("1\u00BA linea");
			GridBagConstraints gbc_lblLinea = new GridBagConstraints();
			gbc_lblLinea.insets = new Insets(0, 0, 5, 5);
			gbc_lblLinea.gridx = 0;
			gbc_lblLinea.gridy = 1;
			contentPanel.add(lblLinea, gbc_lblLinea);
		}
		{
			lin1 = new JTextField();
			GridBagConstraints gbc_lin1 = new GridBagConstraints();
			gbc_lin1.insets = new Insets(0, 0, 5, 0);
			gbc_lin1.fill = GridBagConstraints.HORIZONTAL;
			gbc_lin1.gridx = 1;
			gbc_lin1.gridy = 1;
			contentPanel.add(lin1, gbc_lin1);
			lin1.setColumns(10);
		}
		{
			JLabel lblLinea_1 = new JLabel("2\u00BA Linea");
			GridBagConstraints gbc_lblLinea_1 = new GridBagConstraints();
			gbc_lblLinea_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblLinea_1.gridx = 0;
			gbc_lblLinea_1.gridy = 2;
			contentPanel.add(lblLinea_1, gbc_lblLinea_1);
		}
		{
			lin2 = new JTextField();
			GridBagConstraints gbc_lin2 = new GridBagConstraints();
			gbc_lin2.insets = new Insets(0, 0, 5, 0);
			gbc_lin2.fill = GridBagConstraints.HORIZONTAL;
			gbc_lin2.gridx = 1;
			gbc_lin2.gridy = 2;
			contentPanel.add(lin2, gbc_lin2);
			lin2.setColumns(10);
		}
		{
			JLabel lblLinea_2 = new JLabel("3\u00BA Linea");
			GridBagConstraints gbc_lblLinea_2 = new GridBagConstraints();
			gbc_lblLinea_2.insets = new Insets(0, 0, 5, 5);
			gbc_lblLinea_2.gridx = 0;
			gbc_lblLinea_2.gridy = 3;
			contentPanel.add(lblLinea_2, gbc_lblLinea_2);
		}
		{
			lin3 = new JTextField();
			GridBagConstraints gbc_lin3 = new GridBagConstraints();
			gbc_lin3.insets = new Insets(0, 0, 5, 0);
			gbc_lin3.fill = GridBagConstraints.HORIZONTAL;
			gbc_lin3.gridx = 1;
			gbc_lin3.gridy = 3;
			contentPanel.add(lin3, gbc_lin3);
			lin3.setColumns(10);
		}
		{
			JLabel lblLinea_3 = new JLabel("4\u00BA Linea");
			GridBagConstraints gbc_lblLinea_3 = new GridBagConstraints();
			gbc_lblLinea_3.insets = new Insets(0, 0, 0, 5);
			gbc_lblLinea_3.gridx = 0;
			gbc_lblLinea_3.gridy = 4;
			contentPanel.add(lblLinea_3, gbc_lblLinea_3);
		}
		{
			lin4 = new JTextField();
			GridBagConstraints gbc_lin4 = new GridBagConstraints();
			gbc_lin4.fill = GridBagConstraints.HORIZONTAL;
			gbc_lin4.gridx = 1;
			gbc_lin4.gridy = 4;
			contentPanel.add(lin4, gbc_lin4);
			lin4.setColumns(10);
		}
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

		//setVisible(true);

		
		

	}

	/**
	 * muestra el buscador de archivos al usuario 
	 * @return la ruta del archivo seleccionado por el usuario
	 */
	protected String mostrarBuscarIcono() {
		JFileChooser fileChooser = new JFileChooser("./");
		int seleccion = fileChooser.showOpenDialog(this);

		if (seleccion == JFileChooser.APPROVE_OPTION)
		{
			File fichero = fileChooser.getSelectedFile();
			return fichero.getAbsolutePath();
		}else {
			return "";
		}

	}

	/**
	 * @return the lin1
	 */
	public String getLin1() {
		return lin1.getText();
	}

	/**
	 * @return the lin2
	 */
	public String getLin2() {
		return lin2.getText();
	}

	/**
	 * @return the lin3
	 */
	public String getLin3() {
		return lin3.getText();
	}

	/**
	 * @return the lin4
	 */
	public String getLin4() {
		return lin4.getText();
	}

	/**
	 * @return the pathIcon
	 */
	public String getPathIcon() {
		return pathIcon.getText();
	}

}
