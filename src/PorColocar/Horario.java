package PorColocar;
/**
 * clase principal para gestionar y conetern las cosas necesarias para el horari
 * o
En un principio se piensa realizar un horario de formato cuadriculado
 * @author
 *
 */
public class Horario {
	/**
	 * array con los dias de la semana que se usaran en el horario
valores: 0-6 
	 * Lunes-Domingo, activo, inactivo
	 */
	public Boolean[] diasSemana;
	/**
	 * Coleccion de objetos Slots
primer indice: columna de la semana.
Segundo i
	 * ndice indica intervalo de teimpo
	 */
	public Slot[][] momento;

	public Horario() {
		
	}

	/**
	 * @return void
	 */
	public void Horario() {
		// TODO Auto-generated method stub
	}

	/**
	 * aniade una instancia de Slot a la coleccion momento, colocandolo ordenado
	 *  por tiempo y dia
	 * @param momento
	 * @return void
	 */
	public void aniadirMomento(Slot momento) {
		// TODO Auto-generated method stub
	}

	/**
	 * elimina un momento de la coleccion
	 * @return void
	 */
	public void eliminarMomento() {
		// TODO Auto-generated method stub
	}

	/**
	 * @param diasSemana
	 * @return Void
	 */
	public Void setDiaSemana(Boolean[] diasSemana) {
		// TODO Auto-generated method stub
	}

	/**
	 * @return Boolean[]
	 */
	public Boolean[] getDiaSemana() {
		// TODO Auto-generated method stub
	}

	/**
	 * @param slot
	 * @return Void
	 */
	public Void setMomento(Slot slot) {
		// TODO Auto-generated method stub
	}

	/**
	 * @return Slot
	 */
	public Slot getMomento() {
		// TODO Auto-generated method stub
	}

}

