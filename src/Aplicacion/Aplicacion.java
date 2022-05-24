package Aplicacion;

import Modelo.*;

import java.util.Scanner;

public class Aplicacion {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Cantidad a retirar: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Dispensando: ");
        DispensadorDeDinero cadena = getChainOfRensability();
        cadena.devuelveDeBillete(n);
    }

    private static DispensadorDeDinero getChainOfRensability(){

        DispensadorDeDinero b100 = new Billete100Mil();
        DispensadorDeDinero b50 = new Billete50Mil();
        DispensadorDeDinero b20 = new Billete20Mil();
        DispensadorDeDinero b10 = new Billete10Mil();

        b100.setSiguiente(b50);
        b50.setSiguiente(b20);
        b20.setSiguiente(b10);

        return b100;
    }
}
