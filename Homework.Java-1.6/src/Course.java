import java.util.ArrayList;
import java.util.List;

class Course {
    private String name;
    private List<Student> students = new ArrayList<Student>();
    private List<Teacher> teachers = new ArrayList<Teacher>();
    Course(String name, List<Student> students, List<Teacher> teachers) {
        this.name = name;
        this.students = students;
        this.teachers= teachers;
    }
    public void addStudentToCourse(Student student) {
        students.add(student);
    }
    public void removeStudentFromCourse(Student student) {
        students.remove(student);
    }

    public void addTeacherToCourse(Teacher teacher) {
        teachers.add(teacher);
    }
    public void RemoveTeacherFromCourse(Teacher teacher) {
        teachers.remove(teacher);
    }
    public Course createNewCourse(String name, List<Student> students, List<Teacher> teachers) {
        Course course = new Course(name, students, teachers);
        for (Student i : students) {
            course.addStudentToCourse(i);
        }
        for(Teacher i: teachers)
        {
            course.addTeacherToCourse(i);
        }
        return course;

    }
    public void printeverything()
    {
        System.out.print("Course name: "+name);
        System.out.println();
        System.out.println("Teacher:");
        for(Teacher i: teachers)
        {
            i.print();
        }
        System.out.println("Students:");
        for (Student i : students) {
            i.print();
        }
    }
}
