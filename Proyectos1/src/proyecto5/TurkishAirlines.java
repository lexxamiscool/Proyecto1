package proyecto5;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
5. Turkish Airlines has just launched an offer to travel among the following destinations: Turkey, Greece,
 Lebanon, Spain, and Portugal. Develop an algorithm with the following characteristics:
It must have a login and validate the data; after the third failed attempt, it should be locked.DONE
The user must choose the origin country and the destination country, the flight date, and the condition:
 Economy or First Class.DONE
The user must choose if they want to check an additional piece of luggage into the hold.
Hand luggage is free of charge.
The user must purchase both the outbound and return tickets.
The user can choose their preferred meal: Regular, Vegetarian, Kosher.
The program must collect the following data: Name, country of origin, passport, 
and destination country.
Upon completing the process, the system will display everything the user has previously chosen along
 with their information. 
The system will provide the option to confirm the reservation or cancel it. If the user chooses YES,
 a confirmation message will appear. If not, it will return to the main menu.
*/

public class TurkishAirlines {
    public static void main(String[] args) {
      
        
        String username = "juan";
        String password = "zP54o9ui";
        String countries[] = {"Turkey", "Greece", "Lebanon", "Spain", "Portugal"};
        
    }
    static void login(String usernameSystem, String passwordSystem) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        String username = "";
        String password = "";
        do {
            System.out.println("Welcome Turkish Airlines System");
            System.out.println("Enter your username:");
            username = scanner.next();
            System.out.println("Enter your password: ");
            password = scanner.next();
            if(usernameSystem.equals(username)&& passwordSystem.equals(password)) {
                
            }else {
                counter ++;
                System.out.println("Username or password is wrong. You have + " + (3-counter) + " left");
            }
            
            
        }while(counter < 3);
        
        if(counter == 3) {
            System.out.println("You have been blocked");
            System.exit(0);
        }
    }
    
    static boolean validationCountry(String countries[], String destinationCountry, String originCountry) {
        for(String country : countries) {
            if(destinationCountry.equalsIgnoreCase(country)) {
                for(String country2: countries) {
                    if(originCountry.equalsIgnoreCase(country2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    
    static void userData(String countries[]) {
       /*The user must choose the origin country and the destination country, the flight date, and 
        * the condition:
         Economy or First Class.
        * */ 
        Scanner scanner = new Scanner(System.in);
        String originCountry = "";
        String destinationCountry="";
        String classToSit = "";
        String date = "";
        System.out.println("Please enter your origin country:");
        originCountry = scanner.next();
        System.out.println("Please enter your destination country");
        destinationCountry = scanner.next();
        System.out.println("Which date would you like to travel: ");
        date = scanner.next();
        if(validationCountry(countries, destinationCountry, originCountry) && validationDate(date)) {
            System.out.println("Write the class you would like to be: Economy or First Class");
            classToSit =scanner.next();
        }
    }
    
    static boolean validationDate(String date) {
        
        Pattern pattern = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");
        Matcher matcher = pattern.matcher(date);
        return matcher.find();
    }
}
