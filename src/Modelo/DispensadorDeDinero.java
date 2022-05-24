package Modelo;

public abstract class DispensadorDeDinero
{
    protected DispensadorDeDinero siguiente;

    public DispensadorDeDinero getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(DispensadorDeDinero siguiente){
        this.siguiente =siguiente;
    }

    public abstract void devuelveDeBillete(int suma);


}
