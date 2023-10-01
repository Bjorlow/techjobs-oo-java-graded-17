package org.launchcode.techjobs.oo;

// We are defining a new class called 'CoreCompetency' which extends the 'JobField' class.
// This means that 'CoreCompetency' inherits all the fields and methods from 'JobField.'

public class CoreCompetency extends JobField {

    // This is the constructor for the 'CoreCompetency' class.
    // It takes a 'value' argument, which is passed to the constructor of the parent class 'JobField' using 'super(value)'.
    public CoreCompetency(String value) {
        super(value);// Calls the constructor of the 'JobField' class with the 'value' argument.
    }

    // Additional methods specific to CoreCompetency, if needed.
}
