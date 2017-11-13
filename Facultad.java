import java.util.ArrayList;
/**
 * Write a description of class Facultad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Facultad{
private String nombre;
private ArrayList<Profesor> profesores;

public Facultad(String p_nombre, ArrayList<Profesor> p_profesores){
    this.setNombre(p_nombre);
    this.setProfesores(p_profesores);
}

public Facultad(String p_nombre, Profesor p_profesor){
    this.setNombre(p_nombre);
    this.setProfesores(new ArrayList<Profesor>());
    this.agregarProfesor(p_profesor);
}

public boolean agregarProfesor(Profesor p_profesor){
    return this.getProfesores().add(p_profesor);
}

private void setNombre(String p_nombre){
    this.nombre = p_nombre;
}

private void setProfesores(ArrayList p_profesores){
    this.profesores = p_profesores;
}

public String getNombre(){
    return this.nombre;
}

public ArrayList<Profesor> getProfesores(){
    return this.profesores;
}

public void nominaProfesores(){
    System.out.println("*************** Nómina Facultad: " + this.getNombre());
    System.out.println("------------------------------------------------------------------");
    for(int i = 0; i< this.getProfesores().size(); i++){
        System.out.println(this.getProfesores().get(i).mostrarLinea());
    }
    System.out.println("------------------------------------------------------------------");
    System.out.println("Total a pagar: " + this.totalAPagar());
}

public void listarProfesorCargos(){
    System.out.println("***** Detalle de Profesores y cargos de Facultad: FaCENA *****");
    System.out.println("--------------------------------------------------------------------------------");
    for(int i = 0; i< this.getProfesores().size(); i++){
        this.getProfesores().get(i).mostrar();
        if(i != this.getProfesores().size() - 1){
            System.out.println("------------------ **** -------------------");
        }
    }
    System.out.println("-------------------------------------------------------------------");
    System.out.println("Hay " + this.getProfesores().size() + " Profesores");
}

public double totalAPagar(){
    double total = 0;
    for(int i = 0; i< this.getProfesores().size(); i++){
        total = total + this.getProfesores().get(i).sueldoTotal();
    }
    return total;
}
 
}