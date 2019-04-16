public class startswith{
	public static void main (String args[])
	{Console c = new Console();
                 boolean valor;
	  c.println ("Ejemplo de uso de startsWith");
                String str="Hola Mundo";
	 valor= str.startsWith("Ho");    // retorna true, pues Ho es prefijo de str
                if (valor == true) 			       
                      c.println("Substring concuerdan");	    
                else					      
                      c.println("No calzan");		        
                }
}
