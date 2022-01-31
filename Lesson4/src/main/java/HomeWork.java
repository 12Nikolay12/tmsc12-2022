public class HomeWork {

    public static void main(String[] args) {

        //Некоторые тесты для проверки задач. Можно также написать свои тесты.
        //printArray();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(operation(-2));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6, 7}));
        countDevs(103);
        countDevs(11);
        foobar(6);
        foobar(10);
        foobar(15);
        printPrimeNumbers(100);
    }


//    /**
//     * Необходимо прочитать с консоли значение числа типа int,
//     * сделать проверку что если пользователь ввел не положительное число,
//     * то вывести ошибку и отправить пользователя вводить заново новое число!
//     * далее создать одномерный массив типа int размера прочитанного с консоли
//     * далее заполнить массив случайными значениями
//     * далее вывести массив на консоль
//     */
//    Не сообразил как сделать
//    private static void printArray(int number) {
//        int value = 0;
//        Scanner scanner = new Scanner(System.in);
//        boolean exist = true;
//        while (exist) {
//            value = getEnteredValueFromConsole(scanner);
//            if (exist = value > 0) {
//                printArray(value);
//            } else {
//                System.out.println("Ошибка");
//            }
//        }
//    }
//
//    private static int getEnteredValueFromConsole(Scanner scanner) {
//        int value = 0;
//        do {
//            menu();
//            if (scanner.hasNextInt()) {
//                value = scanner.nextInt();
//            } else {
//                scanner.next();
//            }
//        } while (value < 1 || value > 3);
//        return value;
//    }
//
//    private static void menu() {
//        System.out.println("Введите положительное число");
//    }
//}

    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {
        if (number > 0) {
            return ++number;
        } else if (number < 0) {
            return number - 2;
        } else {
            return number = 10;
        }
    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int n = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                ++n;
            }
        }
        return n;
    }


    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        switch (count) {
            case 1, 21, 31, 41, 51, 61, 71, 81, 91, 101:
                System.out.println(count + " Программист");
                break;
            case 2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54, 62, 63, 64, 72, 73, 74, 82, 83, 84, 92, 93, 94, 102, 103, 104:
                System.out.println(count + " Программиста");
                break;
            case 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 25, 26, 27, 28, 29, 30, 35, 36, 37, 38, 39, 40, 45, 46, 47, 48, 49, 50, 55, 56, 57, 58, 59, 60, 65, 66, 67, 68, 69, 70, 75, 76, 77, 78, 79, 80, 85, 86, 87, 88, 89, 90, 95, 96, 97, 98, 99, 100, 105:
                System.out.println(count + " Программистов");
                break;
            default:
                System.out.println(count + " Программистов");
        }
    }

    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */

    public static void foobar(int num) {
        if (((num % 3) == 0) && ((num % 5) == 0)) {
            System.out.println("foobar");
            ;
        } else if ((num % 5) == 0) {
            System.out.println("bar");
            ;
        } else if ((num % 3) == 0) {
            System.out.println("foo");
            ;
        }
    }

    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */
    private static void printPrimeNumbers(int i) {
        if (i == 1) {
            i = 2;
        } else if (i == 0) {
            i = 2;
        }
        for (; i < 1000; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.floor(Math.sqrt(i)); j++) {
                if ((i % j) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
