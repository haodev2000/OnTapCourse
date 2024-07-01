package Main;

import Model.CourseOnline;
import Model.Student;

public class Main {
    public static void main(String[] args) {
        CourseOnline c = new CourseOnline(1,"toán học", "dương",100,"Khoa học",60);
        Student s = new Student(1, "Hảo", 24);

        c.displayDetailSource();
        s.displayStudent();


    }
}
