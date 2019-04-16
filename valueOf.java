public class valueOf{
	public static void main (String args[])
	{Console c = new Console();
	  c.println ("Ejemplo de uso de valueOf");
	  char value[]={'a','b','c','d','e','f','g'};
                 String str; 
                 str=String.valueOf(value); //str queda igual "abcdefg"
                 c.println(str);
                 }
}
