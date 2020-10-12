import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LectureTest {


    @Test
    public void enter() {
    }

    @Test
    public void getHighestAverageGrade() {

        List<Double> student1Grades = new ArrayList<>();
        student1Grades.add(55.00);
        student1Grades.add(67.00);
        student1Grades.add(19.00);
        student1Grades.add(90.00);

        Student student1 = new Student(student1Grades, HasLevel.Level.Level300);

        List<Double> student2Grades = new ArrayList<>();
        student2Grades.add(55.00);
        student2Grades.add(67.00);
        student2Grades.add(19.00);
        student2Grades.add(80.00);

        Student student2 = new Student(student2Grades, HasLevel.Level.Level300);

        List<Double> student3Grades = new ArrayList<>();
        student3Grades.add(55.00);
        student3Grades.add(67.00);
        student3Grades.add(19.00);
        student3Grades.add(50.00);

        Student student3 = new Student(student3Grades, HasLevel.Level.Level300);


        List<Double> lecture1Students = new ArrayList<>();
        lecture1Students.add(student1.getAverageGrade());
        lecture1Students.add(student2.getAverageGrade());
        lecture1Students.add(student3.getAverageGrade());

        Lecture lecture1 = new Lecture();
        lecture1.Enter(lecture1Students);
        assertEquals( 57.75,lecture1.getHighestAverageGrade(), 0.00);

    }
}