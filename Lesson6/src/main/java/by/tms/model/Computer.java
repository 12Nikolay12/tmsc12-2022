package by.tms.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String cpu;
    private String ram;
    private String hdd;
    private int cycleResource;
    private boolean burn;

    public Computer(String cpu, String ram, String hdd, int cycleResource) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.cycleResource = cycleResource;
    }

    public void on() {
        do {
            if (cycleResource > 0) {
                System.out.println("Внимание! Введите 0 или 1");
                Scanner scanner = new Scanner(System.in);
                int personValue = scanner.nextInt();
                Random random = new Random();
                int randomValue = random.nextInt(2);
                if (personValue == randomValue) {
                    off();
                } else {
                    burn();
                }
            } else {
                burn();
            }
        } while (cycleResource > 0);
    }

    public void off() {
        System.out.println("Выключение компьютера");
        cycleResource--;
        System.out.println("Осталось циклов " + cycleResource--);
    }

    public void burn() {
        System.out.println("Компьютер сгорел");
        cycleResource = 0;
        burn = true;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", cycleResource=" + cycleResource +
                '}';
    }
}