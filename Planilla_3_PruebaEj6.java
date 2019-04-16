/** Ejemplo de ejecución del Ej6 que guarda Strings en 
    un arreglo con el formato "Apellido, Nombre" y utiliza
    un método para mostrar un mensaje con el formato
    "Bienvenido Nombre Apellido!"		      **/
import java.io.*;
public class PruebaEj6{
	public static void main(String[] args) throws IOException{
		Ej6 prueba = new Ej6();
		prueba.inicializarPersonas();
		prueba.mostrarMensaje();
	}
}
