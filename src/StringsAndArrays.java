import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class StringsAndArrays {

	// This string returns n times the word parameter
	public static String echo(String word, int n) {

		String echoThis = "";

		for (int i = 0; i < n; i++) {
			echoThis += word;
		}

		return echoThis;
	}

	// This method takes in two strings and returns them
	// with a space in between
	public static String fullName(String first, String last) {

		return first + " " + last;

	}

	// This method returns boolean value based on
	// condition of sum being greater than 100
	public static boolean oneHundred(int[] integers) {

		int sum = 0;

		for (int ints : integers) {
			sum += ints;
		}

		return (sum > 100);

	}

	// This method returns the average of the array of doubles
	public static double avgDoubles(double[] doubles) {

		double sum = 0.0;

		for (double dubs : doubles) {
			sum += dubs;
		}
		return sum / doubles.length;
	}

	// This method determines and returns true if the average of the first
	// array is greater than the second array
	public static boolean higherAvg(double[] firstArr, double[] secondArr) {

		double sumOne = 0.0;
		double sumTwo = 0.0;

		for (double dubs : firstArr) {
			sumOne += dubs;
		}

		for (double dubs : secondArr) {
			sumTwo += dubs;
		}

		return (sumOne / firstArr.length) > (sumTwo / secondArr.length);
	}

	// This method has parameters boolean and double and returns the AND truth table
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return (isHotOutside && moneyInPocket > 10.50);
	}

	// This method takes in a List of zeros and ones and converts
	// the binary number to its integer equivalent.
	public static int convertBinaryArrToInt(List<Integer> binary) {

		int sum = 0;
		int i = binary.size() - 1;
		int count = 0;

		while (i >= 0) {
			if (binary.get(i) == 1) {
				sum += Math.pow(2, count);
			}
			count++;
			i--;
		}

		return sum;
	}

	public static void main(String[] args) {

		// QUESTION 1
		System.out.println("Answers to Question 1");
		System.out.println("-----------------------");

		// Declaring and initializing array ages of type integer
		int[] ages = new int[] { 3, 9, 23, 64, 2, 8, 28, 93 };
		int indexOne = ages[0];
		int lastIndex = ages[ages.length - 1];
		System.out.println("The first minus the last element = " + (indexOne - lastIndex));

		// Statically adding a new age to array ages
		ages = new int[] { 3, 9, 23, 64, 2, 8, 28, 93, 43 };
		int lastIndex2 = ages[ages.length - 1];
		System.out.println("The first minus the last element = " + (indexOne - lastIndex2));

		// Using a loop to iterate through array ages to calculate the average
		double sum = 0.0;
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
		}

		// Creating format object to two decimal places
		DecimalFormat df = new DecimalFormat("0.00");
		double average = (sum / ages.length);
		System.out.println("The average age = " + df.format(average));

		// QUESTION 2
		System.out.println("\nAnswers to Question 2");
		System.out.println("---------------------");

		String[] names = new String[] { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };

		// for loop to calculate average number of letters per name.
		double sum2 = 0;
		for (int i = 0; i < names.length; i++) {
			sum2 += names[i].length();
		}

		double nameAverage = (sum2 / names.length);
		System.out.println("The average letter per name = " + df.format(nameAverage));

		// for loop to concatenate names with spaces
		String allNames = "";
		for (String name : names) {
			allNames += (name + " ");
		}
		System.out.println(allNames);

		// Question 5

		System.out.println("\nAnswer to Question 5");
		System.out.println("---------------------");

		int[] nameLengths = new int[names.length];

		// for loop to add length of each name from array names

		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.println(Arrays.toString(nameLengths));

		// QUESTION 6

		System.out.println("\nAnswer to Question 6");
		System.out.println("---------------------");

		int sumNameLengths = 0;

		for (int lengths : nameLengths) {
			sumNameLengths += lengths;
		}

		System.out.println(sumNameLengths);

		// QUESTION 7
		System.out.println("\nAnswer to Question 7");
		System.out.println("---------------------");
		System.out.println(echo("Hello", 3));

		// QUESTION 8
		System.out.println("\nAnswer to Question 8");
		System.out.println("---------------------");
		System.out.println(fullName("Marcus", "Aurelius"));

		// QUESTION 9
		System.out.println("\nAnswer to Question 9");
		System.out.println("---------------------");

		int[] intArray = new int[] { 43, 3, 6, 9, 40 };
		System.out.println(oneHundred(intArray));

		// QUESTION 10
		System.out.println("\nAnswer to Question 10");
		System.out.println("---------------------");

		double[] doubles = new double[] { 34.2, 56.4, 76.8, 23.1 };
		System.out.println(df.format(avgDoubles(doubles)));

		// QUESTION 11
		System.out.println("\nAnswer to Question 11");
		System.out.println("---------------------");

		double[] firstArr = new double[] { 43.2, 56.3, 29.4 };
		double[] secondArr = new double[] { 47.5, 53.5, 20.9 };

		System.out.println(higherAvg(firstArr, secondArr));

		// QUESTION 12
		System.out.println("\nAnswer to Question 12");
		System.out.println("---------------------");
		System.out.println(willBuyDrink(true, 10.49));
		System.out.println(willBuyDrink(true, 10.51));
		System.out.println(willBuyDrink(false, 10.51));
		System.out.println(willBuyDrink(false, 10.49));

		// QUESTION 13
		System.out.println("\nAnswer to Question 13");
		System.out.println("---------------------");

		// Declaring and initializing a list to pass into binary conversion method above
		List<Integer> binary_0 = new ArrayList<Integer>(Arrays.asList(0, 1, 1, 1));
		System.out.println(convertBinaryArrToInt(binary_0));
	}

}
