
/**
 * Write a description of class Figura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Figura{
    public static void main(String [] args){
        Punto origen = new Punto(10.5, 5.10);
        Cuadrado figura1 = new Cuadrado(origen, 4.6);
        figura1.caracteristicas();
        Rectangulo figura2 = new Rectangulo(origen, 4.6, 4.6);
        figura2.caracteristicas();
        Circulo circulo = new Circulo(origen,15.6);
        circulo.caracteristicas();
        Elipse elipse = new Elipse(origen, 15.6, 6.15);
        elipse.caracteristicas();
    }
}