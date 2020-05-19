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
public class Exercice1 {
    public static void main(String args[]) {
        int a,b,q,r;
        double qr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tapez a : ");
        a = sc.nextInt();
        System.out.println("Tapez b : ");
        b = sc.nextInt();
        q=a/b;
        r=a%b;
        qr=(float)a/b;
        System.out.println("le quotient entier de " + a + " ET " + b + " est "+ q);
        System.out.println("le reste de la division  de " + a + " ET " + b + " est "+ r);
        System.out.println("le quotient reel de" + a + " ET " + b + " est "+ qr);
    }
}
