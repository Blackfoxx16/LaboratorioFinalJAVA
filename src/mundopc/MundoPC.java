package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        
        //Crear monitor
        Monitor m1 = new Monitor("DELL", 17);
        //Crear teclado
        Teclado t1 = new Teclado("inalambrico", "choice");
        //Crear raton
        Raton r1 = new Raton("USB", "Esteren");
        
        Computadora com1 = new Computadora("Dell", m1, t1, r1);
        Computadora com2 = new Computadora("Hp", m1, t1, r1);
        Computadora com3 = new Computadora("Sony", m1, t1, r1);
        Computadora com4 = new Computadora("Mac", m1, t1, r1);
        Computadora com5 = new Computadora("Huawei", m1, t1, r1);
        Computadora com6 = new Computadora("Acer", m1, t1, r1);
        
        Orden or1 = new Orden();
        
        or1.agregarComputadora(com1);
        or1.agregarComputadora(com2);
        or1.agregarComputadora(com3);
        or1.agregarComputadora(com4);
        or1.agregarComputadora(com5);
        or1.agregarComputadora(com6);
        or1.motrarOrden();
    }
}
