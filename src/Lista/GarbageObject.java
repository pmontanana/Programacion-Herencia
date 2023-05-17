package Lista;

public class GarbageObject {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("El objeto está siendo recolectado por el recolector de basura: " + this);
        System.out.flush();
        for(int i=0;i<100000; i++);
    }
}
