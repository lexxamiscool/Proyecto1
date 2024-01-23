package Proyecto2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 2. A travel agency has a special offer for traveling in any season of 2024. Their destinations are:

Winter: Andorra and Switzerland. In Andorra, there are skiing activities, and in Switzerland, there's a 
tour of the Swiss Alps.

Summer: Spain and Portugal. In Spain, there are hiking and extreme sports activities. In Portugal, there 
are activities on the beaches.

Spring: France and Italy. In France, there are extreme sports activities, and in Italy, there's a cultural
 and historical tour.
 
Autumn: Belgium and Austria. In Belgium, there are hiking and extreme sports activities, and in Austria,
 there are cultural and historical activities.
 
Note: Traveling in winter costs $100, in autumn $200, in spring $300, and in summer $400.

Design a system that helps users choose their best destination according to their personal preferences
 and the season they want to travel in.
 
12. Important: With the information you have, you should ask the user the right questions and 
display on screen what their best destination would be.

Clue: You could consider the user's budget
 * */
public class TravelAgency {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        List<Destiny> destinies = new ArrayList<>();
        
        destinies.add(new Destiny("WINTER","Andorra", "skiing", 100));
        destinies.add(new Destiny("WINTER","Switzerland", "tour of the Swiss Alps", 100));
        destinies.add(new Destiny("SUMMER","Spain", "hiking and extreme sports activities", 400));
        destinies.add(new Destiny("SUMMER","Portugal", "activities on the beaches", 400));
        destinies.add(new Destiny("SPRING","France", "extreme sports activities", 300));
        destinies.add(new Destiny("SPRING","Italy", "cultural and historical tour", 300));
        destinies.add(new Destiny("AUTUMN","Belgium", "hiking and extreme sports activities", 200));
        destinies.add(new Destiny("AUTUMN","Austria", "cultural and historical activities", 200));
        
        System.out.println("Welcome to travel Agency");
        System.out.println("The budget for the travel are: 100, 200, 300, 400 dollars");
        System.out.println("Please enter your burget for travel");
        Integer budget = Integer.parseInt(scanner.next());
        System.out.println("Please enter your preferred season");
        String season = scanner.next();
        System.out.println("please enter your preferred activity (skiing, tour, hiking, activities on the beaches, extreme sports)");
        String activity = scanner.next();
        System.out.println(budget);
        System.out.println(season);
        System.out.println(activity);
        
        List<String> destinyPreferred = new ArrayList<>();
        
        for(Destiny destiny: destinies) {
            if((destiny.getSeason().equalsIgnoreCase(season)) && (destiny.getCost() <= budget) 
                    && (destiny.getActivite().contains(activity.toLowerCase())) ) {
                destinyPreferred.add(destiny.getCountry());
            }
        }
        if(destinyPreferred.isEmpty()) {
            System.out.println("Sorry, doesn't exist suitable destinies for you try later");
        }else {
            for(String destino: destinyPreferred) {
                System.out.println("The destiny suitable for you " + destino);
            }
        }
        scanner.close();
    
    }
}


