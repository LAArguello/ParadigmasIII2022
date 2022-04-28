

package Videoclub;

/**
 *
 * @author LeoArguello
 */
public class Videoclub {

   private String nombre;
   private Integer cantSocios;
   private Integer cantUsuarios;
   private Integer cantPeliculas;

   public void pedirPeliculas(){}   
   public void gestionDeCatalogo(){}
   public void gestionDeUsuarios(){}
   public void gestionDeSocios(){}
   
    public Integer getCantSocios() {
        return cantSocios;
    }

    public void setCantSocios(Integer cantSocios) {
        this.cantSocios = cantSocios;
    }

    public Integer getCantUsuarios() {
        return cantUsuarios;
    }

    public void setCantUsuarios(Integer cantUsuarios) {
        this.cantUsuarios = cantUsuarios;
    }

    public Integer getCantPeliculas() {
        return cantPeliculas;
    }

    public void setCantPeliculas(Integer cantPeliculas) {
        this.cantPeliculas = cantPeliculas;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

    