/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.assignment3;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Assignment3 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Number of classes held:");
      double numofheld = sc.nextInt();
        System.out.println("Number of classes attended:");
        double numofattend = sc.nextInt();
        double c= (numofattend/numofheld) *100 ;
        System.out.println(c);
        if (c<75.0) {
            System.out.println("you are not allowed to enter the exam");
            
        }
        else{
            System.out.println("you allowed to enter the exam");
        }
      
    }
}
