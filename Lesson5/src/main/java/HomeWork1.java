public class HomeWork1 {
    //        1) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
    //        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
    public static void main(String[] args) {
        System.out.println(summ(12, 4));
    }
        public static int summ (int a, int b) {
            int ans = 0, count = 0;
            while (b > 0)
            {
                if (b % 2 == 1)
                    ans += a << count;
                count++;
                b /= 2;
            }
            return ans;
        }
}
