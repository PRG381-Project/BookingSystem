package BusinessLogicLayer;
import java.util.*;
import java.io.IOException;

import DataAccessLayer.DB;
import PresentationLayer.UserInput;

public class Program
{
    public static void main(String[] args) throws IOException 
    {
        // Scanner NumOfPeople = new Scanner(System.in);
        // System.out.print("Enter Number of People: ");   
        // int Num = NumOfPeople.nextInt();      

        // if(Num > 40)
        // {
        //     int price;
        //     int newPrice = price / 15 * 100;
        //     System.out.print("Total adult's meal price: " + newPrice);
        // }

        Booking bookInfo = new Booking();
        UserInput ui = new UserInput();  
        DB data = new DB();

        bookInfo = ui.getInfo();

        ArrayList<Booking> tempList = new ArrayList<Booking>();
        tempList = Booking.addBooking(bookInfo);

        data.retrieveFromBLL(tempList);
    }
}