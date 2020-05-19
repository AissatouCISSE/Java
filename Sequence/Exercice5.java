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
public class Exercice5 {
     public static void main(String args[]) {
        int somme=0, i, val;
        
        Scanner sc = new Scanner(System.in);
        for(i=1;i<=5;i++){
         System.out.println("Entrer la valeur : ");
         val = sc.nextInt();
         somme=somme+val;
            }
        
        System.out.println("La somme des 5 nombres saisis au clavier est: "+somme);
        
    }
}
