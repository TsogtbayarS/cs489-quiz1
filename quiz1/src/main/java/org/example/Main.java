package org.example;

import org.example.Entity.Contact;

public class Main {
    public static void main(String[] args) {

        Contact[] contacts = new Contact[]{
                new Contact(1L, "David", "Sanger", "Argos LLC", "Sales Manager"),
                new Contact(2L, "Carlos", "Jimenez", "Zappos", "Director"),
                new Contact(2L, "Ali ", "Gafar", "BMI Services", "HR Manager")
        };
        contacts[0].addEmailAddress("dave.sang@gmail.com", "Home");
        contacts[0].addPhoneNumber("240-133-0011", "Home");
        contacts[0].addEmailAddress("dsanger@argos.com", "Work");
        contacts[0].addPhoneNumber("240-112-0123", "Mobile ");
        contacts[2].addEmailAddress("ali@bmi.com", "Work");
        contacts[2].addPhoneNumber("412-116-9988", "Work ");

        printJson(contacts);
    }

    public static void printJson(Contact[] contacts) {
        System.out.println("Printed in JSON format");
        System.out.println("[");

        for (Contact p : contacts) {
            String line = String.format("\t{\"firstName\": \"%s\", \"lastName\": \"%s\", \"company\": \"%s\", \"jobTitle\": \"%s\", \"phoneNumbers\": %s, \"emailAddresses\": %s}",
                    p.getFirstName(), p.getLastName(), p.getCompany(), p.getJobTitle(), p.getPhoneNumbers(), p.getEmailAddresses());
            System.out.println(line);
        }
        System.out.println("]");
    }


}