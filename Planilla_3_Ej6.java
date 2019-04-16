/** Guarda los nombres y apellidos en un Arreglo de String
    con el típico formato "apellido, nombre" para cada elemento
    del arreglo.
    Necesita un método que devuelva el mensaje 
    "Bienvenido nombre apellido!"				**/
import java.io.*;
public class Ej6{
	String[] Personas = new String[10];
	/** Método para ingreso de datos por teclado que retorna
            la cadena ingresada   **/
	public String Lectura() throws IOException{
		InputStreamReader isr = new InputStreamReader( System.in );
		BufferedReader br = new BufferedReader( isr );
		System.out.println("Ingrese: [Apellido, Nombre] ");
		String cadena = br.readLine();
		return cadena;
	}
	public void inicializarPersonas() throws IOException{
		for( int i=0 ; i < Personas.length ; i++ )
			Personas[i] = Lectura();
	}
	public void mostrarMensaje(){
		for( int i=0 ; i < Personas.length ; i++ ){
			int mitadCadena = Personas[i].indexOf(',');
			int comienzoCadena = 0;
			int finCadena = Personas[i].length() ; //tenía- 1 pero no andaba ;
			int finApellido = mitadCadena ; //tenía -1 pero no andaba
			int comienzoNombre = mitadCadena ; // tenía +1 pero no andaba
			String Apellido = Personas[i].substring( comienzoCadena , finApellido );
			String Nombre =   Personas[i].substring( comienzoNombre , finCadena );
			System.out.println("Bienvenido " + Nombre + " " + Apellido + " !");
		}
	}
}
