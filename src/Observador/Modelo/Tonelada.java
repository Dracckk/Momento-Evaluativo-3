package Observador.Modelo;

import java.util.Observable;

public class Tonelada implements IObserver{
    float n = 0;
    @Override
    public void update(Observable o, Object arg) {
        n = (int) arg;
        n = n / 1000;

        System.out.println("Conversion: "+n+"T");
    }
}
