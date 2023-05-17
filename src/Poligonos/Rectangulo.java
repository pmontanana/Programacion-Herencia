package Poligonos;

public class Rectangulo extends Poligono{
    public Rectangulo(double base, double altura){
        super(base,altura);
    }

    public double Area(){
        return base*altura;
    }
}