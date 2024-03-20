/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Usuario
 */
public class Ejemplar {
    private String titulo;
    private Autor autor;
    private boolean disponible;

    public Ejemplar(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible=true;
    }
    
    public boolean prestar(){
    if (disponible=true){
    
    disponible=false;
    return true;
    }else 
    
    return false;
    }
    
    public boolean devolver(){
    
    
    if(disponible=false){
    disponible=true;
    return false;
    }
    return true;
    }

    @Override
    public String toString() {
        return "Ejemplar{" + "titulo=" + titulo + ", autor=" + autor + ", disponible=" + disponible + '}';
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
    
 
}
