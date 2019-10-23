package co.grandcircus;

import java.util.Scanner;

public class Lab8StudentInfo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userNum = 0;

		String[] arrNames = { "Bryan", "Bob", "Steve", "Robbie", "Ben", "Dru", "Ashley", "Abbey", "Jazz", "Chloe" };

		String[] arrCitys = { "Detroit", "Saigon", "Hanoi", "Hong Kong", "Cuzco", "Varansai", "New Orleans", "New York",
				"Cao Lao", "Burma" };

		String[] arrFood = { "Ice Cream", "Steak", "Pho", "Dim Sum", "Baked Goods", "Veggie Garlic Curry", "Po-Boy",
				"Steak", "Cao Lao", "BolaChung" };

		String userQuest = "y";
		while (userQuest.equals("y")) {

			System.out.println("Welcome to our Java class. Which student would you like to learn more about? (enter\r\n"
					+ "a number 1-10): ");
			userNum = Validator.getInt(scan, "Please Enter a digit 1-10:  ");
			userNum = userNum - 1;
			while (userNum > 9) {
				System.out.println("You have enter a digit above 10");
				userNum = Validator.getInt(scan, "Please Enter a digit 1-10:  ");
				continue;
			}
			String selectName = arrNames[userNum];

			System.out.println("What would you like to know about " + selectName + "?");
			System.out.println("Please type either - city - or - food -");

			String cityOrFood = scan.nextLine();

			
			while (!cityOrFood.equals("city") && !cityOrFood.equals("food")) {
				 
				 System.out.println("Please Enter Either city or food...");
				 System.out.println("What would you like to know about " + selectName + "?");
				 System.out.println("Please type either - city - or - food -");
				 
				 cityOrFood = scan.nextLine();
			
			}
			if (cityOrFood.equals("city")) {
				System.out.print("They were born in: ");
				System.out.println(arrCitys[userNum]);

			}
			if (cityOrFood.equals("food")) {
				System.out.print("Their Favorite Food is: ");
				System.out.println(arrFood[userNum]);

			}


			System.out.println("Would you like to know more?");
			System.out.println("Please enter y to repeat");
			userQuest = scan.next();

		}

	}

}
