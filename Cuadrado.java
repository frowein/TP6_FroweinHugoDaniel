
/**
 * Write a description of class Cuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuadrado extends Rectangulo{
    public Cuadrado(Punto p_origen, double p_lado){
        super(p_origen, p_lado, p_lado);
    }
    
    public String nombreFigura(){
        return "****** Cuadrado ******";
    }
    
    public void caracteristicas(){
        System.out.println(this.nombreFigura());
        System.out.println("Origen: " + super.getOrigen().coordenadas() + " - Lado: " + super.getAlto());
	System.out.println("Superficie: " + super.superficie() + " - Perimetro: " + super.perimetro());
    }
}