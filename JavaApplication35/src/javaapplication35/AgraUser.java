/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class AgraUser {
    public static void main(String[] args) {
        System.out.println("Masukkan Angka Besar :");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(FirstDigit(n));
    }
    private static int FirstDigit (int n){
        while (n>=10){
            n /= 10;
        }
            
    return n;}
}
