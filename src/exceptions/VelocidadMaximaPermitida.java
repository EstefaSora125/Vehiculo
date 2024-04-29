package exceptions;

public class VelocidadMaximaPermitida extends Exception{

    public VelocidadMaximaPermitida(){
        super("La velocidad no debe superar a los 150km/h");
    }

}
