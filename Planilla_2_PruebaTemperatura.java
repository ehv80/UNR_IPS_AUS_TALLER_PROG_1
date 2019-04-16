/** Ejemplo de ejecución de Temperatura **/

public class PruebaTemperatura{

   public static void main(String[] args){

      Temperatura prueba = new Temperatura();

      System.out.println("98.6ºF equivalen a: " + prueba.farenheitAcelsius( 98.6 ) + "ºC" );
      System.out.println("82.4ºF equivalen a: " + prueba.farenheitAcelsius( 82.4 ) + "ºC" );

      System.out.println("15.0ºC equivalen a: " + prueba.celsiusAfarenheit( 15.0 ) + "ºF" );
      System.out.println(" 3.0ºC equivalen a: " + prueba.celsiusAfarenheit( 3.0 ) + "ºF" );
   }
}

