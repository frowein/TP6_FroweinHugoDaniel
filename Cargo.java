import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Write a description of class Cargo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cargo{
    private String nombreCargo;
    private double sueldoBasico;
    private int anioIngreso;
    private int horasDeDocencia;

    public Cargo(String p_nombre, double p_sueldo, int p_anio, int p_horas){
        this.setNombre(p_nombre);
        this.setSueldo(p_sueldo);
        this.setAnio(p_anio);
        this.setHoras(p_horas);
    }
    
    private void setNombre(String p_nombre){
        this.nombreCargo = p_nombre;
    }
    
    private void setSueldo(double p_sueldo){
        this.sueldoBasico = p_sueldo;
    }
    
    private void setAnio(int p_anio){
        this.anioIngreso = p_anio;
    }
    
    private void setHoras(int p_horas){
        this.horasDeDocencia = p_horas;
    }
    
    public String getNombre(){
        return this.nombreCargo;
    }
    
    public double getSueldo(){
        return this.sueldoBasico;
    }
    
    public int getAnio(){
        return this.anioIngreso;
    }
    
    public int getHoras(){
        return this.horasDeDocencia;
    }
    
    public int antiguedad(){
        Calendar hoy = new GregorianCalendar();
        return hoy.get(Calendar.YEAR) - this.getAnio();
    }
    
    private double adicionalXAntiguedad(){
        return (this.getSueldo() * (this.getAnio() * 1)) / 100;
    }
    
    public double sueldoDelCargo(){
        return this.getSueldo() + this.adicionalXAntiguedad();
    }
    
    public void mostrarCargo(){
        System.out.println(this.getNombre() + " - Sueldo Basico: " + this.getSueldo() + " - Sueldo Cargo: " 
                            + this.sueldoDelCargo() + " – Antiguedad: " + this.getAnio() + " años" 
                            + "\tHoras Docencia: " + this.getHoras());
    }
}   