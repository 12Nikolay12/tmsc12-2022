import java.util.Scanner;

public class HomeWork4 {
    //4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.
    public static void main(String[] args) {
        String sign="";
        int month, day;

        Scanner c = new Scanner (System.in);
        System.out.println("Введите день(1-31): ");
        day = c.nextInt();
        System.out.println("Введите месяц(1-12): ");
        month = c.nextInt();


        if((month == 1) && (day <= 20) || (month == 12) && (day >= 23)) {
            sign = "Козерог";
        } else if((month == 1) || (month == 2) && (day <= 19)) {
            sign = "Водолей";
        } else if((month == 2) || (month == 3) && (day <= 20)) {
            sign = "Рыбы";
        } else if((month == 3) || (month == 4) && (day <= 20)) {
            sign = "Овен";
        } else if((month == 4) || (month == 5) && (day <= 21)) {
            sign = "Телец";
        } else if((month == 5) || (month == 6) && (day <= 21)) {
            sign = "Близнецы";
        } else if((month == 6) || (month == 7) && (day <= 22)) {
            sign = "Рак";
        } else if((month == 7) || (month == 8) && (day <= 21)) {
            sign = "Лев";
        } else if((month == 8) || (month == 9) && (day <= 23)) {
            sign = "Дева";
        } else if((month == 9) || (month == 10) && (day <= 23)) {
            sign = "Весы";
        } else if((month == 10) || (month == 11) && (day <= 22)) {
            sign = "Скорпион";
        } else if(month == 11 || (month == 12)) {
            sign = "Стрелец";
        }

        System.out.println("Знак зодиака "+sign+".");

    }
}