// Jared Gardner 1212774964
// CSE 360 Assignment 2
// This class has the ability to add or subtract passed values from a running
// total, while maintaining a history of the additions/subtractions made. 

package cse360assign2;

import java.util.Random;

// The AddingMachine class 
public class AddingMachine {

	private int total;
	private String history = "0";
	
	// Constructor class, sets initial total to 0
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	// Returns the current total variable value
	public int getTotal () {
		return total;
	}
	
	// Increases the total variable by the passed value
	public void add (int value) {
		total += value;
		history += " + ";
		history += value;
	}
	
	// Decreases the total variable by the passed value
	public void subtract (int value) {
		total -= value;
		history += " - ";
		history += value;
	}
		
	// Returns the history of addition/subtraction that the total variable
	// underwent.
	public String toString () {
		return history;
	}

	// Resets total to 0, and resets the history string
	public void clear() {
		total = 0;
		history = "";
	}
	
	// Main method to test the addingMachine class
	public static void main (String[] args) {
		AddingMachine testBox;
		testBox = new AddingMachine();
		for (int i = 0; i < 10; i ++) {
			int random = (int) (Math.random() * 10);
			System.out.println("Value: " + random);
			if (i % 2 == 0) {
				testBox.add(random);
			} else {
				testBox.subtract(random);
			}
		}
		System.out.println("History:\n" + testBox.toString());
		System.out.println("End value: " + testBox.getTotal());
	}
}


