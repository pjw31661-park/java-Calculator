public class Calculator {
    protected int num1;
    protected int num2;
    protected int result;

    public void setNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        result = num1 + num2;
        return result;
    }

    public int subtract() {
        result = num1 - num2;
        return result;
    }

    public int multiply() {
        if (num1 == 0 || num2 == 0) {
            result = 0;
            return result;
        }
        int tempResult = 0;
        for (int i = 0; i < num2; i++) {
            tempResult += num1;
        }
        result = tempResult;
        return result;
    }

    public int divide() {
        if (num2 == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            result = Integer.MAX_VALUE; // 오류 표시
            return result;
        }
        if (num1 == 0) {
            result = 0;
            return result;
        }
        int quotient = 0;
        int currentNum1 = num1;
        while (currentNum1 >= num2) {
            currentNum1 -= num2;
            quotient++;
        }
        result = quotient;
        return result;
    }

    public void displayResult(String operator) {
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}

