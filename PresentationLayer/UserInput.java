package PresentationLayer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.*;

import BusinessLogicLayer.Booking;
import BusinessLogicLayer.Event;

public class UserInput {

    private static int amountOfPeople;
    private static String adultMeal;
    private static String kidsMeal;
    private static String drink;
    private static String dessert;

    private static String eventType;
    private static String eventDate;
    private static String eventAddress;

    public Booking getInfo() throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the amount of people attending the event:");
        amountOfPeople = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the meal the adults will have from the options bellow:");
        System.out.println("Burgers");
        System.out.println("Pasta");
        System.out.println("Pizza");
        System.out.println("Salad");
        System.out.println("Fish & Chips");
        System.out.println("Steak & Wedges");
        adultMeal = scan.nextLine();

        System.out.println("Enter the meal the children will have from the options bellow:");
        System.out.println("Burgers");
        System.out.println("Fish fingers");
        System.out.println("Pizza");
        System.out.println("Chips");
        System.out.println("Fish & Chips");
        System.out.println("Mac & Cheese");
        kidsMeal = scan.nextLine();

        System.out.println("Enter the drink of choice from the options bellow:");
        System.out.println("Coke");
        System.out.println("Cream Soda");
        System.out.println("Fanta");
        System.out.println("Wine");
        System.out.println("Whiskey");
        System.out.println("Beer");
        System.out.println("Orange juice");
        System.out.println("Apple juice");
        drink = scan.nextLine();

        System.out.println("Enter dessert of choice from the options bellow:");
        System.out.println("Ice cream");
        System.out.println("Chocolate pudding");
        System.out.println("Cheese cake");
        System.out.println("Chocolate Moose");
        dessert = scan.nextLine();

        Booking b = new Booking(amountOfPeople, adultMeal, kidsMeal, drink, dessert);
        return b;
    }

    public Event getEvent() throws ParseException
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter event type (Wedding/Birthday/Funeral/Business Event):");
        eventType = scan.nextLine();
        System.out.println("Enter event date, Format: dd/MM/yyyy");
        eventDate = scan.nextLine();
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(eventDate);
        System.out.println("Enter event address:");
        eventAddress = scan.nextLine();

        Event ev = new Event(eventType, date1, eventAddress);
        return ev;
    }
 
}
