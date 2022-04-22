/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Videoclub;

/**
 *
 * @author LeoArguello
 */
public class Main {
    public static void main(String[] args){
            Pelicula spiderman = new Pelicula();
            Categoria cienciaFiccion= new Categoria();
            spiderman.setNombre("Spiderman");
            spiderman.setAnioEstreno(2002);
            cienciaFiccion.setNombre("Ciencia Ficcion");
            spiderman.setCategoria(cienciaFiccion);
            
            
            System.out.print(spiderman.toString());
   
    }

   
   
    
}
