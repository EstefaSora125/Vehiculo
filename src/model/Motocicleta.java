package model;

import exceptions.VelocidadMaximaPermitida;
import exceptions.VelocidadMayorCero;

public class Motocicleta extends VehiculoBase{
    public Motocicleta(String marca, int velocidadActual, String estadoMovimiento, String color) {
        super(marca, velocidadActual, estadoMovimiento, color);
    }

    @Override
    public void acelerar(int velocidad) throws VelocidadMayorCero, VelocidadMaximaPermitida {
        if(velocidad<=0){
            throw new VelocidadMayorCero();
        }else if (velocidad>150 || getVelocidadActual() + velocidad >150){
            throw new VelocidadMaximaPermitida();
        }else {
            setVelocidadActual(getVelocidadActual() + velocidad);
            System.out.println("La motocicleta está acelerando " + getMarca());

        }
    }
}
