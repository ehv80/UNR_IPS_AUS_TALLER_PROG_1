public class getChars{
	public static void main (String args[])
	{Console c = new Console();
	  c.println ("Ejemplo de uso de getchars");
                 char valor[]={'a','b','c'};
                 StringBuffer str;
                 str=new StringBuffer("Hola Mundo");
                 str.getChars(2,4,valor,1); // Se copia del StringBuffer str, de la posicion 2 a la 4
				      // al arreglo valor, empezando desde la posicion 1
	  c.println(valor[0]); // retorna a
	  c.println(valor[1]); // retorna l
	  c.println(valor[2]); // retorna a
	  }
}
