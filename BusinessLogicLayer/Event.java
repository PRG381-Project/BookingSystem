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

    @Override
    public String toString() 
    { 
        return String.format("Event type: " + this.eventType + "\t Event date: " + this.eventDate + "\t Event address: " + this.eventAddress); 
    } 
}
