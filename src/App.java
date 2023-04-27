import Instrumentos.*;
import Transportes.Caja;
import Transportes.CajaCarton;
import Transportes.Unidad;
import Lista.Lista711;

public class App {

    public static void pruebaInstrumentos() {
        Nota cancion[] = { Nota.DO, Nota.SI, Nota.SOL, Nota.RE, Nota.FA };
        Campana p = new Campana();

        for (Nota nota : cancion) {
            p.add(nota);
        }

        p.interpretar();
    }

    public static void pruebaCajas() {
        Caja test1 = new Caja(20, 20, 20, Unidad.cm);
        System.out.println(test1);
        System.out.println(String.format("Volumen caja %5.2f 0", test1.getVolumen()));
    }

    public static void pruebaCajasCarton() {
        Caja test1 = new CajaCarton(20, 20, 20);
        System.out.println(test1);
        System.out.println(String.format("Volumen caja cartón %5.2f cm3", test1.getVolumen()));
    }

    public static void pruebaLista() {

        Lista711 test1 = new Lista711();
        Lista711 test2 = new Lista711();
        test1.insertarFinal(4);
        test1.insertarFinal(5);
        test1.insertarFinal(6);
        System.out.println(test1);
        test1.insertarPrincipio(3);
        test1.insertarPrincipio(2);
        test1.insertarPrincipio(1);
        System.out.println(test1);
        test1.insertar(2, 99);
        System.out.println(test1);
        test1.eliminar(2);
        System.out.println(test1);
        System.out.println(test1.buscar(4));
        test2.insertarFinal(10);
        test2.insertarFinal(20);
        test2.insertarFinal(30);
        test2.insertarFinal(40);
        test2.insertarFinal(50);
        System.out.println(test2);
        test1.insertarFinal(test2);
        System.out.println(test1);

    }

    public static void main(String[] args) {
        //pruebaInstrumentos();
        //pruebaCajas();
        //pruebaCajasCarton();
        pruebaLista();
    }
}
