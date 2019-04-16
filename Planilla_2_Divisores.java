/** Encuentra todos los divisores de un número entero dado **/
public class Divisores{
	public void mostrarDivisores( int num ){
		for( int i=1 ; i <= num ; i++ ){
			if( num % i == 0 )
				System.out.println( "Un divisor de " + num + " es: " + i );
		}
	}
}
