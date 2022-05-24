package Modelo;

public class Billete50Mil extends DispensadorDeDinero{

    @Override
    public void devuelveDeBillete(int suma){
        int numBillete =  suma / 50000;
        int resto = suma % 50000;

        if (numBillete > 0){
            System.out.println(numBillete + " de $50000");
        }

        if (resto > 0){
            siguiente.devuelveDeBillete(resto);
        }
    }
}
