public class lastIndexOf3{
	public static void main (String args[])
	{Console c = new Console();
                 int valor;
	  c.println ("Ejemplo de uso de lastIndexOf");
                String str="Hola Mundo";
	 valor= str.lastIndexOf("o");  // retorna 9, pues la ultima ocurrencia de "o"
                c.println(valor);	           // esta en la posicion 9
                valor= str.lastIndexOf("d");  // retorna 8, pues la ultima ocurrencia de "d"
                c.println(valor);	          // esta en la posicion 8
	 valor= str.lastIndexOf("b");  // retorna -1, pues "b" no se encuentra en el string
                c.println(valor);   	          
                }
}
