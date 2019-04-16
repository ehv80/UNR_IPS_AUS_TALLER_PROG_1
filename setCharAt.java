public class setCharAt{
	public static void main (String args[])
	{ char i;
                 Console c;
                 c = new Console();
                 StringBuffer str3;
                 str3=new StringBuffer("hola");      
                 str3.setCharAt(0,'l');//str3 queda como "lola"
                 c.println(str3.toString());
                 }
}
