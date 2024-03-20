// This program is supposed to create a letter inventory from a given string.

// Name: Pierce Coyle

// Date: 1/23/2024  

// Class: CS 145

// Assignment:  lab #3 - LetterInventory

import java.util.Scanner;
public class LetterInventoryTest {
    public static void main(String[] args) {
        Boolean canContinue = true;
        LetterInventory inventory1 = new LetterInventory();

        while (canContinue) { //While loop for menu
            Scanner scan = new Scanner(System.in);
            char selection;
            String input;
        
            intro();

            selection = scan.next().charAt(0);
            scan.nextLine();
            switch (selection) {
                case 'r':
                    System.out.println("String representation of your inventory:" + inventory1);
                    break;
                case 's':
                    System.out.println("Please enter your string:");
                    input = scan.nextLine();
                    inventory1 = new LetterInventory(input);
                    break;
                case 'a':
                    System.out.println("Please enter a second string:");
                    input = scan.nextLine();
                    LetterInventory inventory2 = new LetterInventory(input);
                    LetterInventory sumInventory = inventory1.add(inventory2);
                    inventory1 = sumInventory;
                    System.out.println("The sum of your two inventories is: " + inventory1);
                    break;
                case 'q':
                System.out.println("Goodbye, come again!");
                canContinue = false;
                break;
                default:
                System.out.println("Invalid answer. Please type a valid answer\n");
                break;
            }
        }
    } //End of main

    public static void intro() { //Prints an intro
        System.out.println("Type s to create a string.");
        System.out.println("Type r to print the inventory.");
        System.out.println("Type a to add a string to the inventory.");
        System.out.println("Type q to quit.");

    } //End of intro
}
