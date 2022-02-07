package by.tms.service;

import by.tms.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Amd", "64 Gb", "10 Tb", 20);
        computer.on();
        System.out.println(computer);
    }
}