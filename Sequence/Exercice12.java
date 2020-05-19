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
public class Exercice12 {
    public static void main(String args[]) {
        int val, som, i;
         Scanner sc=new Scanner(System.in);
        System.out.println("Entrer la valeur  : ");
        val = sc.nextInt();
        som=0;
        for(i=1;i<val;i++){
            if(val%i==0){
                som=som+i;
            }
        }
        if(som==val){
            System.out.println("le nombre "+val+" est parfait");
        }else
            System.out.println("le nombre "+val+" n'est pas parfait");
    }
}
