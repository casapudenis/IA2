import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        Student first_student= new Student("Casapu Denis Cristian",new Address("Craiova","Henri Coanda",68));
        students.add(first_student);
        Student second_student= new Student("Bucur Razvan Nicholas",new Address("Craiova","Paltinis",48));
        students.add(second_student);
        Teacher professor = new Teacher("Cerbulescu Catalin",new Address("Craiova","Decebal",32),"Applied Informatics");
        teachers.add(professor);
        Course course = new Course("Applied Informatics",students,teachers);
        Student third_student = new Student("Papa Boris Stefan",new Address("Craiova","Cerna",4));
        course.addStudentToCourse(third_student);
        course.printeverything();
    }
}