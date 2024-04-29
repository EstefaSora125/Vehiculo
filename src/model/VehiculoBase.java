package model;

import exceptions.VelocidadMaximaPermitida;
import exceptions.VelocidadMayorCero;

public class VehiculoBase implements  InterfazVehiculo{
    private String marca;
    private int velocidadActual;
    private String estadoMovimiento;
    private final int FRENO = 10;

    public VehiculoBase(String marca) {
        this.marca = marca;
        this.velocidadActual = 0;
        this.estadoMovimiento = "detenido";
    }

    public String getMarca() {
        return marca;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public String getEstadoMovimiento() {
        return estadoMovimiento;
    }

    public void setEstadoMovimiento(String estadoMovimiento) {

        this.estadoMovimiento = estadoMovimiento;
    }


    @java.lang.Override
    public String arrancar() {
        setVelocidadActual(getVelocidadActual() + 1);
        setEstadoMovimiento("Arrancando");
        return "Arrancando" + marca;
    }

    @Override
    public String detener() {
        setVelocidadActual(0);
        setEstadoMovimiento("Se ha detenido");
        return "Detenido";
    }

    @java.lang.Override
    public void acelerar(int velocidad) throws VelocidadMayorCero, VelocidadMaximaPermitida {

    }

    @java.lang.Override
    public String frenar() {
        if (getVelocidadActual() - FRENO <= 0){
            detener();
        } else {
            setVelocidadActual(getVelocidadActual() - FRENO);
            setEstadoMovimiento("Frenando");
        }
        return "Frenando";
    }

    @java.lang.Override
    public String obtenerMarca() {
        return null;
    }

    @java.lang.Override
    public String obtenerEstado() {
        return null;
    }

    @Override
    public String toString() {
        return "Información " + "\n" +
                " - Marca: " + marca + "\n" +
                " - Velocidad: " + velocidadActual + "\n" +
                " - Estado De Movimiento: " + estadoMovimiento + "\n";
    }
}
