package Model;

public class CourseOnline extends Course {
    private String nenTang;
    private double thoiLuong;

    public CourseOnline() {
    }

    public CourseOnline(int courseId, String courseName, String mentorName, int credit, String nenTang, double thoiLuong) {
        super(courseId, courseName, mentorName, credit);
        this.nenTang = nenTang;
        this.thoiLuong = thoiLuong;
    }
}
