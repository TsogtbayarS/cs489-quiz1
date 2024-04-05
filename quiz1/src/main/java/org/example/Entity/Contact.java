package org.example.Entity;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private Long id;
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private List<PhoneNumber> phoneNumbers = new ArrayList<>();
    private List<EmailAddress> emailAddresses = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<EmailAddress> getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(List<EmailAddress> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public Contact(Long id, String firstName, String lastName, String company, String jobTitle, List<PhoneNumber> phoneNumbers, List<EmailAddress> emailAddresses) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.phoneNumbers = phoneNumbers;
        this.emailAddresses = emailAddresses;
    }

    public Contact(Long id, String firstName, String lastName, String company, String jobTitle) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
    }

    public void addPhoneNumber(String phone, String label) {
        PhoneNumber phoneNumber = new PhoneNumber(phone,label);
        this.phoneNumbers.add(phoneNumber);
    }

    public void removePhoneNumber(String phone, String label){
        PhoneNumber phoneNumber = new PhoneNumber(phone,label);
        this.phoneNumbers.remove(phoneNumber);
    }

    public void addEmailAddress(String email, String label){
        EmailAddress emailAddress = new EmailAddress(email, label);
        this.emailAddresses.add(emailAddress);
    }

    public void removeEmailAddress(String email, String label){
        EmailAddress emailAddress = new EmailAddress(email,label);
        this.emailAddresses.remove(emailAddress);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + company + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", emailAddresses=" + emailAddresses +
                '}';
    }
}
