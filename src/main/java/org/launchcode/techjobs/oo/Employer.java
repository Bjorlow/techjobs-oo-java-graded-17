// We are defining a new class called 'Employer' which extends the 'JobField' class.
// This means that 'Employer' inherits all the fields and methods from 'JobField.'

package org.launchcode.techjobs.oo;

// This is the constructor for the 'Employer' class.
// It takes a 'value' argument, which is passed to the constructor of the parent class 'JobField' using 'super(value)'.
public class Employer extends JobField {

    public Employer(String value) {
        super(value); // Calls the constructor of the 'JobField' class with the 'value' argument.

    }

    // Additional methods specific to Employer, if needed.
}