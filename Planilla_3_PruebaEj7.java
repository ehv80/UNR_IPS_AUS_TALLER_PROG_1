/** Ejemplo de ejecución del Ej7 donde ingresamos una
    frase y nos informa cúantos espacios en blanco, 
    vocales y consonantes hay en esa cadena        **/
import java.io.*;
public class PruebaEj7{
  public static void main(String[] args) throws IOException{
     Ej7 prueba = new Ej7();
     prueba.frase = prueba.leerFrase();
     prueba.contar( prueba.frase );
     System.out.println("Cantidad de espacios en blanco de la frase: " + prueba.cantidadEspacios );
     System.out.println("Cantidad de consonantes de la frase: " + prueba.cantidadConsonantes );
     System.out.println("Cantidad de vocales de la frase: " + prueba.cantidadVocales );
     System.out.println("Cantidad de dígitos de la frase: " + prueba.cantidadDigitos );
  }
}
