package test.tests;

import org.testng.annotations.*;
import test.Calculator;
import org.testng.Assert;
import test.DataProviders;
import test.Retry;


public class SumTest extends BaseTest{

    Calculator calculator = new Calculator();

    @BeforeClass
    public void textMessageBeforeSumTest() {
        System.out.println("Тесты на прохождение суммы");
    }


    @Test (dataProvider = "forSum", dataProviderClass = DataProviders.class, description = "sum of two values",
            retryAnalyzer = Retry.class)
    public void sumTwoValueTest(int x,int y, int z){
        int actualSumresult = calculator.sum(x,y);
        Assert.assertEquals(actualSumresult,z,"The actual sum result does not match expected!");
    }

    @AfterClass
    public void textMessageAfterSumTest(){
        System.out.println("Тесты на прохождения суммы закончены");
    }
}

