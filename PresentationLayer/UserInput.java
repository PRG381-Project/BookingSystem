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
    public int TotPrice = 1000;

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
            if(adultMeal == "Burgers"){
                TotPrice = TotPrice + 30;
            }else if(adultMeal == "Pasta"){
                TotPrice = TotPrice + 50;
            }else if(adultMeal == "Pizza"){
                TotPrice = TotPrice + 65;
            }else if(adultMeal == "Salad"){
                TotPrice = TotPrice + 30;
            }else if(adultMeal == "Fish & Chips"){
                TotPrice = TotPrice + 70;
            }else if(adultMeal == "Steak & Wedges"){
                TotPrice = TotPrice + 110;
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
            if(kidsMeal == "Burgers"){
                TotPrice = TotPrice + 20;
            }else if(kidsMeal == "Fish Fingers"){
                TotPrice = TotPrice + 25;
            }else if(kidsMeal == "Pizza"){
                TotPrice = TotPrice + 50;
            }else if(kidsMeal == "Chips"){
                TotPrice = TotPrice + 15;
            }else if(kidsMeal == "Fish & Chips"){
                TotPrice = TotPrice + 50;
            }else if(kidsMeal == "Mac & Cheese"){
                TotPrice = TotPrice + 45;
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
            if(drink == "Coke"){
                TotPrice = TotPrice + 15;
            }else if(drink == "Cream Soda"){
                TotPrice = TotPrice + 15;
            }else if(drink == "Fanta"){
                TotPrice = TotPrice + 15;
            }else if(drink == "Wine"){
                TotPrice = TotPrice + 20;
            }else if(drink == "Whiskey"){
                TotPrice = TotPrice + 34;
            }else if(drink == "Beer"){
                TotPrice = TotPrice + 15;
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
            if(dessert == "Ice Cream"){
                TotPrice = TotPrice + 15;
            }else if(dessert == "Chocolate pudding"){
                TotPrice = TotPrice + 25;
            }else if(dessert == "Cheese cake"){
                TotPrice = TotPrice + 20;
            }else if(dessert == "Chocolate Moose"){
                TotPrice = TotPrice + 20;
            }

        }catch(Exception e){
            System.out.println(e.toString());
        }

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
