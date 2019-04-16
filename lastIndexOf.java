public class lastIndexOf{
	public static void main (String args[])
	{Console c = new Console();
                 int valor;
	  c.println ("Ejemplo de uso de lastIndexOf");
                String str="Hola Mundo";
	 valor= str.lastIndexOf(111);  // retorna 9, pues el numero 111 representa al codigo
                c.println(valor);	           // ascii "o", el que esta en la posicion 9
                valor= str.lastIndexOf(100);  // retorna 8, pues el numero 100 representa al codigo
                c.println(valor);	          // ascii "d", el que esta en la posicion 8
	 valor= str.lastIndexOf(98);    // retorna -1, pues el numero 98 representa al codigo
                c.println(valor);   	          // ascii "b", que no se encuentra en el string
                }
}
