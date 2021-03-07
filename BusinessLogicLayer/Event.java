package BusinessLogicLayer;
import java.util.*;

public class Event 
{
    String eventType;
    Date eventDate;
    String eventAddress;    

    public Event(String et, Date dt, String ea)
    {
        this.eventType = et;
        this.eventDate = dt;
        this.eventAddress = ea;
    }

    public Event()
    {

    }

    public static ArrayList<Event> addEvent(Event e)
    {
        ArrayList<Event> eventList = new ArrayList<Event>();
        Event newItem = e; //presentation layer object;
        eventList.add(newItem);
        return eventList;
    }

    @Override
    public String toString() 
    { 
        return String.format("Event type: " + this.eventType + "\t Event date: " + this.eventDate + "\t Event address: " + this.eventAddress); 
    } 
}
