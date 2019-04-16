/** Permite ingresar una cantidad determinada de números del tipo double,
    guardarlos en un arreglo y mostrarlos en el orden inverso al ingresado **/
import java.io.*;
public class Ej1{
	int tamaño=10;
	double[] Arreglo = new double[tamaño];
	public double LecturaTeclado() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader( isr );
		String cadena="";
		System.out.println("Ingrese un double:");
		cadena = br.readLine();	//Lee del teclado y guarda en cadena
		double valorIngresado = Double.parseDouble( cadena );
		return valorIngresado;
	}
	public void guardarEnArreglo() throws IOException {
		for( int i = 0 ; i < Arreglo.length ; i++ )
			Arreglo[i] = LecturaTeclado();
	}
	public void mostrarArregloInverso(){
		for( int i = ( Arreglo.length - 1 ) ; i >= 0 ; i-- )
			System.out.println("Elemento de la posición " + i + " es: " + Arreglo[i] );
	}
}
