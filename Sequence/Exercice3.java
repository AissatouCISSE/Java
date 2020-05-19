/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequence;

import java.util.Scanner;

/**
 *
 * @author Aissatou
 */
public class Exercice3 {
    
     public static void main(String args[]) {
         //version1
        double Rpar, Rser, r1, r2, r3  ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer r1 : ");
        r1 = sc.nextDouble();
        System.out.println("Entrer r2 : ");
        r2 = sc.nextDouble();
        System.out.println("Entrer r3 : ");
        r3 = sc.nextDouble();
        Rser=  r1+r2+r3;
        Rpar = (r1*r2*r3) / (r1*r2+r1*r3+r2*r3);
        System.out.println("La résistance en série est "+Rser);
        System.out.println("La résistance en parallele est "+Rpar);
        
        //Version2
        int choix;
        System.out.println("Entrer votre choix : ");
        choix = sc.nextInt();
        switch(choix) {
            case 1 :
                Rser=  r1+r2+r3;
                System.out.println("La résistance en série est "+Rser);
            break; 
   
            case 2 :
                Rpar = (r1*r2*r3) / (r1*r2+r1*r3+r2*r3);
                System.out.println("La résistance en parallele est "+Rpar);
            break; 
   
            default : 
      
    }
        
     }
  
 
}
