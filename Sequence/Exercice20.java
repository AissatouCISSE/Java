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
public class Exercice20 {
    public static void main(String args[]) {
        int n, pos, max,i, j;
        int[] tab = new int[10];
        Scanner sc = new Scanner(System.in);
        for(i=0;i<10;i++){
            System.out.println("Entrer la valeur de n");
            n = sc.nextInt();
            tab[i]=n;
        }
        pos = 0;
	max = 0;
        
        for(i=0;i<9;i++) {
            for(j=i+1;j<=9;j++) {
                if(tab[i]>tab[j]) {
                    pos =j;
                    max = tab[i];
                }
                               
            }
            j = 9;
        }
        System.out.println("le plus grand de ces 10 nombres est "+ max+ " et il est la position "+pos);
	
    }
}
