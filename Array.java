
/**
 * This java class produces an array, sorts the array, and then finds the
 * frequency of the numbers 0-9 in the array.
 * 
 * @author Cole Doty
 * @version 27 Oct 2016
 */
public class Array {
	private int[] array;

	// constructor for Array class
	public Array(int inArray) {
		array = new int[inArray];
	}
	
	//this method fills the array
	public void fill() {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}
	}

	// this method prints the array and the formatting of the array
	public void print() {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array.length == 5) {
				System.out.println("-----------");
				System.out.print("|");
				break;
			}
			if (array.length == 10) {
				System.out.println("---------------------");
				System.out.print("|");
				break;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			count++;
			if (count > 0) {
				System.out.print("|");
			} else if (count < 10) {
				System.out.print("|");
			}
		}
		if (count < 10) {
			System.out.println();
			System.out.println("-----------");
		} else if (count == 10) {
			System.out.println();
			System.out.println("---------------------");
		}
	}

	// this method sorts the array from smallest to largest value
	public void sort() {
		boolean swap = true;
		int num;
		int n = 0;
		while (swap) {
			swap = false;
			n++;
			for (int i = 0; i < array.length - n; i++) {
				if (array[i] > array[i + 1]) {
					num = array[i];
					array[i] = array[i + 1];
					array[i + 1] = num;
					swap = true;
				}
			}
		}
	}
	
	//finds the average of array
	public double average(int[] inputArray) {
		int sum = 0;

		for (int i = 0; i < inputArray.length; i++) {
			sum = sum + inputArray[i];
		}
		double average = (double) sum / inputArray.length;
		return average;
	}

	//finds the maximum value of array
	public int maxValue(int[] inputArray) {
		int max = inputArray[0];
		for (int i = 0; i < inputArray.length; i++)
			if (inputArray[i] > max) {
				max = inputArray[i];
			}
		return max;

	}

	//finds the minimum value of the array
	public int minValue(int[] inputArray) {
		int min = inputArray[0];
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] < min) {
				min = inputArray[i];
			}
		}
		return min;
	}

	//prints the max, min, and average values
	public void printStats() {
		System.out.println();
		System.out.println("Average Value: " + average(array));
		System.out.println("Maximum Value: " + maxValue(array));
		System.out.println("Minimum Value: " + minValue(array));
	}

	// shows how often a number is returned from the array
	public void printFrequency() {
		int[] counter = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < array.length; i++) {
			counter[array[i]]++;
		}

		for (int i = 0; i < counter.length; i++)
			System.out.println("There are " + counter[i] + ", " + i + "'s.");
	}

	public static void main(String[] args) {

		// creates new instance of Array class
		Array a = new Array(5);
		a.fill();
		System.out.println("Original:");
		a.print();
		a.sort();
		System.out.println("Sorted:");
		a.print();
		System.out.println("Frequencies:");
		a.printFrequency();
		a.printStats();
		
		System.out.println();

		// creates new instance of Array class
		Array b = new Array(10);
		b.fill();
		System.out.println("Original:");
		b.print();
		System.out.println("Sorted:");
		b.sort();
		b.print();
		System.out.println("Frequencies:");
		b.printFrequency();
		b.printStats();

	}
}

