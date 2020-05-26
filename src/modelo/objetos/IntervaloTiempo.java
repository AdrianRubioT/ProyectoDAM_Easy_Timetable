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
	private Int horaIncio;
	private Int minutoInicio;
	private Int horaFin;
	private Int minutoFin;

	public IntervaloTiempo () {
		
	}

	/**
	 * Instancia la clase.
Dara error si se pasan valores fuera del margen
Marge
	 * n:
Horas: 0 - 24
Minutos: 0 - 60
	 * @param horaInit
	 * @param minutoInit
	 * @param horaFin
	 * @param minutoFin
	 * @return void
	 */
	public void IntervaloTiempo (Int horaInit, Int minutoInit, Int horaFin, Int minutoFin) {
		// TODO Auto-generated method stub
	}

	/**
	 * comprueba que  otro IntervaloTeimpo no se  solape con esta instancia.
Dev
	 * uelve true si hay solapamiento, False en caso contrario
	 * @param otroMargen
	 * @return bollean
	 */
	public bollean comprobarSolapamiento(IntervaloTiempo  otroMargen) {
		// TODO Auto-generated method stub
	}

}

