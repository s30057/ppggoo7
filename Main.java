//Zadanie 1
//import java.util.ArrayList;
//import java.util.List;
//interface Figure {
//    double getPerimeter();
//    double getArea();
//    String getType();
//}
//class Circle implements Figure {
//    private double radius;
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//    @Override
//    public double getPerimeter() {
//        return 2 * Math.PI * radius;
//    }
//    @Override
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//    @Override
//    public String getType() {
//        return "Circle";
//    }
//}
//class Parallelogram implements Figure {
//    private double baseSide;
//    private double side;
//    private double height;
//    public Parallelogram(double baseSide, double side, double height) {
//        this.baseSide = baseSide;
//        this.side = side;
//        this.height = height;
//    }
//    @Override
//    public double getPerimeter() {
//        return 2 * (baseSide + side);
//    }
//    @Override
//    public double getArea() {
//        return baseSide * height;
//    }
//    @Override
//    public String getType() {
//        return "Parallelogram";
//    }
//}
//class Rectangle implements Figure {
//    private double sideA;
//    private double sideB;
//    public Rectangle(double sideA, double sideB) {
//        this.sideA = sideA;
//        this.sideB = sideB;
//    }
//    @Override
//    public double getPerimeter() {
//        return 2 * (sideA + sideB);
//    }
//    @Override
//    public double getArea() {
//        return sideA * sideB;
//    }
//    @Override
//    public String getType() {
//        return "Rectangle";
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        double radius = 3d;
//        Figure circle = new Circle(radius);
//        double baseSide = 10d;
//        double side = 5d;
//        double height = 8d;
//        Figure parallelogram = new Parallelogram(baseSide, side, height);
//        double sideA = 15d;
//        double sideB = 10;
//        Figure rectangle = new Rectangle(sideA, sideB);
//        List<Figure> figures = new ArrayList<>(3);
//        figures.add(circle);
//        figures.add(parallelogram);
//        figures.add(rectangle);
//        for (Figure figure : figures) {
//            System.out.println(figure.getType());
//            System.out.println("Area: " + figure.getArea() + " units.");
//            System.out.println("Perimeter: " + figure.getPerimeter() + " units.\n");
//        }
//    }
//}
//Zadanie 2
//interface Moveable {
//    void start();
//    void stop();
//}
//abstract class Animal {
//    protected String name;
//    public Animal(String name) {
//        this.name = name;
//    }
//    public abstract String getType();
//    public String getName() {
//        return name;
//    }
//}
//class Cat extends Animal implements Moveable {
//    public Cat(String name) {
//        super(name);
//    }
//    @Override
//    public void start() {
//        System.out.println("Cat starts!");
//    }
//    @Override
//    public void stop() {
//        System.out.println("Cat stopped!");
//    }
//    @Override
//    public String getType() {
//        return "Cat";
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Cat mruczek = new Cat("Mruczek");
//        mruczek.start();
//        System.out.println(mruczek.getType());
//        mruczek.stop();
//    }
//}
//Zadanie 3
//abstract class Person {
//    protected String firstName;
//    protected String lastName;
//    protected int birthdayYear;
//    public Person(String firstName, String lastName, int birthdayYear) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.birthdayYear = birthdayYear;
//    }
//    public int getAge() {
//        return java.time.Year.now().getValue() - birthdayYear;
//    }
//}
//class Employee extends Person {
//    protected int hireDate;
//    protected String companyName;
//    protected double salary;
//    public Employee(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary) {
//        super(firstName, lastName, birthdayYear);
//        this.hireDate = hireDate;
//        this.companyName = companyName;
//        this.salary = salary;
//    }
//    public int getJobSeniority() {
//        return java.time.Year.now().getValue() - hireDate;
//    }
//    public double getSalary() {
//        return salary;
//    }
//}
//final class Manager extends Employee {
//    private double bonus;
//    public Manager(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary, double bonus) {
//        super(firstName, lastName, birthdayYear, hireDate, companyName, salary);
//        this.bonus = bonus;
//    }
//    @Override
//    public double getSalary() {
//        return super.getSalary() + bonus;
//    }
//    @Override
//    public String toString() {
//        return "Manager with lastName " + lastName + " and age " + getAge() + " has salary " + getSalary();
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Manager manager = new Manager("Jan", "Kowalski", 1990, 2010, "PJATK", 2000d, 100d);
//        System.out.println(manager);
//    }
//}