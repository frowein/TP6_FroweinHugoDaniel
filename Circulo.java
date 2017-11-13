
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo extends Elipse{
    public Circulo(Punto p_origen,double p_radio){
        super(p_origen, p_radio, p_radio);
    }
    
    public String nombreFigura(){
        return "******Circulo******";
    }
}