import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name ");
        System.out.println("First name:  ");
        String firstName = scanner.nextLine();

        System.out.println(" Enter first letter of your middle name: ");
        String middleName = scanner.nextLine();

        System.out.println("Last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter suffix(ex. Jr, PhD): ");
        String suffix = scanner.nextLine();

        String fullName = firstName + " " +  middleName + " " +  lastName + ", " + suffix;

        if (middleName.isEmpty()) {
            fullName = firstName + " " + lastName + " " + suffix;
        } if (suffix.isEmpty()) {
            fullName = firstName + " " +  middleName + " " + lastName;
        }

        System.out.print("Full name: " + fullName);









    }
}