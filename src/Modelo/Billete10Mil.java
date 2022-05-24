package Modelo;

public class Billete10Mil extends DispensadorDeDinero{
    @Override
    public void devuelveDeBillete(int suma) {
        int numBillete = suma / 10000;
        int resto = suma % 10000;

        if (numBillete > 0) {
            System.out.println(numBillete + " de $10000");
        }


        if (resto > 10000) {
            siguiente.devuelveDeBillete(resto);
        } else if (resto < 10000) {
            System.out.println("No se pudo sacar : " + resto);
        }

    }

}
