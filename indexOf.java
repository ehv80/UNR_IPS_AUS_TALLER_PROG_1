public class indexOf{
	public static void main (String args[])
	{Console c = new Console();
                 int valor;
	  c.println ("Ejemplo de uso de indexOf");
                String str="Hola Mundo";
	 valor= str.indexOf(97);    // retorna 3, pues el numero 97 representa al codigo
                c.println(valor);	   // ascii "a", el que esta en la posicion 3 
                valor= str.indexOf(100);  // retorna 8, pues el numero 100 representa al codigo
                c.println(valor);	   // ascii "d", el que esta en la posicion 8
	 valor= str.indexOf(98);    // retorna -1, pues el numero 98 representa al codigo
                c.println(valor);	   // ascii "b", que no se encuentra en el string
                }
}
