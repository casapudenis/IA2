public class Student {
    private String name;
    private int note;
    Student(String name,int note)
    {
        this.name=name;
        this.note=note;
    }
    public int getNote()
    {
        return note;
    }
    public String toString()
    {
        return name +" "+ note;
    }
}
