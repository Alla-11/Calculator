package test.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import test.Calculator;
import org.testng.annotations.Test;
import org.testng.Assert;
import test.DataProviders;
import test.Retry;

public class MultiplicationTest extends BaseTest {

    Calculator calculator = new Calculator();

    @BeforeClass
    public void textMessageBeforeMultiplicationTest() {
        System.out.println("Тесты на прохождение умножения");
    }

    @Test(dataProvider = "forMultiplication", dataProviderClass = DataProviders.class, description = "multiplication of two values",
            retryAnalyzer = Retry.class, invocationCount = 3, threadPoolSize = 2)
    public void multiplicationTwoValueTest(int x, int y ,int z){
        int actualMultiplicationResult = calculator.multiplication(x,y);
        Assert.assertEquals(actualMultiplicationResult,z);
    }

    @AfterClass
    public void textMessageAfterMultiplicationTest(){
        System.out.println("Тесты на прохождения умножения закончены");
    }


}
