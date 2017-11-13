public abstract class Cuenta{
    private Persona titular;
    private int nroCuenta;
    private double saldo;
    
    public Cuenta(int p_cuenta, double p_saldo, Persona p_titular){
        this.setCuenta(p_cuenta);
        this.setSaldo(p_saldo);
        this.setTitular(p_titular);
    }
    
    private void setCuenta(int p_cuenta){
        this.nroCuenta = p_cuenta;
    }
    
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    public int getCuenta(){
        return this.nroCuenta;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public Persona getTitular(){
        return this.titular;
    }
    
    public double depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
        return this.getSaldo();
    }
    
    public void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
    }
    
    public abstract boolean puedeExtraer(double p_importe);
    
    public abstract boolean extraer(double p_importe);
    
    public abstract String xQNoPuedoExtraer(double p_importe);
    
    public void mostrar(){
        System.out.println("Nro. Cuenta: " + this.getCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
    }
}