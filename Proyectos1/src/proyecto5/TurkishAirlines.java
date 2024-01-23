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
        String password = "1234";
        login(username, password);
        
    }
    static void login(String usernameSystem, String passwordSystem) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        String username = "";
        String password = "";
        String countries[] = {"Turkey", "Greece", "Lebanon", "Spain", "Portugal"};
        
        do {
            System.out.println("Welcome Turkish Airlines System");
           
            System.out.println("Enter your username:");
            username = scanner.next();
            System.out.println("Enter your password: ");
            password = scanner.next();
            if(usernameSystem.equals(username)&& passwordSystem.equals(password)) {                
             while(true) {
                 menu(countries);
             }
            }else {
                counter ++;
                System.out.println("Username or password is wrong. You have " + (3-counter) + " left");
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
        System.out.println("Welcome to registration form for Turkey airlines please complete the fields correctly");
        System.out.println("The countries available are: ");
        for(String country: countries) {
            System.out.println("-"+country);
        }
        Scanner scanner = new Scanner(System.in);
        String originCountry = "";
        String destinationCountry="";
        String classToSit = "";
        String date = "";
        String name = "";
        String passport = "";
        String luggage = "";
        String meal = "";
        System.out.println("Enter your full name: ");
        name = scanner.next();
        System.out.println("Enter your passport: (The passport must contain from 1 to 9 numbers");
        passport = scanner.next();
        System.out.println("Please enter your origin country:");
        originCountry = scanner.next();
        System.out.println("Please enter your destination country");
        destinationCountry = scanner.next();
        System.out.println("Which date would you like to travel: (The date must be dd-mm-yyyy format)");
        date = scanner.next();
        System.out.println("Would you like to have an extra piece of luggage in your hold wirte yes or no ");
        luggage= scanner.next();
        if(validationCountry(countries, destinationCountry, originCountry) && validationDate(date) && validationPassport(passport)) {
            System.out.println("Write the class you would like to be: Economy or First Class");
            classToSit =scanner.next();
            System.out.println("Choose your preferred meal: (Regular, Vegetarian, Kosher)");
            meal=scanner.next();
            System.out.println("S U M M A R Y");
            System.out.println("This is a summary of your choices");
            System.out.println("Name: " + name);
            System.out.println("Passport: " + passport);
            System.out.println("Origin Country: " + originCountry);
            System.out.println("Destination Country: " + destinationCountry);
            System.out.println("Date for fly: " + date);
            System.out.println();
            
        }
        System.out.println("One of the information you give is wrong please try again");
        
    }
    
    static boolean validationDate(String date) {
        
        Pattern pattern = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");
        Matcher matcher = pattern.matcher(date);
        return matcher.find();
    }
    static boolean validationPassport(String passport) {
        Pattern pattern = Pattern.compile("\\d{9}");
        Matcher matcher = pattern.matcher(passport);
        return matcher.find();
    }
    static void menu(String countries[]) {
        Scanner scanner = new Scanner(System.in);
        int option;
        System.out.println("Welcome to the menu of Turkey Airlines ");
        System.out.println("1.)Make a reservation");
        System.out.println("2.)Exit");
        option= Integer.parseInt(scanner.next());
        switch(option) {
        case 1:
            userData(countries);
            break;
        case 2:
            System.exit(0);
            
        }
    }
}
