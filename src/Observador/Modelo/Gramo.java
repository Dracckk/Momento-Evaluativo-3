package Observador.Modelo;

import java.util.Observable;
import java.util.Observer;

public class Gramo implements IObserver {
    int n = 0;
    @Override
    public void update(Observable o, Object arg) {
        n = (int) arg;
        n = n * 1000;

        System.out.println("Conversion: "+n+"g");
    }
}
