package Observador.Modelo;

import java.util.Observable;

public class Libra implements IObserver{
    float n = 0;
    float nn= 2.20462f;
    @Override
    public void update(Observable o, Object arg) {
        Integer a = new Integer((Integer) arg);
        n = a.floatValue();
        n = n * nn;

        System.out.println("Conversion: "+n+"lb");
    }
}
