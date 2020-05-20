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
public class Exercice19 {
    public static void main(String args[]) {
        int  somme, prix, rep;
        Scanner sc = new Scanner(System.in);
        somme=0;
        rep=1;
        while((somme<=0) || rep!=0){
            System.out.println("Entrer le prix : ");
            prix = sc.nextInt();
            somme=somme+prix;
            System.out.println("Entrer 1 si vous voulez continuer sinon taper 0 : ");
            rep = sc.nextInt();
            
        }
        System.out.println("La somme des articles est : "+somme+"CFA");
    }
}
