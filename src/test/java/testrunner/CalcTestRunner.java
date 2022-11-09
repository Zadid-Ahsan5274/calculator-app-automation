package testrunner;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.CalculatorScreen;
import setup.Setup;

public class CalcTestRunner extends Setup {

    @Test
    public void doSum(){
        CalculatorScreen calcScreen = new CalculatorScreen(driver);
        String resActual = calcScreen.doSum();
        System.out.println(resActual);
        int resExpected = 6;
        Assert.assertEquals(Integer.parseInt(resActual),resExpected);
    }



}
