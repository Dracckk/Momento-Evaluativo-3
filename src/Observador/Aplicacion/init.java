package Observador.Aplicacion;

import Observador.Modelo.Gramo;
import Observador.Modelo.Libra;
import Observador.Modelo.Tonelada;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class init extends Observable {
    static ArrayList<Observer> observers = new ArrayList<Observer>();
    int n = 0;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        Gramo g = new Gramo();
        Libra lb = new Libra();
        Tonelada T = new Tonelada();


        observers.add((Observer) g);
        observers.add((Observer) lb);
        observers.add((Observer) T);

        System.out.println("Ingrese la cantidad a convertir en kilogramos: ");
        n = scanner.nextInt();

        notifyObservers();
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size() ; i++) {
            Observer obj = (Observer) observers.get(i);

            obj.update(this, n);
        }
    }
}
