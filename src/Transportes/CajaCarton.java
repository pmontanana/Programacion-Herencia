package Transportes;
public class CajaCarton extends Caja{

    public CajaCarton(int ancho, int alto, int fondo) {
        super(ancho, alto, fondo, Unidad.cm);
    }

    @Override
    public double getVolumen() {
        return super.getVolumen()*.8;
    }
}
