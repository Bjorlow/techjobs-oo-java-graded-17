package org.launchcode.techjobs.oo;

// We are defining a new class called 'PositionType' which extends the 'JobField' class.
// This means that 'PositionType' inherits all the fields and methods from 'JobField.'
public class PositionType extends JobField {


    // This is the constructor for the 'PositionType' class.
    // It takes a 'value' argument, which is passed to the constructor of the parent class 'JobField' using 'super(value)'.


    public PositionType(String value) {
        super(value); // Calls the constructor of the 'JobField' class with the 'value' argument
    }

    // Additional methods specific to PositionType, if needed.
}
