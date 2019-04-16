/** Prueba de ejecución para la generación de los 20 nros aleatorios
     entre 1 y 100 obtenieno máximo, mínimo y media 		    **/

public class PruebaEj7{
   public static void main(String[] args){
	Ej7 prueba = new Ej7();
	prueba.guardarNroEnArreglo();
	prueba.mostrarNroDeArreglo();
	System.out.println("");
	System.out.println("El mayor es: " + prueba.MayorEnArreglo() );
	System.out.println("El menor es: " + prueba.MenorEnArreglo() );
	System.out.println("");
	System.out.println("La media es: " + prueba.MediaDelArreglo() );
   }
}
