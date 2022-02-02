import java.util.Arrays;
import java.util.Scanner;

public class HomeWork7 {
    //    7) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array that is to be created:");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Enter the elements of the array :");

        for(int i=0; i<size; i++) {
            myArray[i] = sc.nextInt();
        }
        System.out.println("The array created is :"+ Arrays.toString(myArray));
        System.out.println("indices of the duplicate elements : ");

        for(int i=0; i<myArray.length; i++) {
            for (int j=i+1; j<myArray.length; j++) {
                if(myArray[i] == myArray[j]) {
                    System.out.println(j);
                }
            }
        }
    }
}
