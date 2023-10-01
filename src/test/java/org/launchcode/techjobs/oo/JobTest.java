// We are importing necessary classes for testing and assertions.
package org.launchcode.techjobs.oo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

// This is the declaration of the 'JobTest' class, which will contain our unit tests
public class JobTest {

    // These are member variables to hold instances of the 'Job' class for testing
    private Job job1;
    private Job job2;
    private Job job3;

    // The '@Before' annotation marks this method to run before each test method.
    // It initializes the 'job1', 'job2', and 'job3' objects with test data
    @Before
    public void setUp() {
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    // The '@Test' annotation marks this method as a test case for setting job IDs
    @Test
    public void testSettingJobId() {
        // Test the empty constructor
        assertNotEquals(job1.getId(), job2.getId());
    }

    // This is a test case for the full constructor, ensuring it sets all fields correctly
    @Test
    public void testJobConstructorSetsAllFields() {
        // Test the full constructor
        // We check if 'job3' is an instance of the 'Job' class and if its fields are set correctly
        assertTrue(job3 instanceof Job);
        assertEquals("Product tester", job3.getName());
        assertEquals("ACME", job3.getEmployer().getValue());
        assertEquals("Desert", job3.getLocation().getValue());
        assertEquals("Quality control", job3.getPositionType().getValue());
        assertEquals("Persistence", job3.getCoreCompetency().getValue());
    }

    // This test checks the 'equals' method to verify that 'job1' and 'job2' are not equal
    @Test
    public void testJobsForEquality() {
        // Test the equals method
        assertFalse(job1.equals(job2));
    }

    // This test checks if the 'toString' method returns a string that starts and ends with a new line
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        String jobString = job1.toString();

        assertTrue(jobString.startsWith(System.lineSeparator()));  // Check for a single newline character at the start
        assertTrue(jobString.endsWith(System.lineSeparator()));    // Check for a single newline character at the end
    }

    // This test checks if the 'toString' method contains correct labels and data
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        String jobString = job3.toString();
        assertTrue(jobString.contains("ID: " + job3.getId()));
        assertTrue(jobString.contains("Name: Product tester"));
        assertTrue(jobString.contains("Employer: ACME"));
        assertTrue(jobString.contains("Location: Desert"));
        assertTrue(jobString.contains("Position Type: Quality control"));
        assertTrue(jobString.contains("Core Competency: Persistence"));
    }


    // This test checks if the 'toString' method handles empty fields by showing "Data not available.
    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        String jobString = job.toString();

        assertTrue(jobString.contains("Employer: Data not available"));
        assertTrue(jobString.contains("Position Type: Data not available"));
    }
}