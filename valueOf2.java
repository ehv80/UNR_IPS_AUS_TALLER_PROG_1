public class valueOf2{
	public static void main (String args[])
	{Console c = new Console();
	  c.println ("Ejemplo de uso de valueOf");
	  char value[]={'a','b','c','d','e','f','g'};
                 String str; 
                 str=String.valueOf(value,2,4); //str queda igual "cdef"
                 c.println(str);
                 }
}
