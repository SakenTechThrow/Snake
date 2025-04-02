////import java.util.Scanner;
////
////public class Main {
////    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Enter the number of Students: ");
////        int num = scanner.nextInt();
////        scanner.nextLine();
////        StudentManager s1 = new StudentManager(num);
////
////        for (int i = 1; i <= num; i++) {
////            System.out.print("Enter the name for student "+(i)+": ");
////            String name = scanner.nextLine();
////
////            System.out.print("Enter the grade for student " + (i)+": ");
////            int grade = scanner.nextInt();
////            scanner.nextLine();
////            s1.addStudent(name, grade);
////        }
////        s1.displayStudents();
////        System.out.println("Average Grade: " + s1.calculateAverage());
////        s1.findHighestLowest();
////    }
////}
////class Student{
////    private String name;
////    private int grade;
////    public Student(String name, int grade) {
////        this.name = name;
////        this.grade = grade;
////    }
////
////    public String getName() {
////        return name;
////    }
////
////    public int getGrade() {
////        return grade;
////    }
////
////    public void display(){
////        System.out.println(name + " : " + grade);
////    }
////}
////class StudentManager{
////    Student[] students;
////    int count;
////
////    public StudentManager(int size) {
////        students = new Student[size];
////    }
////    public void addStudent(String name, int grade){
////        students[count] = new Student(name, grade);
////        count++;
////    }
////    public void displayStudents(){
////        System.out.println("--- Student List ---");
////        for (Student s : students) {
////            s.display();
////        }
////    }
////    public double calculateAverage(){
////        int sum = 0;
////        for (Student s : students) {
////            sum += s.getGrade();
////        }
////        return (double) sum/count;
////    }
////    public void findHighestLowest(){
////        int max = Integer.MIN_VALUE;
////        String s1 = "";
////        int min = Integer.MAX_VALUE;
////        String s2 = "";
////        for (Student s : students) {
////            if (s.getGrade() > max){
////                max = s.getGrade();
////                s1 = s.getName();
////            } if (s.getGrade() < min){
////                min = s.getGrade();
////                s2 = s.getName();
////            }
////        }
////        System.out.println("Highest grade: " + s1 + " - " + max);
////        System.out.println("Lowest grade: " + s2 + " - " + min);
////    }
////}
////
////class Person{
////    private String name;
////    private int age;
////
////    public Person(String name, int age) {
////        this.name = name;
////        this.age = age;
////    }
////
////    public String getName() {
////        return name;
////    }
////
////    public int getAge() {
////        return age;
////    }
////
////    public void displayInfo(){
////        System.out.println("Name: "+name);
////        System.out.println("Age: " + age);
////    }
////}
////class Student extends Person{
////    String studentId;
////
////    public Student(String name, int age, String studentId) {
////        super(name, age);
////        this.studentId = studentId;
////    }
////
////    ArrayList<Course> enrolledCourses = new ArrayList<>();
////    public void enrollInCourse(Course course){
////        System.out.println("Student enrolled: " + getName() + " in " + course.getCourseId());
////        enrolledCourses.add(course);
////    }
////    public void displayEnrolledCourses(){
////        System.out.print("Enrolled Courses: ");
////        for (Course c: enrolledCourses) {
////            System.out.println(c);
////        }
////    }
////
////    @Override
////    public void displayInfo() {
////        System.out.println("\nStudent Info: ");
////        super.displayInfo();
////        System.out.println("Student ID: " + studentId);
////    }
////}
////class Instructor extends Person{
////    String instructorId;
////
////    public Instructor(String name, int age, String instructorId) {
////        super(name, age);
////        this.instructorId = instructorId;
////    }
////    ArrayList<Course> assignedCourses = new ArrayList<>();
////    public void assignCourse(Course course){
////        assignedCourses.add(course);
////    }
////    public void displayAssignedCourses(){
////        System.out.print("\nAssigned Courses: ");
////        for (Course c : assignedCourses) {
////            System.out.println(c);
////        }
////    }
////
////    @Override
////    public void displayInfo() {
////        System.out.println("\nInstructor Info: ");
////        super.displayInfo();
////        System.out.print("Instructor ID: " + instructorId);
////    }
////}
////class Course{
////    String courseId;
////    String courseName;
////    Instructor instructor;
////    public Course(String courseId, String courseName) {
////        this.courseId = courseId;
////        this.courseName = courseName;
////    }
////
////    public String getCourseId() {
////        return courseId;
////    }
////
////    public Instructor getInstructor() {
////        return instructor;
////    }
////
////    public String getCourseName() {
////        return courseName;
////    }
////
////    public void assignInstructor(Instructor instructor){
////        this.instructor = instructor;
////        instructor.assignCourse(this);
////    }
////    public void displayCourseInfo(){
////        System.out.println("Course Info:");
////        System.out.println("Course ID: " + courseId);
////        System.out.println("Course Name: " + courseName);
////    }
////
////    @Override
////    public String toString() {
////        return courseId +" - "+ courseName;
////    }
////}
////public class Main {
////    public static void main(String[] args) {
////        System.out.println("Creating students and instructors...");
////        Student s1 = new Student("Saken", 19, "240103044");
////        Student s2 = new Student("Damir", 19, "123123123");
////
////        Instructor instructor = new Instructor("Aiya", 20, "321321321");
////
////        Course course = new Course("CSS108", "Islam and its Foundations");
////
////        s1.enrollInCourse(course);
////        s2.enrollInCourse(course);
////
////        instructor.assignCourse(course);
////
////        s1.displayInfo();
////        s1.displayEnrolledCourses();
////
////        instructor.displayInfo();
////        instructor.displayAssignedCourses();
////    }
////}
////abstract class Vehicle{
////    private String brand;
////    private int year;
////
////    public Vehicle(String brand, int year) {
////        this.brand = brand;
////        this.year = year;
////    }
////    public void dislayInfo(){
////        System.out.println("Info");
////    }
////    abstract void move();
////}
////class Car1 extends Vehicle{
////
////    public Car1(String brand, int year) {
////        super(brand, year);
////    }
////    @Override
////    void move() {
////
////    }
////}
////interface Drivable{
////    void drive();
////}
////interface Flyable{
////    void fly();
////}
////class Airplane extends Vehicle implements Flyable{
////    public Airplane(String brand, int year) {
////        super(brand, year);
////    }
////
////    @Override
////    void move() {
////        System.out.println("moving");
////    }
////
////    @Override
////    public void fly() {
////        System.out.println("fly");
////    }
////}
////class FlyingCar extends Vehicle implements Drivable, Flyable{
////    public FlyingCar(String brand, int year) {
////        super(brand, year);
////    }
////    @Override
////    void move() {
////        System.out.println("Moving");
////    }
////
////    @Override
////    public void fly() {
////        System.out.println("flying");
////    }
////
////    @Override
////    public void drive() {
////        System.out.println("driving");
////    }
////}
//
//import java.util.ArrayList;
//
//// Класс Product: представляет товар в магазине.
////class Product {
////    private String productId;
////    private String name;
////    private double price;
////    private int stock;
////
////    // Конструктор для инициализации товара.
////    public Product(String productId, String name, double price, int stock) {
////        this.productId = productId;
////        this.name = name;
////        this.price = price;
////        this.stock = stock;
////    }
////
////    // Вывод информации о товаре.
////    public void displayProductInfo() {
////        System.out.println("Product Info: " + name + ", Price: $" + price + ", Stock: " + stock);
////    }
////
////    // Проверка наличия нужного количества товара.
////    public boolean isAvailable(int quantity) {
////        return stock >= quantity;
////    }
////
////    // Уменьшение количества товара после покупки.
////    public void reduceStock(int quantity) {
////        if (isAvailable(quantity)) {
////            stock -= quantity;
////        } else {
////            System.out.println("Not enough stock for " + name);
////        }
////    }
////
////    // Увеличение количества товара (например, при отмене заказа).
////    public void increaseStock(int quantity) {
////        stock += quantity;
////    }
////
////    // Геттер для цены
////    public double getPrice() {
////        return price;
////    }
////
////    // Геттер для имени
////    public String getName() {
////        return name;
////    }
////}
////
////// Класс User: базовый класс для пользователей системы.
////class User {
////    private String userId;
////    private String name;
////
////    public User(String userId, String name) {
////        this.userId = userId;
////        this.name = name;
////    }
////
////    // Вывод информации о пользователе.
////    public void displayInfo() {
////        System.out.println("User Info: " + userId + " - " + name);
////    }
////}
////
////// Класс Customer: наследует User и добавляет возможность оформлять заказы.
////class Customer extends User {
////    ShoppingCart cart;
////
////    public Customer(String userId, String name) {
////        super(userId, name);
////        // Инициализируем пустую корзину для покупок.
////        this.cart = new ShoppingCart();
////    }
////
////    // Метод для просмотра содержимого корзины.
////    public void viewCart() {
////        cart.displayCartItems();
////    }
////
////    // Метод для оформления заказа.
////    public void placeOrder() {
////        if (cart.isEmpty()) {
////            System.out.println("Корзина пуста. Заказ не может быть оформлен.");
////            return;
////        }
////
////        // Проверяем наличие товара для каждого элемента корзины.
////        for (int i = 0; i < cart.itemCount; i++) {
////            Product product = cart.cartProducts[i];
////            int quantity = cart.cartQuantities[i];
////            if (!product.isAvailable(quantity)) {
////                System.out.println("Недостаточно товара: " + product.getName());
////                return; // Прерываем оформление, если хоть один товар недоступен.
////            }
////        }
////
////        // Если все товары доступны, уменьшаем запас на складе.
////        for (int i = 0; i < cart.itemCount; i++) {
////            Product product = cart.cartProducts[i];
////            int quantity = cart.cartQuantities[i];
////            product.reduceStock(quantity);
////        }
////
////        double total = cart.calculateTotal();
////        System.out.println("Заказ успешно оформлен. Общая сумма: $" + total);
////        cart.clearCart();
////    }
////
////    @Override
////    public void displayInfo() {
////        System.out.println("Customer Info: ");
////        super.displayInfo();
////    }
////}
////
////// Класс ShoppingCart: корзина покупок с фиксированным размером (например, до 10 товаров).
////class ShoppingCart {
////    // Массивы для хранения товаров и их количеств.
////    Product[] cartProducts;
////    int[] cartQuantities;
////    int itemCount; // Количество добавленных элементов.
////
////    // Конструктор: инициализируем массивы.
////    public ShoppingCart() {
////        cartProducts = new Product[10];
////        cartQuantities = new int[10];
////        itemCount = 0;
////    }
////
////    // Добавление товара в корзину, если он доступен.
////    public void addToCart(Product product, int quantity) {
////        if (product.isAvailable(quantity)) {
////            // Если товар уже есть в корзине, увеличиваем количество.
////            for (int i = 0; i < itemCount; i++) {
////                if (cartProducts[i].equals(product)) {
////                    cartQuantities[i] += quantity;
////                    System.out.println("Добавлено ещё " + quantity + " шт. товара " + product.getName() + " в корзину.");
////                    return;
////                }
////            }
////            // Если товара ещё нет, добавляем в новую ячейку.
////            if (itemCount < cartProducts.length) {
////                cartProducts[itemCount] = product;
////                cartQuantities[itemCount] = quantity;
////                itemCount++;
////                System.out.println("Товар " + product.getName() + " добавлен в корзину. Количество: " + quantity);
////            } else {
////                System.out.println("Корзина заполнена.");
////            }
////        } else {
////            System.out.println("Недостаточно товара " + product.getName() + " для добавления в корзину.");
////        }
////    }
////
////    // Удаление товара из корзины.
////    public void removeFromCart(Product product) {
////        for (int i = 0; i < itemCount; i++) {
////            if (cartProducts[i].equals(product)) {
////                // Сдвигаем оставшиеся элементы.
////                for (int j = i; j < itemCount - 1; j++) {
////                    cartProducts[j] = cartProducts[j + 1];
////                    cartQuantities[j] = cartQuantities[j + 1];
////                }
////                itemCount--;
////                System.out.println("Товар " + product.getName() + " удален из корзины.");
////                return;
////            }
////        }
////        System.out.println("Товар " + product.getName() + " не найден в корзине.");
////    }
////
////    // Вычисление общей стоимости товаров в корзине.
////    public double calculateTotal() {
////        double total = 0;
////        for (int i = 0; i < itemCount; i++) {
////            total += cartProducts[i].getPrice() * cartQuantities[i];
////        }
////        return total;
////    }
////
////    // Вывод содержимого корзины.
////    public void displayCartItems() {
////        if (isEmpty()) {
////            System.out.println("Корзина пуста.");
////            return;
////        }
////        System.out.println("Содержимое корзины:");
////        for (int i = 0; i < itemCount; i++) {
////            System.out.print((i + 1) + ". ");
////            cartProducts[i].displayProductInfo();
////            System.out.println("Количество: " + cartQuantities[i]);
////        }
////    }
////
////    // Проверка, пуста ли корзина.
////    public boolean isEmpty() {
////        return itemCount == 0;
////    }
////
////    // Очистка корзины после оформления заказа.
////    public void clearCart() {
////        itemCount = 0;
////        System.out.println("Корзина очищена.");
////    }
////}
////
////// Класс Main для тестирования работы системы.
////public class Main {
////    public static void main(String[] args) {
////        // Создаем несколько товаров.
////        Product product1 = new Product("P001", "Laptop", 1500.0, 5);
////        Product product2 = new Product("P002", "Smartphone", 800.0, 10);
////        Product product3 = new Product("P003", "Headphones", 150.0, 20);
////
////        // Выводим информацию о товарах.
////        product1.displayProductInfo();
////        product2.displayProductInfo();
////        product3.displayProductInfo();
////
////        // Создаем покупателя.
////        Customer customer = new Customer("U001", "Alice");
////        customer.displayInfo();
////
////        // Добавляем товары в корзину.
////        customer.cart.addToCart(product1, 1);
////        customer.cart.addToCart(product2, 2);
////        customer.cart.addToCart(product3, 3);
////
////        // Просмотр корзины.
////        customer.viewCart();
////
////        // Удаление товара из корзины (пример удаления Headphones).
////        customer.cart.removeFromCart(product3);
////
////        // Просмотр корзины после удаления.
////        customer.viewCart();
////
////        // Оформление заказа.
////        customer.placeOrder();
////
////        // Попробуем оформить заказ с пустой корзиной.
////        customer.placeOrder();
////
////        // Выводим обновленные данные о товарах после оформления заказа.
////        product1.displayProductInfo();
////        product2.displayProductInfo();
////        product3.displayProductInfo();
////    }
////}
//class Person{
//    private String name;
//    private int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//    public void displayInfo(){
//        System.out.println("Name: " + name + ", Age: " + age);
//    }
//}
//class Member extends Person{
//    private String memberId;
//    ArrayList<Book> borrowedBooks = new ArrayList<>();
//    public Member(String name, int age, String memberId) {
//        super(name, age);
//        this.memberId = memberId;
//    }
//
//    public void borrowBook(Book book){
//        borrowedBooks.add(book);
//    }
//    public void returnBook(Book book){
//        borrowedBooks.remove(book);
//    }
//    public void displayBorrowedBooks(){
//        System.out.println("Borrowed books: ");
//        for (Book b : borrowedBooks) {
//            System.out.println("- "+b.toString());
//        }
//    }
//
//    @Override
//    public void displayInfo() {
//        System.out.println("Memner Info: ");
//        super.displayInfo();
//        System.out.println("Member ID: " + memberId);
//    }
//
//    public String getMemberId() {
//        return memberId;
//    }
//}
//class Librarian extends Person{
//    private String librarianId;
//    ArrayList<Book> books;
//    public Librarian(String name, int age, String librarianId) {
//        super(name, age);
//        this.librarianId = librarianId;
//        this.books = new ArrayList<>();
//    }
//
//    public void addBook(Book book){
//        books.add(book);
//        System.out.println("Book added: " + book.getTitle() + " by " + book.getAuthor());
//    }
//    public void removeBook(Book book){
//        books.remove(book);
//        System.out.println("Book removed: " + book.getTitle());
//    }
//    public void displayBooks(){
//        for (Book b : books) {
//            System.out.println("- "+b.toString());
//        }
//    }
//
//    @Override
//    public void displayInfo() {
//        System.out.println("Librarians INFO: ");
//        super.displayInfo();
//        System.out.println("Librarian ID: " + librarianId);
//    }
//}
//class Book{
//    private String bookId;
//    private String title;
//    private String author;
//    private boolean isAvailable;
//
//    public Book(String bookId, String title, String author) {
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
//    public void displayInfo(){
//        System.out.println("Books Info: ");
//        System.out.println("Book ID: " + bookId + ", Title: " + title + ", Author: " + author +
//                " (" + (isAvailable ? "Available" : "Borrowed") + ")");
//    }
//
//    @Override
//    public String toString() {
//        return title + " by " + author + " (" + (isAvailable ? "Available" : "Borrowed") + ")";
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public boolean isAvailable() {
//        return isAvailable;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Book book1 = new Book("B001", "1984", "George Orwell");
//        Book book2 = new Book("B002", "The Great Gatsby", "F. Scott Fitzgerald");
//
//        Librarian librarian = new Librarian("Anna", 35, "L100");
//        System.out.println("Adding books to library...");
//        librarian.addBook(book1);
//        librarian.addBook(book2);
//
//        Member member = new Member("John", 25, "M101");
//        System.out.println("Borrowing books...");
//        member.borrowBook(book1);
//        System.out.println();
//
//        // Вывод информации о члене библиотеки.
//        System.out.println("Member Info:");
//        member.displayInfo();
//
//        System.out.println();
//
//        // Читатель возвращает книгу.
//        System.out.println("Returning books...");
//        member.returnBook(book1);
//
//        System.out.println();
//
//        // Вывод книг в библиотеке после возврата.
//        System.out.println("Books in Library:");
//        librarian.displayBooks();
//    }
//}
public class Main {
    public static void main(String[] args) {
        int num = 90;
        System.out.println(num);
    }
}