public class ScientificCalculator extends AdvancedCalculator {

    public int mod() {
        if (num2 == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return result;
        }

        result = num1 - (num2 * (num1 / num2));  // a - b*(a/b)
        return result;
    }
}

