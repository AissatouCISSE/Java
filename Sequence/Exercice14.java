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
public class Exercice14 {
    public static void main(String args[]){
        int j,m,a;
        Scanner sc = new Scanner(System.in);
         System.out.println("entrer le jour ");
         j = sc.nextInt();
         System.out.println("entrer le mois ");
         m = sc.nextInt();
         System.out.println("entrer l'annee ");
         a = sc.nextInt();
        if((j<1 || j>31) || (m<1 || m>12) ||(m==2 && j>29 && a%4==0)||(j>28 && a%4!=0) ||(a<1583)){
            System.out.println("La date est incorrecte ");
            
        }else
            if((a % 4 ==0 && a % 100 != 0) || a % 400 ==0){
                System.out.println("l'annee est bissextile  ");
            }else
                System.out.println("La date n'est pas bisextille ");
            
    }
}
