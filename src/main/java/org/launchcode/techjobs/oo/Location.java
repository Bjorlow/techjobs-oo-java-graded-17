// We are defining a new class called 'Location' which extends the 'JobField' class.
// This means that 'Location' inherits all the fields and methods from 'JobField.'
package org.launchcode.techjobs.oo;

public class Location extends JobField {

    // This is the constructor for the 'Location' class.
    // It takes a 'value' argument, which is passed to the constructor of the parent class 'JobField' using 'super(value)'.
    public Location(String value) {
        super(value);// Calls the constructor of the 'JobField' class with the 'value' argument.
    }

    // Additional methods specific to Location, if needed.
}
