package Lista;

public class Cola extends Lista711{
    public Cola(){
        super();
    }

    public void inserta(int temp){
        insertarFinal(temp);
    } 

    public Integer extrae(){
        return eliminar(0);
    }
}
