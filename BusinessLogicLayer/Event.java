package BusinessLogicLayer;
import java.util.*;

public abstract class Event 
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

    public abstract String getType();

    public abstract Date getDate();

    public abstract String getAddress();
}
