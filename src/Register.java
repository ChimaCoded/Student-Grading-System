import java.util.*;

// create a Register class with a list of Nameable
public class Register implements HasLevel{
    private List<String> studentsNameList;
    Student student = new Student();
    private List<String> namesOfStudents = new ArrayList<>();
    private Level level;

    public Register(List<String> studentsNameList) {
        this.studentsNameList = studentsNameList;
    }

    //function returns names of students
    public List<String> getRegister() {
        for (String name : this.studentsNameList) {
            namesOfStudents.add(student.getName(name));
        }
        return namesOfStudents;
    }

    //get register by level
    public void getRegisterByLevel(Level level){
        this.level = level;
    }

    public String printReport(){
        return ("");
    }

    @Override

    public Level getLevel() {
        return null;
    }
}



