/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author LuisD
 */
public class Categoria {
    
    private String nombre;
    private ArrayList<Pelicula> peliculas = new ArrayList<>();
    
    
    public Categoria(String pnombre) {
        this.nombre = pnombre;
    }
    
    
    public void setCategoria(String pnombre)        {   this.nombre = pnombre;  }
    public void ActualizarPeliculas(Pelicula peli)  {   peliculas.add(peli);    }
    
    
    public String getCategoria()                {   return this.nombre;     }
    public ArrayList<Pelicula> getPeliculas()   {   return this.peliculas;  }
    public int getUsuarios() {
        int user = 0;
        for (Pelicula peli : peliculas) {
            user += peli.getUsuarios();
        }
        return user;
    }
    public int getCalificacion() {
        int prom = 0;
        for (Pelicula peli : peliculas) {
            prom += peli.getCalificacion();
        }
        prom = (int) Math.round(prom/peliculas.size());
        return prom;
    }
}
