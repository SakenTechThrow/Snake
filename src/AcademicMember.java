//import java.util.ArrayList;
//class Department{
//    public static void main(String[] args) {
//        Course course1 = new Course("CSS101", "Fundamental of Programming");
//        Course course2 = new Course("CS102", "Data Structures");
//
//        Instructor instructor = new Instructor("Dr. Smith", 45, "I001");
//
//        course1.assignInstructor(instructor);
//        instructor.assignCourse(course1);
//        Student alice = new Student("Alice", 20, "S101");
//
//        alice.enrollInCourse(course1);
//
//        alice.displayInfo();
//        System.out.println();
//        instructor.displayInfo();
//        System.out.println();
//        course1.displayCourseInfo();
//    }
//
//}
//public abstract class AcademicMember {
//    private String name;
//    private int age;
//    public AcademicMember(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//    public abstract void displayInfo();
//}
//class Student extends AcademicMember{
//    private String studentId;
//    private ArrayList<Course> enrolledCourses;
//    public Student(String name, int age, String studentId){
//        super(name, age);
//        this.studentId = studentId;
//        this.enrolledCourses = new ArrayList<>();
//    }
//    public void enrollInCourse(Course course){
//        enrolledCourses.add(course);
//    }
//    public void displayEnrolledCourses(){
//        for (Course course : enrolledCourses) {
//            System.out.println(course);
//        }
//    }
//
//    @Override
//    public void displayInfo() {
//        System.out.println("=== Student Info ===");
//        System.out.println("Name: " + getName());
//        System.out.println("Age: " + getAge());
//        System.out.println("Student ID: " + studentId);
//        displayEnrolledCourses();
//    }
//    }
//
//class Instructor extends AcademicMember{
//    private String instructorId;
//    private ArrayList<Course> assignedCourses;
//    public Instructor(String name, int age, String instructorId){
//        super(name, age);
//        this.instructorId = instructorId;
//        this.assignedCourses = new ArrayList<>();
//    }
//    public void assignCourse(Course course){
//        assignedCourses.add(course);
//    }
//    public void displayAssignedCourses(){
//        for (Course course : assignedCourses) {
//            System.out.println(course);
//        }
//    }
//
//    @Override
//    public void displayInfo() {
//        System.out.println("=== Instructor Info ===");
//        System.out.println("Name: " + getName());
//        System.out.println("Age: " + getAge());
//        System.out.println("Instructor ID: " + instructorId);
//        displayAssignedCourses();
//    }
//}
//class Course{
//    private String courseId;
//    private String courseName;
//    private Instructor instructor;
//
//    public Course(String courseId, String courseName){
//        this.courseId = courseId;
//        this.courseName = courseName;
//    }
//    public void assignInstructor(Instructor instructor){
//        this.instructor = instructor;
//        instructor.assignCourse(this);
//    }
//    public void displayCourseInfo(){
//        System.out.println("=== Course Info ===");
//        System.out.println("Course ID: " + courseId);
//        System.out.println("Course Name: " + courseName);
//        if (instructor != null) {
//            System.out.println("Instructor: " + instructor.getName());
//        } else {
//            System.out.println("Instructor: Not assigned");
//        }
//    }
//
//    @Override
//    public String toString() {
//        return courseId + " - " + courseName;
//    }
//}
