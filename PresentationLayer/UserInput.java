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
            if(adultMeal.toLowerCase().equals("burgers")){
                TotPrice += 30;
            }else if(adultMeal.toLowerCase().equals("pasta")){
                TotPrice += 50;
            }else if(adultMeal.toLowerCase().equals("pizza")){
                TotPrice += 65;
            }else if(adultMeal.toLowerCase().equals("salad")){
                TotPrice += 30;
            }else if(adultMeal.toLowerCase().equals("fish & chips")){
                TotPrice += 70;
            }else if(adultMeal.toLowerCase().equals("steak & wedges")){
                TotPrice += 110;
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
            if(kidsMeal.toLowerCase().equals("burgers")){
                TotPrice += 20;
            }else if(kidsMeal.toLowerCase().equals("fish fingers")){
                TotPrice += 25;
            }else if(kidsMeal.toLowerCase().equals("pizza")){
                TotPrice += 50;
            }else if(kidsMeal.toLowerCase().equals("chips")){
                TotPrice += 15;
            }else if(kidsMeal.toLowerCase().equals("fish & chips")){
                TotPrice += 50;
            }else if(kidsMeal.toLowerCase().equals("mac & cheese")){
                TotPrice += 45;
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
            if(drink.toLowerCase().equals("coke")){
                TotPrice += 15;
            }else if(drink.toLowerCase().equals("cream soda")){
                TotPrice += 15;
            }else if(drink.toLowerCase().equals("fanta")){
                TotPrice += 15;
            }else if(drink.toLowerCase().equals("wine")){
                TotPrice += 20;
            }else if(drink.toLowerCase().equals("whiskey")){
                TotPrice += 34;
            }else if(drink.toLowerCase().equals("beer")){
                TotPrice += 15;
            }

        }catch(Exception e){
            System.out.println(e.toString());
        }

        System.out.println("Enter dessert of choice from the options bellow:");
        System.out.println("Ice cream:: R15");
        System.out.println("Chocolate pudding: R25");
        System.out.println("Cheese cake: R20");
        System.out.println("Chocolate Mousse: R20");
        dessert = scan.nextLine();
        
        try{
            if(dessert.toLowerCase().equals("ice cream")){
                TotPrice += 15;
            }else if(dessert.toLowerCase().equals("chocolate pudding")){
                TotPrice += 25;
            }else if(dessert.toLowerCase().equals("cheese cake")){
                TotPrice += 20;
            }else if(dessert.toLowerCase().equals("chocolate mousse")){
                TotPrice += 20;
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

        try{
            if(eventType.toLowerCase().equals("wedding")){
                TotPrice = 1500;
            }else if(eventType.toLowerCase().equals("birthday")){
                TotPrice = 1000;
            }else if(eventType.toLowerCase().equals("funeral")){
                TotPrice = 1500;
            }else if(eventType.toLowerCase().equals("business event")){
                TotPrice = 5000;
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }

        System.out.println("Enter event date, Format: dd/MM/yyyy");
        eventDate = scan.nextLine();
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(eventDate);
        System.out.println("Enter event address:");
        eventAddress = scan.nextLine();

        Event ev = new Event(eventType, date1, eventAddress);
        return ev;
    }
 
}
