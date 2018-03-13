

package proyectoinegrador;

import javax.swing.JOptionPane;


public class Lista {
    private Nodo inicio,fin;
    
    public Lista(){
        inicio=null;
        fin=null;
    }
    
    public boolean estaVacia(){
        if (inicio==null){
            return true;
        }else{
            return false;
        }
    }
    
    public void insertarFinal(Persona persona){
        Nodo actual;
        if(estaVacia()){
           actual=new Nodo(persona,null);
           inicio=actual;
           fin=actual;
        }else{
            actual= new Nodo(persona,null);
            fin.setSiguente(actual);
            fin=actual;
        }
    }
    
    public void insertarFinal(Usuario user){
        Nodo actual;
        if(estaVacia()){
           actual=new Nodo(user,null);
           inicio=actual;
           fin=actual;
        }else{
            actual= new Nodo(user,null);
            fin.setSiguente(actual);
            fin=actual;
        }
    }
    
    public void mostrar(){
        if(estaVacia()){
            JOptionPane.showMessageDialog(null,"La lista está vacía.");
            return;
        }else{
            Nodo temporal;
            temporal = inicio;
            while (temporal!=null){
                JOptionPane.showMessageDialog(null, temporal.getDato().toString());
                temporal=temporal.getSiguente();
            }
        }
    }

}
