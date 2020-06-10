package vista.elementos.ListaTargetas;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

import vista.seleccion.Seleccion;
import vista.seleccion.Seleccionable;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Component;

/**
 * Pequeño JPanel con JLabels indicando las claves y sus valores
 * @author
 *
 */
public class InfoPanel extends JPanel implements Seleccionable {

	private ArrayList<JLabel> labelKey = new ArrayList<JLabel>();
	private ArrayList<JLabel> labelValue= new ArrayList<JLabel>();
	private String tipo;



	//TODO: quitar este atributo
	private int id_BD;



	public InfoPanel(String[] campos, String tipo) {
		setAlignmentY(Component.TOP_ALIGNMENT);

		this.tipo = tipo;


		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				notificarSeleccion();

				//... crear codigo
			}
		});
		
		setBorder(new LineBorder(new Color(0, 0, 0), 2));






		GridBagLayout gbl_panDescripcion = new GridBagLayout();
		gbl_panDescripcion.columnWidths = new int[]{0};
		gbl_panDescripcion.rowHeights = new int[]{0};
		gbl_panDescripcion.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panDescripcion.rowWeights = new double[]{0.0, Double.MIN_VALUE};
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
			JLabel jlKey = new JLabel( campos[i].toUpperCase() + ":" );
			//guardar el JLabel en la lista
			labelKey.add(jlKey);
			GridBagConstraints gbc_lblLinea_3 = new GridBagConstraints();
			//gbc_lblLinea_3.insets = new Insets(0, 0, 0, 5);
			gbc_lblLinea_3.anchor = GridBagConstraints.NORTHWEST;
			gbc_lblLinea_3.insets = new Insets(0, 0, 5, 5);
			gbc_lblLinea_3.gridx = 1;
			gbc_lblLinea_3.gridy = i;
			add(jlKey, gbc_lblLinea_3);
		}

		//Value
		for (int i = 0; i < campos.length; i++) {
			JLabel jlValue = new JLabel();
			labelValue.add(jlValue);
			GridBagConstraints gbc_lin4 = new GridBagConstraints();
			//gbc_lin4.fill = GridBagConstraints.HORIZONTAL;
			gbc_lin4.anchor = GridBagConstraints.NORTHWEST;
			gbc_lin4.insets = new Insets(0, 0, 5, 5);
			gbc_lin4.gridx = 2;
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

	/**
	 * notifica a Seleccion que el objeto
	 * ha sido seleccionado
	 */
	@Override
	public void notificarSeleccion() {
		//obtener la instancia que proboca el evento

		Seleccion.nuevoSeleccion(this);
	}

	/**
	 * agrega el radiobuton a la parte visible
	 * @param radio
	 */
	public void addRadioButon(JRadioButton radio) {

		GridBagConstraints gbc_lblLinea_3 = new GridBagConstraints();
		//gbc_lblLinea_3.insets = new Insets(0, 0, 0, 5);
		gbc_lblLinea_3.gridx = 0;
		gbc_lblLinea_3.gridy = 0;
		add(radio, gbc_lblLinea_3);

	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}


	/**
	 * @return the id_BD
	 */
	public int getId_BD() {
		return id_BD;
	}

	/**
	 * @param id_BD the id_BD to set
	 */
	public void setId_BD(int id_BD) {
		this.id_BD = id_BD;
	}

	@Override
	public void cambiaColorSelecionado() {
		setBackground( new Color(255, 218, 71) );

	}

	@Override
	public void cambiaColorDesseleccionado() {
		setBackground( new Color(238, 238, 238) );

	}

}

