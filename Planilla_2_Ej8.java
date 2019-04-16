/** Convierte temperatura de grados celsius a grados farenheit
    y viceversa mediante dos métodos                          **/
/** Conversión a Farenheit: 9.0 / 5.0 * Temp en ºC + 32.0     **/
/** Conversión a Celsius:   ( Temp en ºF - 32.0 ) * 5.0 / 9.0 **/

public class Temperatura{
	public double celsiusAfarenheit( double celsius ){
		double farenheit = ( ( ( 9.0 / 5.0 ) * celsius ) + 32.0 );
		return farenheit;
	}
	public double farenheitAcelsius( double farenheit ){
		double celsius = ( ( farenheit -  32.0 ) * ( 5.0 / 9.0 ) );
		return celsius;
	}
}
