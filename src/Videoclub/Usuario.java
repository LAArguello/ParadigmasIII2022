
package Videoclub;

/**
 *
 * @author LeoArguello
 */
public class Usuario {
    
     
    private String nombre;
    private String apellido;
    private Tarjeta tarjeta;

    
    
     public void comprarPeliculas(){
   }
     
    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    private int dni;

      
       
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

  

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    


}