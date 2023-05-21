//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//
//import java.util.Arrays;
//import java.util.Collection;
//
//
//@RunWith(Parameterized.class)
//public class ArraysTest {
//    Calculator calc = new Calculator();
//
//    int expected, x, y;
//
//    public ArraysTest(int expected, int x, int y) {
//        this.expected = expected;
//        this.x = x;
//        this.y = y;
//    }
//
//    @Parameterized.Parameters
//    public static Collection<Object[]> getParametrs() {
//        return Arrays.asList(new Object[][]{
//                {2147483647, 2147483646, 1},
//                {2147483647, 1, 2147483646},
//                {2147483647, 2147483647, 0},
//                {2147483647, 0, 2147483647}
//        });
//    }
//
//
//    @Test
//    public void MyAddMax1Test(int expected, int x, int y) {
//
//        Assert.assertEquals("Addition returned wrong result: ", expected, calc.add(x, y));
//    }
//}
