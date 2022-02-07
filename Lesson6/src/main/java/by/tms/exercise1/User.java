package by.tms.exercise1;

public class User {
    private String name;
    private String surname;
    private int age;
    private String gender;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public User(int age) {
        this.age = age;
    }

    public User(String name, String surname, int age, String gender) {
        this(name, surname);
        this.age = age;
        this.gender = gender;
    }

    public static void name(String name, String surname) {
        System.out.println("Имя " + name + " Фамилия " + surname);
    }

    public static void age(int age) {
        age = age + 20;
        System.out.println("Увеличенный возраст " + age);
    }

    public static void userInfo(String name, String surname, int age, String gender) {
        System.out.println("Имя " + name + " Фамилия " + surname + " Возраст " + age + " Пол " + gender);
    }

    @Deprecated
    public User(String name, String surname, String gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }
}
