package Lista;

public class Pila extends Lista711{
    public Pila(){
        super();
    }

    public void push(int temp){
        insertarPrincipio(temp);
    } 

    public Integer pop(){
        return eliminar(0);
    }
}
