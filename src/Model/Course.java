package Model;

public class Course {

    private int courseId;
    private String courseName;
    private String mentorName;
    private int credit;

    public Course() {
    }

    public Course(int courseId, String courseName, String mentorName, int credit) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.mentorName = mentorName;
        this.credit = credit;
    }

    public void displayDetailSource(){
        System.out.println("Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", mentorName='" + mentorName + '\'' +
                ", credit=" + credit +
                '}');
    }

}
