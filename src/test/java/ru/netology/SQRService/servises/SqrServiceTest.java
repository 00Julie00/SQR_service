package ru.netology.SQRService.servises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SqrServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resoursesfortests/SqlServiceData.csv")
    public void shouldCalculateNumberOfSquareRoot(int expected, int min, int max) {
        SqlServiceCalc service = new SqlServiceCalc();
        int actual = service.calcSqrService(min, max);

        Assertions.assertEquals(expected, actual);
    }
}

