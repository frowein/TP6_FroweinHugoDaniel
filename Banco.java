public class Banco{
public static void main(String [] args){
Persona titular = new Persona(38316259,"Hugo","Daniel",1994);
CajaDeAhorro caja = new CajaDeAhorro(5169,titular,90.3);
caja.extraer(80.6);
caja.mostrar();
CuentaCorriente cuenta =new CuentaCorriente(5170,titular,9000.6);
cuenta.extraer(700.8);
cuenta.mostrar();
}
}