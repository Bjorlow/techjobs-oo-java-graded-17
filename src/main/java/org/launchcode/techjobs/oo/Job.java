// We import the necessary classes for object comparison and hashing.
package org.launchcode.techjobs.oo;

import java.util.Objects;

// This is the declaration of the 'Job' class, which represents job information.
public class Job {

    // Member variables to hold job data and manage IDs.
    private int id;
    private static int nextId = 1;

    // Fields representing job attributes.
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // Constructor to initialize the id field with a unique value.
    public Job() {
        id = nextId;
        nextId++;
    }

    // Second constructor to initialize all fields.
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this(); // Calls the first constructor to initialize the 'id' field.
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // Custom equals and hashCode methods. Two Job objects are "equal" when their id fields match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Getters for each field EXCEPT nextId.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    // Setters for each field EXCEPT nextID and id.
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    // Custom toString method to handle empty fields.
    @Override
    public String toString() {
        String idString = "ID: " + id + System.lineSeparator();
        String nameString = "Name: " + (name != null && !name.isEmpty() ? name : "Data not available") + System.lineSeparator();
        String employerString = "Employer: " + (employer != null && employer.getValue() != null && !employer.getValue().isEmpty() ? employer.getValue() : "Data not available") + System.lineSeparator();
        String locationString = "Location: " + (location != null && location.getValue() != null && !location.getValue().isEmpty() ? location.getValue() : "Data not available") + System.lineSeparator();
        String positionTypeString = "Position Type: " + (positionType != null && positionType.getValue() != null && !positionType.getValue().isEmpty() ? positionType.getValue() : "Data not available") + System.lineSeparator();
        String coreCompetencyString = "Core Competency: " + (coreCompetency != null && coreCompetency.getValue() != null && !coreCompetency.getValue().isEmpty() ? coreCompetency.getValue() : "Data not available") + System.lineSeparator();

        return System.lineSeparator() + idString + nameString + employerString + locationString + positionTypeString + coreCompetencyString;
    }

    //instances here
}