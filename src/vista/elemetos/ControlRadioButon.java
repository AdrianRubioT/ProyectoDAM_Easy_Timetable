package vista.elemetos;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/**
 * clase para controlar y generar radiobuttons en un grupo concreto
 * asi como el evento
 * @author Adrian
 *
 */
public class ControlRadioButon {

	ButtonGroup group = new ButtonGroup();
	
	/**
	 * inicializa la clase con un buttonGroup
	 */
	public ControlRadioButon() {
		
	}
	
	
	/**
	 * metodo que genera un radiobuton asignado al grupo de la misma instancia
	 * @param labelradio etiqueta que acompaña al radiobuton, si se indica 
	 * @param accion accion a guardar en setActionCommand
	 * @return radiobutton con grupo y etiqueta
	 */
	public JRadioButton crearRadioButton(String labelradio, String accion) {
		
		JRadioButton radio = new JRadioButton();
		if ( !labelradio.equals("") ) {
			radio.setLabel(labelradio);
		}
		radio.setActionCommand(accion);
		
		group.add(radio);
		
		return radio;
		
	}
	
}
