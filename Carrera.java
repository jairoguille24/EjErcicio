import java.util.*;

public class Carrera
{
    private String codigo;
    private String nombre;
    private String telefono;
    private Integer numsem;
    private Integer numcreditos;
    private String titulo;
    private String director;
    Date fechaini;
    
    //constructor de carrera
    public Carrera(){
     
     this.codigo=codigo;
     this.nombre=nombre;
     this.telefono=telefono;
     this.numsem=numsem;
     this.numcreditos=numcreditos;
     this.titulo=titulo;
     this.director=director;
     this.fechaini=fechaini;
    }
     public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getNumsem() {
        return numsem;
    }

    public void setNumsem(Integer numsem) {
        this.numsem = numsem;
    }

    public Integer getNumcreditos() {
        return numcreditos;
    }

    public void setNumcreditos(Integer numcreditos) {
        this.numcreditos = numcreditos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Date getFechaini() {
        return fechaini;
    }

    public void setFechaini(Date fechaini) {
        this.fechaini = fechaini;
    }
    
}
