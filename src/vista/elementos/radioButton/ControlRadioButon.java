package vista.elementos.radioButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JRadioButton;

import Controlador.Controlador;

/**
 * clase para controlar y generar radiobuttons en el grupo de esta instancia.
 * Notifica al controlador cuando un radioButton es pulsado 
 * @author Adrian
 *
 */
public class ControlRadioButon {

	ButtonGroup group = new ButtonGroup();
	Controlador controlador;
	
	
	/**
	 * inicializa la clase con un buttonGroup
	 */
	public ControlRadioButon(Controlador controlador) {
		this.controlador = controlador;
	}
	
	
	/**
	 * metodo que genera un radiobuton asignado al grupo de la misma instancia
	 * @param labelradio etiqueta que acompa�a al radiobuton, si se indica 
	 * @param accion accion a guardar en setActionCommand
	 * @return radiobutton con grupo y etiqueta
	 */
	public JRadioButton crearRadioButton(String labelradio, String accion) {
		
		JRadioButton radio = new JRadioButton();
		if ( !labelradio.equals("") ) {
			radio.setText(labelradio);
		}
		
		
		radio.setActionCommand(accion);
		
		radio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.actualizarAreaTrabajo();
			}
		});
		
		group.add(radio);
		
		//estilos
		radio.setOpaque(false);
		
		
		return radio;
	}
	
	/**
	 * devuelve el radioButton seleccionado
	 * @return
	 */
	public ButtonModel getSelected() {
		return group.getSelection();
	}
	
}
