

package proyectoinegrador;

import java.util.Date;


public class Persona {
    
    protected String usuario, password, nombre, sexo;
    protected Date fechan;
    
    public Persona(){
        
    }

    public Persona(String usuario, String password, String nombre, String sexo, Date fechan) {
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.sexo = sexo;
        this.fechan = fechan;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechan() {
        return fechan;
    }

    public void setFechan(Date fechan) {
        this.fechan = fechan;
    }

    @Override
    public String toString() {
        return "Persona{" + "usuario=" + usuario + ", password=" + password + ", nombre=" + nombre + ", sexo=" + sexo + ", fechan=" + fechan + '}';
    }
    
    

}
