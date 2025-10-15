
public class AdvancedCalculator extends Calculator {

    @Override
    public int multiply()
    {
        result = num1 * num2;
        return result;
    }

    @Override
    public int divide()
    {
        result = num1 / num2;
        return result;
    }
}