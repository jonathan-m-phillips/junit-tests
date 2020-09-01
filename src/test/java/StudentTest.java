
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class StudentTest {

    Student jon;
    Student bob;
    Student zach;

    @Before
    public void setUp() {
        jon = new Student();
        jon.addGrades(98);
        jon.addGrades(95);
        jon.addGrades(96);

        bob = new Student();
        bob.addGrades(97);
        bob.addGrades(84);
        bob.addGrades(76);

        zach = new Student();
    }

    @Test
    public void testSetStudentName() {
        jon.setName("jon");
        assertEquals("student name", jon.getName(), "jon");
        bob.setName("BoB");
        assertEquals("student name", bob.getName(), "BoB");
        zach.setName("Zach");
        assertEquals("student name", zach.getName(), "Zach");
    }

    @Test
    public void testSetID() {
        jon.setID(123456789);
        assertEquals("student ID", jon.getID(), 123456789);
        bob.setID(234567890);
        assertEquals("student ID", bob.getID(), 234567890);
        zach.setID(345678901);
        assertEquals("student ID", zach.getID(), 345678901);
    }

    @Test
    public void testIsEmpty() {
        assertFalse("empty grade list", jon.isEmpty());
        assertFalse("empty grade list", bob.isEmpty());
        assertTrue("empty grade list", zach.isEmpty());
    }

    @Test
    public void testAddGrades() {
        jon.addGrades(96);
        assertEquals(jon.getGrades().size(), 4);
        bob.addGrades(89);
        assertEquals(bob.getGrades().size(), 4);
        zach.addGrades(89);
        assertEquals(zach.getGrades().size(), 1);
    }


    @Test
    public void testGetGradeAverage() {
        assertEquals("grade average",96, jon.getGradeAverage());
        assertEquals("grade average",85, bob.getGradeAverage());
        assertTrue("grade average",zach.isEmpty());
    }


}
