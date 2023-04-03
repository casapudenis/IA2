import java.util.ArrayList;
import java.util.List;

class Student extends Person {
    private int nr;

    Student(String name, Address address) {

        super(name, address);
    }
    public void ChangeStudentAddress(Address address) {

        super.changeAddress(address);
    }

}
