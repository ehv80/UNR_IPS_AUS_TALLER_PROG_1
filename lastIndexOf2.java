public class lastIndexOf2{
	public static void main (String args[])
	{Console c = new Console();
                 int valor;
	  c.println ("Ejemplo de uso de lastIndexOf");
                String str="abracadabra";
	 valor= str.lastIndexOf(98,1);  // retorna 1, pues el numero 98 representa al codigo
                c.println(valor);	            // ascii "b", cuya ultima posicion  en "ab" es 1
                valor= str.lastIndexOf(98,3);  // retorna 1, pues el numero 98 representa al codigo
                c.println(valor);	           // ascii "b", cuya ultima posicion en "abra" es 1
	 valor= str.lastIndexOf(98,10); // retorna 8, pues el numero 98 representa al codigo
                c.println(valor);   	          // ascii "b",y la ultima posicion de "b" en "abracadabra" es 8
                }
}
