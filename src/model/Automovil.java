package model;

import exceptions.VelocidadMayorCero;

public class Automovil extends VehiculoBase{


    /*
    * "Honda", 340, en movimiento, verde
    * */
    public Automovil(String marca, int velocidadActual, String estadoMovimiento, String color) {
        super(marca, velocidadActual, estadoMovimiento, color);
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
    /*Detenido*/
    /*Movimiento*/
    @Override
    public String obtenerEstado() {

        return super.obtenerEstado();
    }

    @Override
    public void acelerar(int velocidad) throws VelocidadMayorCero {
        if (velocidad >0){
            setVelocidadActual(getVelocidadActual()+ velocidad);
            System.out.println("El vehículo está acelerando." +"\n"+ " - La marca del vehículo es: " + getMarca());
        }else {
            throw new VelocidadMayorCero();
        }

    }
}
