import java.util.ArrayList;

public class Gerencia{
    private String nombre;
    private ArrayList<Alojamiento> alojamientosAlquilados;
    
    public Gerencia(String p_nombre, ArrayList<Alojamiento> p_alojamientos){
        this.setNombre(p_nombre);
        this.setAlojamientos(p_alojamientos);
    }
    
    public Gerencia(String p_nombre, Alojamiento p_alojamiento){
        this.setNombre(p_nombre);
        this.setAlojamientos(new ArrayList<Alojamiento>());
        this.agregarAlojamiento(p_alojamiento);
    }
    
    public Gerencia(String p_nombre){
        this.setNombre(p_nombre);
        this.setAlojamientos(new ArrayList<Alojamiento>());
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setAlojamientos(ArrayList<Alojamiento> p_alojamientos){
        this.alojamientosAlquilados = p_alojamientos;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public ArrayList<Alojamiento> getAlojamientos(){
        return this.alojamientosAlquilados;
    }
    
    public boolean agregarAlojamiento(Alojamiento p_alojamiento){
        return this.getAlojamientos().add(p_alojamiento);
    }
    
    public boolean quitarAlojamiento(Alojamiento p_alojamiento){
        return this.getAlojamientos().remove(p_alojamiento);
    }
    
    public int contarAlojamiento(String tipoAlojamiento){
        int total = 0;
        for(int i=0; i < this.getAlojamientos().size(); i++){
            total = total + this.getAlojamientos().get(i).contar(tipoAlojamiento);
        }
        return total;
    }
    
    public void liquidar(){
        for(int i=0; i < this.getAlojamientos().size(); i++){
            this.getAlojamientos().get(i).liquidar();
        }
    }
    
    public void mostrarLiquidacion(){
        System.out.println("Gerencia " + this.getNombre());
        System.out.println("Liquidacion------------------- \n");
        this.liquidar();
        System.out.println("\nAlojamiento tipo Cabaña ---->" + this.contarAlojamiento("Cabaña"));
        System.out.println("Alojamiento tipo Hotel ------->" + this.contarAlojamiento("Hotel"));
    }
}