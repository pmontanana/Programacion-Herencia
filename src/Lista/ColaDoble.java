package Lista;

public class ColaDoble extends Cola{
    

    public ColaDoble(){
        super();
    }

    public void encolarPrincipio(int temp){
        insertarPrincipio(temp);
    }

    public Integer desencolarFinal(){
        int ultimoElemento = tabla.length - 1;
        return eliminar(ultimoElemento); //tabla.length - 1
    }
}
