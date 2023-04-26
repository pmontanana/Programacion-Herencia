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
    }

    public static void main(String[] args){
        //pruebaInstrumentos();
        pruebaCajas();
    }
}
