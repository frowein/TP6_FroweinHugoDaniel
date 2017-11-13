public class Rectangulo extends FiguraGeometrica{
    private Punto origen;
    private double ancho;
    private double alto;

    /**
    *Costructor de la clase Rectangulo
    *@param p_origen objeto de tipo Punto
    *@param p_ancho dato de tipo double
    *@param p_alto dato de tipo double
    */
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto){
    super(p_origen);
    this.setAncho(p_ancho);
    this.setAlto(p_alto);
    }
    
    /**
    *Costructor sobrecargado de la clase Rectangulo
    *No recibe el objeto de tipo Punto por lo cual lo instancia usando el constructor
    *sobrecargado de la clase Punto.
    *@param p_ancho dato de tipo double
    *@param p_alto dato de tipo double
    */
    public Rectangulo(double p_ancho, double p_alto){
    super(new Punto());
    this.setAncho(p_ancho);
    this.setAlto(p_alto);
    }
    
    //Inicio de los mutadores    
    private void setAncho(double p_ancho){
    this.ancho = p_ancho;
    }
    
    private void setAlto(double p_alto){
    this.alto = p_alto;
    }
    //Fin de los mutadores
    
    //Inicio de los observadores
    public double getAncho(){
    return this.ancho;
    }
    
    public double getAlto(){
    return this.alto;
    }
    //Fin de los observadores

    public String nombreFigura(){
        return "****** Rectangulo ******";
    }
    
    /**
    *El metodo desplazar envia un mensaje al metodo desplazar del objeto Origen
    *con los dato de desplazamiento para calcular
    *@param p_dx dato de tipo double
    *@param p_dy dato de tipo double
    */
    public void desplazar(double p_dx, double p_dy){
    this.getOrigen().desplazar(p_dx,p_dy);
    }
    
    /**
    *El metodo caracteristicas imprime por pantalla las caracteristicas del rectangulo
    */
    public void caracteristicas(){
    System.out.println(this.nombreFigura());
    System.out.println("Origen: " + this.getOrigen().coordenadas() + " - Alto: " + this.getAlto() + " - Ancho: " + this.getAncho());
    System.out.println("Superficie: " + this.superficie() + " - Perimetro: " + this.perimetro());
    }
    
    /**
    *El metodo perimetro calcula el perimetro del objeto de clase Rectangulo
    *@return double perimetro del rectangulo
    */
    public double perimetro(){
    return 2 * (this.getAncho() + this.getAlto());
    }

    /**
    *El metodo superficie calcula la superficie del objeto de clase Rectagulo
    *@return double superficie del rectangulo
    */
    public double superficie(){
    return this.getAlto() * this.getAncho();
    }

    /**
    *El metodo recibe un objeto de clase Rectangulo para comparar con el objeto de clase Rectangulo
    *se envian los origenes de ambos objetos al metodo distanciaA de la clase Punto
    *@param otroRectangulo objeto de tipo Rectangulo
    *@return la distancia entre ambos puntos de origen
    */
    public double distanciaA(Rectangulo otroRectangulo){
    return this.getOrigen().distanciaA(otroRectangulo.getOrigen());
    }

    /**
    *El metodo rectangulo retorna un objeto u otro segun cual tenga la mayor superficie
    *@param otroRectangulo objeto de tipo Rectangulo
    *@return this el mismo objeto
    *@return otroRectangulo el objeto pasado por parametro
    */
    public Rectangulo elMayor(Rectangulo otroRectangulo){
    if(this.superficie() > otroRectangulo.superficie()){
        return this;
    }else{
        return otroRectangulo;
    }
    }
    
    }