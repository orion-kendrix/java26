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
        int randomX = ThreadLocalRandom.current().nextInt(-10, 11);
        int randomY = ThreadLocalRandom.current().nextInt(-10, 11);
        int attempts = 0;
        int count = -1;
        int[] dataX = new int[100];
        int[] dataY = new int[100];
        
        System.out.println("Welcome to the game!");
        System.out.println("Choose the difficulty of the game(based on the difficulty you will get a certain amount attempts to win the game:\n1 1.Easy(20 attempts)\n2 2.Medium(15 attempts)\n3 3.Hard(10 attempts)"); //Difficulty Option
        int diff = Integer.parseInt(scan.nextLine());
        switch (diff) {
            case 1 ->
                attempts = 20;
            case 2 ->
                attempts = 15;
            case 3 ->
                attempts = 10;
            default ->
                System.out.println("Invalid Choice!");
        }
        System.out.println("Attempts left:  " + attempts);
        int score = attempts;
        do {
            System.out.println("Guess the X position: ");
            int guessX = Integer.parseInt(scan.nextLine());
            System.out.println("Guess the Y position:");
            int guessY = Integer.parseInt(scan.nextLine());                                              //Game
            if ((guessX == randomX) && (guessY < randomY)) {
                System.out.println("STOP!! go up");
                attempts--;
                count++;
                dataX[count] = guessX;
                dataY[count] = guessY;
                System.out.println("Attempts left:  " + attempts);
            } else if ((guessX == randomX) && (guessY > randomY)) {
                System.out.println("STOP!! go down");
                attempts--;
                count++;
                dataX[count] = guessX;
                dataY[count] = guessY;
                System.out.println("Attempts left:  " + attempts);
            } else if ((guessY == randomY) && (guessX < randomX)) {
                System.out.println("STOP! go straight forward");
                attempts--;
                count++;
                dataX[count] = guessX;
                dataY[count] = guessY;
                System.out.println("Attempts left:  " + attempts);
            } else if ((guessY == randomY) && (guessX > randomX)) {
                System.out.println("STOP! go straight back");
                attempts--;
                count++;
                dataX[count] = guessX;
                dataY[count] = guessY;
                System.out.println("Attempts left:  " + attempts);
            } else if ((guessX < randomX) && (guessY < randomY)) {
                System.out.println(">^");
                attempts--;
                count++;
                dataX[count] = guessX;
                dataY[count] = guessY;
                System.out.println("Attempts left:  " + attempts);
            } else if ((guessX < randomX) && (guessY > randomY)) {
                System.out.println(">!");
                attempts--;
                count++;
                dataX[count] = guessX;
                dataY[count] = guessY;
                System.out.println("Attempts left:  " + attempts);
            } else if ((guessX > randomX) && (guessY < randomY)) {
                System.out.println("<^");
                attempts--;
                count++;
                dataX[count] = guessX;
                dataY[count] = guessY;
                System.out.println("Attempts left:  " + attempts);
            } else if ((guessX > randomX) && (guessY > randomY)) {
                System.out.println("<!");
                attempts--;
                count++;
                dataX[count] = guessX;
                dataY[count] = guessY;
                System.out.println("Attempts left:  " + attempts);
            } else if ((guessX == randomX) && (guessY == randomY)) {
                System.out.println("You win!! Hooray!!");
                System.out.println("You only took " + (score - attempts) + " attempts to win!!");
                break;
            }
        } while (attempts > 0);
        if (attempts == 0) {
            System.out.println("You lose!");
        }
        
        System.out.println("All of your coordinates: ");
        for (int i = 0;i < count;i++) {
            System.out.println(i + "(" + dataX[i] + "," + dataY[i] + ")");
        }
    }
}
