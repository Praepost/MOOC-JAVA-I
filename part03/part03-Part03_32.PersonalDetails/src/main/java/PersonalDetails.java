
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0, sum = 0, count=0;
        String buffer = "";
        String[] arr;
        while(true){
            String str = input.nextLine();
                if (str.equals("")) {
                    break;
                }    
                
            arr = str.split(",");
            if(arr[0].length()>max){
                max = arr[0].length();
                buffer = arr[0];
            }
            sum += Double.valueOf(arr[1]);
            count+=1;
        }
            
        System.out.println("Longest name: " + buffer);
        System.out.println("Average of the bith day years: " + (Double.valueOf(sum) / Double.valueOf(count)));
    }
}
