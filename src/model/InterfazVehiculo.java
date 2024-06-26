package model;

import exceptions.VelocidadMaximaPermitida;
import exceptions.VelocidadMayorCero;

public interface InterfazVehiculo {

    public String arrancar();
    public String detener();
    public void acelerar(int velocidad) throws VelocidadMayorCero, VelocidadMaximaPermitida;
    public String frenar();
    public String obtenerMarca();
    public String obtenerEstado();
}
