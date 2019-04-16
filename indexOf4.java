public class indexOf4{
	public static void main (String args[])
	{Console c = new Console();
                 int valor;
	  c.println ("Ejemplo de uso de indexOf con posicion de comienzo");
                String str="abracadabra";
	 valor= str.indexOf("b",0);  // retorna 1, pues la primera ocurrencia de
                c.println(valor);	      // "b" en "abracadabra" es en la posicion 1
                valor= str.indexOf("b",2);  // retorna 8, pues la primera ocurrencia de 
                c.println(valor);	      // "b" en "racadabra" es en la posicion 8
	 valor= str.indexOf("b",9); // retorna -1, pues no hay ocurrencias de "b"
                c.println(valor);	     // en el string "ra"
                }			   
}
