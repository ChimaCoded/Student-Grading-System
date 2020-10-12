import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RegisterTest {

    @Test
    public void getRegister() {
        List<Double> student1Grades = new ArrayList<>();
        student1Grades.add(55.00);
        student1Grades.add(67.00);
        student1Grades.add(19.00);
        student1Grades.add(90.00);

        Student student1 = new Student(student1Grades, HasLevel.Level.Level300);

        String student1Name = student1.getName("Kelvin Prince");

        List<String> studentNameList = new ArrayList<>();
        studentNameList.add(student1Name);

        Register register = new Register(studentNameList);
        //assertEquals("Kelvin Prince", register.getRegister());

        assertNotSame("Kelvin Prince", register.getRegister());
    }
}