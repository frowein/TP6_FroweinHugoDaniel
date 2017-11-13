import java.util.ArrayList;

public abstract class Alojamiento{
    private String nombre;
    private double precioBase;
    private int diasAlquiler;
    private ArrayList<Servicio> servicios;

    public Alojamiento(String p_nombre, double p_precio, int p_dias, ArrayList<Servicio> p_servicios){
        this.setNombre(p_nombre);
        this.setPrecio(p_precio);
        this.setDias(p_dias);
        this.setServicios(p_servicios);
    }

    public Alojamiento(String p_nombre, double p_precio, int p_dias, Servicio p_servicio){
        this.setNombre(p_nombre);
        this.setPrecio(p_precio);
        this.setDias(p_dias);
        this.setServicios(new ArrayList<Servicio>());
        this.agregarServicio(p_servicio);
    }

    public Alojamiento(String p_nombre, double p_precio, int p_dias){
        this.setNombre(p_nombre);
        this.setPrecio(p_precio);
        this.setDias(p_dias);
        this.setServicios(new ArrayList<Servicio>());
    }

    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    private void setPrecio(double p_precio){
        this.precioBase = p_precio;
    }

    private void setDias(int p_dias){
        this.diasAlquiler = p_dias;
    }

    private void setServicios(ArrayList<Servicio> p_servicios){
        this.servicios = p_servicios;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getPrecio(){
        return this.precioBase;
    }

    public int getDias(){
        return this.diasAlquiler;
    }

    public ArrayList<Servicio> getServicios(){
        return this.servicios;
    }

    public boolean agregarServicio(Servicio p_servicio){
        return this.getServicios().add(p_servicio);
    }

    public boolean quitarServicio(Servicio p_servicio){
        return this.getServicios().add(p_servicio);
    }

    public abstract int contar(String p_alojamiento);

    public double costo(){
        return this.getPrecio() * this.getDias();
    }

    public void listarServicios(){
        for(int i = 0; i < this.getServicios().size(); i++){
            System.out.println(this.getServicios().get(i).getDescripcion() + ": $" + 
                               this.getServicios().get(i).getPrecio());
        }
    }

    public double costoServicios(){
        double total = 0.0;
        for(int i = 0; i < this.getServicios().size(); i++){
            total = total + this.getServicios().get(i).getPrecio();
        }
        return total;
    }

    public void liquidar(){
        System.out.println("Alojamiento: " + this.getNombre());
        System.out.println("Costo por " + this.getDias() + " dias: $" + this.costo());
        this.listarServicios();
    }
}