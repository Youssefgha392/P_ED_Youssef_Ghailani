/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadora;

/**
 *
 * @author Alumno Tarde
 */
public class Calculadora {
private int ans;
        
  

    public Calculadora() {
       ans=0; 
    }
    
    
     public int Dividir(int a, int b) {
         if (b==0) {
             return 0 ;
         }
         ans=a/b;
         return ans;
    }
}

public int suma(int a, int b){
return a+b;
}
public int multiplica(int a,int b){
return a*b;
}
