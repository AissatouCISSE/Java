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
public class Exercice15 {
    public static void main(String args[]){
        int som,i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer la valeur de n");
        n = sc.nextInt();
        som=0;
        i=1;
        while(i<=n){
            som=som+i;
            i=i+1;
        }
        System.out.println("la sommes est egale a : "+som);
        
    }
}
