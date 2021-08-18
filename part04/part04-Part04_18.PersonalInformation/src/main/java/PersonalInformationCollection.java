
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("First name: ");
            String firstName = scanner.nextLine();
            if(firstName.equals("")) {
                break;
            }
            System.out.println("Last name: ");
            String secondName = scanner.nextLine();
            if(secondName.equals("\n")) {
                break;
            }
            System.out.println("Identification number: ");
            String identificationNumber = scanner.nextLine();
            if(identificationNumber.equals("\n")) {
                break;
            }
            PersonalInformation object = new PersonalInformation(firstName,secondName,identificationNumber);
            infoCollection.add(object);
        }
        for(PersonalInformation buffer:infoCollection){
            System.out.println(buffer.getFirstName() + " " + buffer.getLastName());
        }
    }
}
