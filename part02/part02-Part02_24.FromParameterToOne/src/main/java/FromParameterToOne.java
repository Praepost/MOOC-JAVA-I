import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printFromNumberToOne(scanner.nextInt());
    }

    public static void printFromNumberToOne(int value){
        for (int i=0;i<value;i++){
            System.out.println(value-i);
        }
    }
}
