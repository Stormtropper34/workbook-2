import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {

        StringBuilder skills = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter full name: ");
        String fullName = scanner.nextLine().trim();
        System.out.println("Enter Billing Street: ");
        String billingStreet = scanner.nextLine();
        System.out.println("Enter Billing City: ");
        String billingCity = scanner.nextLine().trim();
        System.out.println("Enter Billing State: ");
        String billingState = scanner.nextLine().trim();
        System.out.println("Enter Billing Zip: ");
        String billingZip = scanner.nextLine().trim();


        skills.append(fullName).append("\n");
        skills.append("Billing Address: \n");
        skills.append(billingStreet).append("\n");
        skills.append(billingCity).append(", ").append(billingState).append(" ").append(billingZip).append("\n\n");


        System.out.println("Enter Shipping Street:");
        String shippingStreet = scanner.nextLine();
        System.out.println("Enter Shipping City: ");
        String shippingCity = scanner.nextLine().trim();
        System.out.println("Enter Shipping State: ");
        String shippingState = scanner.nextLine().trim();
        System.out.println("Enter Shipping Zip: ");
        String shippingZip = scanner.nextLine().trim();



        skills.append("Shipping Address: \n");
        skills.append(shippingStreet).append("\n");
        skills.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip);

        String mySkills = skills.toString();
        System.out.println(mySkills);



    }
}
