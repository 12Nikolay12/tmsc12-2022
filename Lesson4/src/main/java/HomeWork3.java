/** import java.util.Scanner;

public class HomeWork3 {
    //3) В переменную записываем число.
    //        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
    //        Например, Введите число: 5
    //        "5 - это положительное число, количество цифр = 1"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        myMethod(scanner.nextLine());
    }

    private static void myMethod(String myStr) {
        Scanner parser = new Scanner(myStr);
        int num = new int();
        while (parser.hasNextInt()) {
            if ((num % 10) == num) {
                System.out.println("1 цифра");
            } else if ((num % 100) == num) {
                System.out.println("2 цифры");
            } else if ((num % 1000) == num) {
                System.out.println("3 цифры");
            }
            num = parser.nextInt();
            System.out.println(num == 0 ? 3 : num > 0 ? 2 : 1);
        }
    }
}  **/
