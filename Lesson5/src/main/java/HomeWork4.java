public class HomeWork4 {
    //        4) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10
    public static void main(String[] args) {

        int mas1[] = new int[12];

        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int) Math.floor(Math.random() * 16);
            System.out.print(mas1[i] + " ");

        }
        int max = mas1[0], index = 0;
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] >= max ) {
                max = mas1[i];
                index = i;
            }
        }
        System.out.println("Самое большое число " + max + " и индекс его последнего вхождения " + index);
    }
}

