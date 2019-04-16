public class substring{
	public static void main (String args[])
	{Console c = new Console();
                 String s;
	  c.println ("Ejemplo de uso de substring");
                String str="Hola Mundo";
	 s= str.substring(2);          // retorna "la Mundo"
                c.println(s);	   
                s=str.substring(5);     // retorna "Mundo"
                c.println(s);
                s=str.substring(12);     // retorna una excepcion pues 12 excede el largo del string
                c.println(s);	   
                }
}
