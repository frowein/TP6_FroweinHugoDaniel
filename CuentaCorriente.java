public class CuentaCorriente extends Cuenta{
    private double limiteDescubierto;
    
    public CuentaCorriente(int p_nroCuenta, Persona p_titular){
        super(p_nroCuenta,0.0 ,p_titular);
        this.setLimiteDescubierto(500);
    }
    
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
        super(p_nroCuenta, p_saldo, p_titular);
        this.setLimiteDescubierto(500);
    }
    
    public double getLimiteDescubierto(){
        return this.limiteDescubierto;
    }
    
    private void setLimiteDescubierto(int p_limite){
        this.limiteDescubierto = p_limite;
    }
    
    public boolean puedeExtraer(double p_importe){
        if(this.getLimiteDescubierto() + p_importe < this.getSaldo()){
            return true;
        }else{
            return false;
        }
    }

    public boolean extraer(double p_importe){
        if(puedeExtraer(p_importe)){
            this.extraccion(p_importe);
            return true;
        }else{
            System.out.println(this.xQNoPuedoExtraer(p_importe));
            return false;
        }
    }
    
    public String xQNoPuedoExtraer(double p_importe){
        return "El importe de extraccion sobrepasa el limite Descubierto!";
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Descubierto: " + this.getLimiteDescubierto());
    }   
}