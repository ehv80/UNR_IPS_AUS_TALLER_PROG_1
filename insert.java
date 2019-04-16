public class insert{
	public static void main (String args[])
	{ char i;
                 Console c;
                 c = new Console();
                 c.println("Ejemplo de uso de insert");
                 char valor[]={'a','b','c'};
                 char ch='O';
                 boolean f=true;
                 int a=1;
	  long b=3;
                 double g=7;
                 StringBuffer str3;
                 str3=new StringBuffer("hola");      
                 str3=str3.insert(2,"Mundo");//str3 queda como "hoMundola"
                 c.println(str3.toString());
                 str3=str3.insert(0,valor);//str3 queda como "abchoMundola"
                 c.println(str3.toString());
                 str3=str3.insert(3,ch);//str3 queda como "abcOhoMundola"
                 c.println(str3.toString());
                 str3=str3.insert(0,f);//str3 queda como "trueabcOhoMundola"
                 c.println(str3.toString());
     	  str3=str3.insert(1,a);//str3 queda como "t1rueabcOhoMundola"
                 c.println(str3.toString());
	  str3=str3.insert(1,b);//str3 queda como "t31rueabcOhoMundola"
                 c.println(str3.toString());
	  str3=str3.insert(1,g);//str3 queda como "t7.031rueabcOhoMundola"
                 c.println(str3.toString());
                 }
}
