/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequence;
import java.util.Scanner;
/**
 *
 * @author Aissatou
 */
public class Lapins {
    public static void main(String args[]) {
        int u = 2, v = 2, w;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tapez N : ");
        int N = sc.nextInt();
        w = 2;
        for (int i = 2; i <= N; i++) {
            w = u + v;
            u = v;
            v = w;
        }
        System.out.println("F" + N + "=" + w);
    }
}