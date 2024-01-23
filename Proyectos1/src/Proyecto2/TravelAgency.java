package Proyecto2;

import java.util.HashMap;
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
        System.out.println("Welcome to travel Agency");
        System.out.println("The budget for the travel are: 100, 200, 300, 400 dollars");
        System.out.println("Please enter your burget for travel");
        Integer budget = Integer.parseInt(scanner.next());
     
        switch(budget) {
        case 100:
            System.out.println("According to your budget this are the plans for you");
            System.out.println("Winter 100$: " + winterDestinationAndActivities());
            break;
        case 200:
            System.out.println("According to your budget this are the plans for you");
            System.out.println("Winter 100$: " +winterDestinationAndActivities());
            System.out.println("Autumn 200$: " +autumnDestinationAndActivities());
            break;
        case 300:
            System.out.println("According to your budget this are the plans for you");
            System.out.println("Winter 100$: " +winterDestinationAndActivities());
            System.out.println("Autumn 200$: " + autumnDestinationAndActivities());
            System.out.println("Spring 300$: " +springDestinationAndActivities());
            break;
        
         default:
             if(budget >= 400) {
                 System.out.println("According to your budget this are the plans for you");
                 System.out.println("Winter 100$: " +winterDestinationAndActivities());
                 System.out.println("Autumn 200$: " + autumnDestinationAndActivities());
                 System.out.println("Spring 300$: " +springDestinationAndActivities());
                 System.out.println("Summer 400$: " + summerDestinationAndActivities());
                 break; 
             }else if(budget < 100) {
                 System.out.println("Sorry your budget is insufficient for buy a plan try later");
                 break;
             }
         }
        
        
        
    }
    
    public static HashMap<String, String> winterDestinationAndActivities(){
        HashMap<String,String>winterDestinationAndActivities = new HashMap<String,String>();
        winterDestinationAndActivities.put("Andorra", "Skiing activities");
        winterDestinationAndActivities.put("Switzerland", "Tour of the Swiss Alps");
        return winterDestinationAndActivities;
    }
    
    public static HashMap<String, String> summerDestinationAndActivities(){
        HashMap<String,String> summerDestinationAndActivities = new HashMap<String,String>();
        summerDestinationAndActivities.put("Spain", "hiking and extreme sports activities");
        summerDestinationAndActivities.put("Portugal", "activities on the beaches");
        return summerDestinationAndActivities;
    }
    
    public static HashMap<String, String> springDestinationAndActivities(){
        HashMap<String,String> springDestinationAndActivities = new HashMap<String,String>();
        springDestinationAndActivities.put("France", "Extreme sports activities");
        springDestinationAndActivities.put("Italy", "cultural and historical tour");
        return springDestinationAndActivities;
    }
    
    public static HashMap<String, String> autumnDestinationAndActivities(){
        HashMap<String,String> autumnDestinationAndActivities = new HashMap<String,String>();
        autumnDestinationAndActivities.put("Belgium", "hiking and extreme sports activities");
        autumnDestinationAndActivities.put("Austria", "cultural and historical activities");
        return autumnDestinationAndActivities;
    }
}


