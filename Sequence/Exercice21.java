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
public class Exercice21 {
    public static void main(String args[]) {
    int a, b,reponse=1;
    Scanner sc = new Scanner(System.in);
        System.out.println("Entrer la valeur de a: ");
        a = sc.nextInt();
        System.out.println("Entrer la valeur de b: ");
        b = sc.nextInt();
        
        if(a!=b){
                if(a!=b){
                    if(a>b){
                        System.out.println("la valeur entree par le premier utilisateur est plus grande ");
                    }else
                        System.out.println("la valeur entree par le premier utilisateur est plus petite  ");
                }
        
        }else
            System.out.println("Bravo! Vous avez devine la reponse");
                    
        while((a!=b) ){
           
        System.out.println("Entrer la valeur de b: ");
        b = sc.nextInt();
        
       
        if(a>b){
                        System.out.println("la valeur entree par le premier utilisateur est plus grande ");
                }else
                       if(a<b) {
                       System.out.println("la valeur entree par le premier utilisateur est plus petite  ");
                       }else
                           System.out.println("Bravo! Vous avez devine la reponse");
                           
        
        }
        
        
    }
}
