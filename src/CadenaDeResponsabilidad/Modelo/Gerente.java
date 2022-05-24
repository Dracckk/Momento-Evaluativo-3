package CadenaDeResponsabilidad.Modelo;

public class Gerente extends solicitarPrestamo {
    @Override
    public void responsabilidad(int suma){
        if(suma > 50000000 && suma <= 100000000){
            System.out.println("Presto a realizar por el gerente");
        }else if (suma > 100000000){
            siguiente.responsabilidad(suma);
        }
    }
}
