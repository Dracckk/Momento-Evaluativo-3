package CadenaDeResponsabilidad.Modelo;

public class Director extends solicitarPrestamo {
    @Override
    public void responsabilidad(int suma) {
        if (suma > 100000000){
            System.out.println("Presto a realizar por el director");
        }
    }
}
