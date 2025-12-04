import java.util.Scanner;

class Course {
    String courseId;
    String courseName;
    
    Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }
    String getCourseInfo() {
        return courseId + ": " + courseName;
    }
}
class Student12 {
    String studentName;
    Course enrolledCourse;
    Student12(String studentName, Course enrolledCourse) {
        this.studentName = studentName;
        this.enrolledCourse = enrolledCourse;
    }
    void displayEnrollment() {
        System.out.println("Student: " + studentName);
        System.out.println("Enrolled in: " + enrolledCourse.getCourseInfo());
    }
}
public class Lab2_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String courseId = scanner.nextLine();
        String courseName = scanner.nextLine();
        String studentName = scanner.nextLine();
        Course course = new Course(courseId, courseName);
        Student12 student = new Student12(studentName, course);
        student.displayEnrollment();
        scanner.close();
    }
}