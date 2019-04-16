public class lastIndexOf4{
	public static void main (String args[])
	{Console c = new Console();
                 int valor;
	  c.println ("Ejemplo de uso de lastIndexOf");
                String str="abracadabra";
	 valor= str.lastIndexOf("b",1);   // retorna 1, pues la ultima ocurrencia de "b" en str
                c.println(valor);	               //  tal que la posicion es menor o igual que 1 es 1
                valor= str.lastIndexOf("b",3);   // retorna 1, pues la ultima ocurrencia de "b" en str
                c.println(valor);	               //  tal que la posicion es menor o igual que 3 es 1
	 valor= str.lastIndexOf("b",10); // retorna 8, pues la ultima ocurrencia de "b" en str
                c.println(valor);   	               // tal que la posicion es menor o igual que 10 es 8
                }
}
