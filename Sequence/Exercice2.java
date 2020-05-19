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
public class Exercice2 {
       public static void main(String args[]) {
        double rayon, surface, perimetre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tapez le rayon : ");
        rayon = sc.nextDouble();
        surface=(rayon*rayon)*Math.PI;
        perimetre= rayon*2*Math.PI;
        System.out.println("La surface du cercle est : "+ surface);
        System.out.println("Le périmètre du cercle est : "+ perimetre);
    }
        
       
    
}
