package ru.netology.SQRService;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRCounterTest {

    @ParameterizedTest
    @CsvSource (value = {"'sqrcounter0_100', 0, 100, 1",
            "'sqrcounter100_900', 100, 900, 21",
            "'sqrcounter899_901', 899, 901, 1",
            "'sqrcounter0_100 but 0', 0, 100, 0"})
    void sqrcounter(String name, int start, int end, int expected) {
        SQRCounter service = new SQRCounter();
        int actual = service.sqrcounter(start, end);
        assertEquals(expected, actual);
    }
}