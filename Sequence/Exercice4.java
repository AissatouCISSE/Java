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
public class Exercice4 {
    public static void main(String args[]) {
        int i, n;
        double x,puis ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer la valeur de x : ");
        x = sc.nextInt();
        System.out.println("Entrer la valeur de n : ");
        n = sc.nextInt();
        
        //version1
        puis = Math.pow(x, n);
        System.out.println("la puissance en version1 est "+puis);
        //version
        i=1;
        puis=1;
        while(i<=n){
            puis=puis*x;
            i=i+1;
        }
        System.out.println("la puissance en version2 est "+puis);
    }
}
