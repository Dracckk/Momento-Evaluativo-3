package Modelo;

public class Billete20Mil extends DispensadorDeDinero{
    @Override
    public void devuelveDeBillete(int suma){
        int numBillete =  suma / 20000;
        int resto = suma % 20000;

        if (numBillete > 0){
            System.out.println(numBillete + " de $20000");
        }

        if (resto > 0){
            siguiente.devuelveDeBillete(resto);
        }
    }
}
