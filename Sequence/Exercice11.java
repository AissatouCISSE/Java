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
public class Exercice11 {
    public static void main(String args[]) {
        String op;
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrer la valeur A : ");
        a = sc.nextInt();
        System.out.println("Entrer la valeur op : ");
        op = sc.next();
        System.out.println("Entrer la valeur B : ");
        b = sc.nextInt();
        
        
        switch(op) {
            case "+" : 
                System.out.println("la somme des 2 valeurs est "+ (a+b));
            break;
            
            case "*" : 
                System.out.println("la somme des 2 valeurs est "+ (a*b));
            break;
            case "/" : if(b!=0){
                            System.out.println("la somme des 2 valeurs est "+ (a/b));
                        }else
                            System.out.println("Erreur ");    
            break;
            case "-" : System.out.println("la somme des 2 valeurs est "+ (a-b));
                         
            break;
            default : System.out.println("l'opérateur saisi est incorrecte");
}
       
        
    }
}
