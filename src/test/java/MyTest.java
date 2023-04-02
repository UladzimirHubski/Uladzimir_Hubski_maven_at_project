import org.junit.Assert;
import org.junit.Test;

public class MyTest {
    Calc calc = new Calc();

    @Test
    public void MyAddTest() {

        Assert.assertEquals("Addition returned wrong result: ", 4, calc.add(2, 2));
    }

    @Test
    public void MySubstractTest() {

        Assert.assertEquals("Addition returned wrong result: ", 0, calc.substract(2, 2));
    }

    @Test
    public void MyMultiplyTest() {

        Assert.assertEquals("Addition returned wrong result: ", 4, calc.multiply(2, 2));
    }

    @Test
    public void MyDivideTest() {

        Assert.assertEquals("Addition returned wrong result: ", 1, calc.divide(2, 2));
    }
}
