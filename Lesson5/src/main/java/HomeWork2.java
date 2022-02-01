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
        int[][] array = {{0, 0, 0, 3},
                {0, 0, 5, 6},
                {0, 7, 8, 9},
                {1, 7, 8, 9}};

        int[][] array1 = {{1, 0, 0, 0},
                {2, 3, 0, 0},
                {1, 7, 8, 0},
                {1, 7, 8, 9}};


        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
                for (int a = 0; a < array.length; a++) {
                    for (int b = 0; b < array[a].length; b++) {
                        System.out.print(array[a][b] + "\t");
                    }
                    System.out.println();
                }
            }
        }
    }}


