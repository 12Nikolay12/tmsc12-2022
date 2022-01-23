public class HomeWork_7 {
    public static void main(String[] args) {
        int[] myList = {1, 2, 10, 3};
        int max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Наибольший элемент: " + max);
    }
}

