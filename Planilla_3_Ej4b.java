/** Clase que tiene los siguientes métodos para un array tridimensional:
	- para inicializar toma 5 parámetros (dimensión1, dimensión2, dimensión3, max, min)
	  Cada elemento será un número aleatorio entre min y max.
	- para mostrar por pantalla el contenido del arreglo
	- para mostrar el elemento máximo y el mínimo               **/
public class Ej4b{
	int[][][] arreglo;
	public void crearEinicializar( int dim1 , int dim2 , int dim3 , int min , int max ){
		arreglo = new int[dim1][dim2][dim3];
		int rango = max - min;
		for( int i=0 ; i < arreglo.length ; i++ ){
			for( int j=0 ; j < arreglo[0].length ; j++ ){
				for( int k=0 ; k < arreglo[0][0].length ; k++){
					int aleat = min + 1 + (int)( rango * Math.random() );
					arreglo[i][j][k] = aleat;
				}
			}
		}
	}
	public void mostrar(){
		for( int i=0 ; i < arreglo.length ; i++ ){
			for( int j=0 ; j < arreglo[0].length ; j++ ){
				for( int k=0 ; k < arreglo[0][0].length ; k++ ){
					System.out.print(" " + arreglo[i][j] + " " );
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
	public void mostrarMaxMin(){
		int mayor = arreglo[0][0][0];
		for( int i=0 ; i < arreglo.length ; i++ ){
			for( int j=0 ; j < arreglo[0].length ; j++ ){
				for( int k=0 ; k < arreglo[0][0].length ; k++){
					if( arreglo[i][j][k] > mayor )
						mayor = arreglo[i][j][k];
				}
			}
		}
		int menor = arreglo[0][0][0];
		for( int i=0 ; i < arreglo.length ; i++ ){
			for( int j=0 ; j < arreglo[0].length ; j++ ){
				for( int k=0 ; k < arreglo[0][0].length ; k++ ){
					if( arreglo[i][j][k] < menor )
						menor = arreglo[i][j][k];
				}
			}
		}
	 	System.out.println("El elemento mayor es: " + mayor );
	 	System.out.println("El elemento menor es: " + menor );
	}	
	
}	
