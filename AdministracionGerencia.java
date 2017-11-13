
public class AdministracionGerencia{
    public static void main(String [] args){
        Servicio internet = new Servicio("Internet",100.0);
        Servicio lavanderia = new Servicio("Lavanderia",300.0);
        Servicio auto = new Servicio("Alquiler de auto", 1500.0);
        Hotel habitacion = new Hotel("Hotel Caribe",800.0,7,internet,"Single");
        habitacion.agregarServicio(lavanderia);
        Cabaña cabaña = new Cabaña("Cabañas Corrientes", 1000.0,5,auto,2);
        cabaña.agregarServicio(lavanderia);
        Gerencia gerencia = new Gerencia("Administracion", habitacion);
        gerencia.agregarAlojamiento(cabaña);
        gerencia.mostrarLiquidacion();
    }
}