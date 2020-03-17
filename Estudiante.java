
import java.util.*;

public class Estudiante
{
    private String codigo;
    private String nombre;
    private String telefono;
    private String email;
    private String direccion;
    private Integer edad;
    private String documento;
    private String tipodoc;
    private Integer creditos;
    private Integer semestre;
    private String estado;
    private Carrera carrera;
    
    //constructor Estudiante
    public Estudiante(String codigo,String nombre,String telefono,String email,String direccion,Integer edad,String documento,String tipodoc,Integer creditos,Integer semestre,String estado,Carrera carrera){
    
        this.codigo=codigo;
        this.nombre=nombre;
        this.telefono=telefono;
        this.email=email;
        this.direccion=direccion;
        this.edad=edad;
        this.documento=documento;
        this.tipodoc=tipodoc;
        this.creditos=creditos;
        this.semestre=semestre;
        this.estado=estado;
        this.carrera=carrera;
    
        
        
    
    
    
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getEdad(){
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
}

public void CalcularMayorEdad(){

 if(getEdad()>=18){
     
     System.out.println("El estudiante es mayor de edad");
    } 
 else{
    System.out.println("El estudiante es menor de edad");
    
    }} 
    
public void cursoTotalCreditos(){

 if(getCreditos()>=carrera.getNumcreditos()){
     System.out.println("El estudiante a cursado:"+getCreditos());
     System.out.println("La carrera tiene:"+carrera.getNumcreditos());
     System.out.println("Ya casi eres:"+carrera.getTitulo());
        }else 
        {   System.out.println("El estudiante a cursado:"+getCreditos());
            System.out.println("La carrera tiene:"+carrera.getNumcreditos());
            System.out.println("Persevera :)");}
    }

 public void matricularProyecto(){
        if(getCreditos()>=(carrera.getNumcreditos()*0.7)&&getSemestre()>=7)
        {
            System.out.println("Puede matricular proyecto");}

        else
            System.out.println("No puede matricular proyecto de grado por faltan creditos y semestres por cursar");
    }

 public void promedioCreditosSemestre(){
    
       Float promedio=(float)(getCreditos()/getSemestre());
        
        System.out.println("Promedio de craditos cursados: "+ promedio);
    
    }
 
 public void actualizarEstado(){
   
        if (getSemestre()>=carrera.getNumsem()* 2)
        {
             this.estado ="PFU";
        }
        System.out.println("Numero de semestres: " + getSemestre());
        System.out.println("Los semestres cursados son: " +carrera.getNumsem());
    
    }
}















/*metodos a realizar 
1.Calcular si el estudiante es mayor de edad
2.El promedio de creditos cursados
3.Matricular un proyecto(para matricular proyecto debe haber aprobado el 70% de los creditos y estar despues de 7mo semestre)
4.Calcular el promedio de creditos por semestre
5.Mostrar total de creditos por carrera si ya cumplio con el total de creditos de la carrera debe mostrar un mensaje
6.Actualizar el estado del estudiante(Matriculado,PFU)

*/