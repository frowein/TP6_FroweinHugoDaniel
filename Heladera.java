
/**
 * Write a description of class Heladera here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heladera extends ArtefactoHogar{
    private int pies;
    private int puertas;
    private boolean compresor;
    
    public Heladera(String p_marca, float p_precio, int p_stock, int p_pies, int p_puertas, boolean p_compresor){
        super(p_marca, p_precio, p_stock);
        this.setPies(p_pies);
        this.setPuertas(p_puertas);
        this.setCompresor(p_compresor);
    }
    
    private void setPies(int p_pies){
        this.pies = p_pies;
    }
    
    private void setPuertas(int p_puertas){
        this.puertas = p_puertas;
    }
    
    private void setCompresor(boolean p_compresor){
        this.compresor = p_compresor;
    }
    
    public int getPies(){
        return this.pies;
    }
    
    public int getPuertas(){
        return this.puertas;
    }
    
    public boolean getCompresor(){
        return this.compresor;
    }
    
    public void imprimir(){
        System.out.println("**** Heladera ****");
        super.imprimir();
        System.out.println("Pies: " + this.getPies());
        System.out.println("Puertas: " + this.getPuertas());
        if(!this.getCompresor()){
            System.out.println("Compresor: Si");
        }else{
            System.out.println("Compresor: No");
        }
    }
    
    public float creditoConAdicional(int p_cuotas,float p_interes){
        if(!this.getCompresor()){
            return this.cuotaCredito(p_cuotas, p_interes);
        }else{
            return this.cuotaCredito(p_cuotas, p_interes) + 50;
        }
    }
}