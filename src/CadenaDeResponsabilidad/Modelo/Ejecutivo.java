package CadenaDeResponsabilidad.Modelo;

public class Ejecutivo extends solicitarPrestamo {

    @Override
    public void responsabilidad(int suma){
        if(suma <= 10000000){
            System.out.println("Presto a realizar por el Ejecutivo de cuenta");
        }else if (suma > 10000000){
            siguiente.responsabilidad(suma);
        }
    }
}
