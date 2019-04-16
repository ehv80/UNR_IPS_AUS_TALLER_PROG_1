//: c03:LimitesAleatorios.java
// ¿Produce Math.random() 0.0 y 1.0?

public class LimitesAleatorios
{
 static void uso()
 {
  System.out.println("Utilización: \n\t" + 
	"LimitesAleatorios inferior\n\t" +
	"LimitesAleatorios superior");
  System.exit(1);
 }
 public static void main(String[] args)
 {
  if( args.length != 1 ) uso();
  if( args[0].equals( "inferior" ) )
  {
   while( Math.random() != 0.0 )
    ; // seguir intentándolo
   System.out.println( "Produjo 0.0!" );
  }
  else if( args[0].equals( "superior" ) ) 
  {
   while( Math.random() != 1.0 )
    ; // seguir intentándolo
    System.out.println( "Produjo 1.0!" );
  }
  else
  {
   uso();
  }
 }
}
