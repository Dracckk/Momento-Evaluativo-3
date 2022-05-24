package CadenaDeResponsabilidad.Modelo;

public abstract class solicitarPrestamo
{
    protected solicitarPrestamo siguiente;

    public solicitarPrestamo getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(solicitarPrestamo siguiente){
        this.siguiente =siguiente;
    }

    public abstract void responsabilidad(int suma);


}
