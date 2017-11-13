import java.util.Calendar;
import java.util.ArrayList;

public class Delegacion extends Visitante{
    private ArrayList<Individuo> integrantes;
    
    public Delegacion(String p_nombre, Calendar p_fecha, ArrayList<Individuo> p_integrantes){
        super(p_nombre,p_fecha);
        this.setIntegrantes(p_integrantes);
    }
    
    public Delegacion(String p_nombre, Calendar p_fecha, Individuo p_integrante){
        super(p_nombre,p_fecha);
        this.setIntegrantes(new ArrayList<Individuo>());
        this.inscribirIndividuo(p_integrante);
    }
    
    private void setIntegrantes(ArrayList<Individuo> p_integrantes){
        this.integrantes = p_integrantes;
    }
    
    public ArrayList<Individuo> getIntegrantes(){
        return this.integrantes;
    }
    
    public double entrada(){
        return (this.cantidadDeIntegrantes() * 10) - (((this.cantidadDeIntegrantes() * 10) * 10 )/100);
    }
    
    public void inscribirIndividuo(Individuo p_individuo){
        this.getIntegrantes().add(p_individuo);
    }
    
    public int cantidadDeIntegrantes(){
        return this.getIntegrantes().size();
    }
    
    public void mostrar(){
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("Delegacion: " + this.getNombre());
        System.out.println("\nIntegrantes");
        for(int i=0; i < this.cantidadDeIntegrantes(); i++){
            this.getIntegrantes().get(i).mostrar();
        }
        System.out.println("Cantidad de Integrantes: " + this.cantidadDeIntegrantes());
        System.out.println("--------------------------------------------------------------------------------------------------------");
    }
    
    public void listarPorFecha(Calendar p_fecha, String p_visitante){
        if(this.getFecha() == p_fecha && this.tipoVisitante() == p_visitante){
            this.mostrar();
        }
    }
    
    public String tipoVisitante(){
        return "Delegacion";
    }
}