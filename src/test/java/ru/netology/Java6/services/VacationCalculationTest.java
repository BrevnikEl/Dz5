package ru.netology.Java6.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationCalculationTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/month.csv")
    public void testRestCalculated (int expected, int income, int expense, int threshold) {
        VacationCalculation service = new VacationCalculation();

        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }

}