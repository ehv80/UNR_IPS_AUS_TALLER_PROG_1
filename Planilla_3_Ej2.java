/** Guarda en un Arreglo de String los actores/actirces y muestra
    uno en forma aleatoria					 **/
import java.io.*;
public class Ej2{
	int tamaño=10;
	String[] Arreglo = new String[tamaño];
	public String Lectura() throws IOException{
		InputStreamReader isr = new InputStreamReader( System.in );
		BufferedReader br = new BufferedReader( isr );
		String cadena="";
		System.out.println("Ingrese el nombre del actor/actriz: ");
		cadena = br.readLine();	//Lee del teclado
		return cadena;
	}
	public void guardarEnArreglo() throws IOException{
		for( int i=0 ; i < Arreglo.length ; i++ )
			Arreglo[i] = Lectura();
	}
	public void obtenerAleatorio(){
		int rango = tamaño - 1;
		int aleat = 0 + 1 + (int)( rango * Math.random() );
		System.out.println("El artista destacado de la semana es: " + Arreglo[aleat] );
	}
}
