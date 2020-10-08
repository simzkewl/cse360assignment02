//Name: Simran Bhalla
// Repository available at: https://github.com/simzkewl/cse360assignment02.git

package cse360assignment02;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility class which aids in the addition of numbers and the memory thereof
 */
public class AddingMachine {
	private int total;
	private List<Transaction> transactions;

	/**
	 * Default constructor, initializes members
	 */
	public AddingMachine() {
		total = 0; // not needed - included for clarity
		transactions = new ArrayList<Transaction>();
	}

	/**
	 * Get the total of previous addition operations
	 * @return Sum of operands
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * Add value to total
	 * @param value Amount by which to increase total
	 */
	public void add(int value) {
		total += value;
		
		transactions.add(new Transaction(value >= 0, Math.abs(value)));
	}

	/**
	 * Subtract value from total
	 * @param value Amount by which to decrease total
	 */
	public void subtract(int value) {
		total -= value;
		
		transactions.add(new Transaction(value < 0, Math.abs(value)));
	}

	/**
	 * Display transaction history
	 */
	public String toString() {
		String str = "0";
		for (Transaction tr : transactions) {
			str += tr.toString();
		}
		return str;
	}

	/**
	 * Empty transaction history and reset total to 0
	 */
	public void clear() {
		total = 0;
		
		transactions.clear();
	}
}

class Transaction {
	private boolean positive;
	private int value;
	public Transaction(boolean positive, int value) {
		this.positive = positive;
		this.value = value;
	}
	
	public String toString() {
		if (positive) {
			return " + " + String.valueOf(value);
		}
		else {
			return " - " + String.valueOf(value);
		}
	}
}