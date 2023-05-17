package Poligonos;

public abstract class Poligono {
    double base, altura;

    public Poligono(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    abstract double Area();

    
}
