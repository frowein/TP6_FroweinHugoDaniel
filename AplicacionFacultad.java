
/**
 * Write a description of class AplicacionFacultad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AplicacionFacultad{
    public static void main(String [] args){
        Cargo simple = new Cargo("Simple",10000.0,2010,8);
        SemiExclusivo semiExclusivo = new SemiExclusivo("Semi Exclusivo",15000.0,2011,9,10);
        Exclusivo exclusivo = new Exclusivo("Exclusivo",20000.0,2012,10,11,20);
        Cargo uno[] = {simple};
        Cargo dos[] = {simple, semiExclusivo};
        Cargo tres[] = {simple,semiExclusivo, exclusivo};
        Profesor prof1 = new Profesor(38316259, "Hugo", "Frowein", 1994, "Pelotudo", uno);
        Profesor prof2 = new Profesor(29349059, "Miguel", "Torrez", 1980, "Doctor", dos);
        //prof2.agregarCargo(semiExclusivo);
        Profesor prof3 = new Profesor(34498332, "Juan", "Perez", 1995, "Licenciado", tres);
        //prof3.agregarCargo(simple);
        //prof3.agregarCargo(exclusivo);
        Facultad unne = new Facultad("Unne", prof1);
        unne.agregarProfesor(prof2);
        unne.agregarProfesor(prof3);
        unne.nominaProfesores();
        unne.listarProfesorCargos();
    }
}