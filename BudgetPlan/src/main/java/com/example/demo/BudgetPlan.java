package com.example.demo;

import java.util.Scanner;

public class BudgetPlan {

	private static int weeklySavings; // Amount to transfer to High Yield Savings account
	private static int weeklyStockDeposit; // Amount to deposit to RobinHood account
	private static Scanner obj;

	public static void main(String[] args) {

		intro();

	}

	public static void intro() { // ask for username, net income per week

		Scanner obj = new Scanner(System.in);

		System.out.println("Welcome to the Budget Calculator! What is your name? ");

		String User = obj.nextLine();
		
		System.out.println();

		System.out.println("Hello " + User + "! Nice to meet you!");

		Income(User);

	}

	public static void Income(String User) {

		System.out.println();

		obj = new Scanner(System.in);

		System.out.println("Do you get paid weekly or bi-weekly? \n Enter 1 for weekly, 2 for bi-weekly ");

		int weekPay = obj.nextInt();
		
		System.out.println();

		System.out.println("How much do you get paid every check after taxes? ");

		double userPay = obj.nextDouble();
		
		System.out.println();

		switch (weekPay) { // Used Switch/Case over If/Else statements for Runtime Efficiency

		case 1:

			userPay = (userPay * weekPay * 4);
			System.out.println("You earn approximately $" + userPay	+ " per month!" );
			System.out.println("For financial education purposes, we usually measure"
					+ " increments of time by months to make personal finances easier to manage.");
			Debt(userPay);
			break;

		case 2:

			userPay = (userPay * weekPay * 2);
			System.out.println("You earn approximately $" + userPay	+ " per month!" );
			System.out.println("For financial education purposes, we usually measure"
					+ " increments of time by months to make personal finances easier to manage.");
			Debt(userPay);
			break;
		}

	}

	public static void Debt(double userPay) {

		obj = new Scanner(System.in);

		System.out.println(
				"What is the total cost of all of your bills within a month? (These are known as your monthly expenses) ");

		double monthlyExpense = obj.nextDouble();

		double freeIncome = userPay - monthlyExpense;

		double freeIncomePercent = (freeIncome / userPay) * 100;

		System.out.println("Awesome! You have " + freeIncome + " to invest and save! Or in other words, "
				+ freeIncomePercent + "%");

		SavingsCalculator(userPay, freeIncome, freeIncomePercent);

	}

	public static void SavingsCalculator(double userPay, double freeIncome, double freeIncomePercent) {

		obj = new Scanner(System.in);

		System.out
				.println("Out of your remaining " + freeIncome + "how much do you feel comfortable saving per month?");

		double userSavings = obj.nextDouble(); // how much user can save outside of casual/discretionary spending

		double userIdealSave = (userPay * .10);

		if (userSavings < userIdealSave) {

			System.out.println("This amount is fine for now, but in the future lets strive to aim for $" + userIdealSave
					+ "since that is 10% of what you bring home every month");

		} else {

			System.out.println("Excellent goal! That is over 10% of what you bring home per month! ");
		}

		System.out.println("Do you have an Emergency savings account? Enter 1 for Yes and 2 for No ");

		int emSavingsQuestion = obj.nextInt();

		switch (emSavingsQuestion) {

		case 1:
			System.out.println("What's the interest rate ? ");
			double emInterestRatePercent = obj.nextDouble();
			if (emInterestRatePercent < 1.5) {

				System.out.println("I would highly advise moving your money to an account with an interate rate "
						+ "of 1.50% or better. This way your money is earning you more for just sitting there ");
			}
		case 2:
			System.out.println(
					"That ok! Lets begin by choosing a savings account with an interest rate of"
					+ " 1.50% or better. This way your money is earning you more for just sitting there."
					+ " Our goal is to get to $1000 before beginning to invest ");
		}


		System.out.println("In addition to having an Emergency savings account, its very important "
				+ "to grow your money while you sleep. This is where investing comes in. ");

	}

	public static void Investment() {
		
		
		
	}

}
