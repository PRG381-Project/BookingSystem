package BusinessLogicLayer;
import java.util.*;
import java.io.IOException;

import DataAccessLayer.DB;
import PresentationLayer.UserInput;

public class Program
{
    public static void main(String[] args) throws IOException 
    {
        ArrayList<Booking> tempList = new ArrayList<Booking>();
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

        while(loop == true)
        {
            Booking bookInfo = new Booking();
            UserInput ui = new UserInput();  
            
            bookInfo = ui.getInfo();        
            tempList = Booking.addBooking(bookInfo);

            System.out.println("Type NO to exit or YES to add another booking");
            String answer = scan.nextLine();
            if(answer.toLowerCase() == "no")
            {
                loop = false;
                break;
            }
        }
        scan.close();
        
        DB data = new DB();
        data.retrieveFromBLL(tempList);
    }
}