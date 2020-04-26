package mundopc;

import com.gm.mundopc.*;

public class Mundopc {
    public static void main(String[] args) {
        Orden orden = new Orden();
        Orden orden1 = new Orden();
        Orden orden2 = new Orden();
        Orden orden3 = new Orden();
        Raton raton = new Raton("USB","Logitec");
        Teclado teclado = new Teclado("Usb","Lenovo");
        Monitor monitor = new Monitor("HP",12.2);
        Computadora computadora1 = new Computadora("Elle",monitor,teclado,raton);

        Raton raton1 = new Raton("USB","Logitec");
        Teclado teclado1 = new Teclado("Usb","Lenovo");
        Monitor monitor1 = new Monitor("HP",12.2);
        Computadora computadora2 = new Computadora("Elle",monitor,teclado,raton);

        Raton raton2 = new Raton("USB","Logitec");
        Teclado teclado2 = new Teclado("Usb","Lenovo");
        Monitor monitor2 = new Monitor("HP",12.2);
        Computadora computadora3 = new Computadora("Elle",monitor,teclado,raton);

        Raton raton3 = new Raton("USB","Logitec");
        Teclado teclado3 = new Teclado("Usb","Lenovo");
        Monitor monitor3 = new Monitor("HP",12.2);
        Computadora computadora4 = new Computadora("Elle",monitor,teclado,raton);


        orden.agregarComoputadoras(computadora1);
        orden1.agregarComoputadoras(computadora2);
        orden2.agregarComoputadoras(computadora3);
        orden3.agregarComoputadoras(computadora4);

        orden.mostarOrden();
        orden1.mostarOrden();
        orden2.mostarOrden();
        orden3.mostarOrden();
    }
}
