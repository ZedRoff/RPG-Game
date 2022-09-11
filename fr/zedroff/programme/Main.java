

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        
        try (Scanner user_entry = new Scanner(System.in)) {
            System.out.println("User name > ");
            String username = user_entry.nextLine();
            HashMap<String, String> card = new HashMap<String, String>();
            Player player = new Player(username, card);

            System.out.println(String.format("Welcome %s in this game, where you can collect Cards and battle against enemies.\n================================\n\nIn this game you can : ", player.getName()));

            
            for(Commands cmd: Commands.getCommands()) {
                System.out.println(String.format("\t- /%s : %s", cmd.toString(), cmd.help_msg));
            }
   
      boolean running = true;
      while(running) {
                String command = user_entry.nextLine();
                String[] arr = command.split(" ");
                switch(arr[0]) {
                    case "/inventory":
                        System.out.println("Here is your inventory :");
                    break;
                    case "/quit": 
                        System.out.println("Thanks for playing this game, see you later !");
                        running = false;
                    break;
                    case "/battle": 
                        System.out.println("Oh, a monster has spawned, you have to battle him :");
                    break;
                    case "/card":
                         if(checkArgs(arr).length() > 0) {System.out.println(checkArgs(arr)); break;}
                        System.out.println("Here is the card you requested for :");
                    break;
                    case "/collect": 
                        System.out.println("A random card has spawned, its :");
                    break;
                    case "/help": 
                        System.out.println("Here is the help page :");
                    break;
                    default: 
                        System.out.println("This Command doesn't exists :");
                }
               
                
      }
        }
      

    }
    private static String checkArgs(String[] arg) {
        if(arg.length == 1) {
            return "There is an argument missing : Ex : /card [card_name]";
           
        }else {
            return "";
        }
       } 
}