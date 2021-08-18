
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String fileName = scan.nextLine();
        ArrayList<Team> Teams = FileInput(fileName);
        Boolean check = true;
        
        System.out.println("Team:");
        String searchinTeam = scan.nextLine();
        
        for(int i = 0; i<Teams.size();i++){
            if(searchinTeam.equals(Teams.get(i).getName())){
                System.out.println("Games: " + Teams.get(i).getGames());
                System.out.println("Wins: " + Teams.get(i).getWins());
                System.out.println("Losses: " + Teams.get(i).getLosese());
                check = false;
            }
        }
        
        if (check){

            System.out.println("Games: " + "0");
            System.out.println("Wins: " + "0");
            System.out.println("Losses: " + "0");
        }
        


    }
    
    public static ArrayList<Team> FileInput (String fileName){
        
        ArrayList<Team> Teams = new ArrayList<>();
        
        try(Scanner inputFile = new Scanner(Paths.get(fileName))){
            while(inputFile.hasNext()){
                String line = inputFile.nextLine();
                String [] buffer = line.split(",");
                if(checkName(Teams, buffer[0])){
                   Teams.add(new Team(buffer[0]));
                } 
                
                if(checkName(Teams, buffer[1])){
                    Teams.add(new Team(buffer[1]));
                }
                if(game(buffer[0],buffer[1], Integer.valueOf(buffer[2]),Integer.valueOf(buffer[3]))){
                    Teams.get(searchIndex(buffer[0], Teams)).counterWins();
                    Teams.get(searchIndex(buffer[1], Teams)).counterLoses();
                } else {
                    Teams.get(searchIndex(buffer[1], Teams)).counterWins();
                    Teams.get(searchIndex(buffer[0], Teams)).counterLoses();
                }
            }
        } catch (Exception e) {
            
        }
        return Teams;
    }
    
    public static Boolean checkName(ArrayList<Team> Teams, String name){
        for(Team buffer:Teams){
            if(buffer.getName().equals(name)){
                return false;
            }
        }
        return true;
    }
    
    public static int searchIndex(String name, ArrayList<Team> Teams){
        for(int i = 0; i<Teams.size();i++){
            if(Teams.get(i).getName().equals(name)){
                return i;
            }
        }
        return 0;
    }
    
    public static Boolean game(String firstPlayer , String secondPlayer, int first,int second)
    {
        if(first>second){
            return true;
        } else{
            return false;
        }
    }

}
