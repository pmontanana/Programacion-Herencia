package Lista;


public class Conjunto extends Lista711{
    public Conjunto(){
        super();
    }

    public boolean existeElemento(int temp){
        for (int i = 0; i < tabla.length; i++){
            if (temp == tabla[i]){
                return true;
            }
        }
        return false;

    /* for (int elemento: tabla){
            if (elemento == temp){
                return true;
            }
        }
        return false; */
    }

    @Override
    public void insertarPrincipio(Integer nuevo){
        if (!existeElemento(nuevo)){
            super.insertarPrincipio(nuevo);
        }
    }

    @Override
    public void insertarFinal(Integer nuevo){
        if (!existeElemento(nuevo)){
            super.insertarFinal(nuevo);
        }
    }

    @Override
    public void insertar(int posicion, Integer nuevo){
        if (!existeElemento(nuevo)){
            super.insertar(posicion, nuevo);
        }
    }

    public boolean equals(Conjunto temp){
        return super.equals(temp);
    }
}
