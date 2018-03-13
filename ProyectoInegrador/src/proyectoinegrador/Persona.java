

package proyectoinegrador;

import java.util.Date;


public class Persona {
    
    protected String usuario, password, nombre, email, sexo, fecha;
    
    public Persona(){
        
    }

    public Persona(String usuario, String password, String nombre, String email, String sexo, String fecha) {
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.email = email;
        this.sexo = sexo;
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "usuario=" + usuario + '}';
    }

    
    
    

}
