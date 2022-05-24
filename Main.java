package examen5;

public class Main 
{
    public static void main(String args[])
    {
        Vehiculo vehiculo = new Vehiculo("TOYOTA", "rojo");

        System.out.println(vehiculo.getColor());
        System.out.println(vehiculo.getModelo());

        vehiculo.agregarVehiculo(new Vehiculo("TOYOTA", "rojo"));

        System.out.println(vehiculo.mostrarVehiculo().getColor());
        System.out.println(vehiculo.mostrarVehiculo().getModelo());
        

    }
    
}
