public class charAt{
	public static void main (String args[])
	{ char i;
                 Console c;
                 c = new Console();
                 StringBuffer str3;
                 str3=new StringBuffer("hola");      
                 i=str3.charAt(2);//retorna 'l'
                 c.println(i);
                 i=str3.charAt(0);//retorna 'h'
                 c.println(i);
                 }
}
