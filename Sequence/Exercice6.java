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
public class Exercice6 {
     public static void main(String args[]) {
        double x1, x2, y1, y2, d , d1, d2, res;
        Scanner sc = new Scanner(System.in);
         System.out.println("Entrer la valeur x1 : ");
         x1 = sc.nextDouble();
         System.out.println("entrer la valeur de y1 :");
         y1 = sc.nextDouble();
         System.out.println("Entrer la valeur x2 : ");
         x2 = sc.nextDouble();
         System.out.println("entrer la valeur de y2 :");
         y2 = sc.nextDouble();
         d2 = 2*(y1-y2);
         d1 = 2*(x2-x1);
         //d2 = 2*(y1–y2);
         res=d1+d2;
         d=Math.sqrt(res);
        System.out.println("La distance est"+d);
        
    }
}
