import java.util.*;
/**
 * Ejercicio 5
 * 
 * @author Frowein Hugo Daniel
 */
public class Empleado extends Persona{
    private long cuil;
    private double sueldoBasico;
    private Calendar fechaIngreso;

    /**
    * El constructor recibe 5 datos por parametro para despues utilizar los mutadores
    * para asignar a los atributos.
    * 
    * @param p_cuil numero de cuil de tipo long
    * @param p_apellido apellido de tipo String
    * @param p_nombre nombre de tipo String  
    * @param p_importe importe de tipo double
    * @param p_anio año de ingreso de tipo int
    */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_ingreso, int p_dni, int p_anio){
        super(p_dni,p_nombre,p_apellido,p_anio);
        this.setCuil(p_cuil);
        this.setAnio(p_ingreso);
        this.setSueldoBasico(p_importe);
    }

	/**
    * El constructor recibe 5 datos por parametro para despues utilizar los mutadores
    * para asignar a los atributos.
    * 
    * @param p_cuil numero de cuil de tipo long
    * @param p_apellido apellido de tipo String
    * @param p_nombre nombre de tipo String  
    * @param p_importe importe de tipo double
    * @param p_fecha fecha de tipo Calendar
    */
	public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha, int p_dni, int p_anio){
        super(p_dni,p_nombre,p_apellido,p_anio);
	this.setCuil(p_cuil);
        this.setFecha(p_fecha);
        this.setSueldoBasico(p_importe);
	}
	
    //Inicio de los mutadores
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }

    private void setAnio(int p_anio){
		Calendar anioIngreso = new GregorianCalendar();
		anioIngreso.set(p_anio,0,1);
        this.fechaIngreso = anioIngreso;
    }

    private void setSueldoBasico(double p_importe){
        this.sueldoBasico = p_importe;
    }
	
	private void setFecha(Calendar p_fecha){
		this.fechaIngreso = p_fecha;
	}
    //Fin de los mutadores
    
    //Inicio de los observadores
    public long getCuil(){
        return this.cuil;
    }

    public int getAnio(){
        return this.getFecha().get(Calendar.YEAR);
    }

    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
	
	public Calendar getFecha(){
		return this.fechaIngreso;
	}
    //Fin de los observadores
    
    //Agrego un metodo mas para obtener de manera mas prolija y ordenada el año actual.
    public Calendar date(){
        Calendar fechaHoy = new GregorianCalendar();
        return fechaHoy;
    }

    /**
     * El metodo antiguedad determina los años de antiguedad calculando
     * el año actual menos el año de ingreso
     * 
     * @return Año de antuguedad de tipo int
     */
    public int antiguedad(){
        return this.date().get(Calendar.YEAR) - this.getAnio();
    }
    
    /**
     * El metodo descuento retorna el 2% del sueldo basico mas 12
     * 
     * @return descuento del 2% + 12
     */
    private double descuento(){
        return ((2 * this.getSueldoBasico()) / 100) + 12;
    }
    
    /**
     * El metodo adicional calcula un monto adicional segun la antiguedad
     * 
     * @return un porcentaje adicional del sueldo basico
     */
    private double adicional(){
        if(this.getAnio() < 2){
            return (2 * this.getSueldoBasico()) / 100;    
        }else  if(getAnio() >= 2 && getAnio() < 10){
            return (4 * this.getSueldoBasico()) / 100;
        }else{
            return (6 * this.getSueldoBasico()) / 100;
        }
    }
    
    
    /**
     * El metodo sueldo neto devulve la suma del sueldo basico mas el adicional menos el descuento
     * 
     * @return Retorna el sueldo neto
     */
    public double sueldoNeto(){
        return (this.getSueldoBasico() + this.adicional()) - this.descuento();
    }
    
    /**
     * El metodo nomYApe junta en un dato de tipo String al nombre y luego al apellido
     * 
     * @return retorna un String con el nombre y luego el apellido
     */
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }
    
    /**
     * El metodo apeYNom junta en un dato de tipo String al apellido y luego al nombre
     * 
     * @return retorna un String con el apellido y luego el nombre 
     */
    public String apeYNom(){
        return this.getApellido() + ", " + this.getNombre();
    }
    
    /**
     * El metodo mostrar imprime por pantalla los datos de nombre, apellido, numero
     * de cuil, antiguedad y sueldo neto.
     */
    public void mostrar(){
        super.mostrar();
        System.out.println("CUIL: " + this.getCuil() + " Antigüedad: " + this.antiguedad() + " años de servicio");
        System.out.println("Sueldo Neto: $" + this.sueldoNeto());
    }
    
    /**
     * El metodo mostrar linea junta los datos de numero de cuil, apellido, nombre y
     * sueldo neto en un dato de tipo String
     * }
     * @return datos del empleado
     */
    public String mostrarLinea(){
        return this.getCuil() + "\t" + super.apeYNom() + " .............. $" + this.sueldoNeto();
    }
    
	/**
	*El metodo esAniversario verifica si en el dia actual se cumple el aniversario
	*@return true or false
	*/
	public boolean esAniversario(){
		if(this.date().get(Calendar.YEAR) == this.getFecha().get(Calendar.YEAR) && 
		this.date().get(Calendar.MONTH) == this.getFecha().get(Calendar.MONTH) &&
		this.date().get(Calendar.DATE) == this.getFecha().get(Calendar.DATE)){
		return true;
		}else{
		return false;
		}
	}
}