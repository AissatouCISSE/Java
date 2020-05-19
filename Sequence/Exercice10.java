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
public class Exercice10 {
    public static void main(String args[]) {
        int a,b,c,e,f,g;
        int i,j;
        int []tab;
       tab= new int [3];
       Scanner sc = new Scanner(System.in);
        System.out.println("Entrer la valeur A : ");
       a = sc.nextInt();
       tab[0]=a;
       System.out.println("Entrer la valeur B : ");
       b = sc.nextInt();
       tab[1]=b;
       System.out.println("Entrer la valeur C : ");
       c = sc.nextInt();
       tab[2]=c;
       for(i=0;i<2;i++){
           for(j=i+1;j<=2;j++){
               if(tab[i]>tab[j]){
                   e=tab[i];
                   tab[i]=tab[j];
                   tab[j]=e;
               }
           }
       }
       System.out.println("les valeurs de A,B et C sont dans l’ordre:");
       for(i=0;i<=2;i++){
           System.out.println(tab[i]);
       }
       
       
    }
}
