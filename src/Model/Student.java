package Model;

public class Student {
    private int studentId;
    private String studentName;
    private int age;

    public Student() {
    }

    public Student(int studentId, String studentName, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
    }

    public void displayStudent(){
        System.out.println("Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                '}');
    }
}
