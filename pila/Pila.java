package pila;

public class Pila<T>{
    //atributo cabeza que apunta al tope de la pilla
    private Nodo<T> cabeza;
    //Almacena el total de elementos de la pila
    private int tamanio;
    //Metodos
    public Pila(){
        cabeza = null;
        tamanio = 0;
    }
    //devuelva el total de elementos de la pila
    public int getTamanio(){
        return tamanio;
    }

    //verificar si la pila esta vacia
    public boolean esVacia(){
        return (cabeza == null);
    }

    //Apilar un elemento nuevo
    public void apilar(T valor){
        //Crear un nuevo nodo
        Nodo<T> nuevo = new Nodo<>();
        //fijar el valor dentro del nodo
        nuevo.setValor(valor);
        if(this.esVacia()){
            //cabeza apunta al nodo nuevo
            cabeza = nuevo;

        }else{
            //se enlaza el campo siguiente de nuevo con la cabeza
            nuevo.setSiguiente(cabeza);
            //La nueva cabeza de la pila pasa a ser el nuevo
            cabeza = nuevo;

        }
        //incrementarmos el tamaño de la pila
        tamanio++;


    }

    //Elimina un elemento del tope de la pina
    public void retirar(){
        if(!this.esVacia()){
            cabeza = cabeza.getSiguiente();
            tamanio --;

        }
    }

    public T cima(){
        if (!esVacia()){
            return cabeza.getValor();
        }
        else{
            return null;
        }

    }



}
