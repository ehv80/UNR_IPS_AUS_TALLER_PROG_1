public class append{
	public static void main (String args[])
	{ char i;
                 Console c;
                 c = new Console();
                 c.println("Ejemplo de uso de append");
                 char valor[]={'a','b','c'};
                 char ch='O';
                 boolean f=true;
                 int a=1;
	  long b=3;
                 double g=7;
                 StringBuffer str3;
                 str3=new StringBuffer("hola");      
                 str3=str3.append(" Mundo");//str3 queda como "hola Mundo"
                 c.println(str3.toString());
                 str3=str3.append(valor);//str3 queda como "hola Mundoabc"
                 c.println(str3.toString());
                 str3=str3.append(ch);//str3 queda como "hola MundoabcO"
                 c.println(str3.toString());
                 str3=str3.append(f);//str3 queda como "hola MundoabcOtrue"
                 c.println(str3.toString());
     	  str3=str3.append(a);//str3 queda como "hola MundoabcOtrue1"
                 c.println(str3.toString());
	  str3=str3.append(b);//str3 queda como "hola MundoabcOtrue13"
                 c.println(str3.toString());
	  str3=str3.append(g);//str3 queda como "hola MundoabcOtrue137.0"
                 c.println(str3.toString());
	  str3=str3.append(valor,0,1);//str3 queda como "hola MundoabcOtrue137.0a"
                 c.println(str3.toString());
                 }
}
