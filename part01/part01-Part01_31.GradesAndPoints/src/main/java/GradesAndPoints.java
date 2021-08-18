
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        Integer value = scan.nextInt();
        if(value<0) {
            System.out.println("impossible!"); 
        } else if (value<50){
            System.out.println("failed");
        } else if (value<60){
            System.out.println("1");
        } else if (value<70){
            System.out.println("2");
        } else if (value<80){
            System.out.println("3");
        } else if (value<90){
            System.out.println("4");
        } else if (value<101){
            System.out.println("5");
        } else if (value>100){
            System.out.println("incredible!");
        } 

    }
}
