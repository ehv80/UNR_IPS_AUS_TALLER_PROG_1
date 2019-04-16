/** Clase que dibuja un rectángulo con un ancho y largo dado **/

/**	  i   1 <= i <= ancho
	#####
	#   #
      j	#   #
	#   #
	#####
 1 <= j <= largo
**/

public class Ej5{
	
	public void DibujarRectangulo( int ancho , int largo ){
	
		for( int i = 1 ; i <= ancho ; i++ )
			System.out.print("#");		// Dibuja la 1º línea ###...###

		System.out.println("");			// salto de línea y retorno de carro

		for( int j = 2 ; j < largo ; j++ ){
			System.out.print("#");
			for( int i = 2 ; i < ancho ; i++ )
				System.out.print(" ");
			System.out.print("#");
			System.out.println("");
		}
		for( int i = 1 ; i <= ancho ; i++ )
			System.out.print("#");
		System.out.println("");
	}

/**
    	  i	i <= ancho
	#####
	#   #
      j	#   #
	#   #
	#####
 j <= largo
**/


	public void DibujarRectangulo2( int ancho , int largo ){
		
		int i=1;
		while( i <= ancho ){
			System.out.print("#");
			i++;
		}

		System.out.println("");
		
		int j=2;
		while( j < largo ){
			System.out.print("#");
			i=2;
			while( i < ancho ){
				System.out.print(" ");
				i++;
			}
			System.out.print("#");
			System.out.println("");
			j++;
		}

		int k=1;
		while( k <= ancho ){
			System.out.print("#");
			k++;
		}
		System.out.println("");
	}	
}
