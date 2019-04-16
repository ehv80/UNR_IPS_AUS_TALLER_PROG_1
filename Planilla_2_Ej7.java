/** Genera 20 números aleatorios entre 1 y 100, los muestra,
     muestra máximo, mínimo y calcula y muestra la media    **/
public class Ej7{
   int min = 1;
   int max = 100;
   int rango = max - min;
   int[] nros = new int[20];
   double media;
   int mayor;
   int menor;
   public int generarNro(){
	int nroAleat = min + 1 + (int)( rango * Math.random() );
	return nroAleat;
   }
   public void guardarNroEnArreglo(){
	for( int i = 0 ; i < nros.length ; i++ )
		nros[i] = generarNro();
   }
   public void mostrarNroDeArreglo(){
	for( int i=0 ; i < nros.length ; i++ )
		System.out.println("Número aleatorio de la posición " + i + " es: " + nros[i] );
   }
   public int MayorEnArreglo(){					
	mayor = nros[0];
	for( int i = 0 ; i < nros.length ; i++ ){
		if( nros[i] > mayor )
			mayor = nros[i];
	}
	return mayor;
   }
   public int MenorEnArreglo(){
	menor = nros[0];
	for( int i = 0 ; i < nros.length ; i++ ){
		if( nros[i] < menor )
			menor = nros[i];
	}
	return menor;
   }
   public double MediaDelArreglo(){
	double suma=0.0;
	for( int i=0 ; i < nros.length ; i++ )
		suma = suma + (double)nros[i];
	media = suma / ( (double)nros.length );
	return media;
   }
}
