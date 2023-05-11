package Lista;

import java.util.*;


public class Lista711 {
    Integer[] tabla;

    public Lista711() {
        tabla = new Integer[0];
    }

    public void insertarPrincipio(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = nuevo;
    }

    public void insertarFinal(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;
    }

    public void insertarFinal(Lista711 otraLista) {
        int tamIni = tabla.length;
        tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
        System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
    }

    public void insertar(int posicion, Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, posicion, tabla, posicion + 1,
                tabla.length - posicion - 1);
        tabla[posicion] = nuevo;
    }

    public Integer eliminar(int indice) {
        Integer eliminado = null;
        if (indice >= 0 && indice < tabla.length) {
            eliminado = tabla[indice];
            for (int i = indice + 1; i < tabla.length; i++) {
                tabla[i - 1] = tabla[i];
            }
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return eliminado;
    }

    public boolean esVacia(){
        return tabla.length == 0;
    }

    public Integer get(int indice) {
        Integer resultado = null;
        if (indice >= 0 && indice < tabla.length) {
            resultado = tabla[indice];
        }
        return resultado;
    }


    public int buscar(Integer claveBusqueda) {
        int indice = -1;
        for (int i = 0; i < tabla.length && indice == -1; i++) {
            if (tabla[i].equals(claveBusqueda)) {
                indice = i;
            }
        }

        return indice;
    }

    public int numeroElementos() {
        return tabla.length;
    }

    public String toString() {
        return "Lista: " + Arrays.toString(tabla);
    }

    public boolean equals(Lista711 temp){
        if (tabla.length != temp.numeroElementos()){
            return false;
        }
        for (int i = 0; i< tabla.length; i++) {
            if (tabla[i] != temp.get(i)) {
                return false;
            }
        }
        return true;
    }

}
