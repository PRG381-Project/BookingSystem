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

    public int getAmount()
    {
        return this.amountOfPeople;
    }

    @Override
    public String toString() 
    { 
        return String.format("Amount of People: " + this.amountOfPeople + "\t Adult meal: " + this.adultMeal + "\t Kids meal:" + this.kidsMeal + " Drink: " + this.drink + "\t Dessert: " + this.dessert); 
    } 



    public ArrayList<Booking> addBooking()
    {
        ArrayList<Booking> bookingList = new ArrayList<Booking>();
        // Booking newItem = //object coming from presentation layer;
        // bookingList.add(newItem);
        return bookingList;
    }




}
