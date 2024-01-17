import org.testng.Assert;
import org.testng.annotations.Test;

public class test {

    @Test
    public void testCalculateArea(){
        Calculate calc = new Calculate();
        double calculated = calc.calcArea(30, 45);
        double actual = 765.8131720807066;
        Assert.assertEquals(calculated, actual);
    }
}