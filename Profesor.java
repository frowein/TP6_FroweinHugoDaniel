
/**
 * Write a description of class Profesor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Profesor extends Persona{
private String titulo;
private Cargo[] cargos;

public Profesor(int p_dni, String p_nombre, String p_apellido, int p_anio, String p_titulo, Cargo[] p_cargos){
    super(p_dni, p_nombre, p_apellido, p_anio);
    this.setTitulo(p_titulo);
    this.setCargos(p_cargos);
}

public Profesor(int p_dni, String p_nombre, String p_apellido, int p_anio, String p_titulo, Cargo p_cargo){
    super(p_dni, p_nombre, p_apellido, p_anio);
    this.setTitulo(p_titulo);
    this.setCargos(new Cargo[3]);
    this.agregarCargo(p_cargo);
}

private void setTitulo(String p_titulo){
    this.titulo = p_titulo;
}

private void setCargos(Cargo[] p_cargos){
    this.cargos = p_cargos;
}

public String getTitulo(){
    return this.titulo;
}

public Cargo[] getCargos(){
    return this.cargos;
}

public void mostrar(){
    super.mostrar();
    System.out.println("Titulo: " + this.getTitulo());
    this.listarCargos();
    System.out.println("** Sueldo Total: " + this.sueldoTotal() + " **");
}

public void agregarCargo(Cargo p_cargo){
    if(this.getCargos().length < 3){
        this.getCargos()[this.getCargos().length] = p_cargo;
    }
}

public void listarCargos(){
    System.out.println("***** Cargos Asignados *****");
    for(Cargo i : this.getCargos()){
        i.mostrarCargo();
    }
}

public double sueldoTotal(){
    double total = 0;
    for(Cargo i : this.getCargos()){
        total = total + i.sueldoDelCargo();
    }
    return total;
}

public String mostrarLinea(){
    return "DNI:  " + super.getDNI() + " - Nombre: " + super.nomYApe() + " - Sueldo Total: " + this.sueldoTotal();
}
}