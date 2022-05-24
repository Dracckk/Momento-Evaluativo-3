package Modelo;

public class Billete100Mil extends DispensadorDeDinero{

    @Override
    public void devuelveDeBillete(int suma){
        int numBillete =  suma / 100000;
        int resto = suma % 100000;

        if (numBillete > 0){
            System.out.println(numBillete + " de $100000");
        }

        if (resto > 0){
            siguiente.devuelveDeBillete(resto);
        }
    }

}
