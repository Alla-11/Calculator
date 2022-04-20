package test;

import org.testng.annotations.DataProvider;

public class DataProviders {

    public DataProviders() {
    }

    @DataProvider
    public static Object[][] forSum() {
        return new Object[][]{
                {1, 5, 6},
                {2, 8, 10},
        };
    }

    @DataProvider
    public static Object[][] forSubstraction() {
        return new Object[][]{
                {1, 5, -4},
                {2, 8, -6},
        };
    }

    @DataProvider
    public static Object[][] forMultiplication() {
        return new Object[][]{
                {1, 5, 5},
                {2, 8, 16},
        };
    }

    @DataProvider
    public static Object[][] forDivision() {
        return new Object[][]{
                {10, 5, 2},
                {2, 1, 2},
        };
    }
}

