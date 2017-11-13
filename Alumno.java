
/**
 * Ejercicio 4
 * 
 * @author Frowein Hugo Daniel
 * 
 */
public class Alumno extends Persona{
    private int lu;
    private double nota1;
    private double nota2;

    /**
    * El constructor recibe 3 datos por parametro para despues utilizar los mutadores
    * para asignar a los atributos.
    * 
    * @param p_lu numero de libreta universitaria de tipo int
    * @param p_nombre nombre de tipo String
    * @param p_apellido apellido de tipo String   
    */
    public Alumno(int p_lu, String p_nombre, String p_apellido, int p_dni, int p_anio){
        super(p_dni,p_nombre,p_apellido,p_anio);
        this.setLU(p_lu);
    }

    //Inicio de los mutadores
    private void setLU(int p_lu){
        this.lu = p_lu;
    }
 
    public void setNota1(double p_nota1){
        this.nota1 = p_nota1;
    }

    public void setNota2(double p_nota2){
        this.nota2 = p_nota2;
    }
    //Fin de los mutadores
    
    //Inicio de los observadores
    public int getLU(){
        return this.lu;
    }

    public double getNota1(){
        return this.nota1;
    }

    public double getNota2(){
        return this.nota2;
    }
    //Fin de los observadores
    
    /**
     * El metodo aprueba calcula si las 2 notas son mayores a 6 y el promedio
     * sea mayor o igual a 7 retornara true en el caso contrario false
     * 
     * @return Verdadero o Falso
     */
    private boolean aprueba(){
        if(this.getNota1() >= 6 && this.getNota2() >= 6){
            if(this.promedio() >= 7){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    /**
     * El metodo leyenda aprueba verifica si el metodo aprueba retorna
     * verdadero el falso y segun el caso retorna la leyenda APROBADO o DESAPROBADO
     * de tipo String.
     * 
     * @return String "APROBADO" o "DESAPROBADO"
     */
    private String leyendaAprueba(){
        if(this.aprueba()){
            return "APROBADO";
        }else{
            return "DESAPROBADO";
        }
    }

    /**
     * El metodo promedio calcula el promedio de las dos notas ingresadas
     * y devuelve un valor de tipo double
     * 
     * @param promedio de tipo double
     */
    public double promedio(){
        return (this.getNota1() + this.getNota2()) / 2;
    }

    /**
     * El metodo nomYApe junta en un dato de tipo String al nombre y luego al apellido
     * 
     * @return retorna un String con el nombre y luego el apellido
     */
    public String nomYApe(){
        return (this.getNombre() + " " + this.getApellido());
    }

    /**
     * El metodo apeYNom junta en un dato de tipo String al apellido y luego al nombre
     * 
     * @return retorna un String con el apellido y luego el nombre 
     */
    public String apeYNom(){
        return (this.getApellido() + " " + this.getNombre());
    }

    /**
     * El metodo mostrar imprime por pantalla los valore s de nombre apellido, numero
     * de libreta universitaria, nota1, nota2, promedio, y la leyenda de si aprueba o no.
     */
    public void mostrar(){
        super.mostrar();
        System.out.println("LU: "+ this.getLU() + "\tNotas: " + this.getNota1() + " - " + this.getNota2()) ;
        System.out.println("Promedio: " + promedio() + " " + leyendaAprueba());
    }
}