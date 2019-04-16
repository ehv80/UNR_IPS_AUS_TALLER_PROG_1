public class indexOf3{
	public static void main (String args[])
	{Console c = new Console();
                 int valor;
	  c.println ("Ejemplo de uso de indexOf");
                String str="Hola Mundo";
	 valor= str.indexOf("a");   // retorna 3, pues la primera ocurrencia de "a"
                c.println(valor);	    // es en  la posicion 3
                valor= str.indexOf("d");   // retorna 8, pues "b" se encuentra en la posicion 8
                c.println(valor);	   
	 valor= str.indexOf("k");   // retorna -1, pues el "k" no se encuentra en str
                c.println(valor);	   
                }
}
