public class HomeWork3 {
    //3) В переменную записываем число.
    //        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
    //        Например, Введите число: 5
    //        "5 - это положительное число, количество цифр = 1"
    public static void main(String[] args) {
        myMethod(53);
        myMethod(-323);
        myMethod(0);
    }

    private static void myMethod(int myStr) {
            if ((myStr % 10) == myStr) {
                System.out.print("количество цифр = 1, ");
            } else if ((myStr % 100) == myStr) {
                System.out.print("количество цифр = 2, ");
            } else if ((myStr % 1000) == myStr) {
                System.out.print("количество цифр = 3, ");
            }
            System.out.println(myStr == 0 ? "Это Ноль" : myStr > 0 ? "Это Положительное число" : "Это Отрицательное число");
        }
    }
