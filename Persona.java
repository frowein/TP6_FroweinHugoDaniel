import java.util.*;
/**
 * Clase Persona
 * @author Frowein Hugo Daniel 
 */
public class Persona{
    private int nroDni;
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento;
    
    /**
    * El constructor recibe 4 datos por parametro para despues utilizar los mutadores
    * para asignar a los atributos
    * 
    * @param p_dni numero de documento
    * @param p_nombre nombre
    * @param p_apellido apellido
    * @param p_anio año de nacimiento
    */
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio){
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }
	
	/**
    * El constructor de la clase Persona ahora recibe un dato de tipo Calendar
    * 
    * @param p_dni numero de documento
    * @param p_nombre nombre
    * @param p_apellido apellido
    * @param p_fecha dato de tipo Calendar
    */
	public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_fecha){
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_fecha);
    }

    //Inicio de los mutadores
    private void setDNI(int p_dni){
        this.nroDni = p_dni;
    }

    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }

    private void setAnioNacimiento(int p_anio){
        Calendar anioNacimiento = new GregorianCalendar();
		anioNacimiento.set(p_anio,0,1);
		this.fechaNacimiento = anioNacimiento;
    }
	
	private void setFechaNacimiento(Calendar p_fecha){
		this.fechaNacimiento = p_fecha;
	}
    //Fin de los mutadores
    
    //Inicio de los observadores
    public int getDNI(){
        return this.nroDni;
    }

    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public int getAnioNacimiento(){
        return this.fechaNacimiento.get(Calendar.YEAR);
    }
    //Fin de los observadores
    
    /**
     * El metodo calcula la edad de la persona restando el año actual
     * menos el año de nacimiento.
     * 
     * @return retorna la edad de tipo int
     */
    public int edad(){
       Calendar fechaHoy = new GregorianCalendar();
       int year = fechaHoy.get(Calendar.YEAR);
       return year - this.getAnioNacimiento();
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
     * El metodo mostrar imprime los datos de nombre y apellido, numero de documento y edad.
     */
    public void mostrar(){
        System.out.println("Nombre y apellido: " + this.nomYApe());
        System.out.println("DNI: " + this.getDNI() + "\tEdad: " + this.edad());
    }
}