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
        array[1][2] = 1;
        array[1][3] = 1;
        array[2][1] = 1;
        array[2][2] = 1;
        array[2][3] = 1;
        array[3][0] = 1;
        array[3][1] = 1;
        array[3][2] = 1;
        array[3][3] = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] array1 = new int[4][4];

        array1[0][0] = 2;
        array1[1][0] = 2;
        array1[1][1] = 2;
        array1[2][0] = 2;
        array1[2][1] = 2;
        array1[2][2] = 2;
        array1[3][0] = 2;
        array1[3][1] = 2;
        array1[3][2] = 2;
        array1[3][3] = 2;

        for (int a = 0; a < array1.length; a++) {
            for (int b = 0; b < array1[a].length; b++) {
                System.out.print(array1[a][b] + "\t");
            }
            System.out.println();
        }

        int[][] array2 = new int[4][4];

        array2[0][0] = 3;
        array2[0][1] = 3;
        array2[0][2] = 3;
        array2[0][3] = 3;
        array2[1][1] = 3;
        array2[1][2] = 3;
        array2[1][3] = 3;
        array2[2][2] = 3;
        array2[2][3] = 3;
        array2[3][3] = 3;

        for (int c = 0; c < array2.length; c++) {
            for (int d = 0; d < array2[c].length; d++) {
                System.out.print(array2[c][d] + "\t");
            }
            System.out.println();
        }

        int[][] array3 = new int[4][4];

        array3[0][0] = 4;
        array3[0][1] = 4;
        array3[0][2] = 4;
        array3[0][3] = 4;
        array3[1][0] = 4;
        array3[1][1] = 4;
        array3[1][2] = 4;
        array3[2][0] = 4;
        array3[2][1] = 4;
        array3[3][0] = 4;

        for (int e = 0; e < array3.length; e++) {
            for (int f = 0; f < array3[e].length; f++) {
                System.out.print(array3[e][f] + "\t");
            }
            System.out.println();
        }
    }
}



