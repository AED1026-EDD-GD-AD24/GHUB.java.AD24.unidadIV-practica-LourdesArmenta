package arboles;

public class ArbolBinarioBusqueda extends ArbolBinario{
    public ArbolBinarioBusqueda(){
        super();

    }
    public ArbolBinarioBusqueda(Nodo raiz){
        super(raiz);

    }
    /**
     * Inserta un nodo en el arbol binario
     * @param valor
     */
    public void inserta(Object valor) throws Exception{
        Comparable dato = (Comparable)valor;
        Nodo nuevo = new Nodo();
        nuevo.setValor(dato);
        if(raiz == null)
           raiz = nuevo;
        else{
            // anterior: refenencia al padre de aux
            Nodo anterior = null;
            //aux: auxiliar que va recorriendo los nodos, desde la raiz
            Nodo aux  = raiz;
            while (aux != null){
                anterior = aux;
                if (dato.esMenor(aux.getValor()))
                  aux = aux.getIzquierdo();
                else if (dato.esMayor(aux.getValor()))
                   aux = aux.getDerecho();
                else
                  throw new Exception("Dato Duplicado");
            }
            if(dato.esMenor(anterior.getValor()))
               anterior.setIzquierdo(nuevo);
            else
               anterior.setDerecho(nuevo);
        }
    }
    /**
     * insertar 2 es la interfaz de la operacion, llama al metodo
     * insertarRecursivo que realiza la operacion y devuelve la raiz del nuevo 
     * arbol. A este metodo interno se le pasa la raiz actual, a partir
     * de la cual se describe el camino de busqueda, y al final se enlaza
     * 
     */
    public void insertar2(Object valor) throws Exception{
        Comparable dato = (Comparable) valor;
        raiz = insertarRec(raiz,dato);
    }

    private Nodo insertarRec(Nodo raizSub, Comparable dato) throws Exception{
        if (raizSub == null){
            //caso base, termina la recursividad
            raizSub = new Nodo(dato);
        }
        else{
            if (dato.esMenor(raizSub.getValor())){
                Nodo iz = insertarRec(raizSub.getIzquierdo(), dato);
                raizSub.setIzquierdo(iz);
            }
            else{
                if (dato.esMayor(raizSub.getValor())){
                    Nodo dr = insertarRec(raizSub.getDerecho(), dato);
                    raizSub.setDerecho(dr);
                }
                else{
                    throw new Exception("Dato Duplicado");
                }
            }
        }
        return raizSub;

    }
    
}
