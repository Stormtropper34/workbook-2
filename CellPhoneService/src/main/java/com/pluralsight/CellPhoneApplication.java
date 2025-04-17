package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        CellPhone cellPhone = new CellPhone();



        // Using the setters of my cellPhone object to add the value entered by user
        System.out.println("What is the serial number? ");
        cellPhone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.println("What model is the phone? ");
        cellPhone.setphoneModel(scanner.nextLine());

        System.out.println("Who is the carrier? ");
        cellPhone.setcarrierName(scanner.nextLine());

        System.out.println("What is the phone number? ");
        cellPhone.setPhoneNumber(scanner.nextLine());

        System.out.println("Who is the owner? ");
        cellPhone.setownersName(scanner.nextLine());

        // Using the getters of my cellPhone print the properties of the
        // phone to the screen. Also, to retrieve that information
        System.out.println("Serial number is: " + cellPhone.getSerialNumber());
        System.out.println("Phone model is: " + cellPhone.getphoneModel());
        System.out.println("Carrier name is: " + cellPhone.getcarrierName());
        System.out.println("Phone number is: " + cellPhone.getPhoneNumber());
        System.out.println("The owners name is: " + cellPhone.getownersName());







    }
}
