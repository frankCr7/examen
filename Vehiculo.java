package examen5;

public class Vehiculo 
{
    private String modelo;
    private String color;
    private Vehiculo vehiculo;

    public Vehiculo(String modelo, String color)
    {
        this.modelo = modelo;
        this.color = color;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void agregarVehiculo( Vehiculo vehiculo)
    {
        this.vehiculo = vehiculo;
    }

    public String getModelo()
    {
        return modelo;
    }

    public String getColor()
    {
        return color;
    }

    public Vehiculo mostrarVehiculo()
    {
        return this.vehiculo;
    }
   
    
}
