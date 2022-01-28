package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {
            "'range included no one sqr',9,99,0",
            "'range included all sqr',99,9900,90",
            "'one of sqr = lower range limit',100,500,13",
            "'one of sqr = upper range limit',1500,9801,61"
    })
    public void shouldCountSqr(String testName, int lowerRangeLimit, int upperRangeLimit, int expected) {
        SQRService service = new SQRService();


        int actual = service.countSqr(lowerRangeLimit, upperRangeLimit);

        assertEquals(expected, actual);

    }
}