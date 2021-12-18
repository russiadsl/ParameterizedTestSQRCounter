package ru.netology.SQRService;

public class SQRService {
    public static void main(String[] args) {
        SQRCounter service = new SQRCounter();

        int start = 100;
        int end = 900;
        int expected = 21;
        int actual = service.sqrcounter(start, end);
        boolean passed = expected == actual;
        System.out.println(passed);
    }
}