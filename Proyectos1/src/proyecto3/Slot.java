package proyecto3;

import java.util.HashMap;

public class Slot {
    private TimeSlot timeSlot;
    private String slot;
  
    public Slot(TimeSlot timeSlot, String slot) {
        super();
        this.timeSlot = timeSlot;
        this.slot = slot;
    }
    public TimeSlot getTimeSlot() {
        return timeSlot;
    }
    public void setTimeSlot(TimeSlot timeSlot) {
        this.timeSlot = timeSlot;
    }
    
}
