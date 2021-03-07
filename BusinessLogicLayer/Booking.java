package BusinessLogicLayer;
import java.util.*;

public class Booking
{
    int amountOfPeople;
    String adultMeal;
    String kidsMeal;
    String drink;
    String dessert;

    public Booking(int amount, String adult, String kid, String drink, String dessert)
    {
        this.amountOfPeople = amount;
        this.adultMeal = adult;
        this.kidsMeal = kid;
        this.drink = drink;
        this.dessert = dessert;
    }

    public Booking()
    {

    }

    @Override
    public String toString() 
    { 
        return String.format("Amount of People: " + this.amountOfPeople + "\t Adult meal: " + this.adultMeal + "\t Kids meal:" + this.kidsMeal + " Drink: " + this.drink + "\t Dessert: " + this.dessert); 
    } 

    public static ArrayList<Booking> addBooking(Booking b)
    {
        ArrayList<Booking> bookingList = new ArrayList<Booking>();
        Booking newItem = b; //presentation layer object;
        bookingList.add(newItem);
        return bookingList;
    }




}
