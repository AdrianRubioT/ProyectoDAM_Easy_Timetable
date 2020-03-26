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
	
	public ControlRadioButon() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * metodo que genera un radiobuton asignado a un grupo
	 * @param grupo grupo al que asignarlo
	 * @param labelradio etiqueta que acompaña al radiobuton
	 * @param accion accion a guardar en setActionCommand
	 * @return radiobutton con grupo y etiqueta
	 */
	public JRadioButton crearRadioButton(String grupo, String labelradio, String accion) {
		
		JRadioButton radio = new JRadioButton();
		if ( !labelradio.equals("") ) {
			radio.setLabel(labelradio);
		}
		radio.setActionCommand(accion);
		
		group.add(radio);
		
		return radio;
		
	}
	
}
