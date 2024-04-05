package org.example.Entity;

public class PhoneNumber {
    private String phoneNumber;
    private String label;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public PhoneNumber(String phoneNumber, String label) {
        this.phoneNumber = phoneNumber;
        this.label = label;
    }

    @Override
    public String toString() {
        return "{" +
                "\"phoneNumber\": \"" + phoneNumber + "\", " +
                "\"label\": \"" + label + "\"" +
                "}";
    }

}
