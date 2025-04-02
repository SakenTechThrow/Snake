//class Meal{
//    String mainCourse;
//    String sideDish;
//    String drink;
//    String dessert;
//
//
////    public Meal(VegetarianMealBuilder vegetarianMealBuilder) {
////    }
//
//    @Override
//    public String toString() {
//        return "Meal{" +
//                "mainCourse='" + mainCourse + '\'' +
//                ", sideDish='" + sideDish + '\'' +
//                ", drink='" + drink + '\'' +
//                ", dessert='" + dessert + '\'' +
//                '}';
//    }
//
//    public Meal(String mainCourse, String sideDish, String drink, String dessert) {
//        this.mainCourse = mainCourse;
//        this.sideDish = sideDish;
//        this.drink = drink;
//        this.dessert = dessert;
//    }
//}
//interface MealBuilder{
////    String mainCourse = null;
////    String sideDish = null;
////    String drink = null;
////    String dessert = null;
//
//
//    MealBuilder setMainCourse(String mainCourse);
//    MealBuilder setSideDish(String sideDish);
//    MealBuilder setDrink(String drink);
//    MealBuilder setDessert(String dessert);
//    Meal build();
//}
//class VegetarianMealBuilder implements MealBuilder{
//    String mainCourse;
//    String sideDish;
//    String drink;
//    String dessert;
//    @Override
//    public MealBuilder setMainCourse(String mainCourse) {
//        this.mainCourse = mainCourse;
//        return this;
//    }
//
//    @Override
//    public MealBuilder setSideDish(String sideDish) {
//        this.sideDish = sideDish;
//        return this;
//    }
//
//    @Override
//    public MealBuilder setDrink(String drink) {
//        this.drink = drink;
//        return this;
//    }
//
//    @Override
//    public MealBuilder setDessert(String dessert) {
//        this.dessert = dessert;
//        return this;
//    }
//
//    @Override
//    public Meal build() {
//        return new Meal(mainCourse, sideDish, drink, dessert);
//    }
//}
//class NonVegetarianMealBuilder implements MealBuilder{
//    String mainCourse;
//    String sideDish;
//    String drink;
//    String dessert;
//
//    @Override
//    public MealBuilder setMainCourse(String mainCourse) {
//        this.mainCourse = mainCourse;
//        return this;
//    }
//
//    @Override
//    public MealBuilder setSideDish(String sideDish) {
//        this.sideDish = sideDish;
//        return this;
//    }
//
//    @Override
//    public MealBuilder setDrink(String drink) {
//        this.drink = drink;
//        return this;
//    }
//
//    @Override
//    public MealBuilder setDessert(String dessert) {
//        this.dessert = dessert;
//        return this;
//    }
//
//    @Override
//    public Meal build() {
//        return new Meal(mainCourse, sideDish, drink, dessert);
//    }
//}
//class Director{
//    Meal vegetarianMeal(){
//        return new VegetarianMealBuilder()
//                .setMainCourse("qaz")
//                .setSideDish("qaz")
//                .setDrink("qaz")
//                .setDessert("qaz")
//                .build();
//    }
//    Meal nonVegetarianMeal(){
//        return new NonVegetarianMealBuilder()
//                .setMainCourse("nonqaz")
//                .setSideDish("nonqaz")
//                .setDrink("nonqaz")
//                .setDessert("nonqaz")
//                .build();
//    }
//}
//public class Application {
//    public static void main(String[] args) {
//        Director director = new Director();
//        System.out.println(director.vegetarianMeal());
//        System.out.println(director.nonVegetarianMeal());
//    }
//}































//class Burger{
//    private final String bun;
//    private final String patty;
//    private final boolean cheese;
//    private final boolean lettuce;
//    private final boolean tomato;
//
//     public Burger(BurgerBuilder builder) {
//         this.bun = builder.bun;
//         this.patty = builder.patty;
//         this.cheese = builder.cheese;
//         this.lettuce = builder.lettuce;
//         this.tomato = builder.tomato;
//     }
//     public static class BurgerBuilder {
//         private final String bun;
//         private final String patty;
//         private boolean cheese = false;
//         private boolean lettuce = false;
//         private boolean tomato = false;
//
//         public BurgerBuilder(String bun, String patty) {
//             this.bun = bun;
//             this.patty = patty;
//         }
//
//         public BurgerBuilder cheese(boolean cheese) {
//             this.cheese = cheese;
//             return this;
//         }
//
//         public BurgerBuilder lettuce(boolean lettuce) {
//             this.lettuce = lettuce;
//             return this;
//         }
//
//         public BurgerBuilder tomato(boolean tomato) {
//             this.tomato = tomato;
//             return this;
//         }
//
//         public Burger build() {
//             return new Burger(this);
//         }
//     }
//
//         @Override
//         public String toString() {
//             return "Burger{" + "bun='" + bun + "', patty='" + patty + "'" +
//                     (cheese ? ", cheese" : "") + (lettuce ? ", lettuce" : "") + (tomato ? ", tomato" : "") + '}';
//         }
//     }
//
//public class Application {
//    Burger myBurger(){
//        return new Burger.BurgerBuilder("cwe", "cw")
//                .build();
//    }
//        public static void main(String[] args) {
//        Application ap = new Application();
//            System.out.println(ap.myBurger());
//
//            //Burger myBurger = new Burger.BurgerBuilder("sesame", "beef").build();
//           // System.out.println(Burger.toString);
//        }
//}
//






//--------------------------------------------------------------------------------
// Pattern Prototype;
//class Adam implements Cloneable{
//    private String name;
//    private int age;
//
//    public Adam(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public Adam clone(){
//        try {
//            return (Adam) super.clone();
//        } catch (CloneNotSupportedException e){
//            throw new RuntimeException("Клонирование не поддерживается");
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "Adam{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}
//public class Application {
//    public static void main(String[] args){
//        Adam original = new Adam("Saken", 19);
//        System.out.println("Original: " + original);
//
//        Adam clone = original.clone();
//        System.out.println("Clone: " + clone);
//    }
//}

//--------------------------------------------------------------------
// Pattern Singleton
//class Singletn{
//    private static Singletn instance;
//    private Singletn(){}
//    public static synchronized  Singletn getInstance(){
//        if (instance == null){
//            instance = new Singletn();
//        }
//        return instance;
//    }
////public static Singletn getInstance() {
////    if (instance == null){
////        synchronized (Singleton.class){
////            if (instance == null){
////                instance = new Singletn();
////            }
////        }
////    }
////    return instance;
////}
//}
//public class Application {
//    public static void main(String[] args) {
//        Singletn obj1 = Singletn.getInstance();
//        Singletn obj2 = Singletn.getInstance();
//
//        System.out.println(obj1 == obj2);
//    }
//}
//--------------------------------------------------------------------
// Pattern Factory Method
//import java.util.Scanner;
//
//interface Button {
//    void render();
//    void onClick();
//}
//class WindowsButton implements Button{
//    @Override
//    public void render() {
//        System.out.println("Отрисовка кнопки в стиле Windows.");
//    }
//
//    @Override
//    public void onClick() {
//        System.out.println("Нажата кнопка Windows.");
//    }
//}
//class MacOSButton implements Button{
//    @Override
//    public void render() {
//        System.out.println("Отрисовка кнопки в стиле MacOS.");
//    }
//    @Override
//    public void onClick() {
//        System.out.println("Нажата кнопка MacOS.");
//    }
//}
//
//abstract class Dialog{
//    public abstract Button createButton();
//    public void renderWindow() {
//        Button button = createButton();
//        button.render();
//    }
//}
//class WindowsDialog extends Dialog{
//    @Override
//    public Button createButton() {
//        return new WindowsButton();
//    }
//}
//class MacDialog extends Dialog{
//    @Override
//    public Button createButton() {
//        return new MacOSButton();
//    }
//}
//public class Application {
//    public static void main(String[] args) {
//        Dialog dialog;
//
//        Scanner scanner = new Scanner(System.in);
//        String osName = scanner.nextLine();
//
//        if (osName.contains("win")){
//            dialog = new WindowsDialog();
//        } else {
//            dialog = new MacDialog();
//        }
//        dialog.renderWindow();
//    }
//}

//--------------------------------------------------------------------
// Pattern Abstract Factory
//import java.util.Scanner;
//
//interface Button {
//    void paint();
//}
//interface Checkbox {
//    void paint();
//}
//class WindowsButton implements Button{
//    @Override
//    public void paint() {
//        System.out.println("Отрисовка Windows-кнопки.");
//    }
//}
//class WindowsCheckbox implements Checkbox{
//    @Override
//    public void paint() {
//        System.out.println("Отрисовка Windows-чекбокса");
//    }
//}
//class MacOSCheckbox implements Checkbox{
//
//    @Override
//    public void paint() {
//        System.out.println("Отрисовка MacOS-чекбокса");
//    }
//}
//class MacOSButton implements Button{
//    @Override
//    public void paint() {
//        System.out.println("Отрисовка MacOS-кнопки.");
//    }
//}
//interface GUIFactory{
//    Button createButton();
//    Checkbox createCheckbox();
//}
//class WindowsFactory implements GUIFactory{
//    @Override
//    public Button createButton() {
//        return new WindowsButton();
//    }
//    @Override
//    public Checkbox createCheckbox() {
//        return new WindowsCheckbox();
//    }
//}
//class MacOSFactory implements GUIFactory{
//
//    @Override
//    public Button createButton() {
//        return new MacOSButton();
//    }
//
//    @Override
//    public Checkbox createCheckbox() {
//        return new MacOSCheckbox();
//    }
//}
//class App{
//    private Button button;
//    private Checkbox checkbox;
//
//    public App(GUIFactory factory){
//        button = factory.createButton();
//        checkbox = factory.createCheckbox();
//    }
//    public void paint() {
//        button.paint();
//        checkbox.paint();
//    }
//}
//public class Application {
//    public static void main(String[] args) {
//        GUIFactory factory;
//        Scanner scanner = new Scanner(System.in);
//        String osName = scanner.nextLine();
//
//        if (osName.contains("mac")){
//            factory = new MacOSFactory();
//        } else {
//            factory = new WindowsFactory();
//        }
//
//        App app = new App(factory);
//        app.paint();
//    }
//}

