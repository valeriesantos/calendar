
/**
 * Write a description of class CalendarBasic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarBasic
{
    private DisplayDosDigitos dia;
    private DisplayDosDigitos mes;
    private DisplayDosDigitos anio;
    
    
    
    
    
    /**
     * Constructor for objects of class CalendarBasic
     */
        public CalendarBasic()
    {
        dia = new DisplayDosDigitos(31);
        mes = new DisplayDosDigitos(13);
        anio = new DisplayDosDigitos(100);
    }
    
    public void fijarFecha(int nuevoDia,int nuevoMes,int nuevoAnio)
    {
        dia.setValor(nuevoDia);
        mes.setValor(nuevoMes);
        anio.setValor(nuevoAnio);
    }

    public void avanzarFecha()
    {
        dia.incrementaValor();
        if(dia.getValor() == 1){
            //Si estamos aqui es que hay que hacer avanzar el mes.
            mes.incrementaValor();
            if(mes.getValor() == 1){
                //Si estamos awui hay que hacer avanzar el año.
                 anio.incrementaValor();
            } 
        }
    }
    
   public String mostrarFecha(){
       return dia.getValorDelDisplay() + "-" + mes.getValorDelDisplay() + "-" + anio.getValorDelDisplay();
       
    }
}
    
    
    
    
    




    
 


     
    

