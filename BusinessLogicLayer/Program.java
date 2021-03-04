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

        while(loop.equals(true))
        {
            //Runtime.getRuntime().exec("cls");
            Booking bookInfo = new Booking();
            UserInput ui = new UserInput();
            DB data = new DB();  
            
            bookInfo = ui.getInfo();        
            tempList = Booking.addBooking(bookInfo);            
            data.retrieveFromBLL(tempList);

            System.out.println("Type NO to exit or YES to add another booking");
            String answer = scan.nextLine();

            if(answer.toLowerCase().equals("no"))
            {
                loop = false;
            }
        }
        scan.close();           
    }
}