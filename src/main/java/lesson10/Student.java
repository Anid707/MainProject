package lesson10;

public class Student extends Person{
    private String major;

    public Student(String name, String lastName, int year, String major) {
        super(name,lastName,year);
        this.major = major;
    }


    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", major='" + major + '\'' +
                '}';
    }
}
