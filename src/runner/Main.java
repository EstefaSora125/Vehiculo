package runner;

import exceptions.VelocidadMaximaPermitida;
import exceptions.VelocidadMayorCero;
import model.Automovil;
import model.Motocicleta;
import model.VehiculoBase;

public class Main {
    public static void main(String[] args) throws VelocidadMaximaPermitida, VelocidadMayorCero {
        Automovil automovil = new Automovil("Toyota");
        Motocicleta motocicleta = new Motocicleta("Honda");

        System.out.println(automovil.getEstadoMovimiento());
        VehiculoBase[] vehiculoBase = new VehiculoBase[2];

        System.out.println(" --------     Estado inicial de los vehículos ---------------");
        vehiculoBase[0] = automovil;
        vehiculoBase[1] = motocicleta;

        for (int i = 0; i < vehiculoBase.length ; i++) {
            System.out.println(vehiculoBase[i].toString());
        }
        System.out.println(" --------    Arrancando vehículos ---------------");
        vehiculoBase[0].arrancar();
        vehiculoBase[1].arrancar();

        for (int i = 0; i < vehiculoBase.length ; i++) {
            System.out.println(vehiculoBase[i].toString());
        }
        System.out.println(" --------     Acelerando vehiculos ---------------");

        vehiculoBase[0].acelerar(60);
        vehiculoBase[1].acelerar(120);

        for (int i = 0; i < vehiculoBase.length ; i++) {
            System.out.println(vehiculoBase[i].toString());
        }
        System.out.println(" --------     Frenando vehículos ---------------");

        vehiculoBase[0].frenar();
        vehiculoBase[1].frenar();

        for (int i = 0; i < vehiculoBase.length ; i++) {
            System.out.println(vehiculoBase[i].toString());
        }

        System.out.println(" --------     Verificar detener  ---------------");

        vehiculoBase[0].frenar();
        vehiculoBase[1].frenar();

        for (int i = 0; i < vehiculoBase.length ; i++) {
            System.out.println(vehiculoBase[i].toString());
        }





    }
}
