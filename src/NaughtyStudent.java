import java.util.List;

public class NaughtyStudent extends Student {

    private Student student;
    private double naughtyStudentAverageGrade;

    public NaughtyStudent(Student student) {
        this.student = student;
    }

    public double getNaughtyStudent() {
        //calculate 10% of avg +the avg assigned naughtyAvg
        naughtyStudentAverageGrade = student.getAverageGrade() + (0.1 * student.getAverageGrade());
        return naughtyStudentAverageGrade;

    }


}


