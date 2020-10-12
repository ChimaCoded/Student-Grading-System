import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class NaughtyStudentTest {

    @Test
    public void getNaughtyStudent() {

        List<Double> student1Grades = new ArrayList<>();
        student1Grades.add(55.00);
        student1Grades.add(67.00);
        student1Grades.add(19.00);
        student1Grades.add(90.00);

        Student student1 = new Student(student1Grades, HasLevel.Level.Level300);

        NaughtyStudent naughtyStudent1 = new NaughtyStudent(student1);

        assertNotEquals(naughtyStudent1.getNaughtyStudent(), student1.getAverageGrade());

    }

}