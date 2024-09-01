package Week4;

import java.util.Arrays;

//Emily Regan

//In Eclipse IDE, write the code that accomplishes the objectives listed below and ensures that the code compiles and runs as directed.
//Comment your code, to prove that you understand what you have written -- this is required!
//Create a new repository on GitHub for this week's assignments and push your code to the repository.
//Create a Video showcasing your assignment.
//Submit the two URL links for the GitHub repo and Video in the Text box.


public class week4Assignment {

	public static void main(String[] args) {
//Coding Steps
		
//	1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};  
		//Here I've created an array of int called "ages" that has initialized the parts with the listed specific values.
		
	 //	a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
			System.out.println("Problem number 1.a.");
			System.out.println((ages[ages.length-1]) - (ages[0]));
		  //Here, I've found a way to reference the last element of the array without using "7" and completing the task.
		  
	//	b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
		  int[] ages2 = new int[9];
		  //I've used a different way to initialize an array here with only the length of the array & int type known.
		  System.out.println("Problem number 1.b.");
		// i. Make sure that there are 9 elements of type int in this new array.  
		  System.out.println(ages2.length);
		//Above, I've used the length attribute of the array to check that there are 9 elements in the new array.
		  
		// ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
		  System.out.println((ages2[ages2.length-1]) - (ages2[0]));
		//Here, I've repeated the way I took to programmatically subtract the value of the first element in the new array ages2 from the last element of ages2 without referencing the specific last element by number.
		  
		// iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
		//Using index values to refer to elements is dynamic and can work for arrays of different lengths. The length strategy being used to reference the same elements in arrays of different lengths (ages3 and ages4 below) proves this.
		  int[] ages3 = {13, 22, 4}; 
		  	System.out.println((ages3[ages3.length-1]) - (ages3[0]));
		  int[] ages4 = {17, 8, 4, 77};
		  	System.out.println((ages4[ages4.length-1]) - (ages4[0]));
		  	
	// c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		  		System.out.println("Problem number 1.c.");
		  	for ( int i = 0; i < 1; i++ ) {
		  	int average = (ages[0] + ages[1] + ages[2] + ages[3] + ages[4] + ages[5] + ages[6] + ages[7]) / ages.length;
			System.out.println(average);
			//Here, I've created a for loop and calculating the sum of all ages elements and dividing by the length.
		  	}
//  2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		//Here I've created an array of String called "names" that has initialized the parts with the listed specific values.
		
	// a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
				System.out.println("Problem number 2.a.");
			double sumOfLetters = 0;
			for (String name : names) {
				sumOfLetters += name.length();	
			}
			System.out.println("Sum of the letters is: ");
				System.out.println(sumOfLetters);
			System.out.println("Average of the letters is: ");
				System.out.println((sumOfLetters) / (names.length));
		//Here I have calculated the average number of letters per name using an enhanced for loop. I've printed the result using .length.
		
	// b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
			System.out.println("Problem number 2.b.");
			String allNames = (names[0]) + " " + (names[1]) + " " + (names[2]) + " " + (names[3]) + " " + (names[4]) + " " + (names[5]);
			for (String name : names) {	
				}
			System.out.println(allNames);
		//Here I have created a string variable to contain the concatenated names I'd like to include and have iterated through the same array, and printed out the string variable.
			
//  3. How do you access the last element of any array?
	//You can use the .length minus 1 of the array to access the last Element since the index is zero-based. For example, arrayName[arrayName.length - 1];
		
		  
//  4. How do you access the first element of any array?
	//The first element of any array is 0, due to the index is zero-based. For example, arrayName[0]; will access the first element of the array since it is 	
		

//  5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
			System.out.println("Problem number 5");
			int[] nameLengths = new int [names.length];
			for ( int i = 0; i < names.length; i++ ) {
			nameLengths[i] = names[i].length();	
			}
			System.out.println(Arrays.toString(nameLengths));
		//For this question I created the new array nameLengths using the names.length from earlier and re-used the for loop. Then I added the length of each name from the array to the new array.
		
//  6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
			System.out.println("Problem number 6");
			int sumOfElements = 0;	
			for ( int i = 0; i < names.length; i++ ) {
				sumOfElements += nameLengths[i];
			}
			System.out.println(sumOfElements);
		//Here, I've used the same for loop for names.length and made a new int called sumOfElements adding up all the name lengths to get 23.
	
//  7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
			}
			public static String concatenatedWord(String word, int n) { 
		  	String result = "";
		  	for (int i = 0; i < n; i++) {
		  		result += word;
		  	}
		  	return result;
		  	}
		//For this problem, I've started the method signature with access modifiers public static. The method is called concatenatedWord, and it will return a string of whatever word is entered concatenated the number of times indicated by n (two parameters).
		
//  8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
			public static String createFullName(String firstName, String lastName) { 
			String fullName = firstName + " " + lastName;
			return fullName;
			}
			{
		
		//For this problem, I created a method signature with access modifiers public static. Then I created a method that returns type string adding the parameters firstName and lastName together with a space in between them.
		
//  9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		}
		public static boolean isSumArrayMoreThan100(int [] numbers) {
		int sum = 0;
		for (int number : numbers) {
			if (sum > 100); {
			return true;
				}
			}
			return false;
		}			
					
		//The method I've written uses the same access modifiers. This time, I've created one that will return boolean true if the sum of the array of ints is greater than 100.
		
//  10. Write a method that takes an array of double and returns the average of all the elements in the array.
		public static double avgArray(double [] elements) {
		double sum2 = 0;
		for (double element : elements) {
		sum2 += element;
		}
		return sum2 / elements.length ;
		}
		
		//For this problem I've used a similar strategy as other method problems and included the public static access modifiers and taken in a double type to return a double average of all the elements in the array as shown in the return statement (sum divided by length of the array = average).
		
//  11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		public static Boolean compareArrayAvg(double [] array3, double [] array4) {
		for (array3 : arrays3, array4 : arrays4) {
		if (double sum3 / array3.length) > (double sum4 / array4.length){
			return true;
		}
	}
}
		//This method is not completely right, but I've tried to compare two arrays of double type and return true if the average of elements in the first one are greater than the average of those in the second.
		
//  12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		public static Boolean willBuyDrink(Boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
				}
		//This method takes in a boolean and a double and only returns true if isHotOutside is true and moneyInPocket is > 10.50.
		
//  13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.	
		public static int findSmallestNumber (int[] numbers) {
			int smallest = numbers[0];
			for (int number : numbers) {
				if (number < smallest) {
					smallest = number;
				}
		}
			return smallest;
	}
		
		 //This method uses an array of type int and I created it so it could figure out and return the smallest number in that array.
		  	
	}