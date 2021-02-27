package DataAccessLayer;
import java.io.*;
import java.io.FileWriter;
import BusinessLogicLayer.Booking;


public class DB 
{
    public static void main(String[] args) throws IOException 
    {

        Booking bk;  //instansiated class named Booking
        //Event ev;     //instansiated class named Event
        
        FileWriter fw = new FileWriter("text.txt");   //FileWriter opening connection to the text file

        for(int i = 0; i < bk.Booking.size(); i++){ //for loop iterating through arrayList, writing each entry to the text file
            fw.write(bk.Booking.get(i));
        }

        for(int i = 0; i < ev.Event.size(); i++){ //for loop iterating through arrayList, writing each entry to the text file
            fw.write(ev.Event.get(i));
        }

        fw.close(); //closing the connection to the text file. 

   } 
    



     
}
