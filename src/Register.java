import java.util.*;

// create a Register class with a list of Nameable
public class Register {
    private List<Nameable> students_list;

    public Register(List<Nameable> list) {
        this.students_list = list;
    }

    //function returns names of students
    public List<String> getRegister() {
        List<String> NamesOfStudents = new ArrayList<>();
        for (Nameable student : students_list) {
            NamesOfStudents.add(student.getName());
        }
        return NamesOfStudents;
    }

}



