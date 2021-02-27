package BusinessLogicLayer;

import java.util.Date;

public class Wedding extends Event {

    public Wedding(String et, Date dt, String ea) 
    {
        super(et, dt, ea);
        this.eventType = et;
        this.eventDate = dt;
        this.eventAddress = ea;        
    }
    
}
