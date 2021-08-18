
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        while(true){
            String str = input.nextLine();
                if (str.equals("")) {
                    break;
                }    
                
            String[] arr = str.split(",");
            if(Integer.valueOf(arr[1])>max){
                max = Integer.valueOf(arr[1]);
            }
        }
            
        System.out.println("Age of the oldest: " + max);
    }
}
