import java.util.Calendar;

public abstract class Visitante{
    private String nombre;
    private Calendar fechaVisita;
    
    public Visitante(String p_nombre, Calendar p_fecha){
        this.setNombre(p_nombre);
        this.setFecha(p_fecha);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setFecha(Calendar p_fecha){
        this.fechaVisita = p_fecha;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Calendar getFecha(){
        return this.fechaVisita;
    }
    
    public abstract void mostrar();
    
    public abstract double entrada();
    
    public abstract void listarPorFecha(Calendar p_fecha, String p_visitante);
    
    public abstract String tipoVisitante();
}