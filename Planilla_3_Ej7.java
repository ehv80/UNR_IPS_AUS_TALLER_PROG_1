/** Recibe una frase por teclado y cuenta por separado
    la cantidad de vocales, consonantes y espacios en Blanco **/
import java.io.*;
public class Ej7{

   String frase = "";

   int cantidadEspacios=0;
   int cantidadVocales=0;
   int cantidadConsonantes=0;
   int cantidadDigitos=0;

   public String leerFrase() throws IOException{
	InputStreamReader isr = new InputStreamReader( System.in );
	BufferedReader br = new BufferedReader( isr );
	System.out.println("Ingrese la frase!");
	String cadena = br.readLine();
	return cadena;
   }
   public void contar( String frase ){
	for( int i=0 ; i < frase.length() ; i++ ){
		char letra = frase.charAt( i );
		switch( letra ){

			case ' ':
			case '\t':
			case '\n':
				cantidadEspacios++;
				break;

			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'á':
			case 'é':
			case 'í':
			case 'ó':
			case 'ú':
				cantidadVocales++;
				break;

			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				cantidadDigitos++;
				break;

			case 'b':
			case 'c':
			case 'd':
			case 'f':
			case 'g':
			case 'h':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'ñ':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
			case 'B':
			case 'C':
			case 'D':
			case 'F':
			case 'G':
			case 'H':
			case 'J':
			case 'K':
			case 'L':
			case 'M':
			case 'N':
			case 'Ñ':
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
			case 'T':
			case 'V':
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				cantidadConsonantes++;
				break;
			
			default:
				break;
		}
	}
   }
}
