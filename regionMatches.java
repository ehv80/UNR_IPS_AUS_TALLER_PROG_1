public class regionMatches{
	public static void main (String args[])
	{Console c = new Console();
                 boolean valor;
	  c.println ("Ejemplo de uso de regionMatches");
                String str="Hola Mundo";
	 valor= str.regionMatches(5,"Mundial",0,4);// retorna true, pues se compara el string
                if (valor == true) 			        // str desde la posicion 5 con el string 
                      c.println("Substring concuerdan");	        // "Mundial",desde la posicion 0, tomando
                else					        // en cuenta los  4 primeros caracteres de
                      c.println("No calzan");		        // cada substring...luego "Mund"=="Mund"
                }
}
