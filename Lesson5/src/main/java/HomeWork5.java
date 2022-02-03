public class HomeWork5 {
    //        5) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.
        public static void main(String[] args){
            int[] Mas = new int[20];
            for(int i=0;i<Mas.length;i++){
                Mas[i]=(int)(Math.random()*21);
                System.out.print(Mas[i] +" ");
            }
            for(int i=0;i<Mas.length;i++){
                if(Mas[i]%2!=0)Mas[i]=0;
                System.out.println(Mas[i] +"");
            }
        }
    }
