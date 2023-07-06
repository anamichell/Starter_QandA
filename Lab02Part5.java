///////////////////////// // CSCI 3326.01
// Spring 2023
// Lab 02
// Ana Garcia
/////////

import java.util.Scanner;

public class Lab02Part5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");

        String name = input.nextLine();

        System.out.println("What is your favorite food item?");

        String food = input.nextLine();

        System.out.println("What is your favorite social media platform?");

        String social = input.nextLine();

        System.out.println("\nThank your answering all the questions, " + name + ".\nIt is true that " + food + " is a delicious food item. \nWell, guess you better get back on " + social + " now.");

        input.close();
    }   
}
