/** Clase que tiene los siguientes métodos para un array bidimensional:
	- para inicializar toma 4 parámetros (filas, columnas, max, min)
	  Cada elemento será un número aleatorio entre min y max.
	- para mostrar por pantalla el contenido del arreglo
	- para mostrar el elemento máximo y el mínimo               **/
public class Ej4{
	int[][] arreglo;
	public void crearEinicializar( int filas , int columnas , int min , int max ){
		arreglo = new int[filas][columnas];
		int rango = max - min;
		for( int i=0 ; i < arreglo.length ; i++ ){
			for( int j=0 ; j < arreglo[0].length ; j++ ){
				int aleat = min + 1 + (int)( rango * Math.random() );
				arreglo[i][j] = aleat;
			}
		}
	}
	public void mostrar(){
		for( int i=0 ; i < arreglo.length ; i++ ){
			for( int j=0 ; j < arreglo[0].length ; j++ ){
				System.out.print(" " + arreglo[i][j] + " " );
			}
			System.out.println("");
		}
	}
	public void mostrarMaxMin(){
		int mayor = arreglo[0][0];
		for( int i=0 ; i < arreglo.length ; i++ ){
			for( int j=0 ; j < arreglo[0].length ; j++ ){
				if( arreglo[i][j] > mayor )
					mayor = arreglo[i][j];
			}
		}
		int menor = arreglo[0][0];
		for( int i=0 ; i < arreglo.length ; i++ ){
			for( int j=0 ; j < arreglo[0].length ; j++ ){
				if( arreglo[i][j] < menor )
					menor = arreglo[i][j];
			}
		}
	 	System.out.println("El elemento mayor es: " + mayor );
	 	System.out.println("El elemento menor es: " + menor );
	}	
	
}	
