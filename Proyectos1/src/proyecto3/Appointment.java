package proyecto3;

public class Appointment {
    private Doctor doctor ;
    private Slot slot;
    
    
    public Appointment(Doctor doctor, Slot slot) {
        super();
        this.doctor = doctor;
        this.slot = slot;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    
    
}
