import java.util.ArrayList;

public class Hotel extends Alojamiento{
    private String tipoHabitacion;

    public Hotel(String p_nombre, double p_precio, int p_dias, String p_tipo){
        super(p_nombre,p_precio,p_dias);
        this.setTipo(p_tipo);
    }

    public Hotel(String p_nombre, double p_precio, int p_dias, Servicio p_servicio, String p_tipo){
        super(p_nombre, p_precio, p_dias, p_servicio);
        this.setTipo(p_tipo);
    }

    public Hotel(String p_nombre, double p_precio, int p_dias, ArrayList<Servicio> p_servicios, String p_tipo){
        super(p_nombre, p_precio, p_dias, p_servicios);
        this.setTipo(p_tipo);
    }

    private void setTipo(String p_tipo){
        this.tipoHabitacion = p_tipo;
    }

    public String getTipo(){
        return this.tipoHabitacion;
    }

    public double costo(){
        if(this.getTipo().equals("Single")){
            return (this.getPrecio() + 20) * this.getDias();
        }else{
            return (this.getPrecio() + 35) * this.getDias();
        }
    }

    public int contar(String p_alojamiento){
        if(p_alojamiento.equals("Hotel")){
            return 1;
        }else{
            return 0;
        }
    }

    public void liquidar(){
        super.liquidar();
        System.out.println("Habitacion " + this.getTipo());
        System.out.println("Total: ------> $" + this.costo());
    }
}