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
    public double TotPrice = 1000;

    public Booking getInfo() throws IOException {

        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the amount of people attending the event:");
        amountOfPeople = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the meal the adults will have from the options bellow:");
        System.out.println("Burgers: R30");
        System.out.println("Pasta: R50");
        System.out.println("Pizza: R65");
        System.out.println("Salad: R30");
        System.out.println("Fish & Chips: R70");
        System.out.println("Steak & Wedges: R110");
        adultMeal = scan.nextLine();
        try{
            if(adultMeal.equals("Burgers")){
                TotPrice += 30;
            }else if(adultMeal.equals("Pasta")){
                TotPrice =+ 50;
            }else if(adultMeal.equals("Pizza")){
                TotPrice =+ 65;
            }else if(adultMeal.equals("Salad")){
                TotPrice =+ 30;
            }else if(adultMeal.equals("Fish & Chips")){
                TotPrice =+ 70;
            }else if(adultMeal.equals("Steak & Wedges")){
                TotPrice =+ 110;
            }

        }catch(Exception e){
            System.out.println(e.toString());
        }

      
        

        System.out.println("Enter the meal the children will have from the options bellow:");
        System.out.println("Burgers: R20");
        System.out.println("Fish fingers: R25");
        System.out.println("Pizza: R50");
        System.out.println("Chips: R15");
        System.out.println("Fish & Chips: R50");
        System.out.println("Mac & Cheese: R45");
        kidsMeal = scan.nextLine();
        try{
            if(kidsMeal.equals("Burgers")){
                TotPrice =+ 20;
            }else if(kidsMeal.equals("Fish Fingers")){
                TotPrice =+ 25;
            }else if(kidsMeal.equals("Pizza")){
                TotPrice =+ 50;
            }else if(kidsMeal.equals("Chips")){
                TotPrice =+ 15;
            }else if(kidsMeal.equals("Fish & Chips")){
                TotPrice =+ 50;
            }else if(kidsMeal.equals("Mac & Cheese")){
                TotPrice =+ 45;
            }

        }catch(Exception e){
            System.out.println(e.toString());
        }

        System.out.println("Enter the drink of choice from the options bellow:");
        System.out.println("Coke: R15");
        System.out.println("Cream Soda: R15");
        System.out.println("Fanta: R15");
        System.out.println("Wine: R20");
        System.out.println("Whiskey: R34");
        System.out.println("Beer: R15");
        
        drink = scan.nextLine();
        try{
            if(drink.equals("Coke")){
                TotPrice =+ 15;
            }else if(drink.equals("Cream Soda")){
                TotPrice =+ 15;
            }else if(drink.equals("Fanta")){
                TotPrice =+ 15;
            }else if(drink.equals("Wine")){
                TotPrice =+ 20;
            }else if(drink.equals("Whiskey")){
                TotPrice =+ 34;
            }else if(drink.equals("Beer")){
                TotPrice =+ 15;
            }

        }catch(Exception e){
            System.out.println(e.toString());
        }

        System.out.println("Enter dessert of choice from the options bellow:");
        System.out.println("Ice cream:: R15");
        System.out.println("Chocolate pudding: R25");
        System.out.println("Cheese cake: R20");
        System.out.println("Chocolate Moose: R20");
        dessert = scan.nextLine();
        
        try{
            if(dessert.equals("Ice Cream")){
                TotPrice =+ 15;
            }else if(dessert.equals("Chocolate pudding")){
                TotPrice =+ 25;
            }else if(dessert.equals("Cheese cake")){
                TotPrice =+ 20;
            }else if(dessert.equals("Chocolate Moose")){
                TotPrice =+ 20;
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }

        
        if(amountOfPeople >= 40){
            TotPrice =  TotPrice * 0.85;
        }  
        
        System.out.println("Total cost: " + TotPrice);

        Booking b = new Booking(amountOfPeople, adultMeal, kidsMeal, drink, dessert);
        return b;
    }

    public Event getEvent() throws ParseException
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter event type:");
        System.out.println("Wedding: R1000");
        System.out.println("Birthday: R1000");
        System.out.println("Funeral: R1000");
        System.out.println("Business Event: R1000");
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
