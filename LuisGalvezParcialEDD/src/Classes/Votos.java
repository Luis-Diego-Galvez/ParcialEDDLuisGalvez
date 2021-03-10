/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author LuisD
 */
public class Votos {
    private int Cant;
    private String usuario;
    
    public Votos(int pcant, String pusuario) {
        this.Cant = pcant;
        this.usuario = pusuario;
    }
    
    public int getCant()        {    return this.Cant;      }
    public String getUsuario()  {    return this.usuario;   }
}
