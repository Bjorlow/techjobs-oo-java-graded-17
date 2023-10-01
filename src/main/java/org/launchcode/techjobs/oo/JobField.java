package org.launchcode.techjobs.oo;

import java.util.Objects;

// We're importing the 'Objects' class to use it later for hashing.

public abstract class JobField {

    // Here we declare three private instance variables: 'id,' 'nextId,' and 'value.'
    // 'id' is used to uniquely identify an object of this class.
    // 'nextId' is a static variable that keeps track of the next available 'id' value.
    // 'value' holds the value associated with this field.

    private int id;
    private static int nextId = 1;
    private String value;

    // This is the first constructor, which doesn't take any arguments.
    // It initializes the 'id' with a unique value by using 'nextId' and then increments 'nextId' for the next object.
    // This constructor is called when an object is created with the 'new' keyword and no arguments.

    public JobField() {
        id = nextId;
        nextId++;
    }

    // This is the second constructor, which takes a 'value' argument.
    // It calls the default constructor (the one with no arguments) using 'this()'.
    // Then, it assigns the 'value' argument to the 'value' instance variable.

    public JobField(String value) {
        this(); // Calls the default constructor to initialize the 'id' field.
        this.value = value;
    }

    // These are the custom toString, equals, and hashCode methods that we've overridden from the Object class.

    // The 'toString' method returns the 'value' of the object as a string when the object is printed or converted to a string.

    @Override
    public String toString() {
        return value;
    }

    // The 'equals' method checks if two objects are equal by comparing their 'id' values.
    // If the 'id' values are the same, the objects are considered equal.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    // The 'hashCode' method generates a hash code for the object based on its 'id' value.

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // These are the getters and setters for the 'id' and 'value' instance variables.

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}