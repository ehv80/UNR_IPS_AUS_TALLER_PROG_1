public class Ej4
{
 private int hora;
 
 public void MostrarParteDia( int hora )
 {
  if( hora >= 800 && hora <= 1300 )
   System.out.println( "Es la MAÑANA" );
  else if( hora >= 1301 && hora <= 2000 )
        System.out.println( "Es la TARDE" );
       else if( hora >= 2001 && hora <= 2400 )
             System.out.println( "Es la NOCHE" );
            else if( hora >= 1 && hora <= 759 )
                  System.out.println( "Es la MADRUGADA" );
 }

 public void MostrarNumDiaMes( int mes )
 {
  switch( mes )
  { case 1:
	   System.out.println("ENERO tiene 31 días");
	   break;
    case 2:
	   System.out.println("FEBRERO tiene 28 días");
	   break;
    case 3:
	   System.out.println("MARZO tiene 31 días");
	   break;
    case 4:
	   System.out.println("ABRIL tiene 30 días");
	   break;
    case 5:
	   System.out.println("MAYO tiene 31 días");
	   break;
    case 6:
	   System.out.println("JUNIO tiene 30 días");
           break;
    case 7:
	   System.out.println("JULIO tiene 31 días");
           break;
    case 8:
	   System.out.println("AGOSTO tiene 31 días");
           break;
    case 9:
	   System.out.println("SEPTIEMBRE tiene 30 días");
           break;
    case 10:
	   System.out.println("OCTUBRE tiene 31 días");
           break;
    case 11:
	   System.out.println("NOVIEMBRE tiene 30 días");
           break;
    case 12:
	   System.out.println("DICIEMBRE tiene 31 días");
           break;
    default:
	   System.out.println("DEBE INGRESAR UN NÚMERO ENTRE 1 Y 12 PARA INDICAR EL MES");
           break;
  }
 }
}
