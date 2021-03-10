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
public class Pelicula {
    private String titulo;
    private ArrayList<Votos> Calificaciones = new ArrayList<>();
    
    public Pelicula(String ptitulo) {
        this.titulo = ptitulo;
    }
    
    
    public void setTitulo(String ptitulo)       {   this.titulo = ptitulo;          }
    public void ActualizarVotos(Votos newVoto)  {   Calificaciones.add(newVoto);    }
    
    
    
    public String getTitulo()    {  return this.titulo;                 }
    public int getUsuarios()     {  return this.Calificaciones.size();  }
    public int getCalificacion() {
        int Prom = 0;
        for (Votos voto : Calificaciones) {
            Prom += voto.getCant();
        }
        Prom = (int) Math.round(Prom/Calificaciones.size());
        return Prom;
    }
    
    
}
