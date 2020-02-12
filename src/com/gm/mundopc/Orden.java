package com.gm.mundopc;

public class Orden {
    
    private int idOrden;
    private Computadora[] computadoras;
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 5;
    
    public Orden(){ 
        this.idOrden = ++contadorOrdenes; 
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){        
        
        if(contadorComputadoras < MAX_COMPUTADORAS){
            this.computadoras[contadorComputadoras++] = computadora;
            System.out.println("Computadora agregada correctamente.");
        }else{
            System.out.println("No se puede agregar mas elementos a la orden.");
            System.out.println("Cantidad maxima de items: " + MAX_COMPUTADORAS);
        }       
    }
    
    public void motrarOrden(){
        
        System.out.println("Orden num: " + this.idOrden);
        
        for(int i=0; i < this.contadorComputadoras; i++ )
        {
            System.out.println(this.computadoras[i]);
        }
        
    }
}
