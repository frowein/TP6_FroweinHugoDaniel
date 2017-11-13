
/**
 * Clase Punto
 * @author Frowein Hugo Daniel
 */
public class Punto{
    private double x;
    private double y;
    
    /**
    * El constructor sobrecargado no recibe datos por parametro, se asignan 0.0 a ambos atributos.
    */
    public Punto(){
        this.setX(0.0);
        this.setY(0.0);
    }
    
    /**
     * El constructor recibe 2 datos por parametro para despues utilizar los mutadores
     * para asignar a los atributos.
     * 
     * @param p_x numero de x de tipo double
     * @param p_y numero de y de tipo double
     */
    public Punto(double p_x, double p_y){
        this.setX(p_x);
        this.setY(p_y);
    }
    
    //Inicio de los mutadores
    private void setX(double p_x){
        this.x = p_x;
    }
    
    private void setY(double p_y){
        this.y = p_y;
    }
    //Fin de los mutadores
    
    //Inicio de los observadores
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    //Fin de los observadores
    
	/**
	*Calcula la distancia en compracion con otro objeto de tipo Punto
	*
	* @return Retorna la distancia de ambos objetos en un dato de tipo double
	*/
	public double distanciaA(Punto p_ptoDistante){
		double x1 = this.getX();
		double y1 = this.getY();
		double x2 = p_ptoDistante.getX();
		double y2 = p_ptoDistante.getY();
		
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}
	
    /**
     * El metodo desplazar suma a X el valor de p_dx y a Y el valor de p_dy
     * 
     * @param p_dx valor a sumar a x
     * @param p_dy valor a sumar a y
     */
    public void desplazar(double p_dx, double p_dy){
        this.setX(this.getX() + p_dx);
        this.setY(this.getY() + p_dy);
    }
    
    /**
     * El metodo mostrar imprime por pantalla los valores de X e Y
     */
    public void mostrar(){
        System.out.println("Punto. X: " + this.getX() + ", Y: " + this.getY());
    }
    
    /**
     * El metodo coordenadas junta los datos de X e Y en un dato de tipo String
     * 
     * @return coordenadas de X e Y
     */
    public String coordenadas(){
        return "(" + this.getX() + ", " + this.getY() + ")";
    }
}