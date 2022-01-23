public class Homework {
    public static void main(String[] args) {
        //вывод на консоль
        printLiterals();
        //Некоторые тесты для проверки задач.
        System.out.println(sum(-500, 1000));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(351, 352));
        System.out.println(calculateHypotenuse(12, 16));
    }

    private static void printLiterals() {
        int a = 0b1101010110; //        целочисленный 2-й
        System.out.println(a);
        int b = 012314; //        целочисленный 8-й
        System.out.println(b);
        int c = 456; //        целочисленный 10-й
        System.out.println(c);
        int d = 0x141D12; //        целочисленный 16-й
        System.out.println(d);
        boolean e = true; //        логический
        System.out.println(e);
        char f = 'a'; //        символьный
        System.out.println(f);
        String str = "My Program"; //        строковый
        System.out.println(str);
        float g = 56.555F; //        литерал типа float
        System.out.println(g);
        double h = 10.666D; //        литерал типа double.
        System.out.println(h);
    }

    public static int sum(int a, int b) {
        int sum = a + b;
        if (sum > Integer.MAX_VALUE) {
            return --sum;
        } else
            return sum;
    }


    public static int max(int a, int b) {
        if (a <= b) {
            System.out.print("max=");
            return (b);
        } else System.out.print("max=");
        return (a);
    }

    public static double calculateHypotenuse(int a, int b) {
        int gipotinuse = a * a + b * b;
        return Math.sqrt(gipotinuse);
    }
}