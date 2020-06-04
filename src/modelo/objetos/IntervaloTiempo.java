package modelo.objetos;
/**
 * Clase para indicar un intervalo entre dos horas con precision de minutos , 
y
 *  metodos para detectar solapamientos.
Las horas i minutos se indican como un 
 * relog de 24 Horas.
 * @author
 *
 */
public class IntervaloTiempo  {

	private int id_BD;

	private int horaIncio;
	private int minutoInicio;
	private int horaFin;
	private int minutoFin;
	private int dia;


	public IntervaloTiempo () {

	}

	/**
	 * Instancia la clase.
	 * Dara error si se pasan valores fuera del margen
	 * Margen:
	 *     Horas: 0 - 24
	 *     Minutos: 0 - 60
	 * @param dia dia de la semana 0-Lunes 6-Domingo
	 * @param horaInit
	 * @param minutoInit
	 * @param horaFin
	 * @param minutoFin
	 */
	public IntervaloTiempo(int dia, int horaIncio, int minutoInicio, int horaFin, int minutoFin) {
		this.dia = dia;
		this.horaIncio = horaIncio;
		this.minutoInicio = minutoInicio;
		this.horaFin = horaFin;
		this.minutoFin = minutoFin;
	}

	/**
	 * comprueba que  otro intervaloTeimpo no se  solape con esta instancia.
	 * Devuelve true si hay solapamiento, False en caso contrario
	 * @param otroMargen
	 * @return bollean
	 */
	public boolean comprobarSolapamiento(IntervaloTiempo otroMargen) {
		//TODO: por hacer
		return false;
	}


	/**
	 * metodo para devolver la hora y minuto inicio
	 */
	public String horaMinInicio() {
		return horaIncio + ":" + minutoInicio;
	}

	/**
	 * metodo para devolver la hora y minuto fin
	 */
	public String horaMinFin() {
		return horaFin + ":" + minutoFin;
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

	/**
	 * @return the horaIncio
	 */
	public int getHoraIncio() {
		return horaIncio;
	}

	/**
	 * @param horaIncio the horaIncio to set
	 */
	public void setHoraIncio(int horaIncio) {
		this.horaIncio = horaIncio;
	}

	/**
	 * @return the minutoInicio
	 */
	public int getMinutoInicio() {
		return minutoInicio;
	}

	/**
	 * @param minutoInicio the minutoInicio to set
	 */
	public void setMinutoInicio(int minutoInicio) {
		this.minutoInicio = minutoInicio;
	}

	/**
	 * @return the horaFin
	 */
	public int getHoraFin() {
		return horaFin;
	}

	/**
	 * @param horaFin the horaFin to set
	 */
	public void setHoraFin(int horaFin) {
		this.horaFin = horaFin;
	}

	/**
	 * @return the minutoFin
	 */
	public int getMinutoFin() {
		return minutoFin;
	}

	/**
	 * @param minutoFin the minutoFin to set
	 */
	public void setMinutoFin(int minutoFin) {
		this.minutoFin = minutoFin;
	}

	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}




}

