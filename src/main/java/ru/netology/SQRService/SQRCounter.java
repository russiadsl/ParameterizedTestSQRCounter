package ru.netology.SQRService;

public class SQRCounter {
    public int sqrcounter(int start, int end) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= start && i * i <= end) {
                counter++;
            }
        }
        return counter;
    }
}
