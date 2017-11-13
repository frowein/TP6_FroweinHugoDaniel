import java.util.ArrayList;
/**
 * Write a description of class Jardin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jardin{
    private String nombre;
    private ArrayList<FiguraGeometrica> figuras;
    
    public Jardin(String p_nombre, ArrayList<FiguraGeometrica> p_figuras){
        this.setNombre(p_nombre);
        this.setFiguras(p_figuras);
    }
    
    public Jardin(String p_nombre, FiguraGeometrica p_figura){
        this.setNombre(p_nombre);
        this.setFiguras(new ArrayList<FiguraGeometrica>());
        this.agregarFigura(p_figura);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setFiguras(ArrayList<FiguraGeometrica> p_figuras){
        this.figuras = p_figuras;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public ArrayList<FiguraGeometrica> getFiguras(){
        return this.figuras;
    }
    
    public boolean agregarFigura(FiguraGeometrica p_figura){
        return this.getFiguras().add(p_figura);
    }
    
    public boolean quitarFigura(FiguraGeometrica p_figura){
        return this.getFiguras().remove(p_figura);
    }
    
    private double cuantosLitros(){
        return this.cuantosMetros() / 5;
    }
    
    public int cuantasLatas(){
        return (int)(this.cuantosLitros() / 4);
    }
    
    public double cuantosMetros(){
        double metros = 0.0;
        for(int i = 0; i < this.getFiguras().size(); i++){
            metros = metros + this.getFiguras().get(i).superficie();
        }
        return metros; 
    }
    
    public void detalleFiguras(){
        for(int i = 0; i < this.getFiguras().size(); i++){
            this.getFiguras().get(i).mostrarSuperficie();
        }
        System.out.println("----------------------------------");
        System.out.println("Total a cubrir: " + this.cuantosMetros());
        System.out.println("Comprar " + this.cuantasLatas() + " latas");
    }
}