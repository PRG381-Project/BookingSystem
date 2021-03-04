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

        bkList.addAll(blist);
        
        FileWriter fw = new FileWriter("bookingInfo.txt",true);   //FileWriter opening connection to the text file

        fw.write(bkList.toString()+"\n");

        fw.close(); //closing the connection to the text file. 
    }     
}
