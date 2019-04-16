/** Muestra en pantalla todos los números primos entre 1 y n
    donde n se recibe como parámetro del programa		**/

import java.io.*;

public class Primos{
	int n = 0;
/**	public void setn(){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader( isr );
		String cadena = "";
                System.out.println("ingrese algun número entero por teclado!!!");
                cadena = br.readLine(); //este método es el que lee por teclado y guarda en cadena
                int nroIng;
                nroIng = Integer.parseInt( cadena );
                System.out.println("Usted ha ingresado el siguiente dato: " + nroIng );
		n = nroIng;
	} **/

	public static void main(String[] args) throws IOException{
		Primos prueba = new Primos();
		//prueba.setn();

		InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader( isr );
                String cadena = "";
                System.out.println("ingrese algun número entero por teclado!!!");
                cadena = br.readLine(); //este método es el que lee por teclado y guarda en cadena
                int nroIng;
                nroIng = Integer.parseInt( cadena );
                System.out.println("Usted ha ingresado el siguiente dato: " + nroIng );
                prueba.n = nroIng;

		int nValues = prueba.n;
		boolean esPrimo = true;
		for( int i = 2 ; i <= nValues ; i++ ){
			esPrimo = true;
			for( int j = 2 ; j < i ; j++ ){
				if( i % j == 0 ){
					esPrimo = false;
					break;
				}
			}
			if( esPrimo )
				System.out.println("Un número primo encontrado es: " + i );
		}
	}
}		
