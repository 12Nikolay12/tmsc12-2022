import java.util.Arrays;
import java.util.Random;

public class HomeWork6 {
    //        6) Найти максимальный элемент в массиве  и поменять его местами с нулевым элементом
    public static void main (String[] args) {
        Random rand = new Random();
        int size = 25;
        int[] array = new int[size];
        int max = 0;
        int temp;

        for ( int i = 0; i < size; i++ ) {
            array[i] = rand.nextInt(100);
            if ( array[max] < array[i] ) max = i;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Max: "+"array["+max+"]="+array[max]);

        temp = array[0];
        array[0] = array[max];
        array[max] = temp;

        System.out.println(Arrays.toString(array));
    }
}
