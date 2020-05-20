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
        int n, pos, max,i;
        Scanner sc = new Scanner(System.in);
        pos=0;
        max=0;
        for(i=1;i<=10;i++){
            System.out.println("Entrer la valeur de n");
            n = sc.nextInt();
            if(i==1 || n>max ) {
                max=n;
                pos=i;
            }
     
        }
        System.out.println("le plus grand de ces 10 nombres est "+ max+ " et il est la position "+pos);

        
	
    }
}
