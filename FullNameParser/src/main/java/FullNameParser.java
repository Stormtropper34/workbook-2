import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter full name: ");
        String fullName = scanner.nextLine().trim();

        int firstPositionSpace = fullName.indexOf(" ");
        int secondPositionSpace = fullName.lastIndexOf(" ");



        String firstName = fullName.substring(0, firstPositionSpace);
        String middleName = fullName.substring(firstPositionSpace+1,secondPositionSpace);
        String lastName = fullName.substring(secondPositionSpace +1);









    }
}
