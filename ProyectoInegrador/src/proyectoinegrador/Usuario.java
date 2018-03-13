

package proyectoinegrador;

import java.util.ArrayList;
import java.util.Date;


public class Usuario extends Persona{
    
    private String direccion;
    private ArrayList<String> correos = new ArrayList();
    private ArrayList<Candidato> candidatos = new ArrayList();

    public Usuario(){
        super();
    }

    public Usuario(String direccion, String usuario, String password, String nombre, String sexo, Date fechan) {
        super(usuario, password, nombre, sexo, fechan);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<String> getCorreos() {
        return correos;
    }

    public void setCorreos(ArrayList<String> correos) {
        this.correos = correos;
    }

    public ArrayList<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(ArrayList<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    @Override
    public String toString() {
        return "Usuario{" + "direccion=" + direccion + ", correos=" + correos + ", candidatos=" + candidatos + '}';
    }

    

}
