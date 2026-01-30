/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java26;

/**
 *
 * @author BUDDY
 */
import java.util.*;
public class Java26 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int randomX = rand.nextInt(100);
        int randomY = rand.nextInt(100);
        
        System.out.println("Guess the X position: ");
        int guessX = Integer.valueOf(scan.nextLine());
        System.out.println("Guess the Y position");
        int guessY = Integer.valueOf(scan.nextLine());
        //Comment for the trial push in github...
        
        do {
            if ((guessX == randomX) || (guessY < randomY)) {
                System.out.println("STOP!! go up");
            }
            else if ((guessX == randomX) || (guessY > randomY)) {
                System.out.println("STOP!! go down");
            }
            else if ((guessY == randomY) || (guessX < randomX)) {
                System.out.println("STOP! go straight forward");
            }
            else if ((guessY == randomY) || (guessX > randomX)) {
                System.out.println("STOP! go straight back");
            }
            else if ((guessX < randomX) || (guessY < randomY)) {
                System.out.println("STOP! go down... ");
            }
            else if ((guessX < randomX) || (guessY > randomY)) {
                System.out.println("STOP! go down... ");
            }
            else if ((guessX > randomX) || (guessY < randomY)) {
                System.out.println("STOP! go down... ");
            }
            else if ((guessX > randomX) || (guessY > randomY)) {
                System.out.println("STOP! go down... ");
            }     
        }
        
    }
}
