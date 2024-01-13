package proyectoUno;

import java.util.HashMap;
import java.util.Scanner;



/*
 * 1. Manchester United FC has hired you as a developer. Develop a program that helps the coach identify their fastest player, player with the most goals, assists, passing accuracy, and defensive involvements.
The system should also allow comparison between two players. Use the following player profiles:

Bruno Fernandes: 5 goals, 6 points in speed, 9 points in assists, 10 points in passing accuracy, 3 defensive involvements. Corresponds to jersey number 8.
Rasmus Hojlund: 12 goals, 8 points in speed, 2 points in assists, 6 points in passing accuracy, 2 defensive involvements. Corresponds to jersey number 11.
Harry Maguire: 1 goal,    5 points in speed, 1 point in assists, 7 points in passing accuracy, 9 defensive involvements. Corresponds to jersey number 5.
Alejandro Garnacho: 8 goals,7 points in speed, 8 points in assists, 6 points in passing accuracy, 0 defensive involvements. Corresponds to jersey number 17.
Mason Mount: 2 goals,       6 points in speed, 4 points in assists, 8 points in passing accuracy, 1 defensive involvement. Corresponds to jersey number 7.
The program functions as follows: The coach accesses the system and encounters a menu with the following options:

Player Review: By entering the player's jersey number, they can access the player's characteristics.
Compare two players: The system prompts for two jersey numbers and displays the data of both players on
 screen.
Identify the fastest player: Displays the player with the most points in speed.
Identify the top goal scorer: Displays the player with the most points in goals.
Identify the player with the most assists: Displays the player with the most points in assists.
Identify the player with the highest passing accuracy: Displays the player with the most points in 
passing accuracy.
Identify the player with the most defensive involvements: Displays the player with the most points 
in defensive involvements.
The system should also allow returning to the main menu.
 * */
public class ManchesterMain {
   public static HashMap<Integer, Players> players = new HashMap<>();
   public static Scanner option = new Scanner(System.in);
   public static String username="EriktenHag";
   public static String password="1234abc";
   public static void main(String [] args) {
       initializePlayers();
       login();
       
   }
   public static void initializePlayers() {
       players.put(8, new Players( "Bruno Fernandes", 5, 6, 9, 10, 3));
       players.put(11, new Players("Rasmus Hojlund", 12, 8, 2, 6, 2));
       players.put(5, new Players("Harry Maguire", 1, 5, 1, 7, 9));
       players.put(17, new Players( "Alejandro Garnacho", 8, 7, 8, 6, 0));
       players.put(7, new Players( "Mason Mount", 2, 6, 4, 8, 1));
   }
   static void login() {
       int count = 0;
       Scanner usernameandpassword = new Scanner(System.in);
       String usernameKeyboard;
       String passwordKeyboard;
       Integer option2 = 0;
       do {
           System.out.println("Manchester United System");
           System.out.println("Username");
           usernameKeyboard =usernameandpassword.next();
           System.out.println("Password");
           passwordKeyboard = usernameandpassword.next();
           if(username.equals(usernameKeyboard) && password.equals(passwordKeyboard)) {
               
               do{
                   System.out.println("This is the menu choose an option");
                   menuOptions();
                   option2=option.nextInt();
                   menu(option2);
               }while(!(option2==8));
               
           }else {
               count ++;
               System.out.println("You have been trying for " + count + " you have "+(3-count)+" tries");
           }
       }while(count < 3);
       if(count ==3) {
           System.out.println("You reached the number of tries. You have been blocked.");
           
           System.exit(0);
       }
   }
   
   static void menu(int option) {
       switch(option) {
       case 1:
           playerReview();
           break;
       case 2:
           comparePlayers();
           break;
       case 3:
           fastestPlayer();
           break;
       case 4:
           topGoalScorer();
           break;
       case 5:
           mostAssists();
           break;
       case 6:
           highestPassingAccuracy();
           break;
       case 7:
           defensiveInvolments();
           break;
       case 8:
           System.out.println("Exit from the system thank you for using it");
           System.exit(0);
       }
   }
   static void playerReview() {
       System.out.println("Enter a Jersey number");
       Scanner jersey=new Scanner(System.in);
       int jerseyNumber = jersey.nextInt();
       System.out.println(players.get(jerseyNumber));
   }
   static void menuOptions() {
       System.out.println(""
               + ""
               + "                              _                 _                          _ _           _   _____           _                 \n"
               + "                             | |               | |                        (_) |         | | /  ___|         | |                \n"
               + " _ __ ___    __ _ _ __   ___ | |__   ___  ___  | |_ ___ _ __   _   _ _ __  _| |_ ___  __| | \\ `--. _   _ ___| |_ ___ _ __ ___  \n"
               + "| '_ ` _ \\ / _` | '_ \\ / __| '_ \\ / _ \\/ __| __/ _ \\ '__| | | | | '_ \\| | __/ _ \\/ _` |  `--. \\ | | / __| __/ _ \\ '_ ` _ \\ \n"
               + "| | | | | |  (_| | | |  | (__ | | | |  __/\\__ \\ || __/ |    | |_| | | | | | ||  __/ (_| | /\\__/ / |_| \\__ \\ ||  __/ | | | | |\n"
               + "|_| |_| |_|\\__,_|_| |_|\\___|_| |_|\\___||___/\\__\\___|_|     \\__,_|_| |_|_|\\__\\___|\\__,_| \\____/ \\__, |___/\\__\\___|_| |_| |_|\n"
               + "                                                                                                __/ |                      \n"
               + "                                                                                               |___/                       ");
       System.out.println("");
       System.out.println("Player Review---->1");
       System.out.println("Compare Players--->2");
       System.out.println("Fastest player-->3");
       System.out.println("Top goal scorer-->4");
       System.out.println("player with the most assists------>5");
       System.out.println("highest passing accuracy--->6");
       System.out.println("most defensive involvements-->7");
       System.out.println("Exit------------->8");
   }
   
   static void comparePlayers() {
       Scanner jersey=new Scanner(System.in);
       System.out.println("Enter a Jersey number of your first player");
       int jerseyNumberOne = jersey.nextInt();
       System.out.println("Enter the jersey of the second player");
       int jerseyNumberTwo = jersey.nextInt();
       System.out.println("The first player you choose: " +players.get(jerseyNumberOne));
       System.out.println("The second player you choose: " +players.get(jerseyNumberTwo));
   }
   
   static void fastestPlayer() {
       int speed=0;
       String playerName = "";
       for(Players player : players.values()) {
           if(player.getSpeed()>speed) {
               speed=player.getSpeed();
               playerName = player.getName();
           }               
       }
       System.out.println("The player with most speed is: " + playerName);
       
   }
   static void topGoalScorer() {
       int goals=0;
       String playerName = "";
       for(Players player : players.values()) {
           if(player.getGoals()>goals) {
               goals=player.getGoals();
               playerName = player.getName();
           }               
       }
       System.out.println("The player with most goals is: " + playerName);
   }
   static void mostAssists() {
       int assits=0;
       String playerName = "";
       for(Players player : players.values()) {
           if(player.getAssists()>assits) {
               assits=player.getAssists();
               playerName = player.getName();
           }               
       }
       System.out.println("The player with most assits is: " + playerName);
       
   }
   static void highestPassingAccuracy() {
       int passes=0;
       String playerName = "";
       for(Players player : players.values()) {
           if(player.getAccuracy()>passes) {
               passes=player.getAccuracy();
               playerName = player.getName();
           }               
       }
       System.out.println("The player with most hisght passing accuracy is: " + playerName);
       
   }
   
   static void defensiveInvolments() {
       int defensive=0;
       String playerName = "";
       for(Players player : players.values()) {
           if(player.getDefensive()>defensive) {
               defensive=player.getDefensive();
               playerName = player.getName();
           }               
       }
       System.out.println("The player with most defensive is: " + playerName);
       
   }

}


