package vista.elementos.AreaTrabajo;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import modelo.objetos.Slot;
import java.awt.GridBagLayout;
import java.awt.Color;
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

		GridBagLayout gbl_config = new GridBagLayout();
		gbl_config.columnWidths = new int[]{10, 10};
		gbl_config.rowHeights = new int[]{0, 0, 0};
		gbl_config.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_config.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		//panelTiempo.setLayout(gbl_config);
		

		if ( coleccionLunes.size() != 0 ) {
			rellenado++;

			JPanel panLunes = new JPanel();
			panLunes.setLayout(gbl_config);
			panLunes.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			
			JLabel diaLunes = new JLabel("Lunes");
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.gridx = rellenado;
			gbc_lblNewLabel.gridy = 0;
			panLunes.add(diaLunes, gbc_lblNewLabel);
			
			
			add(panLunes, gbc_lblNewLabel);

			for (int i = 0; i < coleccionLunes.size(); i++) {
				anaidirSlot(rellenado, i, puntoVista, coleccionLunes.get(i), panLunes);
			}
			
			
		}

		if ( coleccionMartes.size() != 0 ) {
			rellenado++;

			JPanel panMartes = new JPanel();
			panMartes.setLayout(gbl_config);
			
			JLabel diaLunes = new JLabel("Martes");
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.gridx = rellenado;
			gbc_lblNewLabel.gridy = 0;
			panMartes.add(diaLunes, gbc_lblNewLabel);
			
			add(panMartes, gbc_lblNewLabel);
			

			for (int i = 0; i < coleccionMartes.size(); i++) {
				anaidirSlot(rellenado, i, puntoVista, coleccionMartes.get(i),panMartes );
			}
		}

		if ( coleccionMiercoles.size() != 0 ) {
			rellenado++;
			
			JPanel panMiercoles = new JPanel();
			panMiercoles.setLayout(gbl_config);
			
			JLabel diaMartes = new JLabel("Miercoles");
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.gridx = rellenado;
			gbc_lblNewLabel.gridy = 0;
			panMiercoles.add(diaMartes, gbc_lblNewLabel);
			
			add(panMiercoles, gbc_lblNewLabel);

			
			for (int i = 0; i < coleccionMiercoles.size(); i++) {
				anaidirSlot(rellenado, i, puntoVista, coleccionMiercoles.get(i), panMiercoles );
			}
		}

		if ( coleccionJueves.size() != 0 ) {
			rellenado++;
			
			JPanel panJueves = new JPanel();
			panJueves.setLayout(gbl_config);
			
			JLabel diaMiercoles = new JLabel("Jueves");
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.gridx = rellenado;
			gbc_lblNewLabel.gridy = 0;
			panJueves.add(diaMiercoles, gbc_lblNewLabel);
			
			add(panJueves, gbc_lblNewLabel);

			
			for (int i = 0; i < coleccionJueves.size(); i++) {
				anaidirSlot(rellenado, i, puntoVista, coleccionJueves.get(i), panJueves );
			}
		}

		if ( coleccionViernes.size() != 0 ) {
			rellenado++;
			
			JPanel panViernes= new JPanel();
			panViernes.setLayout(gbl_config);
			
			JLabel diaJueves = new JLabel("Viernes");
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.gridx = rellenado;
			gbc_lblNewLabel.gridy = 0;
			panViernes.add(diaJueves, gbc_lblNewLabel);

			add(panViernes, gbc_lblNewLabel);
			
			
			for (int i = 0; i < coleccionViernes.size(); i++) {
				anaidirSlot(rellenado, i, puntoVista, coleccionViernes.get(i), panViernes );
			}
		}

		if ( coleccionSabado.size() != 0 ) {
			rellenado++;
			
			JPanel panSabado = new JPanel();
			panSabado.setLayout(gbl_config);
			
			JLabel diaSabado = new JLabel("Sabado");
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.gridx = rellenado;
			gbc_lblNewLabel.gridy = 0;
			panSabado.add(diaSabado, gbc_lblNewLabel);

			add(panSabado, gbc_lblNewLabel);
			
			for (int i = 0; i < coleccionSabado.size(); i++) {
				anaidirSlot(rellenado, i, puntoVista, coleccionSabado.get(i), panSabado );
			}
		}

		if ( coleccionDomingo.size() != 0 ) {
			rellenado++;
			
			JPanel panDomingo = new JPanel();
			panDomingo.setLayout(gbl_config);
			
			JLabel diaDomingo = new JLabel("Domingo");
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.gridx = rellenado;
			gbc_lblNewLabel.gridy = 0;
			panDomingo.add(diaDomingo, gbc_lblNewLabel);

			add(panDomingo, gbc_lblNewLabel);
			
			for (int i = 0; i < coleccionDomingo.size(); i++) {
				anaidirSlot(rellenado, i, puntoVista, coleccionDomingo.get(i), panDomingo );
			}
		}
		

	}

	/**
	 * metodo para colcar un MomentoInfo en una celda 
	 * de la cuadricula
	 * @param col columna
	 * @param row fila
	 * @param puntoVista punto de vista para instanciar MomentoInfo
	 * @param momento panel al que incorporar el momento
	 */
	private void anaidirSlot(int col, int row, String puntoVista, Slot momento, JPanel panel) {


		MomentoInfo info = new MomentoInfo(puntoVista, momento);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridx = col;
		gbc_lblNewLabel.gridy = row+1;
		panel.add(info, gbc_lblNewLabel);


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
