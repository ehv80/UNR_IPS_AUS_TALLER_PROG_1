public class reverse{
	public static void main (String args[])
	{ char i;
                 Console c;
                 c = new Console();
                 c.println("Ejemplo de uso de reverse");
                 StringBuffer str3;
                 str3=new StringBuffer("hola");      
                 str3=str3.reverse();//str3 queda como "aloh"
                 c.println(str3.toString());
                 }
}
