/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenprueba;

import clases.Autor;
import clases.Ejemplar;
import com.github.javafaker.Faker;
import java.lang.reflect.Array;

import java.util.ArrayList;
import java.util.Random;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class ExamenPrueba {

    public static void main(String[] args) {
      Date d=new Date(2005, 10, 31);
        Faker f = new Faker();
        Random R = new Random();
        
        Autor a = new Autor("", "", d, "");
        
        ArrayList <Ejemplar> a1=new ArrayList<>();
        
        
        for (int i = 0; i < 10; i++) {
            
            Ejemplar e =new Ejemplar(f.book().author(), a);
            
            a1.add(e);
            
        }
        
       
        for (int i = 0; i < a1.size(); i++) {
            
        }
 
        
        
        
        
    }
}
