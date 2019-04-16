public class valueOf3{
	public static void main (String args[])
	{Console c = new Console();
	  c.println ("Ejemplo de uso de valueOf");
	  int i=65;
                 float j=590;
                 double l=1E10;
                 String str; 
                 str=String.valueOf(i); //str queda igual "65"
                 c.println(str);
                 str=String.valueOf(j); //str queda igual "590.0"
                 c.println(str);
                 str=String.valueOf(l); //str queda igual "1E10"
                 c.println(str);
                 }
}
