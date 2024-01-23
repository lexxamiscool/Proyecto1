package proyecto3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class ValenciaHospitalSystem {
    static ArrayList<Doctor> doctors = createDoctorsByProfession();
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String username="warframe";
        String password = "123abc";
        login(username, password);       
      
    }
    public static void login(String usernameSaved, String passwordSaved) {
        int count = 0;
        String username = "";
        String password = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Login of the Hospital of Valencia System");
        System.out.println("Username: ");
        username = scanner.next();
        System.out.println("Password: ");
        password = scanner.next();
        do {
            if(username.equals(usernameSaved) && password.equals(passwordSaved)) {
                optionsOfDoctors(doctors);
            }else {
                count ++;
                System.out.println("Wrong username or password, you have  " + (3-count) + " tries");
            }
        }while(count<3);
        if(count ==3) {
            System.out.println("You reach the limit of tries you are blocked");
            System.exit(0);
        }
    }

    public static ArrayList<Doctor> createDoctorsByProfession() {
        ArrayList<Doctor> doctor = new ArrayList<>();
        doctor.add(new Doctor("Samwyse", "Neurology"));
        doctor.add(new Doctor("Gabler", "Neurology"));
        doctor.add(new Doctor("Arthur", "Neurology"));
        doctor.add(new Doctor("Henbury", "Nutrition"));
        doctor.add(new Doctor("Roffey", "Nutrition"));
        doctor.add(new Doctor("Traher", "Nutrition"));
        doctor.add(new Doctor("Kilroy", "Cardiology"));
        doctor.add(new Doctor("Pree", "Cardiology"));
        doctor.add(new Doctor("Durn", "Cardiology"));
        doctor.add(new Doctor("McComiskie","Physiotherapy"));
        doctor.add(new Doctor("Revelle", "Physiotherapy"));
        doctor.add(new Doctor("Klainer", "Physiotherapy"));
        doctor.add(new Doctor("Pennone","Traumatology"));
        doctor.add(new Doctor("Bearblock", "Traumatology"));
        doctor.add(new Doctor("Guerreau", "Traumatology"));
        doctor.add(new Doctor("Kilroy","General Medicine"));
        doctor.add(new Doctor("Revelle", "General Medicine"));
        doctor.add(new Doctor("Traher", "General Medicine"));
        doctor.add(new Doctor("de Aguirre","Emergency Care"));
        doctor.add(new Doctor("Coyle", "Emergency Care"));
        doctor.add(new Doctor("Vedmore", "Emergency Care"));
        doctor.add(new Doctor("Bridgwood","Internal Medicine"));
        doctor.add(new Doctor("Gillie", "Internal Medicine"));
        doctor.add(new Doctor("Augur", "Internal Medicine"));
        doctor.add(new Doctor("Andreacci","Clinical Analysis"));
        doctor.add(new Doctor("Wrought", "Clinical Analysis"));
        doctor.add(new Doctor("Beard", "Clinical Analysis"));
        return doctor;
    }
    
    public static ArrayList<Slot> addSlot(){
        ArrayList<Slot> slot = new ArrayList<Slot>();
        slot.add(new Slot(TimeSlot.MORNING, "8-9"));
        slot.add(new Slot(TimeSlot.MORNING, "9-10"));
        slot.add(new Slot(TimeSlot.MORNING, "10-11"));
        slot.add(new Slot(TimeSlot.MORNING, "11-12"));
        slot.add(new Slot(TimeSlot.AFTERNOON, "1-2"));
        slot.add(new Slot(TimeSlot.AFTERNOON, "2-3"));
        slot.add(new Slot(TimeSlot.AFTERNOON, "3-4"));
        return slot;
    }
    
    public static  void optionsOfDoctors(ArrayList<Doctor> doctors) {
        //General Medicine, Emergency Care, Clinical Analysis, Cardiology, , Nutrition,
        //Physiotherapy, Traumatology, and Internal Medicine.
        ArrayList<Doctor> doctorsSelected = new ArrayList<>();
        System.out.println("Professions offer by our specialists: \n"
                + "1-)General Medicine \n"
                + "2-)Emergency Care \n"
                + "3-)Clinical Analysis \n"
                + "4-)Cardiology \n"
                + "5-)Neurology \n"
                + "6-)Nutrition \n"
                + "7-)Physiotherapy \n"
                + "8-)Traumatology \n"
                + "9-)Internal Medicine \n");
        System.out.println("Select the number of the speciality: ");
        Scanner scanner = new Scanner(System.in);
        String option=scanner.next();
        switch(option) {
        case "1":
           
            for(Doctor doctor : doctors) {
                if (doctor.getSpeciality().equalsIgnoreCase("general medicine")) {
                    System.out.println(doctor.getName());
                    doctorsSelected.add(doctor);
                }
            }
            appointment(createDoctorsByProfession(),addSlot());
            break;
        case "2":
           
            for(Doctor doctor: doctors){
                if (doctor.getSpeciality().equalsIgnoreCase("Emergency Care")) {
                    System.out.println(doctor.getName());
                    doctorsSelected.add(doctor);
                   
                }
            }
            appointment(createDoctorsByProfession(),addSlot());
            break;
        case "3":
            
            for(Doctor doctor: doctors) {
                if (doctor.getSpeciality().equalsIgnoreCase("Clinical Analysis")) {
                    System.out.println(doctor.getName());
                    doctorsSelected.add(doctor);
                   
                }
            }
            appointment(createDoctorsByProfession(),addSlot());
            break;
        case "4":
            
            for(Doctor doctor: doctors) {
                if (doctor.getSpeciality().equalsIgnoreCase("Cardiology")) {
                    System.out.println(doctor.getName());
                    doctorsSelected.add(doctor);
                   
                }
            }
            appointment(createDoctorsByProfession(),addSlot());
            break;
        case "5":
            System.out.println("Write the  doctor for make your appointment: ");
            for(Doctor doctor: doctors) {
                if (doctor.getSpeciality().equalsIgnoreCase("Neurology")) {
                    System.out.println(doctor.getName());
                    doctorsSelected.add(doctor);
                    
                }
            }
            appointment(createDoctorsByProfession(),addSlot());
            break;
        case "6":
            
            for(Doctor doctor: doctors) {
                if (doctor.getSpeciality().equalsIgnoreCase("Nutrition")) {
                    System.out.println(doctor.getName());
                    doctorsSelected.add(doctor);
                    
                }
            }
            appointment(createDoctorsByProfession(),addSlot());
            break;
        case "7":
          
            for(Doctor doctor: doctors) {
                if (doctor.getSpeciality().equalsIgnoreCase("Physiotherapy")) {
                    System.out.println(doctor.getName());
                    doctorsSelected.add(doctor);
                    appointment(createDoctorsByProfession(),addSlot());
                }
            }
            appointment(createDoctorsByProfession(),addSlot());
            break;
        case "8":
           
            for(Doctor doctor: doctors) {
                if (doctor.getSpeciality().equalsIgnoreCase("Traumatology")) {
                    System.out.println(doctor.getName());
                    doctorsSelected.add(doctor);
                    
                }
            }
            appointment(createDoctorsByProfession(),addSlot());
            break;
        case "9":
            
            for(Doctor doctor: doctors) {
                if (doctor.getSpeciality().equalsIgnoreCase("Internal Medicine")) {
                    System.out.println(doctor.getName());
                    doctorsSelected.add(doctor);
                   
                }
            }
            appointment(createDoctorsByProfession(),addSlot());
            break;
            
        }
    }
    
    public static void appointment(ArrayList<Doctor> doctors, ArrayList<Slot> slots) {
        //Upon selecting a specialty, it will display if the user prefers a morning or afternoon
        //appointment and show available hours. As a developer, you can choose the hours.
        System.out.println("Write the  doctor  for make your appointment: ");
        Scanner scanner = new Scanner(System.in);
        String doctorName = scanner.next();
        String shift= "";
        String timeSlot;
        Doctor doctorSelected = null;
        
        
        ArrayList<Appointment> appointment = new ArrayList<>();        
        for(Doctor doctor: doctors) {
            if(doctor.getName().equalsIgnoreCase(doctorName)) {
                doctorSelected = doctor;
            }
        }
        for(Slot slot: slots) {
           System.out.println(slot.toString());
        }
        System.out.println("Write the shift morning or afternoon");
        shift = scanner.next();
        System.out.println("Write the slot in the following format 8-9");
        timeSlot = scanner.next();
        TimeSlot timeSlotSelected = TimeSlot.valueOf(shift.toUpperCase());
        Slot slotSelected = new Slot(timeSlotSelected, timeSlot);
        appointment.add(new Appointment(doctorSelected, slotSelected));
        
        if(appointment != null) {
            System.out.println("paso");
        }else {
            System.out.println("out");
        }
    }
   
    
}
