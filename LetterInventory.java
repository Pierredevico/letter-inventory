// This program is supposed to create a letter inventory from a given string.

// Name: Pierce Coyle

// Date: 1/23/2024  

// Class: CS 145

// Assignment:  lab #3 - LetterInventory

import java.util.*;
class LetterInventory {

    private static final int LETTERS = 26;
    private int[] inventory;
    private int charNum;
    private int size;

    public LetterInventory(String data) { //Gets the number of each character, stores in array.
        inventory = new int[LETTERS];
		for (int i = 0; i < data.length(); i++) {
			charNum = data.toLowerCase().charAt(i) - 'a';
			if (charNum >= 0 && charNum <=25) {
				inventory[charNum]++;
				size++;
            }
        }
    } //End of LetterInventory
    
    public LetterInventory() { //For initialzing in the add method and main
		this("");
    }

    public int size() { //returns the size of the array.
        return size;
    } //End of size

    public boolean isEmpty() { //checks if array is empty.
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    } //End of isEmpty

    public String toString() { //creates a string representation of the inventory.
        String result = "[";
        for (int i = 0; i < LETTERS; i++) {
            char string = (char)(i + 'a');
            for (int j = 0; j < inventory[i]; j++) {
                result += string;
            }
        }
        return result + "]";
    } //End of toString

    public LetterInventory add (LetterInventory other) { // Adds the first and second inventories
        LetterInventory sum = new LetterInventory();
		for (int i = 0; i < LETTERS; i++) {
			sum.inventory[i] = inventory[i] + other.inventory[i];
		}
		sum.size = size + other.size;
		return sum;
    } //End of add

} //End of class LetterInventory
