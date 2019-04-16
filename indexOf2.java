public class indexOf2{
	public static void main (String args[])
	{Console c = new Console();
                 int valor;
	  c.println ("Ejemplo de uso de indexOf con posicion de comienzo");
                String str="abracadabra";
	 valor= str.indexOf(98,0);  // retorna 1, pues el numero 98 representa al codigo
                c.println(valor);	    // ascii "b", el que esta en la posicion 1
                valor= str.indexOf(98,2);  // retorna 8, pues el numero 98 representa al codigo
                c.println(valor);	    // ascii "b", el que esta en la posicion 8
	 valor= str.indexOf(98,9); // retorna -1, pues el numero 98 representa al codigo
                c.println(valor);	   // ascii "b", que no se encuentra en el string mas alla de 	
                }			   // la posicion 9
}
