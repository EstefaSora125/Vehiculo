package model;

import exceptions.VelocidadMayorCero;

public class VehiculoBase implements  InterfazVehiculo{
    private String marca;
    private int velocidadActual;
    private String estadoMovimiento;

    private String color;

    public VehiculoBase(String marca, int velocidadActual, String estadoMovimiento, String color) {
        this.marca = marca;
        this.velocidadActual = velocidadActual;
        this.estadoMovimiento = estadoMovimiento;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @java.lang.Override
    public String arrancar() {
        return null;
    }

    @Override
    public String detener() {
        return null;
    }

    @java.lang.Override
    public void acelerar(int velocidad) throws VelocidadMayorCero {
    }

    @java.lang.Override
    public String frenar() {
        return null;
    }

    @java.lang.Override
    public String obtenerMarca() {
        return null;
    }

    @java.lang.Override
    public String obtenerEstado() {
        return null;
    }
}
