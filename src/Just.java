//interface MediaPlayer{
//    void play(String audioType, String fileName);
//}
//class AudioPlayer implements MediaPlayer{
//    MediaAdapter mediaAdapter;
//    @Override
//    public void play(String audioType, String fileName) {
//        if (audioType.equals("mp3")){
//            System.out.println("Playing mp3 file. Name: " + fileName);
//        } else if (audioType.equalsIgnoreCase("vlc")) {
//            mediaAdapter = new MediaAdapter(audioType);
//            mediaAdapter.play(audioType, fileName);
//        } else {
//            System.out.println("Invalid media. " + audioType + " format not supported");
//        }
//    }
//    public void otherFormat(){
//
//    }
//}
//interface AdvancedMediaPlayer{
//    void playVlc(String fileName);
//    void playMp4(String fileName);
//}
//class VlcPlayer implements AdvancedMediaPlayer{
//    @Override
//    public void playVlc(String fileName) {
//        System.out.println("Playing vlc. Name: " + fileName);
//    }
//    @Override
//    public void playMp4(String fileName) {
//        System.out.println("Not supported");
//    }
//}
//class Mp4Player implements AdvancedMediaPlayer{
//
//    @Override
//    public void playVlc(String fileName) {
//        System.out.println("Not supported");
//    }
//
//    @Override
//    public void playMp4(String fileName) {
//        System.out.println("Playing mp4. Name: " + fileName);
//    }
//}
//class MediaAdapter implements MediaPlayer{
//    AdvancedMediaPlayer advancedMediaPlayer;
//
//    public MediaAdapter(String audioType) {
//        if (audioType.equalsIgnoreCase("vlc")){
//            advancedMediaPlayer = new VlcPlayer();
//        } else if (audioType.equalsIgnoreCase("mp4")){
//            advancedMediaPlayer = new Mp4Player();
//        }
//    }
//
//    @Override
//    public void play(String audioType, String fileName) {
//        if (audioType.equals("vlc")){
//           advancedMediaPlayer.playVlc(fileName);
//        } else if (audioType.equalsIgnoreCase("mp4")){
//            advancedMediaPlayer.playMp4(fileName);
//        }
//    }
//}
//public class Just {
//    public static void main(String[] args) {
//        AudioPlayer audioPlayer = new AudioPlayer();
//
//        audioPlayer.play("mp3", "beyond the horizon.mp3");
//
//        audioPlayer.play("mp4", "alone.mp4");
//    }
//}
//

//---------------------
//interface MediaPlayer{
//    void play(String audioType, String fileName);
//}
//interface AdvancedMediaPlayer{
//    void playVls(String fileName);
//    void playMp4(String fileName);
//}
//class VlcPlayer implements AdvancedMediaPlayer{
//
//    @Override
//    public void playVls(String fileName) {
//        System.out.println("Воспроизведение vlc файла. Имя: " + fileName);
//    }
//
//    @Override
//    public void playMp4(String fileName) {
//
//    }
//}
//class Mp4Player implements AdvancedMediaPlayer{
//    @Override
//    public void playVls(String fileName) {
//
//    }
//
//    @Override
//    public void playMp4(String fileName) {
//        System.out.println("Воспроизведение vlc файла. Имя: " + fileName);
//    }
//}
//class MediaAdapter implements MediaPlayer{
//    AdvancedMediaPlayer advancedMediaPlayer;
//
//    public MediaAdapter(String audioType) {
//        if (audioType.equalsIgnoreCase("vlc")){
//            advancedMediaPlayer = new VlcPlayer();
//        } else if (audioType.equalsIgnoreCase("mp4")){
//            advancedMediaPlayer = new Mp4Player();
//        }
//    }
//
//    @Override
//    public void play(String audioType, String fileName) {
//        if (audioType.equalsIgnoreCase("vlc")){
//            advancedMediaPlayer.playVls(fileName);
//        } else if (audioType.equalsIgnoreCase("mp4")){
//            advancedMediaPlayer.playMp4(fileName);
//        }
//    }
//}
//class AudioPlayer implements MediaPlayer{
//    MediaAdapter mediaAdapter;
//    @Override
//    public void play(String audioType, String fileName) {
//        if (audioType.equalsIgnoreCase("mp3")){
//            System.out.println("Воспроизведение mp3 файла. Имя:" + fileName);
//        } else if (audioType.equalsIgnoreCase("mp4") || (audioType.equalsIgnoreCase("vlc"))) {
//            mediaAdapter = new MediaAdapter(audioType);
//            mediaAdapter.play(audioType, fileName);
//        } else {
//            System.out.println("Неверный формат. " + audioType + " формат не поддерживается.");
//        }
//    }
//}
//public class Just {
//    public static void main(String[] args) {
//        AudioPlayer audioPlayer = new AudioPlayer();
//
//        audioPlayer.play("mp3", "beyond.mp3");
//    }
//}
//-----------------





//interface MediaPlayer{
//    void play(String audioType, String fileName);
//}
//class AudioPlayer implements MediaPlayer{
//    MediaAdapter mediaAdapter;
//    @Override
//    public void play(String audioType, String fileName) {
//        if (audioType.equalsIgnoreCase("mp3")){
//            System.out.println("Play Mp3 " + fileName);
//        } else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
//            mediaAdapter = new MediaAdapter(audioType);
//            mediaAdapter.play(audioType, fileName);
//        } else {
//            System.out.println("Incorrect");
//        }
//    }
//}
//interface AdvancedMediaPlayer{
//    void playVlc(String fileName);
//    void playMp4(String fileName);
//}
//class VlcPlayer implements AdvancedMediaPlayer{
//    @Override
//    public void playVlc(String fileName) {
//        System.out.println("Play Vlc: " + fileName);
//    }
//
//    @Override
//    public void playMp4(String fileName) {
//
//    }
//}
//class Mp4Player implements AdvancedMediaPlayer{
//
//    @Override
//    public void playVlc(String fileName) {
//
//    }
//
//    @Override
//    public void playMp4(String fileName) {
//        System.out.println("Play Mp4 " + fileName);
//    }
//}
//class MediaAdapter implements MediaPlayer{
//    AdvancedMediaPlayer advancedMediaPlayer;
//    public MediaAdapter(String audioType) {
//        if (audioType.equalsIgnoreCase("mp4")){
//            advancedMediaPlayer = new Mp4Player();
//        } else if (audioType.equalsIgnoreCase("vlc")) {
//            advancedMediaPlayer = new VlcPlayer();
//        }
//    }
//
//    @Override
//    public void play(String audioType, String fileName) {
//        if (audioType.equalsIgnoreCase("mp4")){
//            advancedMediaPlayer.playMp4(fileName);
//        } else if (audioType.equalsIgnoreCase("vlc")) {
//            advancedMediaPlayer.playVlc(fileName);
//        }
//    }
//}
//public class Just {
//    public static void main(String[] args) {
//        AudioPlayer audioPlayer = new AudioPlayer();
//        audioPlayer.play("mp3", "beyond_the_horizon.mp3");
//
//        // Воспроизведение mp4 файла (используется адаптер)
//        audioPlayer.play("mp4", "alone.mp4");
//
//        // Воспроизведение vlc файла (используется адаптер)
//        audioPlayer.play("vlc", "far_far_away.vlc");
//
//        // Попытка воспроизвести неподдерживаемый формат
//        audioPlayer.play("avi", "mind_me.avi");
//    }
//}
//













//interface MediaPlayer{
//    void play(String audioType, String fileName);
//}
//class AudioPlayer implements MediaPlayer{
//    @Override
//    public void play(String audioType, String fileName) {
//        if (audioType.equals("mp3")){
//            System.out.println("successfully supported");
//        }
//    }
//    public void otherFormat(){
//
//    }
//}
//interface AdvancedMediaPlayer{
//    void playVlc(String fileName);
//    void playMp4(String fileName);
//}
//class VlcPlayer implements AdvancedMediaPlayer{
//    @Override
//    public void playVlc(String fileName) {
//        System.out.println("Playing vlc. Name: " + fileName);
//    }
//    @Override
//    public void playMp4(String fileName) {
//        System.out.println("Not supported");
//    }
//}
//class Mp4Player implements AdvancedMediaPlayer{
//
//    @Override
//    public void playVlc() {
//        System.out.println("Playing vlc");
//    }
//
//    @Override
//    public void playMp4() {
//        System.out.println("Playing mp4");
//    }
//}
//class MediaAdapter implements MediaPlayer{
//    AudioPlayer audioPlayer;
//    AdvancedMediaPlayer advancedMediaPlayer;
//    @Override
//    public void play(String audioType, String fileName) {
//        if (audioType.equals("mp3")){
//            audioPlayer.play("mp3", "song.mp3");
//        } else {
//            advancedMediaPlayer.playMp4();
//        }
//    }
//}
//public class Just {
//    public static void main(String[] args) {
//        AudioPlayer audioPlayer = new AudioPlayer();
//        audioPlayer.play("mp3", "song.mp3");
//    }
//}









// Pattern Adapter
//class OldCharger{
//    void chargeWithOldConnector(){
//        System.out.println("Зарядка через старый разъем... ");
//    }
//}
//interface NewCharger{
//    void chargeWithConnector();
//}
//class ChargerAdapter implements NewCharger{
//    private OldCharger oldCharger;
//
//    public ChargerAdapter(OldCharger oldCharger) {
//        this.oldCharger = oldCharger;
//    }
//
//    @Override
//    public void chargeWithConnector() {
//        oldCharger.chargeWithOldConnector();
//    }
//}
//public class Just {
//    public static void main(String[] args) {
//        OldCharger oldCharger = new OldCharger();
//        NewCharger adapter = new ChargerAdapter(oldCharger);
//        adapter.chargeWithConnector();
//    }
//}
//class OldCharge{
//    void chargeWithOldConnector(){
//        System.out.println("Old Connector");
//    }
//}
//interface NewCharge{
//    void chargeWithConnector();
//}
//class Adapter implements NewCharge{
//    OldCharge oldCharge;
//
//    public Adapter(OldCharge oldCharge) {
//        this.oldCharge = oldCharge;
//    }
//
//    @Override
//    public void chargeWithConnector() {
//        oldCharge.chargeWithOldConnector();
//    }
//}
//public class Just {
//    public static void main(String[] args) {
//        OldCharge oldCharge = new OldCharge();
//        NewCharge adapter = new Adapter(oldCharge);
//        adapter.chargeWithConnector();
//    }
//}
// ----------------------------------------------------------------------------------------------------------------
// Pattern Bridge


//interface Device {
//    void turnOn();
//    void turnOff();
//}
//
//class TV implements Device{
//
//    @Override
//    public void turnOn() {
//        System.out.println("TV turned on");
//    }
//
//    @Override
//    public void turnOff() {
//        System.out.println("TV turned off");
//    }
//}
//class Radio implements Device{
//
//    @Override
//    public void turnOn() {
//        System.out.println("Radio turned on");
//    }
//
//    @Override
//    public void turnOff() {
//        System.out.println("Radio turned off");
//    }
//}
//abstract class Remote{
//    protected Device device;
//
//    public Remote(Device device) {
//        this.device = device;
//    }
//    abstract void powerButton();
//}
//class SimpleRemote extends Remote{
//
//    public SimpleRemote(Device device) {
//        super(device);
//    }
//
//    @Override
//    void powerButton() {
//        System.out.println("Simple Remote: ");
//        device.turnOn();
//    }
//}
//class SmartRemote extends Remote{
//    public SmartRemote(Device device) {
//        super(device);
//    }
//
//    @Override
//    void powerButton() {
//        System.out.println("Smart Remote: ");
//        device.turnOn();
//        System.out.println("Additional functions added.");
//    }
//}
//public class Just {
//    public static void main(String[] args) {
//        Remote simpleRemoteForTv = new SimpleRemote(new TV());
//        simpleRemoteForTv.powerButton();
//
//        Remote smartRemoteForRadio = new SmartRemote(new Radio());
//        smartRemoteForRadio.powerButton();
//    }
//}
//
//


// ----------------------------------------------------------------------------------------------------------------
// Pattern Composite
//import java.util.ArrayList;
//import java.util.List;
//
//// Pattern Composite
//interface FileSystemComponent{
//    void showDetails();
//}
//class File implements FileSystemComponent{
//    private String name;
//
//    public File(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public void showDetails() {
//        System.out.println("File: " + name);
//    }
//}
//class Folder implements FileSystemComponent{
//    private String name;
//    private List<FileSystemComponent> components = new ArrayList<>();
//
//    public Folder(String name) {
//        this.name = name;
//    }
//    public void addComponent(FileSystemComponent component){
//        components.add(component);
//    }
//    @Override
//    public void showDetails() {
//        System.out.println("📂 Папка: " + name);
//        for (FileSystemComponent component : components) {
//            component.showDetails();
//        }
//    }
//}
//public class Just {
//    public static void main(String[] args) {
//        File file1 = new File("Document.txt");
//        File file2 = new File("Image.png");
//
//        Folder folder1 = new Folder("My folders: ");
//        folder1.addComponent(file1);
//        folder1.addComponent(file2);
//
//        Folder subFolder = new Folder("Рабочие документы");
//        File file3 = new File("Project.docx");
//        subFolder.addComponent(file3);
//
//        folder1.addComponent(subFolder);
//        folder1.showDetails();
//
//    }
//}
//interface Employee{
//    void showDetails();
//}
//class Worker implements Employee{
//    private String name;
//
//    public Worker(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public void showDetails() {
//        System.out.println("Сотрудник " + name);
//    }
//}
//class Manager implements Employee{
//    private String name;
//    private List<Employee> subordinates = new ArrayList<>();
//
//    public Manager(String name) {
//        this.name = name;
//    }
//    public void addEmployee(Employee employee){
//        subordinates.add(employee);
//    }
//    @Override
//    public void showDetails() {
//        System.out.println("Mенеджер: " + name);
//        for (Employee employee : subordinates) {
//            employee.showDetails();
//        }
//    }
//}
//public class Just {
//    public static void main(String[] args) {
//        Worker worker1 = new Worker("Ivan");
//        Worker worker2 = new Worker("Aliya");
//
//        Manager manager1 = new Manager("Bekzat");
//        manager1.addEmployee(worker1);
//        manager1.addEmployee(worker2);
//
//        Manager director = new Manager("Aslan");
//        director.addEmployee(manager1);
//
//        director.showDetails();
//    }
//}

// ----------------------------------------------------------------------------------------------------------------
 // Pattern Decorator
//interface Coffee{
//    String getDescription();
//    double getCost();
//}
//class SimpleCoffee implements Coffee{
//
//    @Override
//    public String getDescription() {
//        return "Обычный кофе";
//    }
//
//    @Override
//    public double getCost() {
//        return 5.0;
//    }
//}
//abstract class CoffeeDecorator implements Coffee{
//    protected Coffee coffee;
//
//    public CoffeeDecorator(Coffee coffee) {
//        this.coffee = coffee;
//    }
//    public String getDescription() {
//        return coffee.getDescription();
//    }
//    public double getCost(){
//        return coffee.getCost();
//    }
//}
//class MilkDecorator extends CoffeeDecorator{
//    public MilkDecorator(Coffee coffee) {
//        super(coffee);
//    }
//
//    public String getDescription() {
//        return super.getDescription() + ", milk";
//    }
//
//    public double getCost(){
//        return super.getCost() + 2.0;
//    }
//}
//class SugarDecorator extends CoffeeDecorator{
//    public SugarDecorator(Coffee coffee) {
//        super(coffee);
//    }
//
//    @Override
//    public String getDescription() {
//        return super.getDescription() + ", sugar";
//    }
//    public double getCost(){
//        return super.getCost() + 1.0;
//    }
//}
//public class Just {
//    public static void main(String[] args) {
//        Coffee coffee = new SimpleCoffee();
//        System.out.println(coffee.getDescription() + " | Цена: " + coffee.getCost());
//
//        coffee = new MilkDecorator(coffee);
//        System.out.println(coffee.getDescription() + " | Цена: " + coffee.getCost());
//
//        coffee = new SugarDecorator(coffee);
//        System.out.println(coffee.getDescription() + " | Цена: " + coffee.getCost());
//    }
//}
// ----------------------------------------------------------------------------------------------------------------
 //Pattern Facade
//class Projector{
//    void turnOn(){
//        System.out.println("Проектор включен");
//    }
//    void turnOff(){
//        System.out.println("Проектор выключен");
//    }
//}
//class AudioSystem{
//    void turnOn(){
//        System.out.println("Аудиосистема включена");
//    }
//    void turnOff(){
//        System.out.println("Аудиосистема выключена");
//    }
//}
//class Lights {
//    void dim(){
//        System.out.println("Свет приглушен");
//    }
//    void turnOn(){
//        System.out.println("Свет включен");
//    }
//}
//class HomeTheaterFacade{
//    private Projector projector;
//    private AudioSystem audio;
//    private Lights lights;
//
//    public HomeTheaterFacade(Projector projector, AudioSystem audio, Lights lights) {
//        this.projector = projector;
//        this.audio = audio;
//        this.lights = lights;
//    }
//    public void watchMovie(){
//        System.out.println("Подготовка к просмотру фильма..");
//        lights.dim();
//        projector.turnOn();
//        audio.turnOn();
//        System.out.println("Фильм завершён.");
//    }
//    public void endMovie() {
//        System.out.println("Завершаем просмотр...");
//        projector.turnOff();
//        audio.turnOff();
//        lights.turnOn();
//        System.out.println("Фильм завершён.");
//    }
//}
//public class Just {
//    public static void main(String[] args) {
//        Projector projector = new Projector();
//        AudioSystem audio = new AudioSystem();
//        Lights lights = new Lights();
//
//        HomeTheaterFacade homeTheater = new HomeTheaterFacade(projector, audio, lights);
//        homeTheater.watchMovie();
//        homeTheater.endMovie();
//    }
//}


import java.util.ArrayList;
import java.util.List;

// ----------------------------------------------------------------------------------------------------------------
// Pattern Flyweight
//class TreeType{
//    private String name;
//    private String color;
//    private String texture;
//
//    public TreeType(String name, String color, String texture) {
//        this.name = name;
//        this.color = color;
//        this.texture = texture;
//    }
//    public void draw(int x, int y){
//        System.out.println("Дерево: " + name + " | Цвет: " + color + " | Координаты: (" + x + ", " + y + ")");
//    }
//}
//class TreeFactory{
//    private static final Map<String, TreeType> treeTypes = new HashMap<>();
//
//    public static TreeType getTreeType(String name, String color, String texture){
//        String key = name + color + texture;
//        if (!treeTypes.containsKey(key)){
//            treeTypes.put(key, new TreeType(name, color, texture));
//            System.out.println("Created new type tree: " + name);
//        }
//        return treeTypes.get(key);
//    }
//}
//class Tree{
//    private int x, y;
//    private TreeType type;
//
//    public Tree(int x, int y, TreeType type) {
//        this.x = x;
//        this.y = y;
//        this.type = type;
//    }
//    public void draw(){
//        type.draw(x, y);
//    }
//}
//public class Just {
//    public static void main(String[] args) {
//        TreeType oakType = TreeFactory.getTreeType("Дуб", "Зелёный", "Шероховатая кора");
//        TreeType pineType = TreeFactory.getTreeType("Сосна", "Тёмно-зелёный", "Гладкая кора");
//
//        Tree tree1 = new Tree(10, 20, oakType);
//        Tree tree2 = new Tree(15, 25, oakType);
//        Tree tree3 = new Tree(5, 30, pineType);
//
//        tree1.draw();
//        tree2.draw();
//        tree3.draw();
//    }
//}
// ----------------------------------------------------------------------------------------------------------------
// Pattern Proxy
//interface Server{
//    void access(String user);
//}
//class RealServer implements Server{
//    @Override
//    public void access(String user) {
//        System.out.println("Доступ разрешен для: " + user);
//    }
//}
//class ServerProxy implements Server{
//    private RealServer realServer;
//    private static final List<String> authorizedUsers = new ArrayList<>();
//    static {
//        authorizedUsers.add("admin");
//        authorizedUsers.add("manager");
//    }
//    public void access(String user){
//        if (authorizedUsers.contains(user)){
//            if (realServer == null){
//                realServer = new RealServer();
//            }
//            realServer.access(user);
//        } else {
//            System.out.println("Доступ запрещён для: " + user);
//        }
//    }
//}
//public class Just {
//    public static void main(String[] args) {
//        Server server = new ServerProxy();
//
//        server.access("admin");
//        server.access("manager");
//        server.access("guest");
//    }
//}
    // ----------------------------------------------------------------------------------------------------------------
 //Pattern Adapter

// ----------------------------------------------------------------------------------------------------------------
// Pattern Bridge
//interface Fuel{
//    void refuel();
//}
////--------------------------------------------------
//class Gasoline implements Fuel{
//    @Override
//    public void refuel() {
//        System.out.println("Заправка бензином");
//    }
//}
////--------------------------------------------------
//class Electric implements Fuel{
//    @Override
//    public void refuel() {
//        System.out.println("Зарядка электричеством");
//    }
//}
////--------------------------------------------------
//abstract class Transport{
//    protected Fuel fuel;
//
//    public Transport(Fuel fuel) {
//        this.fuel = fuel;
//    }
//    abstract void refuel();
//}
////--------------------------------------------------
//class Car extends Transport{
//    public Car(Fuel fuel) {
//        super(fuel);
//    }
//
//    @Override
//    void refuel() {
//        System.out.println("Car: ");
//        fuel.refuel();
//    }
//}
////--------------------------------------------------
//class Train extends Transport{
//    public Train(Fuel fuel) {
//        super(fuel);
//    }
//
//    @Override
//    void refuel() {
//        System.out.println("Поезд: ");
//        fuel.refuel();
//    }
//}
////--------------------------------------------------
//public class Just {
//    public static void main(String[] args) {
//        Gasoline benzin = new Gasoline();
//        Transport car = new Car(benzin);
//        car.refuel();
//
//        Transport electricTrain = new Train(new Electric());
//        electricTrain.refuel();
//    }
//}



// Pattern Composite2
//interface FileSystemComponent{
//    void showDetails();
//}
//class File implements FileSystemComponent{
//    private String name;
//    public File(String name) {
//        this.name = name;
//    }
//    @Override
//    public void showDetails() {
//        System.out.println("Файл: " + name);
//    }
//}
//class Folder implements FileSystemComponent{
//    private String name;
//    private List<FileSystemComponent> components = new ArrayList<>();
//
//    public Folder(String name) {
//        this.name = name;
//    }
//    public void addComponent(FileSystemComponent component){
//        components.add(component);
//    }
//    @Override
//    public void showDetails() {
//        System.out.println("Папка: " + name);
//        for (FileSystemComponent component : components) {
//            component.showDetails();
//        }
//    }
//}
//public class Just {
//    public static void main(String[] args) {
//        File file1 = new File(" Документ.txt");
//        File file2 = new File("Фото.jpg");
//
//        Folder folder1 = new Folder("Мои файлы");
//        folder1.addComponent(file1);
//        folder1.addComponent(file2);
//
//        Folder subFolder = new Folder("Рабочие документы");
//        File file3 = new File("Проект.docx");
//        subFolder.addComponent(file3);
//
//        folder1.addComponent(subFolder);
//
//        folder1.showDetails();
//    }
//}