package test.tests;

import org.testng.annotations.*;
import test.Calculator;
import org.testng.Assert;
import test.DataProviders;
import test.Retry;

public class DivisionTest extends BaseTest{

    Calculator calculator = new Calculator();

    @BeforeClass
    public void textMessageBeforeDivisionTest(){
        System.out.println("Тесты на прохождение деленеия");
    }

    @Test(dataProvider = "forDivision", dataProviderClass = DataProviders.class, description = "division of two values",
            retryAnalyzer = Retry.class)
    public void divisionTwoValueTest(int x, int y ,int z){
        int actualDivisionResult = calculator.division(x,y);
        Assert.assertEquals(actualDivisionResult,z);
    }

    @AfterClass
    public void textMessageAfterDivisionTest(){
        System.out.println("Тесты на прохождения деления закончены");
    }
}
