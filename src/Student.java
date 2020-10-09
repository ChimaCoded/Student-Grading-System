import java.util.List;

public class Student {

    private List<Double> studentsGrade ;
    private double studentTotalGrade = 0.00;
    private double studentAverageGrade;

    //constructor to get student grades
    public Student(List<Double> studentsGrade) {
        this.studentsGrade = studentsGrade;
    }

    public double getAverageGrade(){

        //iterating over all input
        for (double grade : studentsGrade){

            //calculating average of student grades
            studentTotalGrade = studentTotalGrade + grade;
        }
        studentAverageGrade = studentTotalGrade  / studentsGrade.size();
        return studentAverageGrade;
    }

}