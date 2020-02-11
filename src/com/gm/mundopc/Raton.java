package com.gm.mundopc;

public class Raton extends DispositivosEntrada{
    
    private int idRaton;
    private static int contadorRatones;
    
    public Raton (String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton = ++contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + this.idRaton + '}' + super.toString();
    }

}
