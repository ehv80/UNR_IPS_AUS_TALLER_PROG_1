/** Simula la tirada de un dado y calcula el porcentaje de veces que salió cada cara
    Para 10, 100 y 10000 tiradas							**/

public class Ej6{
	
	int caraResultado;
	int veces;
	int cant1=0;
	int cant2=0;
	int cant3=0;
	int cant4=0;
	int cant5=0;
	int cant6=0;

	public int tirada(){
		int min = 1;	// mínimo resultado de una tirada: la cara con 1
		int max = 6;    // máximo resultado de una tirada: la cara con 6
		int rango = max - min;
		int caraResultado = min + 1 + (int)( rango * Math.random() );
		return caraResultado;
	}
	
	public void porcentajeTirada( int veces , int cant1 , int cant2 , int cant3 , int cant4 , int cant5 , int cant6 ){

		double  porcentaje1, porcentaje2, porcentaje3, porcentaje4, porcentaje5, porcentaje6;

		porcentaje1 = (double)( (double)cant1 * 100.0 ) / (double)veces;
		porcentaje2 = (double)( (double)cant2 * 100.0 ) / (double)veces;
		porcentaje3 = (double)( (double)cant3 * 100.0 ) / (double)veces;
		porcentaje4 = (double)( (double)cant4 * 100.0 ) / (double)veces;
		porcentaje5 = (double)( (double)cant5 * 100.0 ) / (double)veces;
		porcentaje6 = (double)( (double)cant6 * 100.0 ) / (double)veces;

		System.out.println("");
		System.out.println("El porcentaje de veces que salio 1 es: " + porcentaje1 );
		System.out.println("El porcentaje de veces que salio 2 es: " + porcentaje2 );
		System.out.println("El porcentaje de veces que salio 3 es: " + porcentaje3 );
		System.out.println("El porcentaje de veces que salio 4 es: " + porcentaje4 );
		System.out.println("El porcentaje de veces que salio 5 es: " + porcentaje5 );
		System.out.println("El porcentaje de veces que salio 6 es: " + porcentaje6 );
		System.out.println("");
	}
	
	public void contarTirada( int caraResultado ){
		
			switch( caraResultado ){
				case 1:
					cant1++;
					break;
				case 2:
					cant2++;
					break;
				case 3:
					cant3++;
					break;
				case 4:
					cant4++;
					break;
				case 5:
					cant5++;
					break;
				case 6:
					cant6++;
					break;
			}
	}
}	
