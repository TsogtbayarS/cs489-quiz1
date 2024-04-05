package org.example.Entity;

public class EmailAddress {
    private String email;
    private String label;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public EmailAddress(String email, String label) {
        this.email = email;
        this.label = label;
    }

    @Override
    public String toString() {
        return "{" +
                "\"email\": \"" + email + "\", " +
                "\"label\": \"" + label + "\"" +
                "}";
    }

}
