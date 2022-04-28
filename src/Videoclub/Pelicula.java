/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Videoclub;

/**
 *
 * @author LeoArguello
 */
public class Pelicula {
    private String nombre;
    private Integer id;
    private Integer cant;
    private Categoria categoria;
    private Integer anioEstreno;


    public Integer getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(Integer anioEstreno) {
        this.anioEstreno = anioEstreno;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCant() {
        return cant;
    }

    public void setCant(Integer cant) {
        this.cant = cant;
    }

    @Override
    public String toString() {
        return "La pelicula es: " + "nombre: " + nombre + ", categoria: " + categoria.getNombre() + ", estreno: " + anioEstreno + " ";
    }

  
    
}
