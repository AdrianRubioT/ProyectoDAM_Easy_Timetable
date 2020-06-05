package vista.elementos.AreaTrabajo;

import java.util.ArrayList;
import javax.swing.JPanel;
import modelo.objetos.Slot;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;


/**
 * clase para crear un tablero con la informacion de la coleccion
 * de slots que se pasen al instanciar
 * @author adrian
 *
 */
public class AreaTrabajo extends JPanel {

	ArrayList<Slot> coleccionLunes = new ArrayList<Slot>();
	ArrayList<Slot> coleccionMartes= new ArrayList<Slot>();
	ArrayList<Slot> coleccionMiercoles = new ArrayList<Slot>();
	ArrayList<Slot> coleccionJueves= new ArrayList<Slot>();
	ArrayList<Slot> coleccionViernes = new ArrayList<Slot>();
	ArrayList<Slot> coleccionSabado = new ArrayList<Slot>();
	ArrayList<Slot> coleccionDomingo = new ArrayList<Slot>();


	/**
	 * Create the panel.
	 */
	public AreaTrabajo(ArrayList<Slot> coleccionSlots, String puntoVista) {

		separarColeccion(coleccionSlots);

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);

		colocarMomentosEnLista(puntoVista);

	}

	/**
	 * metodo que crea los listados por cada dia de la semana
	 * @param puntoVista punto de vista para pasarlo a aniadirSlot
	 */
	private void colocarMomentosEnLista(String puntoVista) {
		//TODO: quitar todo esta repeticion
		int rellenado = 0;


		if ( coleccionLunes.size() != 0 ) {
			rellenado++;
			for (int i = 0; i < coleccionLunes.size(); i++) {
				anaidirSlot(rellenado, i, puntoVista, coleccionLunes.get(i) );
			}
		}

		if ( coleccionMartes.size() != 0 ) {
			rellenado++;
			for (int i = 0; i < coleccionMartes.size(); i++) {
				anaidirSlot(rellenado, i, puntoVista, coleccionMartes.get(i) );
			}
		}

		if ( coleccionMiercoles.size() != 0 ) {
			rellenado++;
			for (int i = 0; i < coleccionMiercoles.size(); i++) {
				anaidirSlot(rellenado, i, puntoVista, coleccionMiercoles.get(i) );
			}
		}

		if ( coleccionJueves.size() != 0 ) {
			rellenado++;
			for (int i = 0; i < coleccionJueves.size(); i++) {
				anaidirSlot(rellenado, i, puntoVista, coleccionJueves.get(i) );
			}
		}

		if ( coleccionViernes.size() != 0 ) {
			rellenado++;
			for (int i = 0; i < coleccionViernes.size(); i++) {
				anaidirSlot(rellenado, i, puntoVista, coleccionViernes.get(i) );
			}
		}

		if ( coleccionSabado.size() != 0 ) {
			rellenado++;
			for (int i = 0; i < coleccionSabado.size(); i++) {
				anaidirSlot(rellenado, i, puntoVista, coleccionSabado.get(i) );
			}
		}

		if ( coleccionDomingo.size() != 0 ) {
			rellenado++;
			for (int i = 0; i < coleccionDomingo.size(); i++) {
				anaidirSlot(rellenado, i, puntoVista, coleccionDomingo.get(i) );
			}
		}
		
	}

	/**
	 * metodo para colcar un MomentoInfo en una celda 
	 * de la cuadricula
	 * @param col columna
	 * @param row fila
	 * @param puntoVista punto de vista para instanciar MomentoInfo
	 */
	private void anaidirSlot(int col, int row, String puntoVista, Slot momento) {


		MomentoInfo info = new MomentoInfo(puntoVista, momento);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridx = col;
		gbc_lblNewLabel.gridy = row;
		add(info, gbc_lblNewLabel);


	}


	/**
	 * metodo para separar la coleccion en las distintas 
	 * colecciones de la semana 
	 * @param coleccionSlots
	 */
	private void separarColeccion(ArrayList<Slot> coleccionSlots) {

		for (Slot slot : coleccionSlots) {

			switch (slot.getIntervalo().getDia()) {
			//Lunes
			case 0:
				coleccionLunes.add(slot);
				break;

			case 1:
				coleccionMartes.add(slot);
				break;
			case 2:
				coleccionMiercoles.add(slot);
				break;
			case 3:
				coleccionJueves.add(slot);
				break;
			case 4:
				coleccionViernes.add(slot);
				break;
			case 5:
				coleccionSabado.add(slot);
				break;
				//dominto
			case 6:
				coleccionDomingo.add(slot);
				break;

			default:
				System.out.println("Dia no encontrado: " + slot.getIntervalo().getDia());
				break;
			}

		}

	}

}
