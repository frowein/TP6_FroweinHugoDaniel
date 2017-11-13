
/**
 * Write a description of class SemiExclusivo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SemiExclusivo extends Cargo{
private int horasDeInvestigacion;

public SemiExclusivo(String p_nombre, double p_sueldo, int p_anio, int p_horas, int p_horasInv){
super(p_nombre,p_sueldo,p_anio,p_horas);
this.setHorasInv(p_horasInv);
}

private void setHorasInv(int p_horasInv){
    this.horasDeInvestigacion = p_horasInv;
}

public int getHorasInv(){
    return this.horasDeInvestigacion;
}

public void mostrarCargo(){
    super.mostrarCargo();
    System.out.println("----Cargo de caracter SemiExclusivo----\nHoras investigación: " + this.getHorasInv());
}
}