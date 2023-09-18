package org.launchcode.techjobs.oo;


import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job jobOne = new Job();
        Job jobTwo = new Job();

        assertNotEquals(jobOne, jobTwo);


    }

    @Test
    public void testJobConstructorSetsAllFields() {
       Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


       assertEquals("Product tester", job.getName());
       assertTrue(job.getEmployer() instanceof Employer);
       assertEquals("ACME", job.getEmployer().getValue());
       assertTrue(job.getLocation() instanceof Location);
       assertEquals("Desert", job.getLocation().getValue());
       assertTrue(job.getPositionType() instanceof PositionType);
       assertEquals("Quality control", job.getPositionType().getValue());
       assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
       assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job jobOne = new Job();
        Job jobTwo = new Job();

        assertFalse(jobOne.equals(jobTwo));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newLine = System.lineSeparator();
        String str = job.toString();
        int strLength = str.length();
        char first = str.charAt(0);
        char last = str.charAt(strLength - 1);

        assertEquals(newLine, String.valueOf(first));
        assertEquals(newLine, String.valueOf(last));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String newLine = System.lineSeparator();

        String expectedName = "Product tester";
        String expectedEmployer = "ACME";
        String expectedLocation = "Desert";
        String expectedPositionType = "Quality control";
        String expectedCoreCompetency = "Persistence";

        assertEquals(newLine + "ID: " +
                job.getId() + newLine +
                "Name: " + expectedName + newLine +
                "Employer: " + expectedEmployer + newLine +
                "Location: " + expectedLocation + newLine +
                "Position Type: " + expectedPositionType + newLine +
                "Core Competency: " + expectedCoreCompetency + newLine, job.toString());

    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newLine = System.lineSeparator();

        String expectedName = "Data not available";
        String expectedEmployer = "ACME";
        String expectedLocation = "Desert";
        String expectedPositionType = "Quality control";
        String expectedCoreCompetency = "Persistence";

        assertEquals(newLine + "ID: " +
                job.getId() + newLine +
                "Name: " + expectedName + newLine +
                "Employer: " + expectedEmployer + newLine +
                "Location: " + expectedLocation + newLine +
                "Position Type: " + expectedPositionType + newLine +
                "Core Competency: " + expectedCoreCompetency + newLine, job.toString());


    }




}
