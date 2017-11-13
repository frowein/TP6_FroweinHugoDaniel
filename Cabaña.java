import java.util.ArrayList;

public class Cabaña extends Alojamiento{
    private int nroHabitaciones;
    
    public Cabaña(String p_nombre, double p_precio, int p_dias, int p_habitaciones){
        super(p_nombre,p_precio,p_dias);
        this.setHabitaciones(p_habitaciones);
    }

    public Cabaña(String p_nombre, double p_precio, int p_dias, Servicio p_servicio, int p_habitaciones){
        super(p_nombre, p_precio, p_dias, p_servicio);
        this.setHabitaciones(p_habitaciones);
    }

    public Cabaña(String p_nombre, double p_precio, int p_dias, ArrayList<Servicio> p_servicios, int p_habitaciones){
        super(p_nombre, p_precio, p_dias, p_servicios);
        this.setHabitaciones(p_habitaciones);
    }
    
    private void setHabitaciones(int p_habitaciones){
        this.nroHabitaciones = p_habitaciones;
    }
    
    public int getHabitaciones(){
        return this.nroHabitaciones;
    }
    
    public double costo(){
        return this.getDias() * (this.getPrecio() + (this.getHabitaciones() * 30));
    }
    
    public int contar(String p_alojamiento){
        if(p_alojamiento.equals("Cabaña")){
            return 1;
        }else{
            return 0;
        }
    }
    
    public void liquidar(){
        super.liquidar();
        System.out.println("Cabaña con " + this.getHabitaciones() + " habitaciones");
        System.out.println("Total: ------> $" + this.costo());
    }
}