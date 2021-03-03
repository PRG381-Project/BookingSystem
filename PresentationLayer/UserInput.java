package PresentationLayer;

import java.util.Scanner;

import BusinessLogicLayer.Booking;

public class UserInput 
{

    private static int amountOfPeople;
    private static String adultMeal;
    private static String kidsMeal;
    private static String drink;
    private static String dessert;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of people attending the event:");
        amountOfPeople = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the meal the adults will have:");
        adultMeal = scan.nextLine();

        System.out.println("Enter the meal the children will have:");
        kidsMeal = scan.nextLine();

        System.out.println("Enter the drink of choice:");
        drink = scan.nextLine();

        System.out.println("Enter dessert of choice");
        dessert = scan.nextLine();
        scan.close();

    }

    public Booking sendBookingInfo()
    {

    }
}
