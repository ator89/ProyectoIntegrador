

package proyectoinegrador;


public class Nodo {
    
    private Nodo siguente;
    private Persona dato;
    
    public Nodo(Persona dato, Nodo siguiente){
        this.siguente=siguiente;
        this.dato=dato;
    }

    public Nodo getSiguente() {
        return siguente;
    }

    public void setSiguente(Nodo siguente) {
        this.siguente = siguente;
    }

    public Persona getDato() {
        return dato;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }
    
    

}
