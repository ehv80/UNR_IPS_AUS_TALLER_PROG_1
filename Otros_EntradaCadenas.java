import java.io.*;

public class EntradaCadenas{

	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader( isr );

		String cadena = "";

		System.out.println("ingrese algun número entero por teclado!!!");

		cadena = br.readLine();	//este método es el que lee por teclado y guarda en cadena
		
		int nroIng;

		nroIng = Integer.parseInt( cadena );

		System.out.println("Usted ha ingresado el siguiente dato: " + nroIng );
	}
}
