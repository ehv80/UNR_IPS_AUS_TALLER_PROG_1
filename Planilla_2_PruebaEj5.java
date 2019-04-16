public class PruebaEj5{

	public static void main(String[] args){

		Ej5 prueba = new Ej5();

		prueba.DibujarRectangulo( 5 , 20 );
		
		prueba.DibujarRectangulo2( 20 , 5 );

		for( int i=2 ; i <= 10 ; i++ )
			for( int j=2 ; j <= 10 ; j++ ){
				prueba.DibujarRectangulo( i , j );
				prueba.DibujarRectangulo2( i , j ); 
			}

	}

}
