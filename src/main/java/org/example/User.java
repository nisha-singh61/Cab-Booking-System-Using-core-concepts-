package org.example;

public class User {
    private String userId;
    private String name;
    private String contactNumber;

    //Constructor to create a User
    public User(String userId, String name, String contactNumber) {
        this.userId = userId;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    //Getters to read the private data
    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    //this override method is used to print the user details in a readable format
    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}
