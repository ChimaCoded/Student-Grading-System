import java.util.Collections;
import java.util.List;

public class Lecture {

    private List<Double> studentsAverageGrade;
    private double highestAverageGrade;

    //getting a list of average grades of various students
    public void  Enter(List<Double> studentsAverageGrade){
        this.studentsAverageGrade = studentsAverageGrade;
    }

    //getting the highest average grade of the various students
    public double getHighestAverageGrade(){
         highestAverageGrade = Collections.max(studentsAverageGrade);
        return highestAverageGrade;
    }
}


