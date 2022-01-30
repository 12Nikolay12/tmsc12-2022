import java.util.Random;

public class HomeWork1 {
    //1) Задача на оператор switch!
    //        Рандомно генерируется число От 1 до 7.
    //        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
    public static void main(String[] args) {
        Random random = new Random();
        int day = random.nextInt(7)+1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a Day");
        }
    }
}
