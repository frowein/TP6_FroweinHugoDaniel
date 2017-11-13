public class Elipse extends FiguraGeometrica{
    private double sEjeMayor;
    private double sEjeMenor;
    
    public Elipse(Punto p_centro, double p_sEjeMayor, double p_sEjeMenor){
        super(p_centro);
        this.setSEjeMayor(p_sEjeMayor);
        this.setSEjeMenor(p_sEjeMenor);
    }
    
    public Elipse(){
        super(new Punto());
        this.setSEjeMayor(0.0);
        this.setSEjeMenor(0.0);
    }
    
    public String nombreFigura(){
        return "******Elipse******";
    }
    
    private void setSEjeMayor(double p_sEjeMayor){
        this.sEjeMayor = p_sEjeMayor;
    }
    
    private void setSEjeMenor(double p_sEjeMenor){
        this.sEjeMenor = p_sEjeMenor;
    }

    public double getSEjeMayor(){
        return this.sEjeMayor;
    }
    
    public double getSEjeMenor(){
        return this.sEjeMenor;
    }
    
    public void desplazar(double p_dx, double p_dy){
        this.getOrigen().desplazar(p_dx,p_dy);
    }
    
    public void caracteristicas(){
        System.out.println(this.nombreFigura());
        System.out.println("Centro: " + this.getOrigen().coordenadas()
                            + " - Semi Eje Mayor : " + this.getSEjeMayor()
                            + " - Semi Eje Menor : " + this.getSEjeMenor());
        System.out.println("Superficie: " + this.superficie());
    }
    
    public double superficie(){
        return Math.PI * this.getSEjeMayor() * this.getSEjeMenor();
    }
    
    public double distanciaA(Elipse otroElipse){
        return this.getOrigen().distanciaA(otroElipse.getOrigen());
    }
    
    public Elipse elMayor(Elipse otroElipse){
        if(this.superficie() > otroElipse.superficie()){
            return this;
        }else{
            return otroElipse;
        }
    }
}