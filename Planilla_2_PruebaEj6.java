/** Prueba de ejecución para resolver el Ejercicio 6 de la planilla 2 
    que simula las tiradas de un dado y calcula el porcentaje de cada tirada **/

public class PruebaEj6{

	public static void main(String[] args){

		Ej6 prueba = new Ej6();
		
		// Para el caso de 10 tiradas del dado
		int[] carasSalidas = new int[10];	// 0 <= indice <= 9

		for( int veces = 0  ; veces < 10 ; veces++ ){

			carasSalidas[veces] = prueba.tirada() ;

			prueba.contarTirada( carasSalidas[veces] );
		}
	
		prueba.porcentajeTirada( 10 , prueba.cant1 , prueba.cant2 , prueba.cant3 , prueba.cant4 , prueba.cant5 , prueba.cant6 );

		
		// Para el caso de 100 tiradas del dado
		Ej6 prueba2 = new Ej6();

		int[] carasSalidas2 = new int[100];	// 0 <= indice <= 99
		
		for( int veces = 0 ; veces < 100 ; veces++ ){
		
			carasSalidas2[veces] = prueba2.tirada();
			
			prueba2.contarTirada( carasSalidas2[veces] );
		}
		prueba2.porcentajeTirada( 100 , prueba2.cant1 , prueba2.cant2 , prueba2.cant3 , prueba2.cant4 , prueba2.cant5 , prueba2.cant6 );


		// Para el caso de 10000 tiradas del dado
		Ej6 prueba3 = new Ej6();
		
		int[] carasSalidas3 = new int[10000];	// 0 <= indice <= 9999
		
		for( int veces = 0 ; veces < 10000 ; veces++ ){
			
			carasSalidas3[veces] = prueba3.tirada();

			prueba3.contarTirada( carasSalidas3[veces] );
		}
		
		prueba3.porcentajeTirada( 10000 , prueba3.cant1 , prueba3.cant2 , prueba3.cant3 , prueba3.cant4 , prueba3.cant5 , prueba3.cant6 );
	
	}
}	
			
