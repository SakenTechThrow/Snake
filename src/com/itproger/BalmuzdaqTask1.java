package com.itproger;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.lang.reflect.Array;
import java.util.*;

// Assignment 1
//public class BalmuzdaqTask1 {
//    public static int numStudents;
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        //Student student = new Student()
//        System.out.print("Enter the number of students: ");
//        //int numStudents = scanner.nextInt();
//        numStudents = scanner.nextInt();
//
//        StudentManager s1 = new StudentManager(numStudents);
//        for (int i = 1; i <= numStudents; i++) {
//            System.out.print("Enter the name for student " + i + ": ");
//            String name = scanner.next();
//            System.out.print("Enter the grade for student " + i + ": ");
//            int grade = scanner.nextInt();
//            s1.addStudent(name, grade);
//            //Student student = new Student(name, grade);
//        }
//        s1.displayStudents();
//        System.out.println("Average grade: "+s1.calculateAverage());
//        System.out.println("Highest grade: "+s1.calculateHighest());
//
//    }
//}
////////----------------------------------------------------------------------------------------------------------------------------
//class Student{
//    String name;
//    int grade;
//
//    public Student(String name, int grade){
//        this.name = name;
//        this.grade = grade;
//    }
//    public void display(){
//        System.out.print("Name: " + name);
//        System.out.println(" Grade: " + grade);
//    }
//
//}
////----------------------------------------------------------------------------------------------------------------------------
//class StudentManager extends BalmuzdaqTask1{
//    public String[] students = new String[numStudents];
//    public int[] grade = new int[numStudents];
//    public int count = 0;
//
//    public StudentManager(int size){
////        for (int i = 0; i < students.length; i++) {
////            students
////        }
//    }
//
//    public void addStudent(String name, int grade){
//        students[count] = name;
//        this.grade[count] = grade;
//        count++;
//    }
//    public void displayStudents(){
//        System.out.println("------ Student List ------");
//        for (int i = 0; i < numStudents; i++) {
//            System.out.println(students[i] + " : "+ grade[i]);
//        }
//    }
//    public double calculateAverage(){
//        double sum = 0;
//        for (int i = 0; i < numStudents; i++) {
//            sum += grade[i];
//        }
//        return sum/numStudents;
//    }
//    public int calculateHighest(){
//        int max = 0;
//        for (int i = 0; i < numStudents; i++) {
//            if (max < grade[i]){
//                max = grade[i];
//            }
//        }
//        return max;
//    }
//}
// Assignment 1 prav
//public class BalmuzdaqTask1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number of students: ");
//        int numStudents = scanner.nextInt();
//        scanner.nextLine();
//
//        StudentManager manager = new StudentManager(numStudents);
//        for (int i = 0; i < numStudents; i++) {
//            System.out.print("Enter the name for student " +(i + 1) + " : ");
//            String name = scanner.nextLine();
//
//            int grade;
//            while (true) {
//                System.out.print("Enter grade for student " + (i + 1) + " (0-100): ");
//                if (scanner.hasNextInt()){
//                    grade = scanner.nextInt();
//                    scanner.nextLine();
//                    if (grade >= 0 && grade <= 100){
//                        break;
//                    } else {
//                        System.out.println("Invalid grade.");
//                    }
//                } else {
//                    System.out.println("Invalid input. Please enter an integer.");
//                }
//            }
//            manager.addStudent(name, grade);
//        }
//
//        System.out.println("\n--- Student List ---");
//        manager.displayStudents();
//
//        double average = manager.calculateAverage();
//        System.out.println("Average Grade: " + average);
//
//        manager.findHighestLowest();
//
//    }
//}
//class Student{
//    private String name;
//    private int grade;
//    public Student(String name, int grade) {
////        if (grade < 0 || grade > 100){
////            throw IllegalArgumentException("Grade must be between 0 and 100.");
////        }
//        this.name = name;
//        this.grade = grade;
//    }
//    public void display() {
//        System.out.println(name +" : " + grade);
//    }
//    public String getName(){
//        return name;
//    }
//
//    public int getGrade() {
//        return grade;
//    }
//}
//class StudentManager{
//    private Student[] students;
//    private int count = 0;
//
//    public StudentManager(int size){
//        students = new Student[size];
//    }
//    public void addStudent(String name, int grade){
//        if (count < students.length) {
//            students[count] = new Student(name, grade);
//            count++;
//        } else {
//            System.out.println("Cannot add student. The array is full.");
//        }
//    }
//    public void displayStudents() {
//        for (int i = 0; i < count; i++) {
//            students[i].display();
//        }
//    }
//    public double calculateAverage() {
//        if (count == 0)
//            return 0;
//        int sum = 0;
//        for (int i = 0; i < count; i++) {
//            sum += students[i].getGrade();
//        }
//        return (double) sum/count;
//    }
//    public void findHighestLowest() {
//        if (count == 0) {
//            System.out.println("No students available to evaluate.");
//            return;
//        }
//
//        Student highest = students[0];
//        Student lowest = students[0];
//
//        for (int i = 1; i < count; i++) {
//            if (students[i].getGrade() > highest.getGrade()) {
//                highest = students[i];
//            }
//            if (students[i].getGrade() < lowest.getGrade()){
//                lowest = students[i];
//            }
//        }
//        System.out.println("Highest Grade: " + highest.getName() + " - " + highest.getGrade());
//        System.out.println("Lowest Grade: " + lowest.getName() + " - " + lowest.getGrade());
//    }
//}




















//
//
//
//public class BalmuzdaqTask1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number of students: ");
//        int numStudents = scanner.nextInt();
//        StudentManager manager = new StudentManager(numStudents);
//        scanner.nextLine();
//
//        for (int i = 0; i < numStudents; i++) {
//            System.out.print("Enter the name for student "+(i + 1)+": ");
//            String name = scanner.nextLine();
//
//            System.out.print("Enter the grade for student "+(i + 1)+": ");
//            int grade = scanner.nextInt();
//            scanner.nextLine();
//
//            manager.addStudent(name, grade);
//        }
//        System.out.println("Average grade: " + manager.calculateAverage());
//        manager.findHighestLowest();
//    }
//}
//class Student{
//    private String name;
//    private int grade;
//
//    public Student(String name, int grade){
//        this.name = name;
//        this.grade = grade;
//    }
//    public void display(){
//        System.out.println(name + " : " + grade);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getGrade() {
//        return grade;
//    }
//}
//class StudentManager{
//    private Student[] students;
//    private int count;
//
//    public StudentManager(int size){
//        students = new Student[size];
//    }
//    public void addStudent(String name, int grade){
//        students[count] = new Student(name, grade);
//        count++;
//    }
//    public void displayStudents(){
//        for (int i = 0; i < count; i++) {
//            students[i].display();
//        }
//    }
//    public double calculateAverage(){
//        int sum = 0;
//        for (int i = 0; i < count; i++) {
//            sum += students[i].getGrade();
//        }
//        return (double) sum / count;
//    }
//    public void findHighestLowest(){
//        Student highest = students[0];
//        Student lowest = students[0];
//
//        for (int i = 0; i < count; i++) {
//            if (students[i].getGrade() > highest.getGrade()){
//                highest = students[i];
//            }
//            if (students[i].getGrade() < lowest.getGrade()){
//                lowest = students[i];
//            }
//        }
//        System.out.println("Highest Grade : "+ highest.getName() +" - "+ highest.getGrade());
//        System.out.println("Lowest Grade : "+ lowest.getName() +" - "+ lowest.getGrade());
//    }
//}



// Assignment 1 preparation
//public class BalmuzdaqTask1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number of books the library can hold: ");
//        int numBooks = scanner.nextInt();
//        scanner.nextLine();
//
//        Library library = new Library(numBooks);
//        while (true){
//            System.out.println("Menu:");
//            System.out.println("1. Add Book\n" + "2. Display Books\n" + "3. Search for a Book\n" + "4. Count Books\n" + "5. Exit\n");
//            System.out.print("Enter choice: ");
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//            switch (choice){
//                case 1:
//                    //for (int i = 0; i < numBooks; i++) {
//                        System.out.print("Enter book Title: ");
//                        String title = scanner.nextLine();
//                        System.out.print("Enter author: ");
//                        String author = scanner.nextLine();
//                        library.addBook(title, author);
//
//                        System.out.println("Book added successfully!\n");
//                    //}
//                    break;
//                case 2:
//                    System.out.println("--- Library Books ---  \n");
//                    library.displayBooks();
//                    break;
//                case 3:
//                    System.out.print("Enter book title to search: ");
//                    String search = scanner.nextLine();
//                    library.searchBook(search);
//                    break;
//                case 4:
//                    System.out.println("Total books in the library: " + library.countBooks());
//            }
//        }
//    }
//}
//class Book{
//    private String title;
//    private String author;
//    public  Book(String title, String author){
//        this.title = title;
//        this.author = author;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void display(){
//        System.out.println(title +" by "+ author);
//    }
//}
//class Library{
//    private Book[] books;
//    private int count;
//    public Library(int size){
//        books = new Book[size];
//    }
//    public void addBook(String title, String author){
//        books[count] = new Book(title, author);
//        count++;
//    }
//    public void displayBooks(){
//        for (int i = 0; i < count; i++) {
//            books[i].display();
//        }
//    }
//    public void searchBook(String title){
//        boolean found = false;
//        for (int i = 0; i < count; i++) {
//            if (books[i].getTitle().equalsIgnoreCase(title)){
//                System.out.println("Book found: " + books[i].getTitle() + " by " + books[i].getAuthor());
//                found = true;
//                break;
//            }
//        }
//        if (!found){
//            System.out.println("Book not found!");
//        }
//    }
//
//    public int countBooks() {
//        return count;
//    }
//}



// Assignment 1 preparation
//public class BalmuzdaqTask1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter account holders name: ");
//        String accountHolder = scanner.nextLine();
//        System.out.print("Enter initial deposit amount: ");
//        int amount = scanner.nextInt();
//
//        BankAccount bankAccount = new BankAccount(accountHolder, amount);
//        while (true){
//            System.out.print("Menu:  \n" +
//                    "1. Deposit Money  \n" +
//                    "2. Withdraw Money  \n" +
//                    "3. Display Account Details  \n" +
//                    "4. Exit  \n" +
//                    "Enter choice: ");
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//            switch (choice){
//                case 1:
//                    System.out.print("Enter deposit amount: ");
//                    int dep = scanner.nextInt();
//                    bankAccount.deposit(dep);
//                    System.out.print("Deposit successful! New balance: ");
//                    System.out.println(bankAccount.getBalance());
//                    break;
//                case 2:
//                    System.out.println("Enter withdrawal amount: ");
//                    int with = scanner.nextInt();
//                    bankAccount.withdraw(with);
//                    System.out.print("Withdrawal successful! New balance: ");
//                    System.out.println(bankAccount.getBalance());
//                    break;
//                case 3:
//                    bankAccount.displayAccountInfo();
//                    break;
//                case 4:
//                    return;
//            }
//        }
//    }
//}
//class BankAccount{
//    private String accontHolder;
//    private double balance;
//
//    public BankAccount(String accontHolder, double initialBalance){
//        this.accontHolder = accontHolder;
//        balance = initialBalance;
//    }
//    public void deposit(double amount){
//        balance += amount;
//    }
//    public void withdraw(double amount){
//        balance -= amount;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void displayAccountInfo(){
//        System.out.println(accontHolder + ", " + balance);
//    }
//}

//
//

//

//

//

//

//

//
//public class BalmuzdaqTask1 {
//    public static void main(String[] args) {
//
//        Student student = new Student("Saken", 19, "240");
//
//        Instructor instructor = new Instructor("Arunaz", 20, "190");
//
//        Course course = new Course("CSS 108", "Islam and its foundations");
//
//        System.out.println("Student enrolled: " + student.getName()+" in " + course.getCourseId());
//        student.enrollInCourse(course);
//
//        System.out.println("Instructor assigned: " + instructor.getName() + " to " + course.getCourseName());
//        course.assignInstructor(instructor);
//
//        System.out.println("\nStudent Info:");
//        student.displayInfo();
//        student.displayEnrolledCourses();
//
//        System.out.println("\nInstructor Info:");
//        instructor.displayInfo();
//        instructor.displayAssignedCourses();
//    }
//}
//class Person{
//    private String name;
//    private int age;
//    public Person(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    public void displayInfo(){
//        System.out.println("Name: "+name + ", Age: " + age);
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
//class Student extends Person{
//    String studentId;
//    ArrayList<Course> enrolledCourses = new ArrayList<>();
//    public Student(String name, int age, String studentId){
//        super(name, age);
//        this.studentId = studentId;
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
//        super.displayInfo();
//        System.out.println("Student ID: " + studentId);
//    }
//}
//class Instructor extends Person{
//    String InstructorId;
//
//    ArrayList<Course> assignedCourses = new ArrayList<>();
//        public Instructor(String name, int age, String InstructorId){
//            super(name, age);
//            this.InstructorId = InstructorId;
//        }
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
//        super.displayInfo();
//        System.out.println("Instructor ID: " + InstructorId);
//    }
//}
//class Course{
//    String courseId;
//    String courseName;
//    Instructor instructor;
//    public Course(String courseId, String courseName){
//        this.courseId = courseId;
//        this.courseName = courseName;
//    }
//    public void assignInstructor(Instructor instructor){
//        this.instructor = instructor;
//        instructor.assignCourse(this);
//    }
//
//    public String getCourseId() {
//        return courseId;
//    }
//
//    public String getCourseName() {
//        return courseName;
//    }
//
//    @Override
//    public String toString(){
//        return courseId + " - " + courseName;
//    }
//
//}
//



















// Assignment 2 READY
//public class BalmuzdaqTask1 {
//    public static void main(String[] args) {
//        Student student = new Student("Saken", 19, "240");
//
//        Instructor instructor = new Instructor("Arunaz", 20, "190");
//
//        Course course = new Course("CSS 108", "Islam and its Foundations");
//
//        System.out.println("Student enrolled: " + student.getName() +" in " + course.getCourseId());
//        student.enrollInCourse(course);
//
//        System.out.println("Instructor assigned: " + instructor.getName() +" to " + course.getCourseId());
//        course.assignInstructor(instructor);
//
//        System.out.println("\nStudent Info:");
//        student.displayInfo();
//        student.displayEnrolledCourses();
//
//        System.out.println("\nInstructor Info: ");
//        instructor.displayInfo();
//        instructor.displayAssignedCourses();
//
//    }
//}
//class Person{
//    private String name;
//    private int age;
//    public Person(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void displayInfo(){
//        System.out.println("Name: " + name + "\nAge: " + age);
//    }
//}
//class Student extends Person{
//    String studentId;
//    ArrayList<Course> enrolledCourses = new ArrayList<>();
//    public Student(String name, int age, String studentId){
//        super(name, age);
//        this.studentId = studentId;
//    }
//    public void enrollInCourse(Course course){
//        enrolledCourses.add(course);
//    }
//    public void displayEnrolledCourses(){
//        for (Course course : enrolledCourses) {
//            System.out.println("Enrolled Courses: "+course);
//        }
//    }
//
//    @Override
//    public void displayInfo() {
//        super.displayInfo();
//        System.out.println("Student ID: " + studentId);
//    }
//}
//class Instructor extends Person{
//    String instructorId;
//    ArrayList<Course> assignedCourses = new ArrayList<>();
//    public Instructor(String name, int age, String instructorId){
//        super(name , age);
//        this.instructorId = instructorId;
//    }
//    public void assignCourse(Course course){
//        assignedCourses.add(course);
//    }
//
//    @Override
//    public String getName() {
//        return super.getName();
//    }
//
//    public void displayAssignedCourses(){
//        for (Course course : assignedCourses) {
//            System.out.println("Assigned Courses: "+course);
//        }
//    }
//
//    @Override
//    public void displayInfo() {
//        super.displayInfo();
//        System.out.println("Instructor ID: " + instructorId);
//    }
//}
//class Course{
//    String courseId;
//    String courseName;
//    Instructor instructor;
//    public Course(String courseId, String courseName){
//        this.courseId = courseId;
//        this.courseName = courseName;
//    }
//    public void assignInstructor(Instructor instructor){
//        this.instructor = instructor;
//        instructor.assignCourse(this);
//    }
//    public void displayCourseInfo(){
//        System.out.println("Course ID: " + courseId);
//        System.out.println("Course Name: " + courseName);
//    }
//
//    public String getCourseName() {
//        return courseName;
//    }
//
//    public String getCourseId() {
//        return courseId;
//    }
//
//    @Override
//    public String toString(){
//        return courseId +" - "+courseName;
//    }
//}

//public class BalmuzdaqTask1 {
//    public static void main(String[] args) {
//        System.out.println("Creating students and instructors...");
//        Student student = new Student("Saken", 19, "240");
//
//        Instructor instructor = new Instructor("Arunaz", 20, "190");
//
//        Course course = new Course("CSS108", "Islam and its foundations");
//
//        student.enrollinCourses(course);
//        instructor.assignCourse(course);
//
//        System.out.println("\nStudent Info: ");
//        student.displayInfo();
//        student.displayEnrolledCourses();
//
//        System.out.println("\nInstructor Info: ");
//        instructor.displayInfo();
//        instructor.displayAssignedCourses();
//
//
//    }
//}
//class Person{
//    private String name;
//    private int age;
//    public Person(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void displayInfo(){
//        System.out.println("Name: " + name + "\nAge: " + age);
//    }
//}
//class Student extends Person{
//    private String studentId;
//    ArrayList<Course> enrolledCourses = new ArrayList<>();
//    public Student(String name, int age, String studentId){
//        super(name, age);
//        this.studentId = studentId;
//    }
//
//    public void enrollinCourses(Course course){
//        enrolledCourses.add(course);
//        System.out.println("Student enrolled: " + getName() +" in "+ course.getCourseId());
//    }
//    public void displayEnrolledCourses(){
//        for (Course course : enrolledCourses) {
//            System.out.println("Enrolled courses: "+course);
//        }
//    }
//
//    @Override
//    public void displayInfo() {
//        super.displayInfo();
//        System.out.println("Student ID: " + studentId);
//    }
//}
//class Instructor extends Person{
//    String instructorId;
//    ArrayList<Course> assignedCourses = new ArrayList<>();
//    public Instructor(String name, int age, String instructorId){
//        super(name, age);
//        this.instructorId = instructorId;
//    }
//    public void assignCourse(Course course){
//        assignedCourses.add(course);
//        System.out.println("Instructor assigned: " + getName() + " to " + course.getCourseId());
//    }
//    public void displayAssignedCourses(){
//        for (Course course : assignedCourses) {
//            System.out.println("Assigned courses: "+course);
//        }
//    }
//
//    @Override
//    public void displayInfo() {
//        super.displayInfo();
//        System.out.println("Instructor ID: " + instructorId);
//    }
//}
//class Course{
//    private String courseId;
//    private String courseName;
//    Instructor instructor;
//
//    public String getCourseName() {
//        return courseName;
//    }
//
//    public String getCourseId() {
//        return courseId;
//    }
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
//        System.out.println("Course ID: " + courseId +"\nCourse name: " + courseName);
//    }
//
//    @Override
//    public String toString() {
//        return getCourseId() +" - "+getCourseName();
//    }
//}
//

//Customer   → BookingSystem   : searchFlights(location, date)
//        BookingSystem → Database      : getAvailableFlights(location, date)
//        Database   → BookingSystem   : return flights list
//        BookingSystem → Customer      : display flights
//
//        Customer   → BookingSystem   : selectFlight(flight)
//        BookingSystem → Cart         : addToCart(flight)
//
//        Customer   → BookingSystem   : checkout()
//        BookingSystem → PaymentProcessor : processPayment(details)
//        PaymentProcessor → BookingSystem : paymentSuccess()
//
//        BookingSystem → FlightConfirmation : confirmFlight(flight)
//        FlightConfirmation → BookingSystem : confirmationSuccess()
//
//        BookingSystem → Cart : emptyCart()
//        BookingSystem → Customer : displayTicket()

//class Flight {
//    String flightNumber;
//    String departure;
//    String arrival;
//    String date;
//
//    public Flight(String flightNumber, String departure, String arrival, String date) {
//        this.flightNumber = flightNumber;
//        this.departure = departure;
//        this.arrival = arrival;
//        this.date = date;
//    }
//} class Cart{
//    private Flight selectedFlight;
//
//    public void addToCart(Flight flight){
//        this.selectedFlight = flight;
//        System.out.println("Flight added to cart: " + flight.flightNumber);
//    }
//
//    public void emptyCart() {
//        selectedFlight = null;
//        System.out.println("Cart is now empty.");
//    }
//
//    public Flight getFlight() {
//        return selectedFlight;
//    }
//} class PaymentProcessor {
//    public boolean processPayment(String paymentDetails){
//        System.out.println("Processing payment...");
//        return true;
//    }
//} class BookingSystem {
//    private Cart cart = new Cart();
//    private PaymentProcessor paymentProcessor = new PaymentProcessor();
//    public void searchFlights(String departure, String arrival, String date) {
//        System.out.println("Searching for flights from " + departure + " to " + arrival + " on " + date);
//    }
//
//    public void addToCart(Flight flight) {
//        cart.addToCart(flight);
//    }
//
//    public void checkout(String paymentDetails) {
//        if (cart.getFlight() != null) {
//            boolean paymentSuccess = paymentProcessor.processPayment(paymentDetails);
//            if (paymentSuccess) {
//                confirmFlight(cart.getFlight());
//                cart.emptyCart();
//                System.out.println("Ticket confirmed! Enjoy your flight.");
//            }
//        } else {
//            System.out.println("Cart is empty!");
//        }
//    }
//
//    private void confirmFlight(Flight flight) {
//        System.out.println("Flight " + flight.flightNumber + " confirmed.");
//    }
//}
//public class BalmuzdaqTask1 {
//    public static void main(String[] args) {
//        BookingSystem bookingSystem = new BookingSystem();
//        // Поиск рейсов
//        bookingSystem.searchFlights("New York", "London", "2025-05-15");
//
//        // Выбор рейса
//        Flight selectedFlight = new Flight("NY1001", "New York", "London", "2025-05-15");
//        bookingSystem.addToCart(selectedFlight);
//
//        // Оформление билета
//        bookingSystem.checkout("Credit Card 1234");
//    }
//}

//public class BalmuzdaqTask1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str =  scanner.nextLine();
//        int num = romanToInt(str);
//        System.out.println(num);
//    }
//    public static int romanToInt(String s) {
//        int count = 0;
//        for(int i = 0; i < s.length();i++){
//            char chr = s.charAt(i);
//            if(chr == 'I'){
//                count += 1;
//            } else if(chr == 'V'){
//                count += 5;
//            } else if(chr == 'X'){
//                count += 10;
//            } else if(chr == 'L'){
//                count += 50;
//            } else if(chr == 'C'){
//                count += 100;
//            } else if(chr == 'D'){
//                count += 500;
//            } else if(chr == 'M'){
//                count += 1000;
//            }
//        }
//        return count;
//    }
//}

// Example 1;
//class Item{
//    private String name;
//    private double price;
//    public Item(String name, double price){
//        this.name = name;
//        this.price = price;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//    public String toString(){
//        return name + " ($" + price + ")";
//    }
//}
//class ItemDatabase{
//    private List<Item> items = new ArrayList<>();
//
//    public ItemDatabase() {
//        items.add(new Item("Laptop", 1000));
//        items.add(new Item("Phone", 600));
//        items.add(new Item("Headphones", 50));
//    }
//
//    public List<Item> getAllItems() {
//        return items;
//    }
//}
//class Cart{
//    private List<Item> itemsInCart = new ArrayList<>();
//    public void addItem(Item item){
//        itemsInCart.add(item);
//        System.out.println("Item added to cart: " + item.getName());
//    }
//    public double getTotal() {
//        double total = 0;
//        for (Item i : itemsInCart) {
//            total += i.getPrice();
//        }
//        return total;
//    }
//
//    public List<Item> getItems() {
//        return itemsInCart;
//    }
//}
//class PaymentSystem {
//    public boolean processPayment(double amount) {
//        System.out.println("Processing amount for $" + amount);
//        return true;
//    }
//}
//class OnlineStore{
//    private ItemDatabase itemDb = new ItemDatabase();
//    private Cart cart = new Cart();
//    private PaymentSystem payment = new PaymentSystem();
//    public void browseItems() {
//        List<Item> items = itemDb.getAllItems();
//        System.out.println("Available items:");
//        for (Item i : items) {
//            System.out.println(" - " + i);
//        }
//    }
//
//    public void addItemToCart(String itemName){
//        for (Item i : itemDb.getAllItems()) {
//            if (i.getName().equalsIgnoreCase(itemName)){
//                cart.addItem(i);
//                return;
//            }
//        }
//        System.out.println("Item not found: " + itemName);
//    }
//    public void checkout(){
//        double total = cart.getTotal();
//        boolean paid = payment.processPayment(total);
//        if (paid) {
//            System.out.println("Payment successful. Order confirmed!");
//        } else {
//            System.out.println("Payment failed. Try again.");
//        }
//    }
//}
//public class BalmuzdaqTask1 {
//    public static void main(String[] args) {
//        OnlineStore onlineStore = new OnlineStore();
//
//        onlineStore.browseItems();
//
//        onlineStore.addItemToCart("Laptop");
//
//        onlineStore.checkout();
//    }
//}


// Example 2;
//enum OrderState{
//    NEW, PAID, SHIPPED, DELIVERED, CANCELLED
//}
//class Order{
//    private OrderState state;
//    public Order() {
//        this.state = OrderState.NEW;
//        System.out.println("Order created. State: NEW");
//    }
//    public void pay(){
//        if (state == OrderState.NEW){
//            state = OrderState.PAID;
//            System.out.println("Order paid. State: PAID");
//        } else {
//            System.out.println("Cannot pay. Current state: " + state);
//        }
//    }
//
//    public void ship() {
//        if (state == OrderState.PAID){
//            state = OrderState.SHIPPED;
//            System.out.println("Order shipped. State: SHIPPED");
//        } else {
//            System.out.println("Cannot ship. Current state: " + state);
//        }
//    }
//    public void deliver(){
//        if (state == OrderState.SHIPPED){
//            state = OrderState.DELIVERED;
//            System.out.println("Order delivered. State: DELIVERED");
//        } else {
//            System.out.println("Cannot deliver. Current state: " + state);
//        }
//    }
//    public void cancel() {
//        if (state == OrderState.NEW || state == OrderState.PAID) {
//            state = OrderState.CANCELLED;
//            System.out.println("Order cancelled. State: CANCELLED");
//        } else {
//            System.out.println("Cannot cancel. Current state: " + state);
//        }
//    }
//
//    public OrderState getState() {
//        return state;
//    }
//}
//public class BalmuzdaqTask1 {
//    public static void main(String[] args) {
//        Order order = new Order();
//        order.pay();
//        order.ship();
//        order.deliver();
//
//        order.cancel();
//    }
//}
//
//
//// For preparation
//class BookingWebsite {
//    private FlightDatabase flightDb;
//    private PaymentSystem paymentSys;
//
//    public BookingWebsite() {
//        this.flightDb = new FlightDatabase();
//        this.paymentSys = new PaymentSystem();
//    }
//
//    public ArrayList<Flight> searchFlights(String departure, String arrival){
//        ArrayList<Flight> available = flightDb.getAvailableFlights(departure, arrival);
//        if (available.isEmpty()) {
//            System.out.println("No flights found for " + departure + " -> " + arrival);
//        } else {
//            System.out.println("Flights found:");
//            for (Flight f : available) {
//                System.out.println(f);
//            }
//        }
//        return available;
//    }
//    public void addFlightToCart(Flight flight, Cart cart){
//        cart.addFlight(flight);
//    }
//    public void checkout(Cart cart, String paymentInfo){
//        double total = 0;
//        for (Flight f : cart.getFlightsInCart()) {
//            total += f.getPrice();
//        }
//
//        boolean paymentResult = paymentSys.processPayment(paymentInfo, total);
//        if (paymentResult){
//            System.out.println("Booking confirmed for flights: ");
//            for (Flight f : cart.getFlightsInCart()) {
//                System.out.println(" - " + f.getFlightId());
//            }
//            cart.emptyCart();
//            System.out.println("Booking complete. Confirmation displayed to customer.");
//        } else {
//            System.out.println("Payment failed. Please try again.");
//        }
//    }
//}
//class FlightDatabase {
//    private ArrayList<Flight> flights = new ArrayList<>();
//
//    public FlightDatabase() {
//        flights.add(new Flight("F001", "NYC", "LAX", 300.0));
//        flights.add(new Flight("F002", "NYC", "MIA", 200.0));
//        flights.add(new Flight("F003", "LAX", "SFO", 150.0));
//    }
//
//    public ArrayList<Flight> getAvailableFlights(String departure, String arrival) {
//        ArrayList<Flight> result = new ArrayList<>();
//        for (Flight f : flights) {
//            if (f.getDepartureLocation().equalsIgnoreCase(departure) && f.getArrivalLocation().equalsIgnoreCase(arrival)){
//                result.add(f);
//            }
//        }
//        return result;
//    }
//}
//class Cart{
//    ArrayList<Flight> flightsInCart = new ArrayList<>();
//    public void addFlight(Flight flight){
//        flightsInCart.add(flight);
//        System.out.println("Flight added to car: " + flight.getFlightId());
//    }
//    public void emptyCart(){
//        flightsInCart.clear();
//        System.out.println("Cart emptied.");
//    }
//
//    public ArrayList<Flight> getFlightsInCart() {
//        return flightsInCart;
//    }
//}
//class PaymentSystem {
//    public boolean processPayment(String paymentInfo, double amount){
//        System.out.println("Processing payment for amount: $" + amount);
//        return true;
//    }
//}
//class Flight {
//    private String flightId;
//    private String departureLocation;
//    private String arrivalLocation;
//    private double price;
//
//    public Flight(String flightId, String departureLocation, String arrivalLocation, double price) {
//        this.flightId = flightId;
//        this.departureLocation = departureLocation;
//        this.arrivalLocation = arrivalLocation;
//        this.price = price;
//    }
//
//    public String getFlightId() {
//        return flightId;
//    }
//
//    public String getDepartureLocation() {
//        return departureLocation;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public String getArrivalLocation() {
//        return arrivalLocation;
//    }
//
//    @Override
//    public String toString() {
//        return "Flight{" +
//                "flightId='" + flightId + '\'' +
//                ", departureLocation='" + departureLocation + '\'' +
//                ", arrivalLocation='" + arrivalLocation + '\'' +
//                ", price=" + price +
//                '}';
//    }
//}
//class Customer {
//    private String name;
//    private Cart cart;
//
//    public Customer(String name) {
//        this.name = name;
//        this.cart = new Cart();
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Cart getCart() {
//        return cart;
//    }
//}
//public class BalmuzdaqTask1 {
//    public static void main(String[] args) {
//        BookingWebsite bookingWebsite = new BookingWebsite();
//
//        Customer customer = new Customer("John Doe");
//
//        ArrayList<Flight> foundFlights = bookingWebsite.searchFlights("NYC", "LAX");
//
//        if (!foundFlights.isEmpty()){
//            Flight chosenFlight = foundFlights.get(0);
//            bookingWebsite.addFlightToCart(chosenFlight, customer.getCart());
//        }
//        String paymentInfo = "VISA 1234-5678";
//        bookingWebsite.checkout(customer.getCart(), paymentInfo);
//    }
//}







//public class BalmuzdaqTask1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        StudentManager studentManager = new StudentManager(2);
//        for (int i = 0; i < 2; i++) {
//            System.out.println("Enter name: ");
//            String str = scanner.nextLine();
//            System.out.println("Enter grade: ");
//            int age = scanner.nextInt();
//            scanner.nextLine();
//            studentManager.addStudent(str, age);
//        }
//        studentManager.displayStudents();
//        System.out.println(studentManager.calculateAverage());
//        studentManager.findHighestLowest();
//    }
//}
//class Student{
//    private String name;
//    private int grade;
//
//    public Student(String name, int grade){
//        this.name = name;
//        this.grade = grade;
//    }
//    public void display(){
//        System.out.println(name+" : " + grade);
//    }
//
//    @Override
//    public String toString() {
//        return name +" : "+ grade;
//    }
//
//    public int getGrade() {
//        return grade;
//    }
//
//    public String getName() {
//            return name;
//    }
//}
//class StudentManager{
//    Student[] students;
//    int count;
//    public StudentManager(int size){
//        students = new Student[size];
//    }
//
//    public void addStudent(String name, int age){
//        students[count] = new Student(name, age);
//        count++;
//    }
//    public void displayStudents(){
//        for (int i = 0; i < count; i++) {
//            students[i].display();
//        }
//    }
//    public double calculateAverage(){
//        int sum = 0;
//        for (int i = 0; i < count; i++) {
//            sum += students[i].getGrade();
//        }
//        return (double) sum/ count;
//    }
//    public void findHighestLowest(){
//        int highest = students[0].getGrade();
//        int lowest = students[0].getGrade();
//        for (int i = 0; i < count; i++) {
//            if (students[i].getGrade() > highest){
//                highest = students[i].getGrade();
//            }
//            if (students[i].getGrade() < lowest){
//                lowest = students[i].getGrade();
//            }
//        }
//        System.out.println("Highest Grade: " + highest);
//        System.out.println("Lowest Grade: " + lowest);
//    }
//}
//

//
//
//public class BalmuzdaqTask1 {
//    public static void main(String[] args) {
//
//        Member member = new Member("Saken", 19, "240");
//
//        Librarian librarian = new Librarian("Farida", 97, "999");
//
//        Book book = new Book("123", "1984", "George Orwell");
//        Book book1 = new Book("234", "Abay zholy", "Mukhrat Auezov");
//        librarian.addBook(book);
//        librarian.addBook(book1);
//        System.out.println("Adding books to library...");
//        System.out.println("Book added: " + book.getTitle() +" by " + book.getAuthor());
//
//        System.out.println("\nBorrowing books...");
//        member.borrowBook(book);
//        book.borrowBook();
//        System.out.println(member.getName() + " borrowed " + book.getTitle());
//
//        System.out.println("\nMember Info:");
//        member.displayInfo();
//        member.displayBorrowedBooks();
//
////        System.out.println("\nReturning books...");
////        member.returnBook(book);
////        book.returnBook();
////        System.out.println(member.getName() + " returned " + book.getTitle());
//
//        System.out.println("\nBooks in Library: ");
//        librarian.displayBooks();
//
//    }
//}
//class Person{
//    private String name;
//    private int age;
//    public Person(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void displayInfo(){
//        System.out.println("Name: "+name+"\nAge: "+age);
//    }
//}
//class Member extends Person{
//    String memberId;
//    ArrayList<Book> borrowedBooks = new ArrayList<>();
//    public Member(String name, int age, String memberId){
//        super(name, age);
//        this.memberId = memberId;
//    }
//
//    public void borrowBook(Book book){
//        if (book.isAvailable()){
//            borrowedBooks.add(book);
//        } else {
//            System.out.println("Book is not available");
//        }
//
//    }
//    public void returnBook(Book book){
//        borrowedBooks.remove(book);
//    }
//    public void displayBorrowedBooks(){
//        if (!borrowedBooks.isEmpty()){
//            for (Book book : borrowedBooks) {
//                System.out.println(book);
//            }
//        } else {
//            System.out.println("No books borrowed!");
//        }
//
//    }
//
//    @Override
//    public void displayInfo() {
//        super.displayInfo();
//        System.out.println("Member ID: " + memberId);
//
//    }
//}
//class Librarian extends Person{
//    String librarianId;
//    ArrayList<Book> books = new ArrayList<>();
//    public Librarian(String name, int age, String librarianId){
//        super(name, age);
//        this.librarianId = librarianId;
//    }
//    public void addBook(Book book){
//        books.add(book);
//    }
//    public void removeBook(Book book){
//        books.remove(book);
//    }
//    public void displayBooks(){
//        for (Book book: books) {
//            book.displayBookInfo();
//        }
//    }
//
//    @Override
//    public void displayInfo() {
//        super.displayInfo();
//        System.out.println("Librarian ID: " + librarianId);
//    }
//}
//class Book{
//    private String bookId;
//    private String title;
//    private String author;
//    private boolean isAvailable;
//    public Book(String bookId, String title, String author){
//        this.bookId = bookId;
//        this.title = title;
//        this.author = author;
//        this.isAvailable = true;
//    }
//    public void borrowBook(){
//        isAvailable = false;
//    }
//    public void returnBook(){
//        isAvailable = true;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void displayBookInfo(){
//        System.out.print("- " + title + "by " + author);
//        if (isAvailable){
//            System.out.println(" (Available)");
//        } else {
//            System.out.println("(Borrowed)");
//        }
//    }
//
//    public boolean isAvailable() {
//        return isAvailable;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public String getBookId() {
//        return bookId;
//    }
//    @Override
//    public String toString(){
//        return  title + " by " + author;
//    }
//}


//public class BalmuzdaqTask1 {
//    public static void main(String[] args) {
//        Member member = new Member("Saken", 19, "240");
//
//        Librarian librarian = new Librarian("Farida", 90, "900");
//
//        System.out.println("Adding Books");
//        Book book = new Book("123", "1984", "George Orwell");
//        Book book1 = new Book("234", "Abay zoly", "Mukhtar Auezov");
//        librarian.addBook(book);
//        librarian.addBook(book1);
//        System.out.println();
//        member.borrowBook(book1);
//        System.out.println("\nMember Info: ");
//        member.displayInfo();
//        member.displayBorrowedBooks();
//        System.out.println();
//
//        member.returnBook(book1);
//
//        System.out.println("\nBooks in Library: ");
//        librarian.displayBooks();
//
//    }
//}
//class Person{
//    private String name;
//    private int age;
//
//    public Person(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void displayInfo(){
//        System.out.println("Name: " + name +"\nAge: " + age);
//    }
//}
//class Member extends Person{
//    private String memberId;
//    ArrayList<Book> borrowedBooks = new ArrayList<>();
//    public Member(String name, int age, String memberId){
//        super(name, age);
//        this.memberId = memberId;
//    }
//    public void borrowBook(Book book){
//        if (book.isAvailable()){
//            System.out.println("Borrowing Books...");
//            borrowedBooks.add(book);
//            System.out.println(getName() + " borrowed " + book);
//        } else {
//            System.out.println("Book is not available!");
//        }
//    }
//    public void returnBook(Book book){
//        System.out.println("Returning books!");
//        borrowedBooks.remove(book);
//        System.out.println(getName() + " returned " + book);
//    }
//    public void displayBorrowedBooks(){
//        if (!borrowedBooks.isEmpty()){
//            for (Book book : borrowedBooks) {
//                System.out.println(book);
//            }
//        }
//    }
//
//    @Override
//    public void displayInfo() {
//        super.displayInfo();
//        System.out.println("Member ID: " + memberId);
//    }
//}
//class Librarian extends Person{
//    private String librarianId;
//    ArrayList<Book> books = new ArrayList<>();
//    public Librarian(String name, int age, String librarianId){
//        super(name, age);
//        this.librarianId = librarianId;
//    }
//    public void addBook(Book book){
//        books.add(book);
//        System.out.println("Book added: " + book.getTitle() + " by " + book.getAuthor());
//    }
//    public void removeBook(Book book){
//        books.remove(book);
//    }
//    public void displayBooks(){
//        if (!books.isEmpty()){
//            for (Book book : books) {
//                book.displayBookInfo();
//            }
//        }
//    }
//
//    @Override
//    public void displayInfo() {
//        super.displayInfo();
//        System.out.println("Librarian ID: " + librarianId);
//    }
//}
//class Book{
//    private String bookId;
//    private String title;
//    private String author;
//    boolean isAvailable;
//    public Book(String bookId, String title, String author){
//
//        this.bookId = bookId;
//        this.title = title;
//        this.author = author;
//        this.isAvailable = true;
//    }
//    public void borrowBook(){
//        isAvailable = false;
//    }
//    public void returnbook(){
//        isAvailable = true;
//    }
//    public boolean isAvailable(){
//        return isAvailable;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void displayBookInfo(){
//        System.out.print("- "+title+" by "+author);
//        if (isAvailable){
//            System.out.println(" (Available)");
//        }else {
//            System.out.println(" (Borrowed)");
//        }
//    }
//    @Override
//    public String toString(){
//        return title+" by "+author;
//    }
//}

/**/
//-----------------------------------------------------------------------------------------------------------------------------
//class Restaurant{
//    private String name;
//    private List<Table> tables;
//    private List<Booking> bookings;
//
//    public Restaurant(String name){
//        /*Конструкторы и методы*/
//        this.name = name;
//        this.tables = new ArrayList<>();
//        this.bookings = new ArrayList<>();
//    }
//    public void addTable(Table table){
//        /*Добавление столиков*/
//        tables.add(table);
//    }
//        public Booking makeBooking(Customer customer, String date, String time, int guests){
//        /* Создание бронирования */
//
//        for (Table table : tables) {
//            if (table.isAvailable() && table.getCapacity() >= guests) {
//                Booking booking = new Booking(customer, table, date, time);
//                bookings.add(booking);
//                return booking;
//            }
//        }
//        return null;
//
//    }
//    public void showBookings(){
//        /* Вывод списка бронирований*/
//        if (bookings.isEmpty()) {
//            System.out.println(" Нет активных бронирований. ");
//        } else {
//            for (Booking booking : bookings) {
//                System.out.println(booking);
//            }
//        }
//    }
//}
//class Customer{
//    private String name;
//    private String contactInfo;
//
//    public Customer(String name, String contactInfo){
//        /*Конструкторы и методы*/
//        this.name = name;
//        this.contactInfo = contactInfo;
//    }
//    public String getName() { return name; }
//    public String getContactInfo() { return contactInfo;  }
//}
//class Booking{
//    private Customer customer;
//    private Table table;
//    private String date;
//    private String time;
//
//    public Booking(Customer customer, Table table, String date, String time){
//        /*Конструкторы и методы*/
//        this.customer = customer;
//        this.table = table;
//        this.date = date;
//        this.time = time;
//        table.markAsBooked();
//    }
//    public void cancelBooking() {table.markAsAvailable();}
//
//    public String toString() {
//        return " Бронирования: " +customer.getName() + " на " + date + " в " + time + " (столик #" + table.getTableNumber() + ", вместимость:  " + table.getCapacity() + ")";
//    }
//}
//class Table{
//    private int tableNumber;
//    private int capacity;
//    private boolean isAvailable;
//
//    public Table(int tableNumber, int capacity){
//        /* Конструкторы и методы */
//
//        this.tableNumber = tableNumber;
//        this.capacity = capacity;
//        this.isAvailable = true;
//    }
//
//    public int getTableNumber() {return tableNumber;}
//    public int getCapacity() {return capacity;}
//
//    public boolean isAvailable(){return isAvailable;}
//    public void markAsBooked() {isAvailable = false;}
//    public void markAsAvailable() {isAvailable = true;}
//}
//
//
//// Main class
//public class BalmuzdaqTask1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        Restaurant restaurant = new Restaurant("Gourmet Place");
//        restaurant.addTable(new Table(1, 2));
//        restaurant.addTable(new Table(2, 4));
//        restaurant.addTable(new Table(3, 6));
//
//        System.out.println("Enter your name: ");
//        String name = scanner.nextLine();
//        System.out.println("Введите ваш контактный номер: ");
//        String contact = scanner.nextLine();
//        System.out.println("Введите время бронирования (HH:MM): ");
//        String time = scanner.nextLine();
//
//        Customer customer = new Customer(name, contact);
//        Booking booking = restaurant.makeBooking(customer, date, time, guests);
//    }
//}
//////----------------------------------------------------------------------------------------------------------------------------
//
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//
//// Класс Table (столик)
//////----------------------------------------------------------------------------------------------------------------------------
//class Table {
//    private int tableNumber;
//    private int capacity;
//    private boolean isAvailable;
//
//    public Table(int tableNumber, int capacity) {
//        this.tableNumber = tableNumber;
//        this.capacity = capacity;
//        this.isAvailable = true;
//    }
//
//    public int getTableNumber() {
//        return tableNumber;
//    }
//    public int getCapacity() {
//        return capacity;
//    }
//    public boolean isAvailable() {
//        return isAvailable;
//    }
//    public void markAsBooked() {
//        isAvailable = false;
//    }
//    public void markAsAvailable() {
//        isAvailable = true;
//    }
//}
//
//// Класс Customer (клиент)
//////----------------------------------------------------------------------------------------------------------------------------
//class Customer {
//    private String name;
//    private String contactInfo;
//
//    public Customer(String name, String contactInfo) {
//        this.name = name;
//        this.contactInfo = contactInfo;
//    }
//
//    public String getName() {
//        return name;
//    }
//    public String getContactInfo() {
//        return contactInfo;
//    }
//}
//
//// Класс Booking (бронирование)
//////----------------------------------------------------------------------------------------------------------------------------
//class Booking {
//    private Customer customer;
//    private Table table;
//    // private String date;
//    //private String time;
//
//    public Booking(Customer customer, Table table) {
//        this.customer = customer;
//        this.table = table;
//        //this.date = date;
//        //this.time = time;
//        table.markAsBooked(); // Помечаем стол как занятый
//    }
//
//    public void cancelBooking() {
//        table.markAsAvailable();
//    }
//
//    @Override
//    public String toString() {
//        return "Бронирование: " + customer.getName()  +
//                " (столик #" + table.getTableNumber() + ", вместимость: " + table.getCapacity() + ")";
//    }
//}
//
//// Класс Restaurant (ресторан)
//////----------------------------------------------------------------------------------------------------------------------------
//class Restaurant {
//    private String name;
//    private List<Table> tables;
//    private List<Booking> bookings;
//
//    public Restaurant(String name) {
//        this.name = name;
//        this.tables = new ArrayList<>();
//        this.bookings = new ArrayList<>();
//    }
//
//    public void addTable(Table table) {
//        tables.add(table);
//    }
//    public void showBooking(){
//        System.out.println("Доступные столики перед бронированием:");
//        for (Table table : tables) {
//            System.out.println("Стол #" + table.getTableNumber() +
//                    " (вместимость: " + table.getCapacity() +
//                    ", доступен: " + table.isAvailable() + ")");
//        }
//    }
//
//public Booking makeBooking(Customer customer, int guests) {
//
//    for (Table table : tables) {
//        if (table.isAvailable() && table.getCapacity() >= guests) {
//            Booking booking = new Booking(customer, table);
//            bookings.add(booking);
//            return booking;
//        }
//    }
//    return null; // Если нет доступных столов
//}
//
//    public void showBookings() {
//        if (bookings.isEmpty()) {
//            System.out.println("Нет активных бронирований.");
//        } else {
//            for (Booking booking : bookings) {
//                System.out.println(booking);
//            }
//        }
//    }
//}
//
//
//
//// Классы Table, Customer, Booking, Restaurant остаются без изменений (как в исходном коде)
//
//public class BalmuzdaqTask1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        Restaurant restaurant = new Restaurant("Gourmet Place");
//        restaurant.addTable(new Table(1, 2));
//        restaurant.addTable(new Table(2, 4));
//        restaurant.addTable(new Table(3, 6));
//
//        boolean running = true;
//
//        System.out.println("Welcome \n\n");
//        restaurant.showBooking();
//
//        while (running) {
//            System.out.println("\n--- Меню ---");
//            System.out.println("1. Забронировать столик");
//            System.out.println("2. Показать все бронирования");
//            System.out.println("3. Выйти");
//            System.out.print("Выберите опцию: ");
//
//            int choice;
//            try {
//                choice = Integer.parseInt(scanner.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("Ошибка: введите число от 1 до 3.");
//                continue;
//            }
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Введите ваше имя: ");
//                    String name = scanner.nextLine();
//
//                    System.out.print("Введите ваш контактный номер: ");
//                    String contact = scanner.nextLine();
//
//                    int guests = 0;
//                    while (guests <= 0) {
//                        System.out.print("Сколько человек в вашей группе? ");
//                        try {
//                            guests = Integer.parseInt(scanner.nextLine());
//                            if (guests <= 0) {
//                                System.out.println("Число гостей должно быть больше 0.");
//                            }
//                        } catch (NumberFormatException e) {
//                            System.out.println("Ошибка: введите целое число.");
//                        }
//                    }
//
////                    System.out.print("Введите дату бронирования (YYYY-MM-DD): ");
////                    String date = scanner.nextLine();
//
////                    System.out.print("Введите время бронирования (HH:MM): ");
////                    String time = scanner.nextLine();
//
//                    Customer customer = new Customer(name, contact);
//                    Booking booking = restaurant.makeBooking(customer, guests);
//
//                    if (booking != null) {
//                        System.out.println("Бронирование успешно!");
//                    } else {
//                        System.out.println("Извините, нет подходящих столиков.");
//                    }
//                    break;
//
//                case 2:
//                    restaurant.showBookings();
//                    break;
//
//                case 3:
//                    running = false;
//                    System.out.println("До свидания!");
//                    break;
//
//                default:
//                    System.out.println("Неверная опция. Попробуйте снова.");
//            }
//        }
//        scanner.close();
//    }
//}


// Assignment 2
//import java.util.ArrayList;
//
//public class BalmuzdaqTask1 {
//    public static void main(String[] args) {
//        System.out.println("Creating students and instructors...");
//        Person person = new Person();
//
//    }
//}
//class Person{
//    private String name;
//    private int age;
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//
//    public void displayInfo(){
//        System.out.println("Name: "+name + "\nAge: " + age);
//    }
//}
//class Student extends Person{
//    private String studentId;
//    ArrayList<Course> enrolledCourses = new ArrayList<>();
//    public void enrollInCourse(Course course){
//        enrolledCourses.add(course);
//    }
//
//    public void displayEnrolledCourses(){
//        for (Course course : enrolledCourses) {
//            System.out.println("Student enrolled: "+course);
//        }
//    }
//
//    @Override
//    public void displayInfo() {
//        super.displayInfo();
//    }
//}
//class Instructor extends Person{
//    private String instructorId;
//    ArrayList<Course> assignedCourses = new ArrayList<>();
//
//    public void assignCourse(Course course){
//        assignedCourses.add(course);
//    }
//    public void displayAssignedCourses(){
//        for (Course course : assignedCourses) {
//            System.out.println("Instructor assigned to: "+course);
//        }
//    }
//
//    @Override
//    public void displayInfo() {
//        super.displayInfo();
//    }
//}
//class Course extends Instructor{
//    String courseId;
//    String courseName;
//    Instructor instructor = new Instructor();
//    public void assignInstructor(Instructor instructor){
//
//    }
//    public void displayCourseInfo(){
//
//    }
//}




// Assignment 2
//import java.util.ArrayList;
//
//public class BalmuzdaqTask1 {
//    public static void main(String[] args) {
//        System.out.println("Creating students and instructors...");
//
//        Person person = new Person("Saken", 12);
//        person.displayInfo();
//
//        Student s1 = new Student("Alice", 20, "S101");
//        s1.displayInfo();
//        s1.displayEnrolledCourses(); // Сообщение, если нет курсов
//
//        Instructor instructor = new Instructor("Dr. Smith", 45, "I001");
//        Course cs101 = new Course("CS101", "Introduction to Programming");
//        cs101.assignInstructor(instructor);
//
//        s1.enrollInCourse(cs101);
//        s1.displayEnrolledCourses();
//
//        instructor.assignCourse(cs101);
//        instructor.displayAssignedCourses();
//    }
//}
//
//class Person {
//    private String name;
//    private int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public void displayInfo() {
//        System.out.println("Name: " + name + "\nAge: " + age);
//    }
//}
//
//class Student extends Person {
//    private String studentId;
//    private ArrayList<Course> enrolledCourses;
//
//    public Student(String name, int age, String studentId) {
//        super(name, age);
//        this.studentId = studentId;
//        this.enrolledCourses = new ArrayList<>();
//    }
//
//    public void enrollInCourse(Course course) {
//        enrolledCourses.add(course);
//        System.out.println("Student enrolled: " + course.getCourseInfo());
//    }
//
//    public void displayEnrolledCourses() {
//        if (enrolledCourses.isEmpty()) {
//            System.out.println("No enrolled courses.");
//        } else {
//            System.out.println("Enrolled Courses:");
//            for (Course course : enrolledCourses) {
//                System.out.println(course.getCourseInfo());
//            }
//        }
//    }
//}
//
//class Instructor extends Person {
//    private String instructorId;
//    private ArrayList<Course> assignedCourses;
//
//    public Instructor(String name, int age, String instructorId) {
//        super(name, age);
//        this.instructorId = instructorId;
//        this.assignedCourses = new ArrayList<>();
//    }
//
//    public void assignCourse(Course course) {
//        assignedCourses.add(course);
//        System.out.println("Instructor assigned: " + course.getCourseInfo());
//    }
//
//    public void displayAssignedCourses() {
//        if (assignedCourses.isEmpty()) {
//            System.out.println("No assigned courses.");
//        } else {
//            System.out.println("Assigned Courses:");
//            for (Course course : assignedCourses) {
//                System.out.println(course.getCourseInfo());
//            }
//        }
//    }
//}
//
//class Course {
//    private String courseId;
//    private String courseName;
//    private Instructor instructor;
//
//    public Course(String courseId, String courseName) {
//        this.courseId = courseId;
//        this.courseName = courseName;
//        this.instructor = null;
//    }
//
//    public void assignInstructor(Instructor instructor) {
//        this.instructor = instructor;
//    }
//
//    public String getCourseInfo() {
//        return courseId + " - " + courseName;
//    }
//}

class Flight{
    private String flightId;
    private String departue;
    private String arrival;
    private String date;
    private double price;

    public Flight(String flightId, String departue, String arrival, String date, double price) {
        this.flightId = flightId;
        this.departue = departue;
        this.arrival = arrival;
        this.date = date;
        this.price = price;
    }

    public String getFlightId() {
        return flightId;
    }

    public double getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDepartue() {
        return departue;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId='" + flightId + '\'' +
                ", departue='" + departue + '\'' +
                ", arrival='" + arrival + '\'' +
                ", date='" + date + '\'' +
                ", price=" + price +
                '}';
    }
}
class FlightDatabase{
    private List<Flight> flights = new ArrayList<>();

    public FlightDatabase() {
        flights.add(new Flight("F001", "NYC", "LAX", "2025-05-10", 300.0));
        flights.add(new Flight("F002", "NYC", "MIA", "2025-05-11", 200.0));
        flights.add(new Flight("F003", "LAX", "SFO", "2025-05-12", 150.0));
    }
    public List<Flight> searchFlights(String departure, String arrival, String date) {
        List<Flight> result = new ArrayList<>();
        for (Flight f : flights) {
            if (f.getDepartue().equalsIgnoreCase(departure) && f.getDepartue().equalsIgnoreCase(departure) && f.getDate().equalsIgnoreCase(date)){
                result.add(f);
            }
        }
        return result;
    }
}
class Cart {
    private List<Flight> flightsInCart = new ArrayList<>();

    public void addFlight(Flight flight){
        flightsInCart.add(flight);
        System.out.println("Fligth added to cart: " + flight.getFlightId());
    }
    public void emptyCart(){
        flightsInCart.clear();
        System.out.println("Cart emptied.");
    }

    public List<Flight> getFlightsInCart() {
        return flightsInCart;
    }
}
class BookingWebsite {
    private FlightDatabase flightDb;
    private Cart cart;

    public BookingWebsite() {
        this.flightDb = new FlightDatabase();
        this.cart = new Cart();
    }

    public List<Flight> searchDatabase(String departure, String arrival, String date) {
        List<Flight> foundFlights = flightDb.searchFlights(departure, arrival, date);
        if (foundFlights.isEmpty()) {
            System.out.println("No flights flights found for " + departure + " - > " + arrival + " on " + date);
        } else {
            System.out.println("Available flights: ");
            for (Flight f : foundFlights) {
                System.out.println(" - " + f);
            }
        }
        return foundFlights;
    }

    public void chooseFlight(Flight chosen) {
        cart.addFlight(chosen);
        System.out.println("Chosen flight: " + chosen.getFlightId());
    }

    public void checkout() {
        System.out.println("Yield personal information... (Pretend user entered name/passport)");

        System.out.println("Purchase confirmed!");

        displayPurchasedTicketInfo();

        cart.emptyCart();
    }

    private void displayPurchasedTicketInfo() {
        for (Flight f : cart.getFlightsInCart()) {
            System.out.println("Purchased ticket for flight: " + f.getFlightId());
        }
        System.out.println("Display purchased ticket info to user...");
    }
}

public class BalmuzdaqTask1 {
    public static void main(String[] args) {
        BookingWebsite bookingSite = new BookingWebsite();

        List<Flight> found = bookingSite.searchDatabase("NYC", "LAX", "2025-05-10");

        if (!found.isEmpty()){
            Flight chosen = found.get(0);
            bookingSite.chooseFlight(chosen);
        }
        bookingSite.checkout();
    }
}