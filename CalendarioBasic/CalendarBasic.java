
/**
 * Write a description of class CalendarBasic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarBasic
{
    private int dia;
    private int mes;
    private int año;
    
    
    
    
    
    /**
     * Constructor for objects of class CalendarBasic
     */
    public void FijarFecha(int fijarDia,int fijarMes,int fijarAño)
    {
          dia = fijarDia;
          mes = fijarMes;
          año = fijarAño;
    }
    
    
     
    public CalendarBasic()
    {
        dia = 1;
        mes = 1;
        año = 1;
    
    }
    public void AvanzarFecha(){
        if (dia < 30){
          dia = dia + 1;
          mes = mes;
          año = año;
        }
        else {
            System.out.println("####Fecha introducida incorrecta####");
        }
        
      }
    }
   
    
    
 


     
    

