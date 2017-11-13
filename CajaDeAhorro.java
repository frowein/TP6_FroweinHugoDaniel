public class CajaDeAhorro extends Cuenta{
    private int extraccionesPosibles;
    
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        super(p_nroCuenta, 0.0, p_titular);
        this.setExtraccionesPosibles(10);
    }
    
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo){
        super(p_nroCuenta, p_saldo, p_titular);
        this.setExtraccionesPosibles(10);
    }
    
    public int getExtraccionesPosibles(){
        return this.extraccionesPosibles;
    }
    
    private void setExtraccionesPosibles(int p_extecciones){
        this.extraccionesPosibles = p_extecciones;
    }
    
    public boolean puedeExtraer(double p_importe){
        if(this.getExtraccionesPosibles() > 0 && p_importe < this.getSaldo()){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean extraer(double p_importe){
        if(puedeExtraer(p_importe)){
            this.extraccion(p_importe);
            this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
            return true;
        }else{
            System.out.println(this.xQNoPuedoExtraer(p_importe));
            return false;
        }
    }
    
    public String xQNoPuedoExtraer(double p_importe){
        if(this.getExtraccionesPosibles() > 0){
                return "No puede extraer mas que el saldo!";
            }else{
                return "No tiene habilitado mas extracciones!";
            }
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Extracciones posibles: " + this.getExtraccionesPosibles());
    }
    
}