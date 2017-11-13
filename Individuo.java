import java.util.Calendar;

/**
 * Write a description of class Individuo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Individuo extends Visitante{
    private Persona persona;
    
    public Individuo(Calendar p_fecha, Persona p_persona){
        super(p_persona.nomYApe(),p_fecha);
        this.setPersona(p_persona);
    }
    
    private void setPersona(Persona p_persona){
        this.persona = p_persona;
    }
    
    public Persona getPersona(){
        return this.persona;
    }
    
    public double entrada(){
        return 10.0;
    }
    
    public void mostrar(){
        this.getPersona().mostrar();
    }
    
    public void listarPorFecha(Calendar p_fecha, String p_visitante){
        if(this.getFecha() == p_fecha && this.tipoVisitante() == p_visitante){
            this.mostrar();
        }
    }
    
    public String tipoVisitante(){
        return "Individuo";
    }
}