import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class NaughtyStudentTest {

    @Test
    public void getNaughtyStudent() {

        List<Double> grades = new ArrayList<>();
        grades.add(55.00);
        grades.add(67.00);
        grades.add(19.00);
        grades.add(90.00);

        boolean bool;

        Student student1 = new Student(grades);
        NaughtyStudent naughtyStudent1 = new NaughtyStudent(student1);

        //assertEquals(student1.getAverageGrade(), naughtyStudent1.getNaughtyStudent(), 0.00);
        if (student1.getAverageGrade() < naughtyStudent1.getNaughtyStudent()){
            bool = true;
        }
        else {
            bool = false;
        }

        System.out.println(student1.getAverageGrade());
        System.out.println(naughtyStudent1.getNaughtyStudent());
        assertFalse(bool);


    }

}