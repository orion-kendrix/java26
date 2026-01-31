/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.java26;

/**
 *
 * @author BUDDY
 */
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Java26 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int randomX = ThreadLocalRandom.current().nextInt(-100, 101);
        int randomY = ThreadLocalRandom.current().nextInt(-100, 101);
        int attempts = 0;

        System.out.println("Choose the difficulty:\n1 1.Easy\n2 2.Medium\n3 3.Hard"); //Difficulty Option
        int diff = Integer.parseInt(scan.nextLine());
        switch (diff) {
            case 1 -> attempts = 30;
            case 2 -> attempts = 20;
            case 3 -> attempts = 10;
            default -> System.out.println("Invalid Choice!");
        }
        
        do { 
            System.out.println("Chances left:  " + attempts);
            System.out.println("Guess the X position: ");
            int guessX = Integer.parseInt(scan.nextLine());
            System.out.println("Guess the Y position:");
            int guessY = Integer.parseInt(scan.nextLine());                                              //Game
            if ((guessX == randomX) && (guessY < randomY)) {
                System.out.println("STOP!! go up");
                attempts--;
            } else if ((guessX == randomX) && (guessY > randomY)) {
                System.out.println("STOP!! go down");
                attempts--;
            } else if ((guessY == randomY) && (guessX < randomX)) {
                System.out.println("STOP! go straight forward");
                attempts--;
            } else if ((guessY == randomY) && (guessX > randomX)) {
                System.out.println("STOP! go straight back");
                attempts--;
            } else if ((guessX < randomX) && (guessY < randomY)) {
                System.out.println(">^");
                attempts--;
            } else if ((guessX < randomX) && (guessY > randomY)) {
                System.out.println(">!");
            } else if ((guessX > randomX) && (guessY < randomY)) {
                System.out.println("^<");
                attempts--;
            } else if ((guessX > randomX) && (guessY > randomY)) {
                System.out.println("!<");
                attempts--;
            } else if ((guessX > randomX) && (guessY > randomY)) {
                System.out.println("You win!! Hooray!!");
            }
        } while (attempts > 0);
        System.out.println("You lose!");
    }
}
