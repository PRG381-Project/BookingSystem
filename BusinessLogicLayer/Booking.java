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

    /*public ArrayList<Booking> addBooking(presentation layer object with booking data)
    {
        ArrayList<Booking> bookingList = new ArrayList<Booking>();
        Booking newItem = //parameter;
        bookingList.add(newItem);
        return bookingList;
    }*/




}
