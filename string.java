public class string{
	public static void main (String args[])
	{Console c = new Console();
	  c.println ("Ejemplo de uso de construcción de Strings");
	  char value[]={'a','b','c','d','e','f','g'};
                 String str; // se declara el string
                 str=new String(value,3,2); //str es igual al arreglo value
                     			        // desde la posicion 3, incluyendo
				        // los dos primeros caracteres.
                 //lo anterior es equivalente a String str="de";
                 c.println(str);
                 }
}
