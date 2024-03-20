/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Autor {
    private String nombre;
    private String apellido;
    private Date nacimiento;
    private String email;

    public Autor(String nombre, String apellido, Date nacimiento, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.email = email;
    }
    
 

    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento=null;
        this.email=null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public void getEdad(){
        System.out.println("su fecha de nacimiento es: "+getNacimiento()+ " y tiene "+nacimiento.getYear()+" años");
    
    
    }
    
    
 public boolean enviarComentario(String mensaje) {
    if (getEmail().equals("")) {
        System.out.println("Se ha enviado el mensaje correctamente");
        return true;
    } else if (getEmail() == null && mensaje.length() >= 10 && mensaje.length() <= 280) {
        System.out.println("No tenemos la dirección de contacto del autor");
        return false;
    } else if (getEmail() == null && (mensaje.length() > 280 || mensaje.length() < 10)) {
        System.out.println("El mensaje debería tener la longitud de un tweet");
        return false;
    } else {
        return false;
    }
}

    @Override
    public String toString() {
        return "Autor{" + nombre + apellido +"(" +nacimiento.getYear()+")"+ ": " + email ;
    }
 
 
 
 
}