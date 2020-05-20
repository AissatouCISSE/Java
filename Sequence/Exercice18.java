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
public class Exercice18 {
    public static void main(String args[]) {
        int a, b, c,e,d, resu, pgcd,ppcm ;
        Scanner sc = new Scanner(System.in);
         System.out.println("Entrer la valeur a : ");
         a = sc.nextInt();
         System.out.println("Entrer la valeur b : ");
         b = sc.nextInt();
         if(a<0){
         while(a<0){
             System.out.println("Entrer la valeur a : ");
            a = sc.nextInt();
         }
         }
         if(b<0){
         while(b<0){
             System.out.println("Entrer la valeur a : ");
            a = sc.nextInt();
         }
         }
        e=a;
        d = b;
        pgcd  = 0;
	resu = 0;
         while(a!=b){
            if(b>a){
                c=a;
                a=b;
                b=c;
         }
            resu = a-b;
            a =b;
            b = resu;
            pgcd = a;
         }
         ppcm = e*d/pgcd;
         System.out.println("le ppcm de "+ e +" et "+ d +" est : "+ ppcm);
         
    }
}
