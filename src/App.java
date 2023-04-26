import Instrumentos.*;
import Transportes.Caja;
import Transportes.Unidad;

public class App {

    public static void pruebaInstrumentos(){
        Nota cancion [] = {Nota.DO, Nota.SI, Nota.SOL, Nota.RE, Nota.FA};
        Campana p = new Campana();
        
        for (Nota nota: cancion) { 
            p.add (nota);
        }

        p.interpretar ();
    }

    public static void pruebaCajas() {
        Caja test1 = new Caja(20, 20, 20, Unidad.cm);
        System.out.println(test1);
        System.out.println(String.format("Volumen caja %5.2f ", test1.getVolumen()));
    }    
    public static void pruebaCajasCarton() {
        Caja test1 = new CajaCarton(20, 20, 20);
        System.out.println(test1);
        System.out.println(String.format("Volumen caja cartón %5.2f cm3", test1.getVolumen()));
    }

    public static void main(String[] args){
        //pruebaInstrumentos();
        pruebaCajas();
        pruebaCajasCarton();
    }
}
