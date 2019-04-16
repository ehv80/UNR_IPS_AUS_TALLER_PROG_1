public class trim{
	public static void main (String args[])
	{Console c = new Console();
	  c.println ("Ejemplo de uso de trim");
                String str="Hola Mundo                        ";
	 str=str.trim();       // str queda como "Hola Mundo", pues se eliminan los 
                c.print(str + ".");  // espacios al final	    
                }		    
}
