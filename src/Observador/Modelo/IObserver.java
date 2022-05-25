package Observador.Modelo;

import java.util.Observable;
import java.util.Observer;

public interface IObserver extends Observer {
    @Override
    public void update(Observable o, Object arg);
}
