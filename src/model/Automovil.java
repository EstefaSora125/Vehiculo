package model;

import exceptions.VelocidadMayorCero;

public class Automovil extends VehiculoBase{


    public Automovil(String marca) {
        super(marca);
    }

    @Override
    public String arrancar() {
        return super.arrancar();
    }

    @Override
    public String frenar() {
        return super.frenar();
    }

    @Override
    public String detener() {
        return super.detener();
    }

    @Override
    public String obtenerEstado() {

        return super.obtenerEstado();
    }

    @Override
    public void acelerar(int velocidad) throws VelocidadMayorCero {
        if (velocidad > 0){
            setVelocidadActual(getVelocidadActual()+ velocidad);
            setEstadoMovimiento("Acelerando");
            System.out.println("El vehículo está acelerando." +"\n"+ " - La marca del vehículo es: " + getMarca());
        }else {
            throw new VelocidadMayorCero();
        }

    }
}
