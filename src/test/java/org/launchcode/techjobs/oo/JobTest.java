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


}
