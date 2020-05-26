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
	private int horaIncio;
	private int minutoInicio;
	private int horaFin;
	private int minutoFin;

	public IntervaloTiempo () {

	}

	/**
	 * Instancia la clase.
	 * Dara error si se pasan valores fuera del margen
	 * Margen:
	 *     Horas: 0 - 24
	 *     Minutos: 0 - 60
	 * @param horaInit
	 * @param minutoInit
	 * @param horaFin
	 * @param minutoFin
	 */
	public IntervaloTiempo(int horaIncio, int minutoInicio, int horaFin, int minutoFin) {
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



}

