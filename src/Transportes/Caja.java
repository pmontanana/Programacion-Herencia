package Transportes;
public class Caja {
    int ancho, alto, fondo;
    Unidad unidad;
    String etiqueta;
    

    public Caja(int ancho, int alto, int fondo, Unidad unidad){
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }

    public double getVolumen() {
        return (double)(ancho*alto*fondo);
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public String toString() {
        return String.format("", null);
    }
}
