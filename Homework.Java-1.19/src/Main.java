import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList students = new ArrayList<>();
        Student student1= new Student("Vlad",3);
        Student student2= new Student("Ioana",6);
        Student student3= new Student("Claudia",10);
        Student student4= new Student("Denis",10);
        Student student5= new Student("Cristian",8);
        Student student6= new Student("Darius",5);
        Student student7= new Student("Ionut",7);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        Collections.sort(students, new NoteComparator());
        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }

    }
}