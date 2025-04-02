import java.util.ArrayList;
import java.util.List;

class WeatherData{
    float temperature;
    float humidity;
    float pressure;
    List<WeatherObserver> observers = new ArrayList<>();
    public void registerObserver(WeatherObserver observer){
        observers.add(observer);
    }
    public void removeObserver(WeatherObserver observer){
        observers.remove(observer);
    }
    public void notifyObservers(){
        for (WeatherObserver observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
interface WeatherObserver{
    void update(float temperature, float humidity, float pressure);
}
class CurrentConditionDisplay implements WeatherObserver{
    float temperature;
    float humidity;
    float pressure;
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        System.out.println("Temperature: " + temperature);
        System.out.println("humidity: " + humidity);
        System.out.println("pressure: " + pressure);
    }
}
class StaticsDisplay implements WeatherObserver{
    List<Float> temperatureReadings = new ArrayList<>();
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Temperature: " + temperature);
        System.out.println("humidity: " + humidity);
        System.out.println("pressure: " + pressure);
    }
}
class ForecastDisplay implements WeatherObserver{
    float previousPressure = 1013;
    String forecast;
    @Override
    public void update(float temperature, float humidity, float pressure) {
        if (pressure > previousPressure){
            forecast = "Improving weather on the way";
        } else if (pressure == previousPressure) {
            forecast = "More of the same";
        } else{
            forecast = "Watch out for cooler, rainy weather.";
        }
        previousPressure = pressure;
        System.out.println("Forecast: " + forecast);
    }
}
class Client{
    List<WeatherData> weatherData = new ArrayList<>();

    public void register(){
        weatherData.add()
    }
}
public class Qaz {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
    }
}

































//import java.util.ArrayList;
//import java.util.List;
//
//// Pattern Observer
//interface Observer{
//    void update(String news);
//}
//interface Subject{
//    void addObserver(Observer o);
//    void removeObserver(Observer o);
//    void notifyObserver(String news);
//}
//class NewsAgency implements Subject{
//    private List<Observer> observers = new ArrayList<>();
//    @Override
//    public void addObserver(Observer o) {
//        observers.add(o);
//    }
//    @Override
//    public void removeObserver(Observer o) {
//        observers.remove(o);
//    }
//    @Override
//    public void notifyObserver(String news) {
//        for (Observer o : observers) {
//            o.update(news);
//        }
//    }
//    public void publishNews(String news){
//        System.out.println("News: " + news);
//        notifyObserver(news);
//    }
//}
//class Subscriber implements Observer{
//    private String name;
//    public Subscriber(String name) {
//        this.name = name;
//    }
//    @Override
//    public void update(String news) {
//        System.out.println(name + " get the news: " + news);
//    }
//}
//public class Qaz {
//    public static void main(String[] args) {
//        NewsAgency agency = new NewsAgency();
//
//        Observer observer1 = new Subscriber("Saken");
//        Observer observer2 = new Subscriber("Ali");
//        Observer observer3 = new Subscriber("Aruzhan");
//
//        agency.addObserver(observer1);
//        agency.addObserver(observer2);
//        agency.addObserver(observer3);
//
//        agency.publishNews("Java 22 !");
//        agency.publishNews("Weather is good");
//    }
//}
//


















































// Pattern Chain Of Responsibility
//class Request{
//    String message;
//    int level;
//
//    public Request(String message, int level) {
//        this.message = message;
//        this.level = level;
//    }
//}
//abstract class Handler{
//    protected Handler next;
//
//    public void setNext(Handler next){
//        this.next = next;
//    }
//    public void handle(Request request){
//        if (canHandle(request)){
//            process(request);
//        } else if (next != null) {
//            next.handle(request);
//        } else {
//            System.out.println("No one could solve problem " + request.message);
//        }
//    }
//    protected abstract boolean canHandle(Request request);
//    protected abstract void process(Request request);
//}
//class Secretary extends Handler{
//
//    @Override
//    protected boolean canHandle(Request request) {
//        return request.level == 1;
//    }
//
//    @Override
//    protected void process(Request request) {
//        System.out.println("Secretary solved request " + request.message);
//    }
//}
//class Manager extends Handler{
//
//    @Override
//    protected boolean canHandle(Request request) {
//        return request.level == 2;
//    }
//
//    @Override
//    protected void process(Request request) {
//        System.out.println("Manager solved request " + request.message);
//    }
//}
//class Director extends Handler{
//
//    @Override
//    protected boolean canHandle(Request request) {
//        return request.level == 3;
//    }
//
//    @Override
//    protected void process(Request request) {
//        System.out.println("Director solve request " + request.message);
//    }
//}
//public class Qaz {
//    public static void main(String[] args) {
//        Handler secretary = new Secretary();
//        Handler manager = new Manager();
//        Handler director = new Director();
//
//        secretary.setNext(manager);
//        manager.setNext(director);
//
//        Request r1 = new Request("Где расписание?", 1);
//        Request r2 = new Request("Почему премия не пришла?", 2);
//        Request r3 = new Request("Сменить стратегию компании!", 3);
//        Request r4 = new Request("Я хочу в отпуск на 3 месяца!", 4);
//
//        secretary.handle(r1);
//        secretary.handle(r2);
//        secretary.handle(r3);
//        secretary.handle(r4);
//    }
//}
// Another type:
//interface Handler{
//    void setNext(Handler next);
//    void handle(Request request);
//}
//class Request{
//    String message;
//    int level;
//
//    public Request(String message, int level) {
//        this.message = message;
//        this.level = level;
//    }
//}
//class Secretary implements Handler{
//    private Handler next;
//    @Override
//    public void setNext(Handler next) {
//        this.next = next;
//    }
//
//    @Override
//    public void handle(Request request) {
//        if (request.level == 1){
//            System.out.println("Secretary did");
//        } else if (next!= null){
//            next.handle(request);
//        } else {
//            System.out.println("No one could");
//        }
//    }
//}




// Pattern Command
//interface Command{
//    void execute();
//    void undo();
//}
//class Light{
//    public void turnOn(){
//        System.out.println("Turned on");
//    }
//    public void turnOff(){
//        System.out.println("Turned off");
//    }
//}
//class TurnOnLightCommand implements Command{
//    private Light light;
//
//    public TurnOnLightCommand(Light light) {
//        this.light = light;
//    }
//
//    @Override
//    public void execute() {
//        light.turnOn();
//    }
//
//    @Override
//    public void undo() {
//        light.turnOff();
//    }
//}
//class TurnOffLightCommand implements Command{
//    private Light light;
//
//    public TurnOffLightCommand(Light light) {
//        this.light = light;
//    }
//
//    @Override
//    public void execute() {
//        light.turnOff();
//    }
//
//    @Override
//    public void undo() {
//        light.turnOn();
//    }
//}
//class RemoteControl{
//    private Command command;
//    private Command lastCommand;
//
//    public void setCommand(Command command) {
//        this.command = command;
//    }
//    public void pressButton(){
//        command.execute();
//        lastCommand = command;
//    }
//    public void pressUndo(){
//        if (lastCommand!= null){
//            lastCommand.undo();
//        }
//    }
//}
//public class Qaz {
//    public static void main(String[] args) {
//        Light light = new Light();
//
//        Command turnOn = new TurnOnLightCommand(light);
//        Command turnOff = new TurnOffLightCommand(light);
//
//        RemoteControl remote = new RemoteControl();
//
//        remote.setCommand(turnOn);
//        remote.pressButton();
//        remote.pressUndo();
//
//        remote.setCommand(turnOff);
//        remote.pressButton();
//        remote.pressUndo();
//    }
//}

// Pattern Iterator
//interface Iterator<T>{
//    boolean hasNext();
//    T next();
//}
//class Book{
//    String title;
//    public Book(String title) {
//        this.title = title;
//    }
//}
//class BookCollection{
//    private List<Book> books = new ArrayList<>();
//    public void addBook(Book book){
//        books.add(book);
//    }
//    public BookIterator getIterator(){
//        return new BookIterator(books);
//    }
//}
//class BookIterator implements Iterator<Book>{
//    private List<Book> books;
//    private int index = 0;
//
//    public BookIterator(List<Book> books) {
//        this.books = books;
//    }
//    @Override
//    public boolean hasNext() {
//        return index < books.size();
//    }
//
//    @Override
//    public Book next() {
//        return books.get(index++);
//    }
//}
//public class Qaz {
//    public static void main(String[] args) {
//        BookCollection collection = new BookCollection();
//        collection.addBook(new Book("Java for Beginners"));
//        collection.addBook(new Book("Design Patterns"));
//        collection.addBook(new Book("Clean Code"));
//
//        Iterator<Book> iterator = collection.getIterator();
//
//        while (iterator.hasNext()){
//            Book book = iterator.next();
//            System.out.println("Book: " + book.title);
//        }
//    }
//}
//interface Iterator<T>{
//    boolean hasNext();
//    T next();
//}
//class Student{
//    String name;
//    public Student(String name) {
//        this.name = name;
//    }
//}
//class StudentGroup{
//    private Student[] students;
//    private int size;
//
//    public StudentGroup(int capacity) {
//        students = new Student[capacity];
//    }
//    public void addStudent(Student student){
//        students[size++] = student;
//    }
//    public StudentIterator getIterator(){
//        return new StudentIterator(students, size);
//    }
//}
//class StudentIterator implements Iterator<Student>{
//    private Student[] students;
//    private int position = 0;
//    private int size;
//
//    public StudentIterator(Student[] students,int size) {
//        this.students = students;
//        this.size = size;
//    }
//
//    @Override
//    public boolean hasNext() {
//        return position < size;
//    }
//
//    @Override
//    public Student next() {
//        return students[position++];
//    }
//}
//public class Qaz {
//    public static void main(String[] args) {
//        StudentGroup group = new StudentGroup(5);
//        group.addStudent(new Student("Ali"));
//        group.addStudent(new Student("Saken"));
//        group.addStudent(new Student("Aruzhan"));
//
//        Iterator<Student> iterator = group.getIterator();
//
//        while (iterator.hasNext()) {
//            Student s = iterator.next();
//            System.out.println("Student: " + s.name);
//        }
//
//    }
//}


// Pattern Mediator
//interface ChatMediator{
//    void sendMessage(String message, User sender);
//    void addUser(User user);
//}
//abstract class User{
//    protected ChatMediator mediator;
//    protected String name;
//
//    public User(ChatMediator mediator, String name) {
//        this.mediator = mediator;
//        this.name = name;
//    }
//    public abstract void send(String message);
//    public abstract void receive(String message);
//}
//class ChatRoom implements ChatMediator{
//    private List<User> users = new ArrayList<>();
//    @Override
//    public void sendMessage(String message, User sender) {
//        for (User user : users) {
//            if (user != sender) {
//                user.receive(message);
//            }
//        }
//    }
//
//    @Override
//    public void addUser(User user) {
//        users.add(user);
//    }
//}
//class ChatUser extends User{
//    public ChatUser(ChatMediator mediator, String name) {
//        super(mediator, name);
//    }
//
//    @Override
//    public void send(String message) {
//        System.out.println(name + " sent message: " + message);
//        mediator.sendMessage(message, this);
//    }
//
//    @Override
//    public void receive(String message) {
//        System.out.println(name + " got message: " + message);
//    }
//}
//public class Qaz {
//    public static void main(String[] args) {
//        ChatMediator chatRoom = new ChatRoom();
//
//        User user1 = new ChatUser(chatRoom, "Saken");
//        User user2 = new ChatUser(chatRoom, "Ali");
//        User user3 = new ChatUser(chatRoom, "Aruzhan");
//
//        chatRoom.addUser(user1);
//        chatRoom.addUser(user2);
//        chatRoom.addUser(user3);
//
//        user1.send("Hello everyone!");
//        user2.send("Salam");
//    }
//}


// Pattern Memento
//class Editor{
//    private String text;
//    public void write(String newText){
//        this.text = newText;
//    }
//
//    public String getText() {
//        return text;
//    }
//    public Memento save(){
//        return new Memento(text);
//    }
//    public void restore(Memento memento){
//        this.text = memento.getSavedText();
//    }
//}
//class Memento{
//    private final String savedText;
//
//    public Memento(String savedText) {
//        this.savedText = savedText;
//    }
//
//    public String getSavedText() {
//        return savedText;
//    }
//}
//class History {
//    private List<Memento> history = new ArrayList<>();
//    public void saveState(Memento memento){
//        history.add(memento);
//    }
//    public Memento getLastSavedState(){
//        if (!history.isEmpty()){
//            return history.remove(history.size() - 1);
//        }
//        return null;
//    }
//}
//public class Qaz {
//    public static void main(String[] args) {
//        Editor editor = new Editor();
//        History history = new History();
//
//        editor.write("State #1: ");
//        history.saveState(editor.save());
//
//        editor.write("State #2: ");
//
//        history.saveState(editor.save());
//
//        editor.write("State #3: ");
//        System.out.println("Currently text: " + editor.getText());
//
//        editor.restore(history.getLastSavedState());
//        System.out.println("После 1 отката: " + editor.getText());
//
//        editor.restore(history.getLastSavedState());
//        System.out.println("После 2 отката: " + editor.getText());
//    }
//}


//
//// Pattern Observer
//interface Observer{
//    void update(String news);
//}
//interface Subject{
//    void addObserver(Observer o);
//    void removeObserver(Observer o);
//    void notifyObserver(String news);
//}
//class NewsAgency implements Subject{
//    private List<Observer> observers = new ArrayList<>();
//    @Override
//    public void addObserver(Observer o) {
//        observers.add(o);
//    }
//    @Override
//    public void removeObserver(Observer o) {
//        observers.remove(o);
//    }
//    @Override
//    public void notifyObserver(String news) {
//        for (Observer o : observers) {
//            o.update(news);
//        }
//    }
//    public void publishNews(String news){
//        System.out.println("News: " + news);
//        notifyObserver(news);
//    }
//}
//class Subscriber implements Observer{
//    private String name;
//    public Subscriber(String name) {
//        this.name = name;
//    }
//    @Override
//    public void update(String news) {
//        System.out.println(name + " get the news: " + news);
//    }
//}
//public class Qaz {
//    public static void main(String[] args) {
//        NewsAgency agency = new NewsAgency();
//
//        Observer observer1 = new Subscriber("Saken");
//        Observer observer2 = new Subscriber("Ali");
//        Observer observer3 = new Subscriber("Aruzhan");
//
//        agency.addObserver(observer1);
//        agency.addObserver(observer2);
//        agency.addObserver(observer3);
//
//        agency.publishNews("Java 22 !");
//        agency.publishNews("Weather is good");
//    }
//}