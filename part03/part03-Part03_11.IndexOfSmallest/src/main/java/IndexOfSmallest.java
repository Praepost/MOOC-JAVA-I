
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true){
            int value = scanner.nextInt();
            if (value == 9999){
                break;
            } else{
                list.add(value);
            }
        }
        int min = 9999;
        for(int i = 0; i < list.size();i++){
            if (min>list.get(i)){
                min=list.get(i);
            }
        }
        System.out.println("Smallest number: " + min);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)== min) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
