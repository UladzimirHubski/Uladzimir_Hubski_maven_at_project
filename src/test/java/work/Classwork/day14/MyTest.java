//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.Arrays;
//import java.util.Collection;
//
//public class MyTest {
//    Calculator calc = new Calculator();
//
//    int expected, x, y;
//
//    public MyTest(int expected, int x, int y) {
//        this.expected = expected;
//        this.x = x;
//        this.y = y;
//    }
//
//public Collection<Object[]> getParametrs(){
//        return Arrays.asList(new Object[][]{
//                {2147483647, 2147483646,1},
//                {2147483647, 1,2147483646},
//                {2147483647, 2147483647,0},
//                {2147483647, 0,2147483647}
//        });
//}
//
//
//
//    @Test
//    public void MyAddMaxTest(int expected, int x, int y) {
//
//        Assert.assertEquals("Addition returned wrong result: ", expected, calc.add(x, y));
//    }
//
//
//    //Calculator
//    @Test
//    public void MyAddTest() {
//
//        System.out.println("------------------------bugaga---------------------\n\n---------------------------------bugaga-----------------------");
//        System.out.println(System.getProperty("myRunnerArg"));
//        // System.out.println(System.getenv(" переменная окружения "));
//        //  mvn test "-DmyRunnerArg=work.Classwork.day14.MyTest.class" - запуск с параметром
//
//        Assert.assertEquals("Addition returned wrong result: ", 4, calc.add(2, 2));
//    }
//
//
//    @Test
//    public void MySubstractTest() {
//
//        Assert.assertEquals("Addition returned wrong result: ", 0, calc.subtract(2, 2));
//    }
//
//    @Test
//    public void MyMultiplyTest() {
//
//        Assert.assertEquals("Addition returned wrong result: ", 4, calc.multiply(2, 2));
//    }
//
//    @Test
//    public void MyDivideTest() {
//
//        Assert.assertEquals("Addition returned wrong result: ", 1, calc.divide(2, 2));
//    }
//
//    @Test(expected = ArithmeticException.class)
//    public void MyDivideZeroTest() {
//        Assert.assertEquals("Addition returned wrong result: ", ArithmeticException.class, calc.divide(2, 0));
//    }
//}
