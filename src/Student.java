import java.util.List;

public class Student implements Nameable, HasLevel{

    private String studentName;
    private List<Double> studentGrades;
    private double studentTotalGrade = 0.00;
    private double studentAverageGrade;
    private Level level;

    //constructor to get student grades
    public Student(List<Double> studentsGrades, Level level) {
        this.studentGrades = studentsGrades;
        this.level = level;
    }

    public Student() {
    }

    public double getAverageGrade(){

        //iterating over all input
        for (double grade : studentGrades){

            //calculating average of student grades
            studentTotalGrade = studentTotalGrade + grade;
        }
        studentAverageGrade = studentTotalGrade  / studentGrades.size();
        return studentAverageGrade;
    }

    @Override
    public String getName(String studentName){
        this.studentName = studentName;
        return this.studentName;
    }

    @Override
    public Level getLevel(){
        return this.level;
    }
}