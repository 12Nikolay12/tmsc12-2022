public class HomeWork2 {
    //        2) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

//        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *


    public static void main(String[] args) {
        int[][] array = new int[4][4];

        array[0][3] = 1;
        array[1][2] = 3;
        array[1][3] = 4;
        array[2][1] = 4;
        array[2][2] = 4;
        array[2][3] = 4;
        array[3][0] = 4;
        array[3][1] = 4;
        array[3][2] = 4;
        array[3][3] = 4;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

