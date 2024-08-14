/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Azalia
 */
public class Usuarios {

    static boolean addUser(String name, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static boolean setPlayer1(String usua, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private String username,password;
    private int puntos;
    
    public Usuarios(String username,String password){
       this.username=username;
       this.password=password;
       this.puntos=0;
       
    }
    
    public void setUsername(String username){
        this.username=username;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setPassword(String password){
        this.password=password;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String infoCreatePalayer(){
        return "\nUsername: "+username;  
    }
    
    public int getPuntos() {
        return puntos;
    }

    public void IncrementarPuntos(int cantidad) {
       puntos = puntos + (cantidad - (puntos % cantidad));
    }
    
    
}
