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
public class Exercice7 {
    public static void main(String args[]) {
        int montant,reste,b20,b10,b5,p2,p1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le montant à décomposer : ");
        montant=sc.nextInt();
        b20 = montant / 20;
        reste = montant%20;
        b10 = reste / 10;
        reste = reste%10;
        b5 = reste / 5;
        reste = reste%5;
        p2 = reste / 2;
        reste = reste%2;
        p1 = reste;
        System.out.println("le montant " + montant+ " contient "+b20+" billets de 20 "+b10+" billets de 10 "+b5+" billets de 5 "+p2+" pièces de 2 et "+p1+" pièces de 1 ");
    }
    
}
