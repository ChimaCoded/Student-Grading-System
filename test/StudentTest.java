import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void getAverageGrade() {
        List<Double> student1Grades = new ArrayList<>();
        student1Grades.add(55.00);
        student1Grades.add(67.00);
        student1Grades.add(19.00);
        student1Grades.add(90.00);

        Student student1 = new Student(student1Grades, HasLevel.Level.Level300);
        assertEquals(57.75, student1.getAverageGrade(), 0.00);
    }
}