package grafos;
//Representar un nodo del grafo, con su nombre
public class Vertice{
    private String nombre;
    public Vertice(String nombre){
        this.nombre = nombre;

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
