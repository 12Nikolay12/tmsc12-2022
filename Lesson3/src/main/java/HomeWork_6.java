public class HomeWork_6 {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5};
        double sum = 0;
        for (int x : num) {
            sum += x;
        }
        System.out.print("среднее арифметическое чисел равно: " + sum / num.length);
    }
}

