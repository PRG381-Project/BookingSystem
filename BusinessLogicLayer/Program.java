package BusinessLogicLayer;
import java.util.*;
import java.io.IOException;
import java.text.ParseException;

import DataAccessLayer.DB;
import PresentationLayer.UserInput;

public class Program {
    public static void main(String[] args) throws IOException, ParseException 
    {
        ArrayList<Booking> tempList = new ArrayList<Booking>();
        ArrayList<Event> evList = new ArrayList<Event>();
        Boolean loop = true;        
        Scanner scan = new Scanner(System.in);


        // Scanner NumOfPeople = new Scanner(System.in);
        // System.out.print("Enter Number of People: ");   
        // int Num = NumOfPeople.nextInt();      

        // if(Num > 40)
        // {
        //     int price;
        //     int newPrice = price / 15 * 100;
        //     System.out.print("Total adult's meal price: " + newPrice);
        // }

        while(loop.equals(true))
        {
            UserInput i = new UserInput();

            //Runtime.getRuntime().exec("cls");
            Booking bookInfo = new Booking();
            UserInput ui = new UserInput();
            DB data = new DB();  
            Event eventDetails = new Event();
            
            eventDetails = ui.getEvent(); 
            evList = Event.addEvent(eventDetails);

            bookInfo = ui.getInfo();             
            tempList = Booking.addBooking(bookInfo);

            data.retrieveFromBLL(tempList, evList);

            System.out.println("Type NO to exit or YES to add another booking");
            String answer = scan.nextLine();
            System.out.println("Your total price is: R" + i.TotPrice + ".00");

            if(answer.toLowerCase().equals("no"))
            {
                loop = false;
            }
        }
        scan.close();           
    }
}