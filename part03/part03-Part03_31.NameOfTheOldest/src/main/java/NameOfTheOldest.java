
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        String buffer ="";
        String[] arr,hash;
        arr = new String[2];
        hash = new String[990];
        while(true){
            String str = input.nextLine();
                if (str.equals("")) {
                    break;
                }    
                
            arr = str.split(",", 2);
            if(Integer.valueOf(arr[1])>max){
                max = Integer.valueOf(arr[1]);
                buffer = arr[0];

            }
        }
            
        System.out.println("Name of the oldest: " + buffer);
    }
}
