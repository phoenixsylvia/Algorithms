package dev.decagon;

public class PersonalisedMessage {
    static String greet(String name, String owner) {
        // Add code here
        return   name.equalsIgnoreCase(owner)  ? "Hello boss" : "Hello guest";
    }
}
