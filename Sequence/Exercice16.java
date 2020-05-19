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
public class Exercice16 {
    public static void main(String args[]){
       int a,b,r,q;
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer la valeur de a");
        a = sc.nextInt();
        System.out.println("Entrer la valeur de b");
        b = sc.nextInt();
        r=0;
        q=0;
        while(a>=b){
            r=a-b;
            a=r;
            q=q+1;
        }
        System.out.println("le quotient est "+q+ " et le reste est "+r);
            
    }
}
