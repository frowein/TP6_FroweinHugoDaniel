import java.util.ArrayList;
import java.util.Calendar;

public class Zoologico{
    private String nombre;
    private ArrayList<Visitante> visitantes;
    
    public Zoologico(String p_nombre, ArrayList<Visitante> p_visitantes){
        this.setNombre(p_nombre);
        this.setVisitantes(p_visitantes);
    }
    
    public Zoologico(String p_nombre, Visitante p_visitante){
        this.setNombre(p_nombre);
        this.setVisitantes(new ArrayList<Visitante>());
        this.nuevoVisitante(p_visitante);
    }
    
    public Zoologico(String p_nombre){
        this.setNombre(p_nombre);
        this.setVisitantes(new ArrayList<Visitante>());
    }
   
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setVisitantes(ArrayList<Visitante> p_visitantes){
        this.visitantes = p_visitantes;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public ArrayList<Visitante> getVisitantes(){
        return this.visitantes;
    }
    
    public void nuevoVisitante(Visitante p_visitante){
        this.getVisitantes().add(p_visitante);
    }
    
    public void listaTipoVisitantePorFecha(Calendar p_fecha, String p_tipoVisitante){
        for(int i=0; i < this.getVisitantes().size(); i++){
            this.getVisitantes().get(i).listarPorFecha(p_fecha,p_tipoVisitante);
        }
    }
    
    public void listaVisitantePorFecha(Calendar p_fecha){
        for(int i=0; i < this.getVisitantes().size(); i++){
            this.getVisitantes().get(i).listarPorFecha(p_fecha,this.getVisitantes().get(i).tipoVisitante());
        }
    }
    
    public double recaudacion(Calendar p_fechaDesde, Calendar p_fechaHasta){
        double total = 0.0;
        do{
            for(int i=0; i < this.getVisitantes().size(); i++){
                if(this.getVisitantes().get(i).getFecha() == p_fechaDesde){
                    total = total + this.getVisitantes().get(i).entrada();
                }
            }
            p_fechaDesde.add(Calendar.DAY_OF_YEAR,1);
        }while(p_fechaDesde == p_fechaHasta);
        return total;
    }
}