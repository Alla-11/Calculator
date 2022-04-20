package test.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import test.Calculator;
import org.testng.annotations.Test;
import org.testng.Assert;
import test.DataProviders;
import test.Retry;

public class SubstrationTest extends BaseTest {

    Calculator calculator = new Calculator();

    @BeforeClass
    public void textMessageBeforeSubstractionTest() {
        System.out.println("Тесты на прохождение вычитания");
    }

    @Test(dataProvider = "forSubstraction", dataProviderClass = DataProviders.class, description = "substration of two values",
            retryAnalyzer = Retry.class)
    public void substrationTwoValueTest(int x, int y ,int z){
        int actualSubstractionResult = calculator.substration(x,y);
        Assert.assertEquals(actualSubstractionResult,z);
    }

    @AfterClass
    public void textMessageAfterSubstractionTest(){
        System.out.println("Тесты на прохождения вычитания закончены");
    }
}
