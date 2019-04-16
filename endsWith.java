public class endsWith{
	public static void main (String args[])
	{Console c = new Console();
                 boolean valor;
	  c.println ("Ejemplo de uso de endsWith");
                String str="Hola Mundo";
	 valor= str.endsWith("ndo");    // retorna true, pues ndo es sufijo de str
                if (valor == true) 			       
                      c.println("Substring concuerdan");	    
                else					      
                      c.println("No calzan");		        
                }
}
