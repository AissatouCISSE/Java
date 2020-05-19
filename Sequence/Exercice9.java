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
public class Exercice9 {
    public static void main(String args[]) {
        int h1, h2, m1, m2;
        int hd, md1,md2,md;
        Scanner sc = new Scanner(System.in);
         System.out.println("entrer horaire de départ : h ");
         h1 = sc.nextInt();
         System.out.println("entrer horaire de départ : min ");
         m1 = sc.nextInt();
         System.out.println("entrer horaire d'arriver : h2 ");
         h2 = sc.nextInt();
         System.out.println("entrer horaire d'arriver : min2 ");
         m2 = sc.nextInt();
         md1 = (h2*60+m2);
         md2 = (h1*60+m1);
         md = md1-md2;
         hd = md/60;
         md = md%60;
         System.out.println("la durée de vol est : "+hd+ ":"+md);
         
//        switch(choix) {
//            case 1 :
                //On considère que le départ et l'arrivée ont lieu le même jour
//                m2 = sc.nextInt();
//                md1 = (h2*60+m2);
//                md2 = (h1*60+m1);
//                md = md1-md2;
//                hd = md/60;
//                md = md%60;
//                System.out.println("la durée de vol est : "+hd+ ":"+md);
//            break; 
//   
//            case 2 :
                //On suppose que la durée de vol est inférieure à 24 heures mais peut avoir lieu le lendemain. 
                if (h2 > h1) {
                
                    if (m2 > m1) {
                        hd = h2-h1 ;
			md = m2-m1 ;
			System.out.println("la duree de vol est : "+hd+":"+ md);
                     }else
                        hd = h2-h1-1 ;
			md = m2+60-m1 ;
			System.out.println("la duree de vol est : "+hd+":"+ md);
                    }else
                        if (m2 > m1 ) {
                        hd = h2-h1+24 ;
			md = m2-m1 ;
			System.out.println("la duree de vol est : "+hd+":"+ md);
                }else
                    hd = h2-h1+24-1 ;
                    md = m2+60-m1 ;
                    System.out.println("la duree de vol est : "+hd+":"+ md);
			
//            break; 
//   
//            default : 
      
    }
        
        
        /*
        Scanner sc = new Scanner(System.in);
         System.out.println("entrer horaire de départ : h ");
         h1 = sc.nextInt();
         System.out.println("entrer horaire de départ : min ");
         m1 = sc.nextInt();
         System.out.println("entrer horaire d'arriver : h2 ");
         h2 = sc.nextInt();
         System.out.println("entrer horaire d'arriver : min2 ");
         m2 = sc.nextInt();
         md1 = (h2*60+m2);
         md2 = (h1*60+m1);
         md = md1-md2;
         hd = md/60;
         md = md%60;
         System.out.println("la durée de vol est : "+hd+ ":"+md);
         
         
         
            md1 = (h2*60+m2);
            md2 = (h1*60+m1);
            md = md1-md2;
            hd = md/60;
            md = md%60;
*/
    
 
}
