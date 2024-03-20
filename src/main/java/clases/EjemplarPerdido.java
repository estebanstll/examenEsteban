/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Usuario
 */
public class EjemplarPerdido extends Ejemplar {

    public EjemplarPerdido(String titulo, Autor autor) {
        super(titulo, autor);
        super.setDisponible(false);
    }

    @Override
    public boolean prestar() {
        System.out.println("El ejemplar esta perdido");
        return false;
    }

    @Override
    public boolean devolver() {
        System.out.println("El ejemplar esta perdido");
        return false;
    }

 public boolean solicitar(Autor a){
 String mensaje ="solicitando un nuevo mensaje";
 if (a.enviarComentario(mensaje)){
 
 return true;
 
 
 }else
 
 return false;
 
 
 }
    
    
}
