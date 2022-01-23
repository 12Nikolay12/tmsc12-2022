import java.util.Scanner;

public class HomeWork_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        System.out.print("Введите первое число: ");
        double a = sc.nextDouble();
        System.out.println("Введите второе число: ");
        double b = sc.nextDouble();
        System.out.println("Введите третье число: ");
        double c = sc.nextDouble();
        if ((Math.abs(a)) < (Math.abs(b)) && (Math.abs(a)) < (Math.abs(c))) {
            System.out.println(Math.abs(a));
        } else if ((Math.abs(b)) < (Math.abs(a)) && (Math.abs(b)) < (Math.abs(c))) {
            System.out.println(Math.abs(b));
        } else {
            System.out.println(Math.abs(c));
        }
    }
}


