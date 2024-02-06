/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task4;

import java.util.Scanner;

/**
 *
 * @author mamma
 */
public class PhoneNumberFormatChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a phone number: ");
            String input = scanner.nextLine();

            PhoneNumber phoneNumber = new PhoneNumber(input);
            System.out.println("Valid phone number: " + phoneNumber.getPhoneNumber());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid phone number format: " + e.getMessage());
        }
    }
}
