package entity;

public class Student {
    private String Sno;
    private String name;

    public String getSno() {
        return Sno;
    }

    public void setSno(String sno) {
        Sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String sno, String name) {
        Sno = sno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Sno='" + Sno + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
