import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void getAverageGrade() {
        List<Double> grades = new ArrayList<>();
        grades.add(55.00);
        grades.add(67.00);
        grades.add(19.00);
        grades.add(90.00);

        Student student1 = new Student(grades);
        System.out.println(grades.size());
        assertEquals(57.75, student1.getAverageGrade(), 0.00);
    }
}