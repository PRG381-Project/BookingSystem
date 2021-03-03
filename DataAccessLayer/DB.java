package DataAccessLayer;

import java.util.*;
import java.io.*;

import BusinessLogicLayer.Booking;
import BusinessLogicLayer.Event;

public class DB 
{
    public void retrieveFromBLL(ArrayList<Booking> blist) throws IOException
    {
        ArrayList<Booking> bkList = new ArrayList<Booking>();
        ArrayList<Event> evList = new ArrayList<Event>();

        Booking bk;  //instansiated class named Booking
        Event ev;     //instansiated class named Event

        bkList.addAll(blist);
        
        FileWriter fw = new FileWriter("bookingInfo.txt");   //FileWriter opening connection to the text file

        fw.append(bkList.toString());

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
