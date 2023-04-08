import org.junit.Assert;
import org.junit.Test;

public class MyTest {
    Calculator calc = new Calculator();
    EvenOddChecker even = new EvenOddChecker();
    Rectangle rec = new Rectangle(4.0, 6.0);


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
    //EvenOddChecker

    @Test

    public void MyLineTrueTest() throws Exception {
        Assert.assertTrue(even.check(6));
    }

    @Test
    public void MyLineFalseTest() throws Exception {
        Assert.assertFalse(even.check(5));
    }


//Rectangle

    @Test
    public void getLTest() {
        Assert.assertEquals(4.0, rec.getLength(), 0.0);
    }

    @Test
    public void setLTest() {
        rec.setLength(5.0);
        Assert.assertEquals(5.0, rec.getLength(), 0.0);
    }

    @Test
    public void getWTest() {

        Assert.assertEquals(6.0, rec.getWidth(), 0.0);
    }

    @Test
    public void setWTest() {
        rec.setWidth(5.0);
        Assert.assertEquals(5.0, rec.getWidth(), 0.0);
    }

    @Test
    public void getAreaTest() {

        Assert.assertEquals(24.0, rec.getArea(), 0.0);
    }
}
