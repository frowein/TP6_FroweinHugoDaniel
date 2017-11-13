
/**
 * Write a description of class Exclusivo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exclusivo extends Cargo{
private int horasDeInvestigacion;
private int horasDeExtencion;

public Exclusivo(String p_nombre, double p_sueldo, int p_anio, int p_horas, int p_horasInv, int p_horasExt){
super(p_nombre,p_sueldo,p_anio,p_horas);
this.setHorasInv(p_horasInv);
this.setHorasExt(p_horasExt);
}

private void setHorasInv(int p_horasInv){
    this.horasDeInvestigacion = p_horasInv;
}

private void setHorasExt(int p_horasExt){
    this.horasDeExtencion = p_horasExt;
}

public int getHorasInv(){
    return this.horasDeInvestigacion;
}

public int getHorasExt(){
    return this.horasDeExtencion;
}

public void mostrarCargo(){
    super.mostrarCargo();
    System.out.println("----Cargo de caracter Exclusivo----" + 
                       "\nHoras investigación: " + this.getHorasInv() +
                       "\nHoras extension: " + this.getHorasExt());
}
}