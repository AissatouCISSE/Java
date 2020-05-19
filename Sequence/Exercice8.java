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
public class Exercice8 {
    public static void main(String args[]) {
        double a,b,c,d,x1,x2;
        Scanner sc = new Scanner(System.in);
        
         do {
            System.out.println("Entrer la valeur de a : ");
            a=sc.nextInt();
        } while (a==0);
        System.out.println("Entrer la valeur de b : ");
        b=sc.nextInt();
        System.out.println("Entrer la valeur de c : ");
        c=sc.nextInt();
        d=b*b-4*a*c;
        if(d>0) {
            x1 = (-b-Math.sqrt(d))/2*a;
    		x2 = (-b+Math.sqrt(d))/2*a;
		System.out.println("les solutions sont :" + " x1 ="+x1+ " et  x2 = " +x2);
        }else 
        if(d==0){
                x1  =   -b/2*a;
   		 System.out.println("la solution est : "+x1);
                
        }else
            System.out.println("il n y  a pas de solutions");
    	
	
    }
}
