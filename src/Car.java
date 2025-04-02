// Coupling and Cohesion right thing
//interface Engine{
//    void start();
//}
//interface Dongelek{
//    void dongeley();
//}
//abstract class Door{
//    public void doorOpen(){
//        System.out.println("Door opened");
//    }
//}
//class Move implements Engine, Dongelek{
//
//    @Override
//    public void start() {
//        System.out.println("Mashina otaldy");
//    }
//
//    @Override
//    public void dongeley () {
//        System.out.println("Dongelek dongeledi!");
//    }
//}
//
//public class Car {
//    public static void main(String[] args) {
//        Move move = new Move();
//        move.dongeley();
//        move.start();
//    }
//}



// Coupling and Cohesion wrong
//class Engine{
//    void engine(){
//        System.out.println("Otaldy");
//    }
//
//}
//class CarsThings extends Engine{
//    void dongeley(){
//        System.out.println("Dongelek dongeledi");
//    }
//
//}
//public class Car extends CarsThings {
//    public static void main(String[] args) {
//        CarsThings car = new CarsThings();
//        car.engine();
//        car.dongeley();
//    }
//}
//abstract class LibraryItem{
//    private String title;
//    private String author;
//    private int id;
//
//    public LibraryItem(String title, String author, int id) {
//        this.title = title;
//        this.author = author;
//        this.id = id;
//    }
//    public void displayInfo(){
//        System.out.println("Info: ");
//        System.out.println(title +", "+ author+", " + id);
//    }
//    public abstract void checkoutItem();
//}
//class Book1 extends LibraryItem implements Borrowable{
//    public Book1(String title, String author, int id) {
//        super(title, author, id);
//    }
//
//    @Override
//    public void borrow() {
//        System.out.println("borrow");
//    }
//
//    @Override
//    public void checkoutItem() {
//        System.out.println("check");
//    }
//}
//interface Borrowable{
//    void borrow();
//    public static void cndo(){
//        System.out.println("ncido");
//    }
//}
//class Journal extends LibraryItem implements Borrowable{
//    public Journal(String title, String author, int id) {
//        super(title, author, id);
//    }
//
//    @Override
//    public void checkoutItem() {
//        System.out.println("cnio");
//    }
//
//    @Override
//    public void borrow() {
//        System.out.println("nvjre");
//    }
//
//
//}
//class User{
//    private String name;
//
//}