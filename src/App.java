import Instrumentos.*;
import Transportes.*;
import Lista.*;

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
        Lista711 test3  = new Lista711();
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
        System.out.println("Prueba equals");
        System.out.println("test1 == test2 "+(test1.equals(test2)));
        test3.insertarFinal(1);
        test3.insertarFinal(2);
        test3.insertarFinal(3);
        test3.insertarFinal(4);
        test3.insertarFinal(5);
        test3.insertarFinal(6);
        test3.insertarFinal(test2);
        System.out.println(test1);
        System.out.println(test3);
        System.out.println("test1 == test3 "+(test1.equals(test3)));
        

    }

    public static void pruebaCola(){
        Cola test1 = new Cola();
        Cola test2 = new Cola();
        Cola test3 = new Cola();
        test1.inserta(1);
        test3.inserta(1);
        test2.inserta(3);
        test1.inserta(2);
        test3.inserta(2);
        // Comprueba el equals
        System.out.println("test1 != test2 "+(test1.equals(test2)));
        System.out.println("test1 == test3 "+(test1.equals(test3)));
        test2.inserta(4);        
        test1.inserta(3);
        test2.inserta(5);
        test1.inserta(4);
        test2.inserta(6);
        System.out.println("Contenido de test1");
        while (!test1.esVacia()) {
            System.out.println(test1.extrae());
        }
    }  
    public static void pruebaPila(){
        Pila test1 = new Pila();
        Pila test2 = new Pila();
        Pila test3 = new Pila();
        test1.push(1);
        test3.push(1);
        test2.push(3);
        test1.push(2);
        test3.push(2);
        // Comprueba el equals
        System.out.println("test1 != test2 "+(test1.equals(test2)));
        System.out.println("test1 == test3 "+(test1.equals(test3)));
        test2.push(4);        
        test1.push(3);
        test2.push(5);
        test1.push(4);
        test2.push(6);
        System.out.println("Contenido de test1");
        while (!test1.esVacia()) {
            System.out.println(test1.pop());
        }
    }  

    public static void pruebaColaDoble(){
        ColaDoble test1 = new ColaDoble();
        ColaDoble test2 = new ColaDoble();
        ColaDoble test3 = new ColaDoble();
        test1.encolarPrincipio(2);
        test3.encolarPrincipio(2);
        test2.encolarPrincipio(3);
        test1.encolarPrincipio(1);
        test3.encolarPrincipio(1);
        // Comprueba el equals
        System.out.println("test1 != test2 "+(test1.equals(test2)));
        System.out.println("test1 == test3 "+(test1.equals(test3)));
        test2.inserta(4);        
        test1.inserta(3);
        test2.inserta(5);
        test1.inserta(4);
        test2.inserta(6);
        System.out.println("Contenido de test1");
        while (!test1.esVacia()) {
            System.out.println(test1.desencolarFinal());
        }
    }  
    
    public static void pruebaConjunto(){
        Conjunto test1 = new Conjunto();
        Conjunto test2 = new Conjunto();
        Conjunto test3 = new Conjunto();
        test1.insertarPrincipio(2);
        test1.insertarPrincipio(2);
        test1.insertarPrincipio(3);
        test2.insertarPrincipio(5);
        test2.insertarPrincipio(6);
        test3.insertarPrincipio(2);
        test3.insertarPrincipio(3);
        System.out.println("Contenido test 1");
        System.out.println(test1);
        System.out.println("Contenido test 2");
        System.out.println(test2);
        System.out.println("Contenido test 3");
        System.out.println(test3);
        System.out.println("test1 != test2 "+(test1.equals(test2)));
        System.out.println("test1 == test3 "+(test1.equals(test3)));
    }

    public static void test() {
        GarbageObject testx = new GarbageObject();
    }

    public static void pruebaRecolector(){
        GarbageObject test1 = new GarbageObject();
        test();
        for (int i = 0; i < 5;i++){
            GarbageObject test3 = new GarbageObject();
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        //pruebaInstrumentos();
        //pruebaCajas();
        //pruebaCajasCarton();
        //pruebaLista();
        //pruebaCola();
        //pruebaPila();
        //pruebaColaDoble();
        //pruebaConjunto();
        pruebaRecolector();
    }
}
