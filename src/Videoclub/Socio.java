/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Videoclub;

/**
 *
 * @author LeoArguello
 */
public class Socio extends Usuario {
    private Integer numSocio;
    private Integer idTarjeta;

    public void alquilarPeliculas(){}
    public void comprarPeliculas(){}
    
    public Integer getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(Integer numSocio) {
        this.numSocio = numSocio;
    }

    public Integer getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(Integer idTarjeta) {
        this.idTarjeta = idTarjeta;
    }
    
}
