package CadenaDeResponsabilidad.Aplicacion;

import CadenaDeResponsabilidad.Modelo.*;

import java.util.Scanner;

public class Aplicacion {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Cantidad del prestamo: ");
        int n = scanner.nextInt();

        solicitarPrestamo cadena = getChainOfRensability();
        cadena.responsabilidad(n);
    }

    private static solicitarPrestamo getChainOfRensability(){

        solicitarPrestamo b100 = new Ejecutivo();
        solicitarPrestamo b50 = new LiderEjecutivo();
        solicitarPrestamo b20 = new Gerente();
        solicitarPrestamo b10 = new Director();

        b100.setSiguiente(b50);
        b50.setSiguiente(b20);
        b20.setSiguiente(b10);

        return b100;
    }
}
