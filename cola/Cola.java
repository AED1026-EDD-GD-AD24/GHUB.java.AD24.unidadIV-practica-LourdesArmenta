package cola;

public class Cola<T> {
    private Nodo<T> cabeza;
    private Nodo<T> cola;
    private int tamanio;
    //constructor por defecto
    public Cola() {
        cabeza = null;
        cola =null;
        tamanio=0;
    }
    //Devuelva el total de elementos de la cola
    public int getTamanio() {
        return tamanio;
    }

    // Verifica si la cola es vacia
    public boolean esVacia(){
        return (cabeza==null);
    }

    //Encola un elemento nuevo
    public void encolar(T valor){
        //Crear un nuevo nodo
        Nodo<T> nuevo = new Nodo<>();
        //fijar el nuevo elemento dentro del nodo
        nuevo.setValor(valor);
        if (this.esVacia()){
            //caneza y la cola apuntan al mismo lugar
            cabeza = nuevo;
            cola = nuevo;

        }else{
            //enlazar el campo siguiente con el nuev0
            cola.setSiguiente(nuevo);
            //la nueva cola pasa a ser nueva
            cola = nuevo;
        }
        //incrementa el tamañp porque hay un nuevo elemento en la cola
        tamanio++;

    }

    //Elimina el primer elemento de la cola
    public void desencolar(){
        //si no es vacia
        if(!esVacia()){
            //verificar si hay un solo elemento en la cola
            if(cabeza == cola){
                cabeza=null;
                cola=null;
            }else{
                //se elimina le primer elemento de la cola
                //desplazar la cabeza la siguiente nodo
                cabeza = cabeza.getSiguiente();
            }
            tamanio--;
        }
    }

    //devuelve el primer elemento de la cola
    public T frente(){
        if(!esVacia())
           return cabeza.getValor();
        else
           return null;
    }
   
}
