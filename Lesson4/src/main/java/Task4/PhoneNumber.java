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
public class PhoneNumber {
    String phoneNumber;
    
    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\+994-(50|51|55)-\\d{3}-\\d{2}-\\d{2}");
    }
    
     public void setPhoneNumber(String phoneNumber) {
        if (isValidPhoneNumber(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Invalid phone number format");
        }
    }

    public PhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

