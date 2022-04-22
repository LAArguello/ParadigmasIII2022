

package Videoclub;

/**
 *
 * @author LeoArguello
 */
public class Videoclub {

   private String nombre;
   private int cantSocios;
   private int cantUsuarios;
   private int cantPeliculas;

   public void pedirPeliculas(){}   
   public void gestionDeCatalogo(){}
   public void gestionDeUsuarios(){}
   public void gestionDeSocios(){}
   
    public int getCantSocios() {
        return cantSocios;
    }

    public void setCantSocios(int cantSocios) {
        this.cantSocios = cantSocios;
    }

    public int getCantUsuarios() {
        return cantUsuarios;
    }

    public void setCantUsuarios(int cantUsuarios) {
        this.cantUsuarios = cantUsuarios;
    }

    public int getCantPeliculas() {
        return cantPeliculas;
    }

    public void setCantPeliculas(int cantPeliculas) {
        this.cantPeliculas = cantPeliculas;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

    