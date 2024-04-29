package exceptions;

public class VelocidadMayorCero extends  Exception{
    public VelocidadMayorCero(){
        super(" La velocidad proporcionada debe ser mayor que cero.");
    }
}
