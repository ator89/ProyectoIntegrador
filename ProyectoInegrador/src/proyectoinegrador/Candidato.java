

package proyectoinegrador;

import java.util.ArrayList;
import java.util.Date;


public class Candidato extends Persona{
    
    private ArrayList<String> certificaciones = new ArrayList();
    private ArrayList<String> publicaciones = new ArrayList();
    private ArrayList<String> seguidores = new ArrayList();

    public Candidato() {
        super();
    }

    public Candidato(String usuario, String password, String nombre, String email, String sexo, String fecha) {
        super(usuario, password, nombre, email, sexo, fecha);
    }

    

    public ArrayList<String> getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(ArrayList<String> certificaciones) {
        this.certificaciones = certificaciones;
    }

    public ArrayList<String> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(ArrayList<String> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public ArrayList<String> getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(ArrayList<String> seguidores) {
        this.seguidores = seguidores;
    }

    @Override
    public String toString() {
        return "Candidato{" + "certificaciones=" + certificaciones + ", publicaciones=" + publicaciones + ", seguidores=" + seguidores + '}';
    }

}
