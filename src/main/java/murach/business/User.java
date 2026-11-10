package murach.business;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String heardFrom;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        heardFrom ="";
    }


    public User(String firstName, String lastName, String email, String heardFrom) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.heardFrom = heardFrom;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeardFrom() {
        return heardFrom;
    }

    public void setHeardFrom(String heardFrom) {
        this.heardFrom = heardFrom;
    }
}