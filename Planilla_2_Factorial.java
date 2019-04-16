/** Calcula el factorial de un número entero dado **/

public class Factorial{
	int resultado=1;
	public int getFactorial( int n ){
		for( int i = n ; i > 0 ; i-- )
			resultado = resultado * i;
		return resultado;
	}
}
