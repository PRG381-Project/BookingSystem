package DataAccessLayer;

import java.util.*;
import java.io.*;
import java.io.FileWriter;

import BusinessLogicLayer.Booking;
import BusinessLogicLayer.Event;


public class DB 
{
    public static void main(String[] args) throws IOException 
    {
        ArrayList<Booking> bkList = new ArrayList<Booking>();
        ArrayList<Event> evList = new ArrayList<Event>();

        Booking bk;  //instansiated class named Booking
        Event ev;     //instansiated class named Event

        bkList.addAll(Booking.addBooking());
        
        FileWriter fw = new FileWriter("text.txt");   //FileWriter opening connection to the text file

        fw.write(bkList.toString());

        // for(int i = 0; i < bkList.size(); i++)//for loop iterating through arrayList, writing each entry to the text file
        // { 
            
        // }

        // for(int i = 0; i < ev.Event.size(); i++) //for loop iterating through arrayList, writing each entry to the text file
        // { 
        //     fw.write(ev.Event.get(i));
        // }

        fw.close(); //closing the connection to the text file. 

   } 
    



     
}
