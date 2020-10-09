import java.util.List;

public class NaughtyStudent extends Student {

    private double naughtyStudentAverageGrade;
    private double studentAverageGrade;

    public NaughtyStudent(Student studentsAverageGrade) {

    }




    /*public double getNaughtyStudent() {
        //calculate 10% of avg +the avg assigned naughtyAvg
        naughtyStudentAverageGrade = studentAverageGrade + (0.1 * studentAverageGrade);
        return naughtyStudentAverageGrade;

    }*/

    public double getNaughtyStudent(){
        naughtyStudentAverageGrade = super.getAverageGrade() * 1.1;
        return naughtyStudentAverageGrade;

    }


}


