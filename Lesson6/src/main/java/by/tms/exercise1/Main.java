package by.tms.exercise1;

public class Main {
    public static void main(String[] args) {
        User.name("Pavel", "Nekrasov");
        User.age(25);
        User.userInfo("Anna", "Petrova", 25, "F");

        User user = new User("Petr", "Semenov");
        User user1 = new User(35);
        User user2 = new User("Aleksandr", "Smirnov", 30, "M");
    }
}

