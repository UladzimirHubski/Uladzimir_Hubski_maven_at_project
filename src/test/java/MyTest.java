import org.junit.Assert;
import org.junit.Test;

public class MyTest {
    Calculator calc = new Calculator();


    //Calculator
    @Test
    public void MyAddTest() {

        Assert.assertEquals("Addition returned wrong result: ", 4, calc.add(2, 2));
    }

    @Test
    public void MySubstractTest() {

        Assert.assertEquals("Addition returned wrong result: ", 0, calc.subtract(2, 2));
    }

    @Test
    public void MyMultiplyTest() {

        Assert.assertEquals("Addition returned wrong result: ", 4, calc.multiply(2, 2));
    }

    @Test
    public void MyDivideTest() {

        Assert.assertEquals("Addition returned wrong result: ", 1, calc.divide(2, 2));
    }

    @Test(expected = ArithmeticException.class)
    public void MyDivideZeroTest() {
        Assert.assertEquals("Addition returned wrong result: ", ArithmeticException.class, calc.divide(2, 0));
    }
}
