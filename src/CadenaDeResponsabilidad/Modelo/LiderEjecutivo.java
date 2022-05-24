package CadenaDeResponsabilidad.Modelo;

public class LiderEjecutivo extends solicitarPrestamo {
    @Override
    public void responsabilidad(int suma){
        if(suma > 10000000 && suma <= 50000000){
            System.out.println("Presto a realizar por el Lider Ejecutivo");
        }else if (suma > 50000000){
            siguiente.responsabilidad(suma);
        }
    }
}
